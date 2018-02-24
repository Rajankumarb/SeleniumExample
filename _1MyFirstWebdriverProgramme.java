package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class _1MyFirstWebdriverProgramme {


	public static void main(String[] args) {

		//Step1  Open a FireFox browser
		WebDriver     driver   = new FirefoxDriver();

		//Step2 Maximize Browser
		driver.manage().window().maximize();

		//Step3   Pass the Flipkart URL "http://www.flipkart.com/" and Enter
		driver.get("http://www.flipkart.com/");    

		//Step4   verify the title of Flipkart Homepage "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com"
		String    expectedTitle ="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		String    actulaTitle=driver.getTitle();

		if (expectedTitle.equals(actulaTitle)) {

			System.out.println("your Flipkart title has been verified successfully");	    	

		} else {

			System.err.println("your Flipkart title is not verified successfully");
		}

		//Step5    Enter "Iphone 6s" value in Search Box
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("Iphone 6S");
		//Step6   click on Search Button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//step7 close the browser
		driver.close();
	}

}
