package com.ecom.base;

import com.ecom.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\sharan\\IdeaProjects\\TestFramework\\src\\main\\java\\com\\ecom\\config\\config.properties");
            prop.load(ip);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void initialization(){
        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){
            driver = new ChromeDriver();
        }else if(browsername.equals("firefox")){
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }

}
