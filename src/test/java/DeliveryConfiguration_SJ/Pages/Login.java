package DeliveryConfiguration_SJ.Pages;

import DeliveryConfiguration_SJ.Utilities.BrowserUtils;
import DeliveryConfiguration_SJ.Utilities.ConfigurationReader;
import DeliveryConfiguration_SJ.Utilities.EmailUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.joda.time.LocalDateTime;

public class Login extends BasePage {

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement userName;
    @FindBy(id = "nextBtn")
    private WebElement NextButton;

    //b2c username page
    @FindBy(id = "rawUserInput")
    private WebElement b2c_userName;
    @FindBy(id = "continue")
    private WebElement b2c_NextButton;
    @FindBy(className = "confirmlogin-card")
    private WebElement unrecognized_ip_window;
    @FindBy(className = "card-message")
    private WebElement unrecognized_ip_message;
    @FindBy(id = "VerificationCode")
    private WebElement key_input_field;
    @FindBy(className = "verifyCode")
    private WebElement verify_code_btn;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement SignIn;

    @FindBy(id = "idSIButton9")
    private WebElement StaySignedIn;

    //@FindBy (xpath = "//input[@type='submit']")
/*
    @FindBy(xpath = "(//button[@class='MuiButton-label jss23'])[5]")
    private WebElement DeliveryConfig;
    @FindBy(xpath = "//span[@class= 'MuiButtonBase-root MuiTableSortLabel-root jss107']")
    private WebElement sorting;
    //xpath syntax ="div(@class='paste here your locator')"

    @FindBy(xpath = "//input [@id='basicSearch-Search']")
    public WebElement searchBox;


    public void setDeliveryConfig() {
        BrowserUtils.wait(3);
        DeliveryConfig.click();
    }

    @FindBy(xpath = "//td[.='Canada Beauty POS Monthly - FF Profile']")
//xpath="//div[.='yourtext']"
    public WebElement canada;


    @FindBy(xpath = "//table[@aria-labelledby='tableTitle']/tbody/tr[21]/td[5]/span/span/input")
    public WebElement firstRD;


    @FindBy(xpath = "//table[@aria-labelledby='tableTitle']/tbody/tr[1]/td[5]/span/span/input")
    public WebElement secondRD;

*/
    public void SetLogin()throws Exception{
        EmailUtils emailUtils = new EmailUtils();
        String userNameValue = ConfigurationReader.getProperty("userNameValue");
        String passwordValue = ConfigurationReader.getProperty("passwordValue");
        try {
            userName.sendKeys(userNameValue);
            BrowserUtils.wait(7);
            NextButton.click();
            BrowserUtils.wait(7);
        } catch (Exception e) {
            b2c_userName.sendKeys(userNameValue);
            BrowserUtils.wait(7);
            b2c_NextButton.click();
            BrowserUtils.wait(7);
        }
        password.sendKeys(passwordValue);
        BrowserUtils.wait(7);
        SignIn.click();
        BrowserUtils.wait(5);
        StaySignedIn.click();
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println("Time Now: "+timeNow);
        BrowserUtils.wait(10);
        boolean needVerification = emailUtils.needToBeVerified();
        if (needVerification){
            BrowserUtils.waitVisibilityOf(unrecognized_ip_window);
            BrowserUtils.wait(3);
            String Code_verification_window_message = unrecognized_ip_message.getText();
            System.out.println("Code Verification Window Message: "+Code_verification_window_message);
            String securityKey = emailUtils.getSecurityKey(timeNow, "Bob.Backline1@npd.com", "kline1OB", "Bob");
            BrowserUtils.wait(2);
            key_input_field.sendKeys(securityKey);
            BrowserUtils.wait(2);
            verify_code_btn.click();
            BrowserUtils.wait(2);
        }
    }
}

