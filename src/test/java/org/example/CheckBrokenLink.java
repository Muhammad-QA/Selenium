package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CheckBrokenLink {
    private WebDriver driver;

    @BeforeClass
    public void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void CheckLinks() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/links/");
        Assert.assertEquals(driver.getTitle(), "Browser Windows", "Main page title is incorrect!");
        System.out.println("BrokenLink Page");

        driver.navigate().to("https://qavalidation.com?page_id=5669123\">broken link 404");
        Assert.assertEquals(driver.getTitle(),"Page not found - qavalidation", "About page title is incorrect!");
        System.out.println("404 Page");
        Thread.sleep(2000);

        driver.navigate().back();
        Assert.assertEquals(driver.getTitle(), "Browser Windows", "Returned to main page, but title is incorrect!");
        System.out.println("Return to BrokenLink Page");


        driver.navigate().to("https://the-internet.herokuapp.com/status_codes/301\">broken link 301");
        Assert.assertEquals(driver.getTitle(),"The Internet", "About page title is incorrect!");
        System.out.println("301 Page");
        Thread.sleep(2000);

        driver.navigate().back();
        Assert.assertEquals(driver.getTitle(), "Browser Windows", "Returned to main page, but title is incorrect!");
        System.out.println("Return to BrokenLink Page");

        driver.navigate().to("https://the-internet.herokuapp.com/status_codes/500\">broken link 500");
        Assert.assertEquals(driver.getTitle(),"The Internet", "About page title is incorrect!");
        System.out.println("500 Page");
        Thread.sleep(2000);

        driver.navigate().back();
        Assert.assertEquals(driver.getTitle(), "Browser Windows", "Returned to main page, but title is incorrect!");
        System.out.println("Return to BrokenLink Page");


    }
}


