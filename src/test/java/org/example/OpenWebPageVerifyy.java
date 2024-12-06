package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenWebPageVerifyy {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();

    }

@Test
    public void openWebPageVerify() {
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();

       Assert.assertEquals(pageTitle,"Google", "Page title is not as expected!");


    //@AfterClass
    //public void Teardown() {
    //    if (driver != null) {
    //        driver.quit();


}
}
