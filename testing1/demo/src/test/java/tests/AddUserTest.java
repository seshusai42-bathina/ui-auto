package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.OHRM.OHRMAdmin;
import pages.OHRM.OHRMAddUser;
public class AddUserTest extends BaseTest {
    OHRMAdmin adminPage = null;
    OHRMAddUser addUserPage = null;
    private void openAddUserPage() {
        adminPage = new OHRMAdmin(driver);
        adminPage.clickAdminMenu();
        addUserPage = adminPage.clickAddButton();
    }
    // TC_001
    @Test
    public void verifyAddUserPageLabels() {
        openAddUserPage();
        addUserPage.verifyLabels();
    }
    // TC_002
    @Test
    public void verifyAddUserPageDropdowns() {
        openAddUserPage();
        addUserPage.verifyDropdowns();
    }
    // TC_003
    @Test
    public void verifyAddUserPageButtons() {
        openAddUserPage();
        addUserPage.verifyButtons();
    }
    // TC_004
    @Test
    public void verifyUsernameLabel() {
        openAddUserPage();
        addUserPage.verifyLabel("Username");
    }
    // TC_005
    @Test
    public void getUserRoleLabelText() {
        openAddUserPage();
        System.out.println("User Role label: "+ addUserPage.getLabelText("User Role"));
    }
    // TC_006
    @Test
    public void verifyUserRoleSelection() {
        openAddUserPage();
        addUserPage.selectUserRole("Admin");
        System.out.println("User Role selected: Admin");
    }
    // TC_007
    @Test
    public void verifyStatusSelection() {
        openAddUserPage();
        addUserPage.selectStatus("Enabled");
        System.out.println("Status selected: Enabled");
    }
    // TC_008
    @Test
    public void verifyUsernameEntry() {
        openAddUserPage();
        addUserPage.enterUsername("testuser001");
        System.out.println("Username entered");
    }
    // TC_009: Fill form without saving
    @Test
    public void fillAddUserForm() {
        openAddUserPage();
        addUserPage.selectUserRole("Admin");
        addUserPage.enterUsername("testuser001");
        addUserPage.selectStatus("Enabled");
        addUserPage.enterPassword("Test@123");
        addUserPage.enterConfirmPassword("Test@123");
        System.out.println(
                "Form filled successfully; Save was not clicked.");
    }
}