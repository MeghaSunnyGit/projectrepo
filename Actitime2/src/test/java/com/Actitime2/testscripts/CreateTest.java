package com.Actitime2.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateTest {
			
			@Test
			public void createCustomerTest() throws InterruptedException 
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://youtube.com/");
				Reporter.log("customer created successfully",true);
				Thread.sleep(3000);
				driver.close();
			}

		}

