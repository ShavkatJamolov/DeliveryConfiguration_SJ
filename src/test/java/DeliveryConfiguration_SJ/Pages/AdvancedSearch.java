package DeliveryConfiguration_SJ.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearch extends BasePage {

    @FindBy(id = "advanced-search-button")
    public WebElement AdvSearch;

    //@FindBy(id = "basicSearch-")
    //public WebElement Open;

   // @FindBy (xpath ="//div[@class='MuiInputBase-root MuiInput-root MuiAutocomplete-inputRoot MuiInputBase-fullWidth MuiInput-fullWidth MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedEnd']");
    //public WebElement Ready;


    //"//*[local-name()='svg' and @data-icon='home']/*[localname()='path']"
    //@FindBy (xpath="/*[name()='svg']/*[name()='MuiSvgIcon-root']")

    @FindBy (xpath = "(//input[@placeholder='From'])[1]")
    public WebElement From;

    @FindBy (xpath = "//input[@placeholder='To']")
    public WebElement To;

    @FindBy (xpath="//span[.='Apply']")
    public WebElement Apply;

    @FindBy (xpath="//td[text()= 'Created From: ']")
    public WebElement CreatedF;

    @FindBy (xpath="//td[text()= 'Created To: ']")
    public WebElement CreatedT;



}
