package REST;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Csslcator {
    @Test
    public static void css()
    {
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
      //  tag#id
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MAC");
        //tag.classname(And if space the remve otherwise it will not work
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MAC");
        //tag[attribute="value"]
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("M");
        //tag.classname[attribute='value']
        driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("M");

    }
}
