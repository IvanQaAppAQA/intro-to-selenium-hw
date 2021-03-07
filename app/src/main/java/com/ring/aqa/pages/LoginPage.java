package com.ring.aqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginLocator = By.cssSelector(".radius");

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public LoginPage setUsername(String text) {
        driver.findElement(usernameLocator).sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        driver.findElement(passwordLocator).sendKeys(text);
        return this;
    }


    public SecurePage clickLogin(){
        driver.findElement(loginLocator).click();
        return new SecurePage(driver);
    }

}

