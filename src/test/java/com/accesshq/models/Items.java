package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class Items {
    WebElement itemsElement;

    public Items(WebElement itemsElement) { this.itemsElement = itemsElement; }

    public String getName() {
        return itemsElement.findElement(By.className("name")).getText().toLowerCase(Locale.ROOT);
    }

    public void clickOrder() {
        itemsElement.findElement(By.className("v-btn")).click();
    }
}
