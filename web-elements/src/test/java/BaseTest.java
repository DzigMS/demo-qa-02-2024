import org.example.config.ConfigProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUpDriver() {
        driver = ConfigProvider.getDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
