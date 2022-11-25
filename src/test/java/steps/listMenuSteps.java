package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.listMenuPage;

public class listMenuSteps {
    listMenuPage listMenuPage = new listMenuPage();
    @When("User click on hamburger button and click on list menu")
    public void userClickOnHamburgerButtonAndClickOnListNenu(){
        listMenuPage.clickHamburgerBtn().clickListMenu();
    }

    @Then("User doing swipe in the screen")
    public void userDoingSwipeInTheScreen() {
        listMenuPage.swipeInListMenu();
    }

    @Then("user doing long press in list menu")
    public void userDoingLongPressInListMenu() {
        listMenuPage.longPressInListMenu();
    }

    @Then("User doing multiple tap on single list menu")
    public void userDoingMultipleTapOnSingleListMenu() {
        listMenuPage.multiTapInMenu();
    }

    @Then("User doing random {int} multiple tap in list menu")
    public void userDoingRandomMultipleTapInListMenu(int arg0) {
        listMenuPage.randomMultiTapInListMenu(arg0);
    }

    @Then("User doing scroll until text {string} showed")
    public void userDoingScrollUntilTextShowed(String arg0) {
        listMenuPage.scrollToTextInListMenu(arg0);
    }
}
