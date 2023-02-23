package TestCases;

import Utilities.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {


    public static ReadConfig read = new ReadConfig();

    public static WebDriver driver;
    public static Logger Log;
    public static WebDriverWait wait;
    public static Actions act;

   @BeforeClass
    public void setup() {
        Log = Logger.getLogger("FlipKart.com");  //Logger.getLogger("eBanking");
        PropertyConfigurator.configure("Log4j.properties");

        if (read.GetBrowser().contains("hrome")) {
            System.out.println("Opening in Chrome Browser");
            System.setProperty("webdriver.chrome.driver", read.getChromeDriverPath());
            driver = new ChromeDriver();
        }
        if (read.GetBrowser().contains("nternet")) {
            System.setProperty("webdriver.ie.driver", read.getIEDriverPath());
            driver = new InternetExplorerDriver();
        }
        if (read.GetBrowser().contains("dge")) {
            System.setProperty("webdriver.edge.driver", read.getEdgeDriverPath());
            driver = new EdgeDriver();
        }
        if (read.GetBrowser().contains("ire")) {
            System.setProperty("webdriver.edge.driver", read.getFireFoxDriverPath());
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(read.getUrl());
        act = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void ScreenShot(WebDriver driver, String path) throws IOException {
        File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sc, new File(path));
    }

   // @AfterClass
    public void CloseBrowser() {
        driver.quit();
    }
}
