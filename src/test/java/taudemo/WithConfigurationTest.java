package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithConfigurationTest {

    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getDriver();
    }

    @Test
    public void justATest() {
        driver.get("https://www.example.org");
        assertEquals(driver.getTitle(), "Example Domain");

    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }


}
