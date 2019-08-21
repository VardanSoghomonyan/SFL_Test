package page_objects;

import org.openqa.selenium.WebDriver;

public class HomePage extends ProjectBaseClass {
    protected final String HOME_PAGE_URL = "https://sflpro.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage visitHomePage() {
        driver.get(HOME_PAGE_URL);
        return this;
    }
}
