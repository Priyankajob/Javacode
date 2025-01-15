package REST;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
import java.util.List;

public class Atomation27 {
    @Test
    public static void newtest()
    {
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://demo.opencart.com/");
     String text=driver.findElement(By.xpath("//a[text()='Desktops']")).getAttribute("Desktops");
     String text1= driver.findElement(By.xpath("//a[text()='Desktops']")).getText();

        System.out.println("getAttribute" +text);
        WebElement link = driver.findElement(By.xpath("//a[text()='Desktops']"));
        String hrefValue = link.getAttribute("href");  // Getting the href attribute value
        System.out.println("The href attribute value is: " + hrefValue);
        Assert.assertTrue(link.isDisplayed());
        Assert.assertEquals(driver.getTitle(), "Expected Title");
        SoftAssert softassert = new SoftAssert();
        //Soft assert applied to verify title
        //softassert.assertEquals(ActualTitle, ExpectedTitle);
      //  softassert.assertAll();
        //Soft assert applied to verify title
        softassert.assertEquals(driver.getTitle(), "ExpectedTitle");
        softassert.assertAll();
        System.out.println("Get Text" +text1);
    driver.manage().window().maximize();
      //  Screenshot screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Specify the path where you want to save the screenshot
        File destFile = new File("fullpage_screenshot.png");

        // Save the screenshot to the specified path
      //  FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE), destFile);

        // Close the browser

     //name
        driver.findElement(By.name("search")).sendKeys("MAC");
        //id
        Boolean logodisplay = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println("Logo is displyaed" +logodisplay);




        //linktest
      //  driver.findElement(By.linkText("Tablets")).click();

        //partiallinktest
      //  driver.findElement(By.partialLinkText("Table")).click();

        //tag and class to find total number of link
        List<WebElement> headerlink= driver.findElements(By.tagName("a"));
        System.out.println("Total number of Link" +headerlink.size());
        List<WebElement> imagelink= driver.findElements(By.tagName("img"));

        for(int i =0;i<=imagelink.size()-1;i++)
        {
            System.out.println("Total image" + imagelink.get(i));

        }

        System.out.println("Total number of image" +imagelink.size());


        File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(Src, new File("C:/Users/user/IdeaProjects/RestBDDFramework/error.png"));
            System.out.println("Screenshotsaved");

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        System.setProperty("webdriver.chrome.logfile",
                "chromedriver.log");


    }
}
