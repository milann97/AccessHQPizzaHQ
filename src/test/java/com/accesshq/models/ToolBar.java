package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolBar {
    WebDriver driver;

    public ToolBar(WebDriver driver) { this.driver = driver; }

    public void clickLogin() {
        driver.findElement(By.cssSelector("[aria-label='login or signup']")).click();
    }

    public void viewProfile() {
        driver.findElement(By.cssSelector("[aria-label='your profile']")).click();
    }

    public void clickLogout() {
        driver.findElement(By.className("dd-nav-logout")).click();
    }

    public void clickMenu() {
        driver.findElement(By.cssSelector("[aria-label='menu']")).click();
    }
}
