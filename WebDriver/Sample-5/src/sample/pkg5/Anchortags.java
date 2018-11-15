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
public class Anchortags { 
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/test/link.html");
                
            //This Uses the Full Text To access the Page
            driver.findElement(By.linkText("click here")).click();					
            System.out.println("title of page is: " + driver.getTitle());
            driver.navigate().back();
            //This Uses only Parital Text To access the Page
            driver.findElement(By.partialLinkText("here")).click();					
            System.out.println("Title of page is: " + driver.getTitle());
            //In Both cases,it will access only 1st Text
            
            //As Both the LinkText and paritalLinkText are Case-Sensitive
            driver.navigate().to("http://demo.guru99.com/test/newtours/");
            String thesmallLinkText = driver.findElement(By.partialLinkText("egis")).getText();		
            System.out.println(thesmallLinkText);
            
            String thecapitalLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();		
            System.out.println(thecapitalLinkText);
            
            driver.quit();
    }
    
}
