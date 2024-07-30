package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MyLeave extends BasePage{

    public MyLeave(WebDriver webDriver) {
        super(webDriver);
    }
    By calenderFromIconSelector = By.xpath("(//input[@placeholder=\"dd-mm-yyyy\"])[1]");
    By CalenderTOIconSelector = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    By SelectedToDaySelector = By.xpath("(//div[@class='oxd-calendar-date'])[7]");
    By selectedFromDaySelector = By.xpath("(//div[@class='oxd-calendar-date'])[1]");



    By X_Icon = By.xpath("//i[@class='oxd-icon bi-x --clear']");
//    By scheduled_X_Icon= By.xpath("(//i[@class='oxd-icon bi-x --clear'])[2]");
//    By taken_X_icon = By.xpath("(//i[@class='oxd-icon bi-x --clear'])[3]");
//    By cancelled_X_icon = By.xpath("(//i[@class='oxd-icon bi-x --clear'])[4]");
//    By rejected_X_icon = By.xpath("(//i[@class='oxd-icon bi-x --clear'])[5]");

    By PendingApprovalSelector = By.xpath("(//div[@class='oxd-select-option'])[3]");
    By scheduledSelector = By.xpath("(//div[@class='oxd-select-option'])[4]");
    By takenSelector = By.xpath("(//div[@class='oxd-select-option'])[5]");
    By cancelledSelector = By.xpath("(//div[@class='oxd-select-option'])[2]");
    By rejectedSelector = By.xpath("(//div[@class='oxd-select-option'])[1]");

    By showLeaveStatusSelector= By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By LeaveTypeClickSelector = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By selectedLeaveTypeSelector = By.xpath("(//div[@class='oxd-select-option'])[2]");

    By threeDotSelector = By.xpath("(//button[@class='oxd-icon-button'])[3]");
    By AddCommentSelector = By.xpath("(//li[@class='oxd-table-dropdown-item'])[1]");
    By viewLeaveSelector = By.xpath("(//li[@class='oxd-table-dropdown-item'])[2]");
    By ViewPIMSelector = By.xpath("(//li[@class='oxd-table-dropdown-item'])[3]");
    By ErrorRequiredInLeaveStatus = By.className("oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message");

    public void clickOnFromCalenderIcon() throws InterruptedException {
        new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(calenderFromIconSelector));
        clickOnButton(calenderFromIconSelector);
    }
    public void clickOnToCalenderIcon(){
        clickOnButton(CalenderTOIconSelector);
    }
    public void selectFromDate(){
        clickOnButton(selectedFromDaySelector);
    }
    public void selectToDate(){
        clickOnButton(SelectedToDaySelector);
    }
    public void removePendingApproval(){
        
//        clickOnButton(PendingApproval_X_Icon);
   }
    public void removeLeaveStatus() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> listRemove = getelements(X_Icon);
        listRemove.get(0).click();
    }

//    public void removeTaken(){
//        clickOnButton(taken_X_icon);
//    }
//    public void removeCancelled(){
//        clickOnButton(cancelled_X_icon);
//    }
//    public void removeRejected()
//    {
//        clickOnButton(rejected_X_icon);
//    }
//    public void clickOnShowLeaveWithStatus() {
//        clickOnButton(showLeaveStatusSelector);
//    }
//
//    public void addPendingApproval(){
//
//       clickOnButton(PendingApprovalSelector);
//    }
//    public void addScheduled(){
//        clickOnButton(scheduledSelector);
//    }
    public void AddTaken(){
        clickOnButton(takenSelector);
    }
    public void AddCancelled(){
        clickOnButton(cancelledSelector);
    }
    public void addRejected()
    {
        clickOnButton(rejectedSelector);
    }
    public void clickOnLeaveType(){
        clickOnButton(LeaveTypeClickSelector);
    }
    public void selectLeaveType()
    {
        clickOnButton(selectedLeaveTypeSelector);
    }
    public void clickOnThreeDot(){
        clickOnButton(threeDotSelector);
    }
    public void addComment()
    {
        clickOnButton(AddCommentSelector);
    }
    public void viewLeave()
    {
        clickOnButton(viewLeaveSelector);
    }
    public void viewPimInfo(){
        clickOnButton(ViewPIMSelector);
    }


}
