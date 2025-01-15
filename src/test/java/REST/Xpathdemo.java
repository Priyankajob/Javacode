package REST;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Xpathdemo {

    @Test
    public static void xpathtest()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //singleattribute
      //  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("may");

        //multipleattribute
       // driver.findElement(By.xpath("//input[@name='search' ][@placeholder='Search']")).sendKeys("may");
        //and or or
    //    driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("May");
        //contains
        driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("May");

    }

}
