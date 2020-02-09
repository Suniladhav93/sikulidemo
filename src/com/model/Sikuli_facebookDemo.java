package com.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_facebookDemo 
{
	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		Pattern email=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\Email.PNG");
		Pattern password=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\password.PNG");
		Pattern login=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\login.PNG");
		Pattern forgetpassword=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\forgetpassword.PNG");
		Pattern back=new Pattern("E:\\Selenium\\Sikuli\\practical-sikuli\\back.PNG");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Screen screen=new Screen();
		screen.click(forgetpassword);
		screen.click(back);
		Thread.sleep(5000);
		screen.type(email, "suniladhav10@gmail.com");
		screen.type(password, "password");
		screen.click(login);
		
		
	}
}
