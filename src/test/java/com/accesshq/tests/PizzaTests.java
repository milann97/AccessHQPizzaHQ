package com.accesshq.tests;

import com.accesshq.models.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.tools.Tool;

public class PizzaTests {
    WebDriver driver;

    @BeforeEach
    public void startup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3eczsrdruv8hn.cloudfront.net/");
    }
    @AfterEach
    public void close() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    public void loginValidationTest() {
        new ToolBar(driver).clickLogin();
        new LoginForm(driver).enterUsername("bob");
        new LoginForm(driver).enterPassword("ilovepizza");
        new LoginForm(driver).clickLogin();
        new ToolBar(driver).viewProfile();
//        new ProfilePage(driver).verifyName("bob");
        String profileURL = new WebPage(driver).getURL();
        new ToolBar(driver).viewProfile();
        new ToolBar(driver).clickLogout();
        new LogoutForm(driver).confirmLogout();
        driver.get(profileURL);
        Assertions.assertEquals("https://d3eczsrdruv8hn.cloudfront.net/#/",
                new WebPage(driver).getURL());
    }

    @Test
    public void orderingTest() {
        new ToolBar(driver).clickMenu();
        new MenuTabs(driver).clickDrinks(); //I cannot get these working
        new MenuTabs(driver).getItem(i -> i.getName().
                equalsIgnoreCase("Espresso Thickshake")).clickOrder();
        new MenuTabs(driver).clickPizzas();
        new MenuTabs(driver).getItem(i -> i.getName().
                equalsIgnoreCase("Margherita")).clickOrder();
        new MenuTabs(driver).getItem(i -> i.getName().
                equalsIgnoreCase("Margherita")).clickOrder();
        Assertions.assertEquals(3, new ToolBar(driver).checkOrderCount());
        new ToolBar(driver).clickOrder();
    }
}
