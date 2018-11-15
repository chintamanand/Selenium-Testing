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
public class Allinks {
public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String underConsTitle = "Under Construction: Mercury Tours";					
            driver.get("http://demo.guru99.com/test/newtours/");					
            List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
            String[] linkTexts = new String[linkElements.size()];							
            int i = 0;					
            //extract the link texts of each link element		
            for (WebElement e : linkElements) {							
		linkTexts[i] = e.getText();							
		i++;
                }		
            for (String t : linkTexts)
            {							
	     driver.findElement(By.linkText(t)).click();					
	      if (driver.getTitle().equals(underConsTitle))
              {							
               System.out.println("\"" + t + "\""+ " is under construction.");			
               } 
              else
              {			
              System.out.println("\"" + t + "\"" + " is working.");
              driver.navigate().back();
              }		
	       //driver.navigate().back();			
              }		
	driver.quit();			
    }		
}