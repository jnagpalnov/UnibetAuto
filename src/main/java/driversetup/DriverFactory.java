package driversetup;

import commonutils.CommonUtils;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jatin on 1/18/2019.
 */
public class DriverFactory {
    private WebDriver driver;
    private AppiumDriver appiumDriver;

    /**
     * Singleton class
     */
    private DriverFactory() {
        initializeAppiumDriver();
    }

    private static DriverFactory instanceOfDriverFactory;

    public static DriverFactory getInstanceOfDriverFactory() {
        if(instanceOfDriverFactory ==null)
        {
            instanceOfDriverFactory = new DriverFactory();
        }
        return instanceOfDriverFactory;
    }

    /**
     * Initialize Appium driver
     */
    private void initializeAppiumDriver()  {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,CommonUtils.getCentralData("PlatformName"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,CommonUtils.getCentralData("PlatformVersion"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,CommonUtils.getCentralData("DeviceName"));
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,120);
        WebDriverManager.chromedriver().setup();
        try {
            appiumDriver= new AppiumDriver(new URL(CommonUtils.getCentralData("AppiumServerURL")),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return instance of Webdriver
     */
    public AppiumDriver getDriver(){
        return  appiumDriver;
    }

    /**
     *  Set driverFactory instance null and quit WebDriver
     */
    public void quitDriver(){
        instanceOfDriverFactory=null;
        appiumDriver.quit();
    }
}
