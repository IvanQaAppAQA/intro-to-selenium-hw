package com.ring.aqa.steps;

import com.ring.aqa.pages.LoginPage;
import com.ring.aqa.pages.SecurePage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    LoginPage loginPage;
    SecurePage securePage;
    private WebDriver driver;


    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        loginPage = new LoginPage(driver);
        securePage = loginPage.setUsername(username)
                .setPassword(password)
                .clickLogin();


        assertEquals(securePage.getTitle(), "Secure Area", "login failed");

        return this;
    }

    public UserSteps logout() {
        securePage.clickLogout();
        return this;
    }
}
