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
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample54 {
public static void main(String[] args) {
    // TODO code application logic here
    System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.navigate().to("http://demo.guru99.com/test/newtours/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Here WebElement is Class
    WebElement usernametext=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]"));
    if(usernametext.isDisplayed()==true){
       System.out.println("Specific Username is Present on the Site");
    }
    else{
        System.out.println("Not Present");
    }
    
    String str="anand";
    WebElement usernameinput=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
    if(usernameinput.isEnabled()==true){
    usernameinput.sendKeys(str);
    }
    else
    {
    System.out.println("Not Enabled");
    }
    driver.quit();
}
    
}
