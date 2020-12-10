package Prueba;

public class WithConfigurationTest{

    @Test
    public void firstAssertion() {
        assertEquals(1, 1);
    }

    @Test
    public void secondAssertion() {
        assertEquals(45, 45);
    }

    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getdriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justATest() {
        driver.get("https://www.example.com");
        assertEquals("Example domain", driver.getTitle());
    }
}