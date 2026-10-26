package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.OHRM.OHRMLogin;
import utils.ConfigReader; 
public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        OHRMLogin loginPage =new OHRMLogin(driver);
        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}