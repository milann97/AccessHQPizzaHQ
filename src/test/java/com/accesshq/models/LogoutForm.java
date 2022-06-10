package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutForm {
    WebDriver driver;

    public LogoutForm(WebDriver driver) { this.driver = driver; }

    public void confirmLogout() {
        driver.findElement(By.cssSelector("[aria-label=yes]")).click();
    }
}
