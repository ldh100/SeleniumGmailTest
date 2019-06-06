package com.larry.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;

	

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		// Options.addArguments("user-data-dir=C:\\Users\\iamld\\AppData\\Local\\Google\\Chrome\\User
		// Data\\");
		driver = new ChromeDriver(Options);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	@Test
	public void Test() {
		String baseUrl = "https://accounts.google.com/signin";
		String accountName ="versapay.qa.test@gmail.com";
		String password = "iLoveApples";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, 20);
        driver.findElement(By.id("identifierId")).sendKeys(accountName, Keys.ENTER);                       
        //  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();         

        //driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(password,Keys.ENTER);             
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);    
         
          driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	}

	@AfterClass
	public void afterClass() {

       // driver.close();
       // driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
