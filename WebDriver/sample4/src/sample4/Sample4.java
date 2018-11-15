package sample4;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
    public static void main(String[] args) {
      //Initliae set the path for the location of the ChromeDriver --> 2 Parameters(Property,Path to Chrome Driver)
      //If we Directly place the chromedriver.exe file inside the Project.Then There will be no need to Write the System.setProperty
      System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
        
      ChromeDriver driver1=new ChromeDriver();
      //We can also make use WebDriver Directly.
      //WebDriver driver =new ChromeDriver();
        
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
      //Maximize the browser
      driver1.manage().window().maximize();
      //Launch website
      driver1.get("https://www.google.com/");
      driver1.navigate().to("https://www.calculator.net/");
      // Click on Input value-1(Value=8)
      driver1.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
      
      //Multiplication operation on value-1 and value-2. 
      driver1.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
      
      // Click on Input value-2 (Value=6)
      driver1.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
      
      // Enter value 10 in the first number of the percent Calculator
      //driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
     // driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
     // driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result =
         driver1.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();

      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver1.close();
   }
}