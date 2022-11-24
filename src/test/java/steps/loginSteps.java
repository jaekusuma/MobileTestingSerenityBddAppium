package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.loginPage;

public class loginSteps {
    loginPage loginPage = new loginPage();
    @Given("User is on login page")
    public void userIsOnLoginPage(){
        Assert.assertTrue(loginPage.isButtonLoginDisplayed());
    }

    @When("User input username {string}")
    public void userInputUsername(String arg0){
        loginPage.inputUsername(arg0);
    }

    @When("User input password {string}")
    public void userInputPassword(String arg0){
        loginPage.inputPassword(arg0);
    }

    @When("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin(){
        Assert.assertTrue(loginPage.isHamButtonDisplayed());
    }
}
