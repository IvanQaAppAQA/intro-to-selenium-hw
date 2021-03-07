package com.ring.aqa;

import com.ring.aqa.steps.UserSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    protected WebDriver driver;
    JavascriptExecutor js;
    UserSteps user;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(1025, 947));
        user  = new UserSteps(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }
}
