package com.accesshq.models;

import org.openqa.selenium.WebDriver;

public class WebPage {
    WebDriver driver;

    public WebPage(WebDriver driver) { this.driver = driver; }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
