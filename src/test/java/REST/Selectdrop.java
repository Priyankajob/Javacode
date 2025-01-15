package REST;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;
import java.util.List;

import static REST.Driver.driver;


public class Selectdrop {
    @Test(priority = 1)



 public static  void openbrowser()
 {
//     ChromeOptions options = new ChromeOptions();
//     options.addArguments("--headless"); // Run Chrome in headless mode
//
//     // Initialize WebDriver with Chrome options
//     driver = new ChromeDriver(options);
     ChromeDriver driver = new ChromeDriver();
     WebDriver drivers = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    // driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   WebElement dropdown=driver.findElement(By.xpath("//select[contains(@id,'cou')]"));
    Select select = new Select(dropdown);
    select.selectByValue("germany");

    // dropdown.sendKeys(Keys.ARROW_DOWN);
     select.selectByValue("india");
     WebElement dropdown1=driver.findElement(By.xpath("//select[contains(@id,'animals')]"));
     dropdown1.sendKeys(Keys.ARROW_DOWN);
     Select selects = new Select(dropdown1);
     WebElement element = driver.findElement(By.xpath("//option[contains(@value,'ze')]"));
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(@value,'ze')]")));
     //wait.until(ExpectedConditions.(By.xpath("//option[contains(@value,'ze')]")));
     JavascriptExecutor js = (JavascriptExecutor)driver;
     //js.executeScript("window.scrollTo(0, 1000)");
    // js.executeScript("arguments[0].scrollIntoView(true);", element);
//     Alert alert = driver.switchTo().alert();
//     alert.accept();

//     dropdown.sendKeys(Keys.ARROW_DOWN);
//     dropdown.sendKeys(Keys.ARROW_DOWN);
//     dropdown.sendKeys(Keys.ARROW_DOWN);
//     dropdown.sendKeys(Keys.ARROW_DOWN);
//     dropdown.sendKeys(Keys.ARROW_DOWN);
 dropdown.sendKeys(Keys.CONTROL);
 Actions action = new Actions(driver);
     File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //selects.selectByValue("zebra");
     //dropdown1.sendKeys(Keys.ENTER);
     //js.executeScript("window.scrollTo(0, 1000)");
     //js.executeScript("document.getElementByXpath("//option[contains(@value,'ze')]"))).click();
     //dropdown1.sendKeys(Keys.ENTER);

//     dropdown.sendKeys(Keys.ARROW_DOWN);
//     dropdown.sendKeys(Keys.ARROW_DOWN);

//    dropdown
//     //driver.manage().window().maximize();
////     WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
////     dropdown.selectByVisibleText("India");
////     dropdown.sendKeys(Keys.ARROW_DOWN);
////     dropdown.sendKeys("Alexa Skills");
////     dropdown.click();
//
//     // Create a new Select object to interact with the dropdown
//      Select dropdownSelect = new Select(dropdown);
////
////     // Select an option by visible text
//// dropdownSelect.selectByVisibleText("India");
//// dropdownSelect.selectByIndex(5);
////  dropdownSelect.selectByValue("brazil");
////  List<WebElement> options =dropdownSelect.getOptions();
//  System.out.println("Number of dropdown" +options.size());


 }


    }



