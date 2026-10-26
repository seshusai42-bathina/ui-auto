package pages.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OHRMLogin extends OHRMBase {
    private static final By USERNAME_FIELD =
            By.name("username");
    private static final By PASSWORD_FIELD =
            By.name("password");
    public OHRMLogin(WebDriver driver) {
        super(driver);
    }
    public void enterUsername(String username) {
        enterText(USERNAME_FIELD, username);
    }
    public void enterPassword(String password) {
        enterText(PASSWORD_FIELD, password);
    }
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickPagebutton("Login");
    }
}