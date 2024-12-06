package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;


public class FormSubmissionTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void FillAndSubmitForm() {
        driver.get("https://qavalidation.com/demo-form/");

        driver.findElement(By.id("g4072-fullname")).sendKeys("Bravo");
        driver.findElement(By.id("g4072-email")).sendKeys("Bravo123@gmail.com");
        driver.findElement(By.id("g4072-phonenumber")).sendKeys("123456789");

        Select genderDropdown = new Select(driver.findElement(By.id("g4072-gender")));
        genderDropdown.selectByVisibleText("NA");

        driver.findElement(By.name("g4072-yearsofexperience-4")).click();
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#4072-yearsofexperience-4[value='4']"))).click();
//


//        driver.findElement(By.id("g4072-yearsofexperience-4")).click();
//         new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#4072-yearsofexperience-4[value='4']"))).click();
//
//        driver.findElement(By.id("g4072-skills-Automation testing")).click();
//
//
//        Select qaTools = new Select(driver.findElement(By.name("g4072-qatools")));
//        qaTools.selectByVisibleText("Appium");
//
//        driver.findElement(By.id("contact-form-comment-g4072-otherdetails")).sendKeys("Hello How Are You?");
//
//        WebElement submitButton = driver.findElement(By.className("wp-block-button__link"));
//        submitButton.click();


    //    String expectedUrl = "https://qavalidation.com/demo-form/?contact-form-id=4072&contact-form-sent";

    //    driver.findElement(By.id("g4072-yearsofexperience-4")).click();

    }
}
