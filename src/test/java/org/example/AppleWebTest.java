package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class AppleWebTest {
    private WebDriver driver;

    // Declare WebDriver at the class level to use across methods

    // Set up WebDriver before any tests run
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); // Starts the Chrome browser
        driver.manage().window().maximize(); // Maximizes the browser window
    }

    @Test
    public void Testcase() {
        driver.get("https:www.apple.com");

        // Use requireNonNull to prevent NullPointerException
        Assert.assertTrue(Objects.requireNonNull(driver.getTitle()).contains("Apple"),
                "Title should contain 'Apple'");

    } @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }//
    }