package com.model.practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Guru99Login 
{
	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		Pattern userid=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\Guru99Sikuli\\UserId.PNG");
		Pattern password=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\Guru99Sikuli\\Password.PNG");
		Pattern login=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\Guru99Sikuli\\Login.PNG");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		Screen screen=new Screen();
		screen.type(userid, "mngr211592");
		Thread.sleep(5000);
		screen.type(password, "AsyjajA");
		Thread.sleep(5000);
		screen.click(login);
				
	}

}
