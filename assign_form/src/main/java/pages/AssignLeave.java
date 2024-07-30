package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignLeave extends BasePage {

    // make them private & final
    private final By employeeName = By.xpath("//input[@placeholder='Type for hints...']");

    By LeaveType = By.className("oxd-select-text-input");
    By LeaveTypeSelectorClickOnSelectField = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
    By selectedLeaveTypeSelector = By.xpath("//div[@class='oxd-select-option'][3]");
    By date = By.xpath("//input[@placeholder='yyyy-dd-mm']");

    By ClickOnChosenName = By.xpath("(//div[@role='option'])[1]");

    By fromCalenderDaySelect = By.xpath("(//div[@class='--holiday-full oxd-calendar-date'])[1]");
    By toCalenderDaySelect = By.xpath("(//div[@class='oxd-calendar-date'])[5]");

    By toCalenderIcon = By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]");
    By fromCalenderIcon = By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");
    By textBoxSelector = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");

    By assignSelector = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    By noRecordFoundedSelector = By.cssSelector("div[data-v-da59eaf4][data-v-3ebc98ba][role='option']");

    By ErrorMessageNoSufficientLeave = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-leave-balance-text --error']");
    By ErrorMessage_NameIsEmpty= By.className("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message");

    public AssignLeave(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterEmployeeName(String name){
       enterData(employeeName,name);
    }

    public void enterFromDate(String fromDate){
        getelements(date).get(0).sendKeys(fromDate);
    }

    public void enterToDate(String toDate){
        getelements(date).get(1).sendKeys(toDate);
    }
    public void selectLeaveType(String type){
        selectElement(LeaveType,type);

    }
    public void clickOnName() throws InterruptedException {
        Thread.sleep(5000);
        clickOnButton(ClickOnChosenName);
    }
    public void selectFromDay(){
        clickOnButton(fromCalenderDaySelect);
    }
    public void selectToDay(){
        clickOnButton(toCalenderDaySelect);
    }
    public void clickOnToCalenderIcon()
    {
        clickOnButton(toCalenderIcon);
    }
    public void clickOnFromCalenderIcon()
    {
        clickOnButton(fromCalenderIcon);
    }
    public void clickOnTextBox() throws InterruptedException {
        Thread.sleep(5000);
        clickOnButton(textBoxSelector);
    }
    public void enterCommentOnTextBox(String comment){
        enterData(textBoxSelector,comment);
    }
    public void clickOnAssign(){
        clickOnButton(assignSelector);
    }
    public void selectLeaveType(){
        clickOnButton(LeaveTypeSelectorClickOnSelectField);
        clickOnButton(selectedLeaveTypeSelector);
    }
    public byte[] FindNoRecordFound(){
        WebElement element = webDriver.findElement(noRecordFoundedSelector);

        System.out.println(  element.getText());
        return null;
    }
    public String getErrorMessage_NoSufficientLeave(){
        return webDriver.findElement(ErrorMessageNoSufficientLeave).getText();
    }
    public String getErrorMessage_NameIsEmpty(){
        return webDriver.findElement(ErrorMessage_NameIsEmpty).getText();
    }



}
