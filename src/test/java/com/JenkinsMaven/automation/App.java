package com.JenkinsMaven.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App
{
	@Test
   public void test()
   {
		System.setProperty("webdriver.chrome.driver","E:/vikky selenium/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://organicsc.com/");  
		System.out.println("Jenkins console");}
}
