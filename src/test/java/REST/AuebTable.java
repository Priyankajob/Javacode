package REST;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.SoftAssert;
//import org.openqa.selenium.screenshot.Screenshot;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;


public class AuebTable {

    @Test
    public static void autosuggest()
    {
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.google.com");
     driver.findElement(By.name("q")).sendKeys("Selenium Testing");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
     List <WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
     System.out.println("size" +options.size());
     for(int i=0;i<=options.size()-1;i++)
     {
         System.out.println(options.get(i).getText());
         {
             if(options.get(i).getText().equals("selenium testing"))
             {
                 options.get(i).click();
             }
             else
             {
                 System.out.println("Text not found");
                 break;
             }
         }


    }



}

}
