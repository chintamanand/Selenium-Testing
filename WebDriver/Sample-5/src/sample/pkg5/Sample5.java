package sample.pkg5;import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sample5 {
public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
      //Here WebDriver is a Interface Has lots of method
      //which will be implemented in different Browsers.
      //WebDriver driver1=new ChromeDriver();
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      //driver.manage().window().fullscreen();
      driver.get("https://www.google.com/");
      
      driver.navigate().to("https://mail.google.com/mail/");
      //This back() method takes you back by one page on the browser's history.
      driver.navigate().back();
      //Takes you forward by one page on the browser's history.
      driver.navigate().forward();
      driver.navigate().refresh();
      
      System.out.println("This will be Title of the Page: "+driver.getTitle());
      System.out.println("Length of the Title is: "+driver.getTitle().length());
      System.out.println("This is the Current URl: "+driver.getCurrentUrl());
//      This will print whole Source Code
      //System.out.println("This is the Page Source: "+driver.getPageSource());
      System.out.println("ALL the Logs in the Website: "+driver.manage().logs());
      
      //As we are implementing the Below Line,It will wait for maximum of 10 sec for EVERY web element.
      //this Gone Wait for every element presence upto 10 sec(maximum).
      //If Element is loaded in 1st sec then it will save 9sec & goes to next step in Execution.
      //There is no need to write this command Twice.
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
      String str1="chintamanand56@gmail.com";
      driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(str1);
      driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
      
      //This not correct way to wait for web Element to load in the website.(For next New website)
      //Better to use Dynamic way to do it.
      //Thread.sleep(2000);
      
      driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("39652422666");
      driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
      //This thread.sleep Will give expected Output but it is not proper way.It has to Be Dynamic . 
      //Thread.sleep(2000);
      
      //so we are Make Use of webdriverWait class with extra 5 Seconds wait
      //wait.untill() statement every where u require.
      WebDriverWait wait=new WebDriverWait(driver,5);
      String res1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[2]/div[2]"))).getText();
      
      //String res =driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")).getText();
      System.out.println("The result will be: "+res1);
      //It Closes all the windows opened by the webdriver.
      driver.quit();
   }
}