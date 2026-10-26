package pages.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class OHRMAdmin extends OHRMBase {
    private static final By ADMIN_MENU = By.xpath("//span[normalize-space()='Admin']");
    private static final By USER_ROLE_LABEL = By.xpath("//label[normalize-space(.)='User Role']");
    public OHRMAdmin(WebDriver driver) {
        super(driver);
    }
    public void clickAdminMenu() {
        click(ADMIN_MENU);
    }
    public OHRMAddUser clickAddButton() {
        clickPagebutton("Add");
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_ROLE_LABEL));
        return new OHRMAddUser(driver);
    }
}