package REST;

import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
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

import java.util.stream.Stream;
import java.util.stream.Stream;

@Test
public class Streamjava {

    public static void stream()
    {
        ArrayList<String> fruits = new ArrayList<>();
        Stream.of("Apple","Banana").forEach(fruits::add);
        System.out.println(fruits);
        fruits.stream()
                            //  .filter(fruit -> fruit.startsWith("B"))  // Filter fruits starting with "A"
                .forEach(fruit -> System.out.println(fruit));


    }
}
