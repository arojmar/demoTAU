package taudemo;

import browser.BrowserGetter;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {

    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;


    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openThePageAndCheckTheTitle() {
        String expectedTitle = "Example title";
    }

}
