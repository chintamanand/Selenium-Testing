/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flashtesting;
import Flash.FlashObjectWebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FlashTesting {
public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");				
        ChromeDriver driver = new ChromeDriver();					
        driver.get("http://demo.guru99.com/test/flash-testing.html");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        // Under Flash jar file there is separate FlashObjectWebDriver class		
	FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");			
	Thread.sleep(5000);		
  	flashApp.callFlashObject("PlayFlashMovie()");			
  	Thread.sleep(5000);		
	flashApp.callFlashObject("StopFlashMovie");			
	Thread.sleep(5000);		
	flashApp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
        System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
        driver.quit();
    }
    
}
