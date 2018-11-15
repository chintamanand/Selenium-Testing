/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample.pkg5;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ImageLink {
public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        driver.get("https://www.facebook.com/login/identify?ctx=recover");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.cssSelector("#blueBarDOMInspector > div > div > div > div.lfloat._ohe > h1 > a")).click();
        //as it goes to previous page or next page
        if(driver.getTitle().equals("Facebook - log in or sign up"))
        {
         System.out.println("We are back at Facebook's homepage");					
        } 
        else 
        {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
	driver.quit();	
    }
    
}
