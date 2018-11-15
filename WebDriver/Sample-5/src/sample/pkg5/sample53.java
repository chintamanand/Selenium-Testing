/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample.pkg5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sample53 {
public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.navigate().to("https://www.wikipedia.org/");
      //This is the Xpath for Select(Input) Element -->  //*[@id="searchInput"]
      //This Xpath is for Selcect element in the website --> //*[@id="searchLanguage"]
      Select select=new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
      select.selectByVisibleText("Dansk");
      
      //ArrayList<WebElement> options1=(ArrayList<WebElement>) select.getOptions();
      List<WebElement> options=select.getOptions();
      System.out.println("Total Number of Elements in the Select(DropDown): "+options.size());
      System.out.println("This gone print all the Languages Present in the Select WebElement");
      for(int i=0;i<options.size();i++){
      System.out.println(options.get(i).getText());
              }
      System.out.println();
      
      System.out.println("Printing all the Links in the Website: ");
      System.out.println();
      List<WebElement> options1=driver.findElementsByTagName("a");
      for(int i=0;i<options1.size();i++)
      {
       System.out.println("Link in Website: "+options1.get(i).getAttribute("href"));
      }
      driver.close();
    }
    
}
