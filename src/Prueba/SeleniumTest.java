package Prueba;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.TestInstance;

import static org,junit.jupiter.api.Assertions.assertEquals;


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
    public void openThePageandCheckTheTitle(){
        String excpectedTitle = "Example Title";
        driver.get("https://www.example.com");
        assertEquals(expectedTitle, driver.getTitle());
        Assertions.assertEquals(expected: 1, expected: 2);

    }
}
