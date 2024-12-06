package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BankLoginTest {
    private WebDriver driver;  // Correct declaration of WebDriver
  //  private Object signinNext;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); // Initialize the driver
        driver.manage().window().maximize();  // Maximize the browser window
    }

       @Test
       public void loginToBank() {
           // Step 1: Open the bank website
           driver.get("https://secure.royalbank.com/statics/login-service-ui/index#/full/signin?LANGUAGE=ENGLISH");

   //         // Retrieve username and password from environment variables
           String username = "yahyarbc";
           String password = "Royalbank0$";


   //         // Locate the login fields and button on the webpage
           WebElement usernameField = driver. findElement(By.id("userName"));
           WebElement nextButton = driver. findElement(By.id("signinNext"));

  //          // Perform login
           usernameField.sendKeys(username); // Automatically enters the username retrieved from environment variable
           nextButton.click(); // Clicks the next button for the next page
           WebElement passwordField = driver.findElement(By.id("password"));
           passwordField.sendKeys(password);
           WebElement loginButton = driver.findElement(By.id("signinNext"));
           loginButton.click();


             //Select number & Continue for OTP Send
           WebElement number = driver.findElement(By.id("radio-number-F4C83A25C15E1251972F1F21AF12316BA74A94C12D26F9682081B0620C9BE989"));
           number.click();




   //        String partialPhoneNumber = "4372****39"; // Replace with the last few digits of your number



           //   @AfterClass
 //   public void tearDown() {
  //      if (driver != null) {
  //          driver.quit();
 //       }
  //  }
    }
}


