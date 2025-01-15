package REST;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Test
public class Getmethod {
    public static void get() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("Current URL  :" +driver.getCurrentUrl());
        System.out.println("Current Title  :" +driver.getTitle());
        System.out.println("Current PageSourse  :" +driver.getPageSource());
      String Getwindow= driver.getWindowHandle();
      System.out.println("Get Window Handle" + Getwindow);
        driver.findElement(By.partialLinkText("OrangeHRM")).click();
        driver.manage().window().maximize();
        System.out.println("new Current URL  :" +driver.getCurrentUrl());
        HashSet<String> set = new HashSet<>();
       Set<String>  Windowshanldes =driver.getWindowHandles();
      System.out.println("Multiple window" +Windowshanldes);
     // List<String> handle = new ArrayList<String>(Windowshanldes);
      ArrayList<String> handle = new ArrayList<>(Windowshanldes);
        String Parentid1=handle.get(0);
        String Parentid2=handle.get(1);
        driver.switchTo().window(Parentid2);
        System.out.println(driver.getTitle());
        //Switch to Parent
        driver.switchTo().window(Parentid1);
        System.out.println(driver.getTitle());



    }
}
