package pages;

import driver.androidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class basePage {

    public AndroidDriver<AndroidElement> getDriver(){
        return androidDriverInit.getAndroidDriver();
    }
    public AndroidElement find(By locator){
        return getDriver().findElement(locator);
    }
    public void type(By locator, String value){
        find(locator).sendKeys(value);
    }
    public void clickObject(By locator){
        find(locator).click();
    }
    public String getText(By locator){
        return find(locator).getText();
    }

}
