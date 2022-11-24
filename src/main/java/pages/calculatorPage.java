package pages;

import io.appium.java_client.MobileBy;

public class calculatorPage extends basePage {
    int firstNumber, secondNumber;
    String realResult = "Hasil : " + (firstNumber + secondNumber);
    public boolean isResultTextIsDisplayes(){
        return find(MobileBy.id("tv_result")).isDisplayed();
    }
    public void inputFistNumber(int number){
        type(MobileBy.id("et_1"),String.valueOf(number));
        firstNumber = number;
    }
    public void inputSecondNumber(int number){
        type(MobileBy.id("et_2"),String.valueOf(number));
        secondNumber = number;
    }
    public calculatorPage clickOption(){
        clickObject(MobileBy.id("spinner_1"));
        return this;
    }
    public calculatorPage clickPlus(){
        clickObject(MobileBy.xpath("//android.widget.TextView[@text='+']"));
        return this;
    }
    public calculatorPage clickMinus(){
        clickObject(MobileBy.xpath("//android.widget.TextView[@text='-']"));
        return this;
    }
    public calculatorPage clickDistri(){
        clickObject(MobileBy.xpath("//android.widget.TextView[@text='/']"));
        return this;
    }
    public calculatorPage clickMulti(){
        clickObject(MobileBy.xpath("//android.widget.TextView[@text='*']"));
        return this;
    }
    public void generateResult(){
        clickObject(MobileBy.id("acb_calculate"));
    }
    public String getTetxResult(){
        return getText(MobileBy.id("tv_result"));
    }
    public String validateSumResult(){
        int result = firstNumber + secondNumber;
        String finalResult = "Hasil : " + result;
        return finalResult;
    }
    public String validateSubResult(){
        int resultSum = firstNumber - secondNumber;
        String sumResult = "Hasil : " + resultSum;
        return sumResult;
    }
    public String validateMulResult(){
        int resultSum = firstNumber * secondNumber;
        String sumResult = "Hasil : " + resultSum;
        return sumResult;
    }
    public String validateDivResult(){
        int resultSum = firstNumber / secondNumber;
        String sumResult = "Hasil : " + resultSum;
        return sumResult;
    }
}
