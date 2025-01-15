package REST;
import org.openqa.selenium.By;
import java.util.Properties;

//import static com.qtpselenium.test.DriverScript.OR;

import java.io.File;

//import static com.qtpselenium.test.DriverScript.OR;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class Driver {

    public static Properties CONFIG;
    public static Properties OR;


    static WebDriver driver;
    static WebDriverWait wait;




    public static void main(String[] args) throws IOException {

        // TODO Auto-generated method stub

        FileInputStream fs = new FileInputStream("C:\\Users\\user\\Automation\\Login.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        int rowcount = sheet1.getPhysicalNumberOfRows();
        int columncount = sheet1.getRow(0).getPhysicalNumberOfCells();
        //String data1= sheet1.getRow(0).getCell(0).getStringCellValue();

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();




        //String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
        //System.out.println("Sheet1" + sheet1);
        for(int i=1;i<rowcount;i++)
        {

            String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println("Value of Testcase:" + data0);
            String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
            String data3 = sheet1.getRow(i).getCell(2).getStringCellValue();
            //	String or = OR.getProperty(data3);
            String data4 = sheet1.getRow(i).getCell(3).getStringCellValue();

            //	for(int j=0;j<columncount;j++)
            //	{
            //System.out.println("Value of Testcase:" + data0);

            //System.out.println("Value of locatortype:" + data2);

            //  System.out.println("Value of locatorvalue:" + data3);
            // System.out.println("Value of Testdata:" + data4);
            if(!data2.equalsIgnoreCase("null"))
            {
                // Keyword k= new Keyword();
                // Keyword.locatorValue(data0, data2, data3);
                // k.locatorValue(data0, data2, data3);
                locatorValue(data0,data2,data3);
                choosekeywords(data0,data2,data3,data4);



            }else

            {
                System.out.println("Locator value missing");
                takescreenshot();

            }



        }

        //}


    }//






    public static void choosekeywords(String data0,String data2,String data3,String data4)
    {
        switch(data0)
        {
            case "click_On_Link":
                click_On_Link(data0,data2,data3);
                break;
            case "enter_Text":
                enter_Text(data0,data2,data3,data4);
                break;
            case "click_On_Button":
                click_On_Button(data0,data2,data3);
                break;
            case "open_Browser":
                open_Browser(data4);
                break;
            case "enter_URL":
                enter_URL(data4);
                break;



        }

    }


    public static By locatorValue(String data0,String data2, String data3) {
        By by;
        switch (data2) {
            case "id":
                by = By.id(data3);
                break;
            case "name":
                by = By.name(data3);
                break;
            case "xpath":
                by = By.xpath(data3);
                break;
            case "css":
                by = By.cssSelector(data3);
                break;
            case "linkText":
                by = By.linkText(data3);
                break;
            case "partialLinkText":
                by = By.partialLinkText(data3);
                break;
            default:
                by = null;
                break;
        }
        return by;
    }





    public static void click_On_Link(String data0,String data2, String data3) {
        try {
            By locator;
            locator = locatorValue(data0,data2, data3);
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (NoSuchElementException e) {
            System.err.format("No Element Found to enter text" + e);
        }
    }

    public static void enter_Text(String data0,String data2, String data3, String data4) {
        try {
            By locator;
            locator = locatorValue(data0,data2, data3);
            WebElement element = driver.findElement(locator);
            element.sendKeys(data4);
        } catch (NoSuchElementException e) {
            System.err.format("No Element Found to enter text" + e);
            System.out.println("Locator value missing");
            takescreenshot();
        }
    }


    public static void click_On_Button(String data0,String data2, String data3) {
        try {
            By locator;
            locator = locatorValue(data0,data2,data3);
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (NoSuchElementException e) {
            System.err.format("No Element Found to perform click" + e);
            System.out.println("Locator value missing");
            takescreenshot();

        }
    }
    public static void open_Browser(String data4) {
        try {
            if (data4.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (data4.equalsIgnoreCase("chrome")) {
                 driver = new ChromeDriver();

            } else if (data4.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver",
                        "D:/Jars/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void enter_URL(String data4) {
        driver.navigate().to(data4);
    }


    public static void takescreenshot()
    {
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:/selenium/error.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }
    }




}
