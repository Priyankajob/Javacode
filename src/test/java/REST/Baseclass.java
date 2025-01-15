package REST;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.screenshot.Screenshot;


public class Baseclass {
    public static WebDriver openurl(String Browsername)
    {
        WebDriver driver = null;
        if(Browsername == "FF")
        {
            driver = new FirefoxDriver();
        }
        else if (Browsername == "Chrome")
        {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void main(String[] args)
    {
        openurl("FF");
    }
}


