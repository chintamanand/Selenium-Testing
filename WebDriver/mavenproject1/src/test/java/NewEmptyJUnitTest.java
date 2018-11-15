import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewEmptyJUnitTest {

  //@Test
  public void hello() {
    WebDriver driver  = new FirefoxDriver();
//    https://www.udemy.com/selenium-real-time-examplesinterview-questions/?ranMID=39197&ranEAID=Fh5UMknfYAU&ranSiteID=Fh5UMknfYAU-svV5LNDebRQfZr1vgo5klg&siteID=Fh5UMknfYAU-svV5LNDebRQfZr1vgo5klg&LSNPUBID=Fh5UMknfYAU
      driver.get("http://sqa.stackexchange.com/questions/13213/how-to-configure-selenium-webdriver-with-netbeans");
      WebElement acceptAnswerLink = driver.findElement(By.id("vote-accepted-13214"));
      acceptAnswerLink.click();  
    driver.quit();
  }
}