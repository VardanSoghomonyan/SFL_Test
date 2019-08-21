package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderAndFooter extends HomePage {
//    private int CareerCountNumber;

    @FindBy(xpath = "//li[@id ='menu-item-3337']/a[contains(text(), 'Career')]/span")
    protected WebElement careersCount;

    @FindAll(@FindBy(xpath = "//ul[@id='sf-menu']/li[contains(@class, 'menu-item')]"))
    protected List<WebElement> topMenuElements;


    public HeaderAndFooter(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

//    public void takeCareerCount() {
//        this.CareerCountNumber = Integer.parseInt(careersCount.getText());
//    }

    public void clickOnCareerButton() {
//        waitForElementClickable(topMenuElements.get(topMenuElements.size()-1));
//        waitForElementVisible(topMenuElements.get(topMenuElements.size()-1));
        topMenuElements.get(topMenuElements.size() - 1).click();
//        waitForElementVisible(careersButton);
//        waitForElementClickable(careersButton);
//        careersButton.click();
//        return new CareersPage(driver);
    }

    public int getCareerCountNumber() {
        int CareerCountNumber = Integer.parseInt(careersCount.getText());
        return CareerCountNumber;
    }
}
