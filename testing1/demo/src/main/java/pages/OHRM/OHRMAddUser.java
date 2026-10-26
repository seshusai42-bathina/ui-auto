package pages.OHRM;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
public class OHRMAddUser extends OHRMBase {
    public OHRMAddUser(WebDriver driver) {
        super(driver);
    }
    // TC_001: Verify all labels
    public void verifyLabels() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPageLabelDisplayed("User Role"),"User Role label is not displayed");
        softAssert.assertTrue(isPageLabelDisplayed("Employee Name"),"Employee Name label is not displayed");
        softAssert.assertTrue(isPageLabelDisplayed("Status"),"Status label is not displayed");
        softAssert.assertTrue(isPageLabelDisplayed("Username"),"Username label is not displayed");
        softAssert.assertTrue(isPageLabelDisplayed("Password"),"Password label is not displayed");
        softAssert.assertTrue(isPageLabelDisplayed("Confirm Password"),"Confirm Password label is not displayed");
        softAssert.assertAll();
    }
    // TC_002: Verify dropdowns
    public void verifyDropdowns() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPageDropdownDisplayed("User Role"),"User Role dropdown is not displayed");
        softAssert.assertTrue(isPageDropdownDisplayed("Status"),"Status dropdown is not displayed");
        softAssert.assertAll();
    }
    // TC_003: Verify buttons
    public void verifyButtons() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPageButtonDisplayed("Save"),"Save button is not displayed");
        softAssert.assertTrue(isPageButtonDisplayed("Cancel"),"Cancel button is not displayed");
        softAssert.assertAll();
    }
    // TC_004: Verify one label
    public void verifyLabel(String fieldName) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(isPageLabelDisplayed(fieldName),fieldName + " label is not displayed");
        softAssert.assertAll();
    }
    // TC_005: Read label text
    public String getLabelText(String fieldName) {
        return getPageLabelText(fieldName);
    }
    // TC_006: Enter generic field
    public void enterField(String fieldName, String value) {
        enterPageInput(fieldName, value);
    }
    public void enterUsername(String username) {
        enterField("Username", username);
    }
    public void enterPassword(String password) {
        enterField("Password", password);
    }
    public void enterConfirmPassword(String password) {
        enterField("Confirm Password", password);
    }
    // TC_007: Select dropdowns
    public void selectUserRole(String role) {
        selectPageDropdown("User Role", role);
    }
    public void selectStatus(String status) {
        selectPageDropdown("Status", status);
    }
    // TC_008: Save and Cancel
    public void clickSave() {
        clickPagebutton("Save");
    }
    public void clickCancel() {
        clickPagebutton("Cancel");
    }
}