import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;

public class DemoQATest {
    private WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    }

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testButtonClick() {
        driver.get("https://demoqa.com/elements");
       }
}
