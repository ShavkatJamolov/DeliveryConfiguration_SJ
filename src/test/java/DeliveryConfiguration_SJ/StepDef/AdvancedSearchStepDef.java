package DeliveryConfiguration_SJ.StepDef;

import DeliveryConfiguration_SJ.Pages.AdvancedSearch;
import DeliveryConfiguration_SJ.Utilities.BrowserUtils;
import DeliveryConfiguration_SJ.Utilities.DriverFactory;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedSearchStepDef {
    AdvancedSearch advancedSearch = new AdvancedSearch();

    static final Logger log = LogManager.getLogger(AdvancedSearchStepDef.class);


    Actions builder = new Actions(DriverFactory.getDriver());



    @When("I click on Advanced Search")
    public void iClickOnAdvancedSearch() {
        BrowserUtils.wait(4);
        advancedSearch.AdvSearch.click();
        log.info("click on Advanced Search");

    }

    /*@And("I click on {string}")
    public void iClickOn(String Status) {
        BrowserUtils.wait(4);
        advancedSearch.Open.click();

    }

    /*@Then("I select {string}")
    public void iSelect(String Ready) {
       BrowserUtils.wait(3);
        advancedSearch.Ready.click();

    }

     */


    @And("I select date range From {string}")
    public void iSelectDateRangeFrom(String From) throws InterruptedException {
        advancedSearch.From.sendKeys("06012021");
        Thread.sleep(5000);
        BrowserUtils.wait(6);
        log.info("enter date in Created From");
    }

    @And("I select date range To {string}")
    public void iSelectDateRangeTo(String To) {
        builder.click(advancedSearch.To).sendKeys("08012021").perform();
        BrowserUtils.wait(6);
        log.info("enter date in Created To");
    }


    @Then("I click on apply button")
    public void iClickOnApplyButton() {
        builder.click(advancedSearch.Apply).perform();
        BrowserUtils.wait(9);
        log.info("click on Apply button");


    }

    @Then("My reports should display results for searched criteria")
    public void myReportsShouldDisplayResultsForSearchedCriteria() throws InterruptedException {

        Thread.sleep(6000);
        BrowserUtils.wait(10);
        if (advancedSearch.CreatedF.isDisplayed()){
            System.out.println("Created From filter is displayed");}
        else{
            System.out.println("Created From filter is NOT displayed");
        }
        BrowserUtils.wait(10);
        if (advancedSearch.CreatedT.isDisplayed()){
            System.out.println("Created To filter is displayed");}
        else {
            System.out.println("Created To filter is NOT displayed");
        }

    }



}
