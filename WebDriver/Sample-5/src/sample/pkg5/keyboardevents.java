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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class keyboardevents {
public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       
        //this usually get the Link from the WebElement whose name is "Home".
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        //This is to check the color .
        WebElement td_Home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]")); 
       
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();
        
        String bgColor = td_Home.getCssValue("BACKGROUND");
        System.out.println("Before hover: " + bgColor);        
        //It will Execute the Action Command
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        
//        WebElement Para=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]"));
//        Actions builder1 =new Actions(driver);
//        
//        Action ContextClick=builder1.moveToElement(Para).contextClick().build();
//        ContextClick.perform();
        driver.quit();
                
    }
    
}
