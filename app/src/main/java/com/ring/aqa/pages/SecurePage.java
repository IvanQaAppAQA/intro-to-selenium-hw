package com.ring.aqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {
    private By titleLocator = By.cssSelector("h2");
    private By logoutLocator = By.linkText("Logout");

    public SecurePage(WebDriver driver) {
        super(driver);

    }


    public String getTitle() {
        return driver.findElement(titleLocator).getText();

    }

    public SecurePage clickLogout() {
        driver.findElement(logoutLocator).click();
        return this;
    }

}



