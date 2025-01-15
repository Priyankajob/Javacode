package REST;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.List;

@Test
public class redingtononline {
    public static void redington()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.redingtononline.com/");
        driver.findElement(By.xpath("//a[@class='menu__link menu__link--lvl-0' and @href='/open-for-all']")).click();
     //   driver.findElement(By.xpath("//a[@class='menu__link menu__link--lvl-2' and @href='/categories/tablet']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='menu__link menu__link--lvl-2' and @href='/categories/tablet']")));
        element.click();

    }
}
