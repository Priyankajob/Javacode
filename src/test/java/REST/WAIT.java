package REST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WAIT {

    @Test
    public static void WAITMETHOD()
    {

                ChromeDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
                driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
                driver.manage().window().maximize();
                WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
                System.out.println("Logo Displayed" +logo.isDisplayed());
                //isenabled
                Boolean enable=driver.findElement(By.xpath("//input[@type='text' and @id='FirstName']")).isEnabled();
                System.out.println("First name Enable" +enable);

                //Beforeselection
                Boolean radio =driver.findElement(By.xpath("//input[@type='radio' and @value='M']")).isSelected();
                System.out.println("Before Click" +radio);
                Boolean radios =driver.findElement(By.xpath("//input[@type='radio' and @value='F']")).isSelected();
                System.out.println("Before Click" +radios);

                //Afterselection
                WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
                WebElement condi=mywait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@type='radio' and @value='M']"))));
                condi.click();

                Boolean radion =driver.findElement(By.xpath("//input[@type='radio' and @value='M']")).isSelected();
                System.out.println("After Click" +radion);
                driver.findElement(By.xpath("//input[@type='radio' and @value='F']")).click();
                Boolean radiosn =driver.findElement(By.xpath("//input[@type='radio' and @value='F']")).isSelected();
                System.out.println("After Click" +radiosn);
            }
        }

