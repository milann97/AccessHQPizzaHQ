package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MenuTabs {
    WebDriver driver;

    public MenuTabs(WebDriver driver) { this.driver = driver; }

    public ArrayList<Items> getAllItems() {
        var allItems = new ArrayList<Items>();
        for(WebElement d : driver.findElements(By.className("name"))){
            allItems.add(new Items(d));
        }
        return allItems;
    }

    public Items getItem(Predicate<Items> logic) {
        for(Items i : getAllItems()) {
            if(logic.test(i)) {
                return i;
            }
        }
        throw new NotFoundException("Item is not on the menu");
    }

    public void clickDrinks() {
        driver.findElement(By.cssSelector(".v-tab::before//' Drinks '")).click();
    }

    public void clickPizzas() {
        driver.findElement(By.className(".v-tab::before//' Pizzas '")).click();
    }
}
