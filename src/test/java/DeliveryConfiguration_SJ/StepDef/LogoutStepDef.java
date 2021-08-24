package DeliveryConfiguration_SJ.StepDef;

import DeliveryConfiguration_SJ.Pages.Logout;
import DeliveryConfiguration_SJ.Utilities.BrowserUtils;
import DeliveryConfiguration_SJ.Utilities.ConfigurationReader;
import DeliveryConfiguration_SJ.Utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class LogoutStepDef {
    static final Logger log = LogManager.getLogger(LogoutStepDef.class);

    Logout logout=new Logout();

    @When("I click on username")
    public void IClickOnUsername() {
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(10);
        logout.userName.click();
        log.info("Click on button");

    }

    @Then("I should see signout option")
    public void IShouldSeeSignoutOption() {
        BrowserUtils.wait(3);
        log.info("Select the signout");

    }

    @And("if i click on signout")
    public void ifIClickOnSignout(){
        BrowserUtils.wait(3);
        logout.signOut.click();
        log.info("click on signout button");

    }

    @Then("I should be logged out from app")
    public void IShouldBeLoggedOutFromApp() {
        BrowserUtils.wait(3);
        String actualT=DriverFactory.getDriver().getTitle();
                String ExpectedT="Sign in";
        Assert.assertEquals(ExpectedT,actualT);
        BrowserUtils.wait(3);

        System.out.println("Actual Title is:"+actualT);
        System.out.println("Expected Title is:"+ExpectedT);
        log.info ("verify that user is logged out");

    }


}

