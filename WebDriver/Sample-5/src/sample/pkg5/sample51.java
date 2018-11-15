package sample.pkg5;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample51 {
    public static WebDriver driver;
    public static String browser="chrome";
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver.exe");
    Scanner scan=new Scanner(System.in);
    String browser=scan.nextLine();
    
    if(browser.equals("chrome")){
    driver=new ChromeDriver();
    } else if(browser.equals("firefox")){
     driver=new FirefoxDriver();
    }else if(browser.equals("ie")){
     driver=new InternetExplorerDriver();
    }else{
    System.out.println("InCorrect Input");
    }
    
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.navigate().to("https://mail.google.com/mail/");
    System.out.println("This will be Title of the Page: "+driver.getTitle());
    System.out.println("This is the Current URl: "+driver.getCurrentUrl());
    System.out.println("Length of the Title is: "+driver.getTitle().length());
    
    driver.close();
    }
    
}

