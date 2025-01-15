package REST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Test
public class Windowhandle {


    public static void createuser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("Current Title" +driver.getTitle());
        System.out.println("Current URL" +driver.getCurrentUrl());
        System.out.println("Current Window" +driver.getWindowHandles());
        driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
        System.out.println("Current Title" +driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        System.out.println("Current URL" +driver.getCurrentUrl());
        System.out.println("Current URL" +driver.getWindowHandles());

       Set<String> handles = driver.getWindowHandles();
       ArrayList<String> Windowhandle = new ArrayList<>(handles);
     String handle1 = Windowhandle.get(0);
        String handle2 = Windowhandle.get(1);
        System.out.println("handle1" +handle1);
        System.out.println("handle1" +handle2);
        driver.switchTo().window(handle2);
        System.out.println(driver.getTitle());
        driver.switchTo().window(handle1);
        System.out.println(driver.getTitle());



    }

}
