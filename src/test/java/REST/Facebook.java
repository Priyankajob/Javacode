package REST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Facebook {
   @Test
    public static void login()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("rbpriyanka6@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pass");
        driver.findElement(By.name("login")).sendKeys("pass");
    }
}
