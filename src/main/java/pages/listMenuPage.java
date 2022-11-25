package pages;

import io.appium.java_client.MobileBy;


public class listMenuPage extends basePage{
    public boolean isHamBtnIsDisplayed(){
        return find(MobileBy.AccessibilityId("Buka panel navigasi")).isDisplayed();
    }
    public listMenuPage clickHamburgerBtn(){
        clickObject(MobileBy.AccessibilityId("Buka panel navigasi"));
        return this;
    }
    public void clickListMenu(){
        clickObject(MobileBy.id("et_2"));
    }
    public void swipeInListMenu(){
        swipeScreen(MobileBy.id("recycler_view"));
    }
    public void longPressInListMenu(){
        longPressObj(findElements(MobileBy.id("text_view")).get(4));
    }
    public void multiTapInMenu(){
        multipleTap(findElements(MobileBy.id("text_view")).get(4));
    }
    public void scrollToTextInListMenu(String arg0){
        scrollToText(arg0);
    }
    public void randomMultiTapInListMenu(int arg0){
        randomMultiTap(findElements(MobileBy.id("text_view")),arg0);
    }
}
