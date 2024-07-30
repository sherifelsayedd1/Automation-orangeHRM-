package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AssignLeave;
import pages.Login;

public class AssignLeaveTests extends basetest {

    private AssignLeave assignLeave;
    private Login login;
    private By LeaveType = By.className("oxd-select-text-input");



@BeforeMethod
    public void beforeMethod() throws InterruptedException {
        setupData();
    login.login("admin","admin123");
    webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave");
    }

    @Test
    public void verifyThatAssignButtonIsWorkCorrectlyWhenFillAllData() throws InterruptedException {
    assignLeave.enterEmployeeName("ra");
    assignLeave.clickOnName();
    assignLeave.selectLeaveType();
    assignLeave.clickOnFromCalenderIcon();
    assignLeave.selectFromDay();
    assignLeave.clickOnToCalenderIcon();
    assignLeave.clickOnToCalenderIcon();
    assignLeave.selectToDay();
    assignLeave.enterCommentOnTextBox("hello");

    }


    @Test
    public void VerifyThatTheSystemWillNotAssignedWhenEmployeeNameIsEmpty(){
        assignLeave.selectLeaveType();
        assignLeave.clickOnFromCalenderIcon();
        assignLeave.selectFromDay();
        assignLeave.clickOnToCalenderIcon();
        assignLeave.clickOnToCalenderIcon();
        assignLeave.selectToDay();

    }
   @Test
    public void VerifyThatTheSystemWillNotAssignedWhenEnterWrongNameInEmployeeNameField() {
       assignLeave.enterEmployeeName("12s");
       assignLeave.FindNoRecordFound();
   }
   @Test
   public void VerifyThatUserCanCommentInTextField(){
       assignLeave.enterCommentOnTextBox("hello");
    }

    private void setupData() {
        assignLeave = new AssignLeave(webDriver);
        login=new Login(webDriver);
    }

}
