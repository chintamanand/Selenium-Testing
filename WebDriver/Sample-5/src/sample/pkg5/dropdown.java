/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample.pkg5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
 public static void main(String[] args) { 
            System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.navigate().to("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		//It will Select By name
                fruits.selectByVisibleText("Banana");
                //It will Select By Index 
                //Starting from Index-1
		fruits.selectByIndex(2);
                //it will deselect all the Selected Values
                fruits.deselectAll();
                driver.quit();
 }
}