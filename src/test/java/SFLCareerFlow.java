import driver_manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_objects.AutomationQAEngineer;
import page_objects.HeaderAndFooter;
import page_objects.CareersPage;
import page_objects.HomePage;

public class SFLCareerFlow {
    WebDriver driver = DriverManager.getDriver();

    @BeforeClass
    public void precondition() {
        driver.manage().window().maximize();
    }


    @Test(description = "Check the Careers count")
    public void compareVacancyCounts() throws InterruptedException {

        new HomePage(driver).visitHomePage();
        HeaderAndFooter headerAndFooterObject = new HeaderAndFooter(driver);
        Thread.sleep(2000);
        headerAndFooterObject.clickOnCareerButton();
        CareersPage careersPageObject = new CareersPage(driver);
        Assert.assertEquals(careersPageObject.totalCountOfJobs(), headerAndFooterObject.getCareerCountNumber(), "Vacancy count and open vacancy numbers are different.");
    }

    @Test(description = "Check existence of Manual QA", priority = 1)
    public void manualQAIsMissing() throws InterruptedException {
        CareersPage careersPageObject = new CareersPage(driver);
        Thread.sleep(2000);
        Assert.assertFalse(careersPageObject.isVacancyExist(careersPageObject.vacancyTitles, "Manual QA Engineer"), "Manual QA Engineer Vacancy exists");
    }

    @Test(description = "Check existence of Automation QA", priority = 2)
    public void findAutomationQA() {
        CareersPage careersPageObject = new CareersPage(driver);
        Assert.assertTrue(careersPageObject.isVacancyExist(careersPageObject.vacancyTitles, "Automation QA Engineer"), "Automation QA Engineer is Missing");
        careersPageObject.clickAutomationQAEngineer(careersPageObject.vacancyTitles);
    }

    @Test(description = "Verify the existence of recaptcha error on Automation QA position application form", priority = 3)
    public void verifyRecaptchaErrorOnPositionSubmissionForm() throws InterruptedException {
        AutomationQAEngineer automationQAEngineerObject = new AutomationQAEngineer(driver);
        automationQAEngineerObject.scrollToTheElement(automationQAEngineerObject.Submit);
        automationQAEngineerObject.fillFirstNameField()
                .fillLastNameField()
                .fillEmailField()
                .uploadCV()
                .clickOnSubmitButton();
        Thread.sleep(2000);
        Assert.assertEquals(automationQAEngineerObject.RecaptchaError.getText().trim(), "Please verify that you are not a robot.");
    }


    @AfterClass
    public void postCondition() {
        driver.close();
        driver.quit();
    }
}