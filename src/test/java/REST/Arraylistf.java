package REST;

import java.util.*;

import org.apache.commons.compress.utils.OsgiUtils;
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
import java.util.stream.Stream;

@Test
public class Arraylistf {

    public static void arr()
    {
       ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> Cars = new ArrayList<>();

      //  List<String> Cars = Arrays.asList("apple","banana");
        Stream.of("Oraange").forEach(Cars::add);
        System.out.println(Cars);
        HashMap<String,String> maps = new HashMap<>();
        maps.put("Fruits",null);
        System.out.println(maps);
        Hashtable<String,String> mapss = new Hashtable<>();
        mapss.put("Fruits",null);
        System.out.println(mapss);
        //fruits.add("apple");
        //System.out.println(fruits);
//        Stream.of("Orange","Lemon").forEach(fruits::add);
//        System.out.println(fruits);
//        long count = Stream.of("Orange","Lemon").count();
//        System.out.println(count);

    }
}
