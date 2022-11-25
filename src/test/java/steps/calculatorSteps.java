package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.calculatorPage;

public class calculatorSteps {
    calculatorPage calculatorPage = new calculatorPage();
    @Given("User is on calculator page")
    public void userIsOnCalculatorPage(){
        Assert.assertTrue(calculatorPage.isResultTextIsDisplayes());
    }

    @When("User input {int} as first number")
    public void userInputAsFirstNumber(int arg0) {
        calculatorPage.inputFistNumber(arg0);
    }

    @When("User selected sum option")
    public void userSelectedSumOption() {
        calculatorPage.clickOption().clickPlus();
    }

    @When("User input {int} as second number")
    public void userInputAsSecondNumber(int arg0) {
        calculatorPage.inputSecondNumber(arg0);
    }

    @When("User click equal to button")
    public void userClickEqualToButton() {
        calculatorPage.generateResult();
    }

    @Then("Result showing as expected sum")
    public void resultShowingAsExpectedSum() {
        Assert.assertEquals(calculatorPage.validateSumResult(),calculatorPage.getTetxResult());
    }

    @When("User selected subtraction option")
    public void userSelectedSubtractionOption() {
        calculatorPage.clickOption().clickMinus();
    }

    @Then("Result showing as expected subtraction")
    public void resultShowingAsExpectedSubtraction() {
        Assert.assertEquals(calculatorPage.validateSubResult(),calculatorPage.getTetxResult());
    }

    @When("User selected multiplication option")
    public void userSelectedMultiplicationOption() {
        calculatorPage.clickOption().clickMulti();
    }

    @Then("Result showing as expected multiplication")
    public void resultShowingAsExpectedMultiplication() {
        Assert.assertEquals(calculatorPage.validateMulResult(),calculatorPage.getTetxResult());
    }

    @When("User selected division option")
    public void userSelectedDivisionOption() {
        calculatorPage.clickOption().clickDistri();
    }

    @Then("Result showing as expected division")
    public void resultShowingAsExpectedDivision() {
        Assert.assertEquals(calculatorPage.validateDivResult(),calculatorPage.getTetxResult());
    }
}