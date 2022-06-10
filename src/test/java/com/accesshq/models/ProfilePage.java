package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    WebDriver driver;

    public ProfilePage(WebDriver driver) { this.driver = driver; }

    public void verifyName(String name) {
        String test = driver.findElement(By.xpath("[style='font-size: 40pm;']/following-sibling::em")).getText();
    }
}
