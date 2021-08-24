package DeliveryConfiguration_SJ.StepDef;

import DeliveryConfiguration_SJ.Pages.Login;
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
import org.openqa.selenium.Keys;

public class LoginStepDef {

    static final Logger log = LogManager.getLogger(LoginStepDef.class);


    Login login = new Login();

    @Given("Im on the website")
    public void im_on_the_website() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(3);
        log.info("Im on the website");

    }

    @When("I enter the credentials")
    public void i_enter_the_credentials()throws Exception{
        BrowserUtils.wait(5);
        login.SetLogin();
        log.info("Enter the credentials");

    }

    @Then("i should be able to login to main website")
    public void i_should_be_able_to_login_to_main_website() throws InterruptedException {
        BrowserUtils.wait(13);
        Thread.sleep(5000);
        // assertEquals(message(optional)String, expected, actual);
        Assert.assertEquals("Client Center", DriverFactory.getDriver().getTitle());
        log.info("Verify that you're on the main website");

    }
}

/*
    @Given("I am on the search box")
    public void iAmOnTheSearchBox() {
        System.out.println("I am on the search box");
        BrowserUtils.wait(3);
    }

    @When("I search in as {string}")
    public void iSearchInAs(String Canada) {
        BrowserUtils.wait(3);
        login.searchBox.sendKeys("Canada" + Keys.ENTER);

    }

    @Then("I should verify the result shows Canadas' sources")
    public void I_should_verify_the_result_shows_Canadas_sources() {
        BrowserUtils.wait(3);
        String actual = login.canada.getText();
        System.out.println(actual);
        BrowserUtils.wait(3);
        String expected = "Canada Beauty POS Monthly - FF Profile";
        Assert.assertEquals(expected, actual);

    }

    @When("I view the first data source in RD")
    public void iViewTheFirstDataSourceInRD() {
    BrowserUtils.wait(3);
    login.firstRD.isSelected();
    BrowserUtils.wait(3);
    login.firstRD.click();
    BrowserUtils.wait(3);


    }

    @Then("i should verify that first data source is selected")
    public void iShouldVerifyThatFirstDataSourceIsSelected() {
        BrowserUtils.wait(3);
        if(login.firstRD.isSelected()) {
            System.out.println("1st checkbox is selected");}
            else{
            System.out.println("1st checkbox is NOT selected");
        }
        
    }

    @And("i click on checkbox to uncheck")
    public void iClickOnCheckboxToUncheck() {
        BrowserUtils.wait(3);
        login.secondRD.click();
    }

    @Then("i should verify that second RD checkbox is selected")
    public void iShouldVerifyThatSecondRDCheckboxIsSelected() {
        BrowserUtils.wait(3);
        if (login.secondRD.isSelected()){
            System.out.println("2nd checkbox is selected");}
        else{
            System.out.println("2nd checkbox is NOT selected");}

    }

 */

