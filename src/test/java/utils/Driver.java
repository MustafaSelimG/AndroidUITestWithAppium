package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability("deviceName", "emulator-5554");
            dc.setCapability("platformName", "android");
            dc.setCapability("appPackage", "com.sahibinden");
            dc.setCapability("appActivity", ".ui.supplementary.UrlForwardingActivity");
            dc.setCapability("noReset", true);

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}