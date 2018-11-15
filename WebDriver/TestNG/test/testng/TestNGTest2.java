/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;

/**
 *
 * @author mahe
 */
public class TestNGTest2 {
     public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver ; 
    public TestNGTest2() {
         System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
    }

}