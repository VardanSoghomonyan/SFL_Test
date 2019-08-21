package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationQAEngineer extends HeaderAndFooter {

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//input[@value = 'Submit']")
    public WebElement Submit;

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//input[@name = 'Firstname']")
    public WebElement FirstnameField;

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//input[@name = 'Lastname']")
    public WebElement LastnameField;

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//input[@name = 'E-mailaddress']")
    public WebElement EmailAddressField;

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//input[@name = 'file-441']")
    public WebElement ChooseFileButton;

    @FindBy(xpath = "//*[@id='wpcf7-f3772-o1']//span[@role = 'alert']")
    public WebElement RecaptchaError;


    public AutomationQAEngineer(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void scrollToTheSubmitButton() {
        scrollToTheElement(Submit);
    }

    public AutomationQAEngineer fillFirstNameField() {
        typeRandomText(FirstnameField);
        return this;
    }

    public AutomationQAEngineer fillLastNameField() {
        typeRandomText(LastnameField);
        return this;
    }

    public AutomationQAEngineer fillEmailField() {
        typeRandomEmail(EmailAddressField);
        return this;
    }

    public AutomationQAEngineer uploadCV() {
        ChooseFileButton.sendKeys("/home/user/Documents/test.txt");
        return this;
    }

    public AutomationQAEngineer clickOnSubmitButton() {
        Submit.click();
        return this;
    }
}
