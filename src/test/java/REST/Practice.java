package REST;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Practice {

    @Test
    public static void Autop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("gLFyf")).sendKeys("Ashapura");
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        int linkcout =links.size();
        System.out.println("All options count" +linkcout);
        for(int i = 0;i<=linkcout-1;i++)
        {
            System.out.println("All options present" +links.get(i).getText());
            if(links.get(i).getText().equals("ashapura"))
            {
                links.get(i).click();
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
}
