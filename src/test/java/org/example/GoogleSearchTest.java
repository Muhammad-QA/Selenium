package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void GoogleSearchTest() {
        driver.get("https://www.google.com");

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("What Is Selenium");
        searchbox.submit();

        //@AfterClass
        //  public void Teardown() {
        //     if (driver != null) {
        //        driver.quit();

    }
}
