package com.demose.SelDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppZomato 
{
   
    public static void main (String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup(); // without using path //for setting up the browser driver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.zomato.com"); // for opening the specific application
        driver.manage().window().maximize();  // to maximize the window
        
        WebElement image = driver.findElement(By.xpath("//img [@src=\"https://b.zmtcdn.com/web_assets/81f3ff974d82520780078ba1cfbd453a1583259680.png"));
 
        
        Thread.sleep(1000);
        driver.close();
    
        //driver.findElement(By.xpath("//option[text()=\"CHE\"]"));
    }

	
}

