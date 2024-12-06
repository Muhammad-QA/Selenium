package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NevigationTest {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test
       public void NevigationBetweenPages() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google", "Main page title is incorrect!");
        System.out.println("Google Page Correct");

        driver.navigate().to("https://www.google.com/about");
        Assert.assertEquals(driver.getTitle(),"Google - About Google, Our Culture & Company News", "About page title is incorrect!");
        System.out.println("About Page Correct");


       driver.navigate().back();
       Assert.assertEquals(driver.getTitle(), "Google", "Returned to main page, but title is incorrect!");
       System.out.println("Back to Google Page");
    }
    }
