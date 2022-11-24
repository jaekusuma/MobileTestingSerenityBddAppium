package pages;

import io.appium.java_client.MobileBy;

public class loginPage extends basePage {
    public boolean isButtonLoginDisplayed(){
        return find(MobileBy.id("com.isl.simpleapp:id/login")).isDisplayed();
    }
    public void inputUsername(String username){
        type(MobileBy.id("com.isl.simpleapp:id/username"),username);
    }
    public void inputPassword(String password){
        type(MobileBy.id("com.isl.simpleapp:id/password"),password);
    }
    public void clickLoginButton(){
        clickObject(MobileBy.id("com.isl.simpleapp:id/login"));
    }
    public boolean isHamButtonDisplayed(){
        return find(MobileBy.AccessibilityId("Buka panel navigasi")).isDisplayed();
    }
}
