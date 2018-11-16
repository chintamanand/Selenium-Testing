/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg7dayproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Day2 {
public static void main(String[] args) throws InterruptedException {
        //         User ID :	mngr163108
//         Password :	Yzudyse
         System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        driver.get("http://www.demo.guru99.com/V4/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait  wait=new WebDriverWait(driver,5);
        
        String username="mngr163108";
        String password="Yzudyse";
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
       
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li[2]/a")));
//        Thread.sleep(500);
        System.out.println(driver.getTitle());
        driver.quit();
    }
    
}
