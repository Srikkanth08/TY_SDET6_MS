package com.crm.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VTiger_Login {

	@Test
	public void vtiger_login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);

		String homepageTitle = driver.getTitle();

		if (homepageTitle.contains("Administrator")) {
			System.out.println("Login is done Successfully, PASS");
		} else {
			System.out.println("Login is Not done Successfully, FAIL");
		}

		Thread.sleep(3000);
		driver.quit();

	}
}
