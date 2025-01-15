package REST;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
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

public class ReadExcel {

    @Test
    public static void readexcel() throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\user\\Automation\\Login.xlsx");
        XSSFWorkbook WB = new XSSFWorkbook(fs);
        XSSFSheet sheet1 = WB.getSheetAt(0);
        int rowcount = sheet1.getPhysicalNumberOfRows();
        int columncount = sheet1.getRow(0).getPhysicalNumberOfCells();
        for (int i = 1; i<rowcount; i++) {
            String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
            String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
            System.out.println("Value of Testcase:" + data0);
            System.out.println("Value of Testcase row2:" + data1);
        }


    }
}
