package com.crm.VTiger.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {

	@Test
	public void facebook_lxogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		String LoginTitle = driver.getTitle();

		if (LoginTitle.contains("log in or")) {
			System.out.println("Login page is opened Successfully, PASS");
		} else {
			System.out.println("Login page is Not opened Successfully, FAIL");
		}

		Thread.sleep(3000);
		driver.quit();
		
		

	}
}
