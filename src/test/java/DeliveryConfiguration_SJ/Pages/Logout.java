package DeliveryConfiguration_SJ.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {


    @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiIconButton-root')]")
    public WebElement userName;



      @FindBy(xpath= "//a[@href='/account/signout']")
    public WebElement signOut;
}
