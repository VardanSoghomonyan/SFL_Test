package page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

public abstract class ProjectBaseClass {
    protected WebDriver driver;

    public ProjectBaseClass(WebDriver driver) {
        this.driver = driver;
    }

    public String generateRandomText() {
        String createdString = UUID.randomUUID().toString();
        return createdString;
    }

    public void typeRandomText(WebElement element) {
        element.sendKeys(generateRandomText());
    }

    public void typeRandomEmail(WebElement element) {
        String s = generateRandomText() + "@mailinator.com";
        element.sendKeys(s);
    }

    public void scrollToTheElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitForElementVisible(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickable(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }
}
