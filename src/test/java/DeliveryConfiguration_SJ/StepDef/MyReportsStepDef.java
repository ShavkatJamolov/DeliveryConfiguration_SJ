package DeliveryConfiguration_SJ.StepDef;


import DeliveryConfiguration_SJ.Pages.MyReports;
import DeliveryConfiguration_SJ.Utilities.BrowserUtils;
import DeliveryConfiguration_SJ.Utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyReportsStepDef {

    static final Logger log = LogManager.getLogger(MyReportsStepDef.class);

    MyReports myReports=new MyReports();

    @Given("I am on the web main page")
    public void iAmOnTheWebMainPage() {


        String expectedTitle="Client Center";
        String ActualTite=DriverFactory.getDriver().getTitle();
        BrowserUtils.wait(7);
        Assert.assertEquals(expectedTitle,ActualTite);
        log.info("im on the main web page");
    }


    @And("I click to File Center module")
    public void i_click_File_Center_module() throws InterruptedException {

        BrowserUtils.wait(10);
        myReports.FileCenter.click();
        log.info ("select File Center");

    }

    @Then("I make sure there is no {string} module")
    public void iMakeSureThereIsNoModule(String arg0) throws InterruptedException {
        BrowserUtils.wait(5);
        Thread.sleep(5000);
        DriverFactory.getDriver().navigate().refresh();

        List<WebElement> myReportsModule=DriverFactory.getDriver().findElements(By.xpath("//span[text()='My Reports']"));
        if (myReportsModule.size()==0){
            System.out.println("There is no My Reports Module..Passed!!!");
            log.info ("Make sure there's no My Reports module");
        }else{
            System.out.println("My Reports Module shows up before impersonating...Failed!!!");
            log.info("My reports shows before impersonation");
        }

    }

    @Then("I click to user icon")
    public void I_click_to_user_icon() throws InterruptedException {
/*
        String expectedTitle2 = "Client Center";
        String actualTitle2 = DriverFactory.getDriver().getTitle();
        BrowserUtils.wait(5);
        Assert.assertEquals(expectedTitle2, actualTitle2);
*/
        // Thread.sleep(10);
        DriverFactory.getDriver().navigate().refresh();
        BrowserUtils.wait(15);
        myReports.icon.click();
        System.out.println("B button");
        log.info ("click on user icon");
    }

    @And("I click to {string}")
    public void iClickToStartimpersonating(String bob) throws InterruptedException {
        BrowserUtils.wait(10);
        Thread.sleep(5000);
        myReports.startImp.click();
        log.info("start impersonation");

    }

    @Then("I add {string} as an username in box")
    public void I_add_Bob_backline_as_an_username_in_box(String bobby) {
        BrowserUtils.wait(10);
        myReports.box.sendKeys("Bob Backline");
        log.info ("enter Bob Backline");
    }


    @And("I click to {string} button")
    public void iClickToButton(String backline) {
        BrowserUtils.wait(15);
        myReports.startImp2.click();
        log.info ("click on start impersonation button");
    }


    @Then("I click to Myreports button")
    public void iClickToMyreportsButton() {
        BrowserUtils.wait(15);
        myReports.Myreports.click();
        log.info ("click on My reports");

    }

    @And("Im on the Myreports module")
    public void imOnTheMyreportsModule() {
        BrowserUtils.wait(5);
        if (myReports.Myreports.isDisplayed()) {
            System.out.println("PASSED!!My Reports Module is here");
            log.info("My Reports module is visible");
        } else {
            System.out.println("FAILED");
            log.info("My Reports module is NOT visible");
        }

    }


}
