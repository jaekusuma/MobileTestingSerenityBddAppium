package pages;

import driver.androidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import java.time.Duration;
import java.util.List;

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
    public List<AndroidElement> findElements(By locator){
        return getDriver().findElements(locator);
    }

    TouchAction touchAction;
    public TouchAction getTouchAct(){
        touchAction = new TouchAction(getDriver());
        return touchAction;
    }
    public void longPressObj(AndroidElement elementPress){
        getTouchAct().longPress(PointOption.point(elementPress.getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .release()
                .perform();
    }
    public void multipleTap(AndroidElement elementTap){
        getTouchAct().tap(TapOptions.tapOptions().withTapsCount(10)
                .withElement(ElementOption.element(elementTap)))
                .perform();
    }
    public void randomMultiTap(List<AndroidElement> elementTap, int loop){
        for (int i = 0; i <= loop; i++){
            int randomInt = (int)Math.floor(Math.random()*(7-1+1)+1);
            getTouchAct().tap(TapOptions.tapOptions().withTapsCount(1)
                    .withElement(ElementOption.element(elementTap.get(randomInt))))
                    .perform();
        }
    }
    public void swipeScreen(By elementSwipe){
        Point coordinate = find(elementSwipe).getCenter();
        getTouchAct().press(PointOption.point(coordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(coordinate.getX(), coordinate.getY() + -1000))
                .release()
                .perform();
    }
    public void scrollToText(String textToScroll){
        getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + textToScroll + "\"))"));
    }
}