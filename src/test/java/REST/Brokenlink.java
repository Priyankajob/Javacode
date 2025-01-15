package REST;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
@Test

public class Brokenlink {

    public static void blink() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
       List<WebElement> alllink = driver.findElements(By.tagName("a"));
       int linkcount = alllink.size();
        System.out.println("Total number of Link" +linkcount);
        for(WebElement linkhref:alllink)
        { String href = linkhref.getAttribute("href");
            if(href==null ||href.isEmpty() )
            {
                System.out.println("Not able to verify");
                continue;
            }
            URL linkurl= null;
            try {
                linkurl = new URL(href);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            HttpURLConnection conn =(HttpURLConnection) linkurl.openConnection();
            conn.connect();
            if(conn.getResponseCode()>=400)
            {
                System.out.println("Broken Link");
            }
            else
            {
                System.out.println("Not Broken link");
            }
        }

    }
}
