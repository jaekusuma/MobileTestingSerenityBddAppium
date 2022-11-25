package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import properties.propertiesReader;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class androidDriverInit {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static AndroidDriver<AndroidElement> getAndroidDriver() {
        return androidDriver;
    }
    public static void fillAndroidDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        propertiesReader reader = new propertiesReader();
        HashMap<String, String> data = reader.readProperties().getAppiumProperties();
        data.forEach((key, value) -> capabilities.setCapability(key, value));

        String URL_APPIUM = "http://localhost:4723/wd/hub";
        try {
            androidDriver = new AndroidDriver<>(new URL(URL_APPIUM), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (Exception ignored) {
        }
    }
    public static void quit() {
        androidDriver.quit();
    }
}
