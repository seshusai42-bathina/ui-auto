package pages.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;
public class OHRMBase extends BasePage {
    // Dynamic locator templates
    private final String pageButton = "//button[normalize-space()='@@']";
    private final String pageLabel = "//label[normalize-space(.)='@@']";
    private final String pageInput = "//label[text()='@@']/parent::div/following-sibling::div//input";
    private final String pageDropdown = "//label[text()='@@']/parent::div/following-sibling::div//i";
    private final String dropdownOption = "//div[contains(@class,'oxd-select-option')]" + "[normalize-space(.)='@@']";
    public OHRMBase(WebDriver driver) {
        super(driver);
    }
    // Button methods
    public void clickPagebutton(String title) {
        By locator = By.xpath(pageButton.replace("@@", title));
        click(locator);
    }
    public boolean isPageButtonDisplayed(String title) {
        By locator = By.xpath(pageButton.replace("@@", title));
        return isDisplayed(locator);
    }
    // Label methods
    public boolean isPageLabelDisplayed(String title) {
        By locator = By.xpath(pageLabel.replace("@@", title));
        return isDisplayed(locator);
    }
    public String getPageLabelText(String title) {
        By locator = By.xpath(pageLabel.replace("@@", title));
        return getText(locator);
    }
    // Input methods
    public void enterPageInput(String fieldName, String value) {
        By locator = By.xpath(pageInput.replace("@@", fieldName));
        enterText(locator, value);
    }
    // Dropdown methods
    public boolean isPageDropdownDisplayed(String fieldName) {
        By locator = By.xpath(pageDropdown.replace("@@", fieldName));
        return isDisplayed(locator);
    }
    public void clickPageDropdown(String fieldName) {
        By locator = By.xpath(pageDropdown.replace("@@", fieldName));
        click(locator);
    }
    public void selectPageDropdown(String fieldName, String value) {
        clickPageDropdown(fieldName);
        By optionLocator = By.xpath(dropdownOption.replace("@@", value));
        click(optionLocator);
    }
}