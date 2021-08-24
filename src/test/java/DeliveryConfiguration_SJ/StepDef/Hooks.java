package DeliveryConfiguration_SJ.StepDef;

import DeliveryConfiguration_SJ.Utilities.DriverFactory;
import DeliveryConfiguration_SJ.Utilities.ConfigurationReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Hooks {
    private static final Logger logger= LogManager.getLogger(Hooks.class);
    @Before
    public void setup(){
        //DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().deleteAllCookies();

    }
    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot=(TakesScreenshot) DriverFactory.getDriver();
            byte[] image= takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach screenshot to the report
            scenario.attach(image,"image/png", scenario.getName());

        }
        // DriverFactory.closeDriver();
    }
}