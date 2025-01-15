package REST;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Autosuggest {

   @Test
    public static void autos() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("gLFyf")).sendKeys("selenium");
        Thread.sleep(5000);
        List<WebElement> alllink = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        int count = alllink.size();
        System.out.println("All options count" +count);
      // Actions actions = new Actions(driver);

      // Alert alert = driver.switchTo().alert();
       WebElement element = driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

// Assert that the element is displayed
       Assert.assertTrue(element.isDisplayed(), "The option is not displayed.");
                 // System.out.println("All options" +alllink.get(i).getText());

        for(int i=1;i<count;i++)
        {
            System.out.println("All options present" +alllink.get(i).getText());
            if(alllink.get(i).getText().equals("selenium rich foods"))
            {

                alllink.get(i).click();

            }
            else {System.out.println("Element not visible");
            }
            }
        }

    }

