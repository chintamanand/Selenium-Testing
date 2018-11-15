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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadfile {
public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();					
        driver.get("http://demo.guru99.com/test/upload/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\mahe\\Desktop\\sample.txt");
        
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        
        //As Uploading the File may take some Time,We can't get the Text quickly.So, I using Explicty wait for the Particular WebElement.
        WebDriverWait  wait=new WebDriverWait(driver,5);
        String res=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"res\"]/center"))).getText();
        //driver.findElement(By.xpath("//*[@id=\"res\"]")).getText();
        System.out.println(res);
        driver.quit();
        
       
    }
    
}
