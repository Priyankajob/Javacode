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
import java.util.List;

import static org.apache.poi.util.LocaleID.FF;

public class TRY {

    public static WebDriver openbrowser(String Browser)
    {
        WebDriver driver = null;
        try{
            if(Browser=="FF")
            {
                driver = new FirefoxDriver();
            }
            else if (Browser=="CH")
            {
                driver = new ChromeDriver();

            }

          } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            if(driver!=null)
            {
                driver.quit();
                System.out.println("Quit Driver");
            }
        }
       return driver;
    }

    public static void main(String[] args)
    {
        openbrowser("CH");
    }
}
