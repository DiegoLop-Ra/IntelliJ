package Prueba;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstamce.Lifecycle.PER_CLASS

@TestInstance(PER_CLASS)
public class SeleniumTest {
    Private BrowserGetter browserGetter = new BrowserGetter();
    Private WebDriver driver;

    @BeforeAll
    public void @BeforeAll(){
        driver = browserGetter.getChromeDriver();

    }

    @AfterAll
    public void afterAll(){
        driver.quit();

    }

    @Test
    public void openTheComPageAndCheckTheTitle(){
        String excpectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedTitle, driver.getTitle());
        Assertions.assertEquals(expected: 1, expected: 2);

    }

    @Test
    public void openTheOrgPageAndCheckTheTitle(){
        String excpectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedTitle, driver.getTitle());
        Assertions.assertEquals(expected: 1, expected: 2);

    }
}
