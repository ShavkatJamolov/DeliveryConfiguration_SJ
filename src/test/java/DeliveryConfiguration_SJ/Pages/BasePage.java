package DeliveryConfiguration_SJ.Pages;

import DeliveryConfiguration_SJ.Utilities.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
