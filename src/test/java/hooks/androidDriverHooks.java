package hooks;

import driver.androidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class androidDriverHooks {
    @Before
    public void initialize() {
        androidDriverInit.fillAndroidDriver();
    }

    @AfterStep
    public void afterSteps(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriverInit.getAndroidDriver()).getScreenshotAs(OutputType.BYTES), "image/png", "evidence-test");
    }

    @After
    public void quitWebDriver(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriverInit.getAndroidDriver())
                .getScreenshotAs(OutputType.BYTES), "image/png", "evidence-test");
        androidDriverInit.quit();
    }
}
