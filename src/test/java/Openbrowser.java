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
public class Openbrowser {
    public static void open()
    {
        WebDriver driver = new ChromeDriver();
       ChromeDriver ch = new ChromeDriver();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

      // WebDriver driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");  // This runs the browser in headless mode
//        options.addArguments("--disable-gpu"); // Optional: Disables GPU hardware acceleration (recommended for headless mode)
//        options.addArguments("--window-size=1920x1080");
//        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.redingtononline.com/categories/tablet/");
     //driver.findElement(By.xpath("//a[@class='menu__link menu__link--lvl-0' and @href='/open-for-all']")).click();
     driver.findElement(By.linkText("Open Categories")).click();
     driver.findElement(By.partialLinkText("Open Categories")).click();
//        String ActualTitle = driver.getTitle();
//        if(ActualTitle.matches("Your Store"))
//        {
//        System.out.println("Actual Title  matched expected..True "  +ActualTitle);
//
//        }
//        else
//        {
//            System.out.println("Actual Title  not matched "  +ActualTitle);
//        }
//        driver.manage().window().maximize();
//        driver.findElement(By.name("search")).sendKeys("MAC");
     //driver.findElement(By.xpath("//a[@class='menu__link menu__link--lvl-0' and @href='/open-for-all']")).click();

       // driver.findElement(By.xpath("/a[@class='menu__link menu__link--lvl-0' and @href='/open-for-all'")).click();
        //driver.findElement(By.className("menu__link menu__link--lvl-0")).click();
     //driver.findElement(By.partialLinkText("menu__link menu__link--lvl-0")).click();

//     By.xpath("//a[@class='menu__link menu__link--lvl-0' and @href= '/open-for-all'])
//        Boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println(logodisplaystatus);
//        //driver.findElement(By.linkText("Software")).click();
//        //in this we use half
//      //  driver.findElement(By.partialLinkText("/open-for-all")).click();
//        List<WebElement> hyperlink = driver.findElements(By.className("list-inline-item"));
//        System.out.println("Total number of link" +hyperlink.size());
//        List<WebElement> tag = driver.findElements(By.tagName("a"));
//        System.out.println("Total number of tag" +tag.size());
//        List<WebElement> img = driver.findElements(By.tagName("img"));
//        System.out.println("Total number of img" +img.size());
//        WebElement element = driver.findElement(By.className("list-inline-item"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().build();
//
//        Assert.assertTrue(element.isDisplayed());
//             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("list-inline-item")));
//        String currentWindowHandle = driver.getWindowHandle();
//        System.out.println(currentWindowHandle);
//        actions.click().perform();

    }

//    public static void main(String[] args)
//      {
//        open();
//
//        }
}
