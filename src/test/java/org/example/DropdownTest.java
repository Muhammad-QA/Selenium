package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropdownTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void testDropDownTest(){
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Joe");

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("John");
    }
}
