package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Field;


public class    LoginAutomation {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginAndVerify() {
    driver.get("https://practicetestautomation.com/practice-test-login/");

    WebElement usernameField = driver.findElement(By.name("username"));
    WebElement passwordField = driver.findElement(By.name("password"));
    usernameField.sendKeys("student");
    passwordField.sendKeys("Password123");

    WebElement submitButton = driver.findElement(By.id("submit"));
    submitButton.click();

        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/"; // Update with the actual post-login URL
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login was not successful.");
    }
}
