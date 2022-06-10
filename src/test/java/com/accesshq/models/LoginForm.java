package com.accesshq.models;

import org.openqa.selenium.*;

public class LoginForm {
    WebDriver driver;

    public LoginForm(WebDriver driver) { this.driver = driver; }

    public void enterUsername(String username) {
        driver.findElement(By.cssSelector("[name=gen-20220610-username]")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("[name=gen-20220610-password]")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.cssSelector("[aria-label=login]")).click();
    }
}
