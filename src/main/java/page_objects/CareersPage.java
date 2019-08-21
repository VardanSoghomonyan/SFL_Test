package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareersPage extends HeaderAndFooter {

    @FindAll(@FindBy(css = ".s-careers-title"))
    public List<WebElement> vacancyTitles;


    public CareersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public boolean isVacancyExist(List<WebElement> list, String name) {
        boolean exist = false;
        for (WebElement item : list) {
            if (item.getText().trim().equals(name)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public int totalCountOfJobs() {
        int jobsCount = vacancyTitles.size();
        return jobsCount;
    }

    public void clickAutomationQAEngineer(List<WebElement> list) {
        String title = "Automation QA Engineer";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().trim().equals(title)) {
                list.get(i).click();
            }
        }
    }
}
