package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.MyLeave;

public class MyLeaveTests extends basetest {
    Login login;
    MyLeave myLeave;


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        setupData();
        login.login("admin","admin123");
        webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewMyLeaveList");
    }



@Test
public void verifyThatSystemCanSelectLeaveTypeSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
      myLeave.clickOnLeaveType();
      myLeave.selectLeaveType();
}
@Test
public void VerifyThatUserCanRemoveLeaveStatusSuccessfully() throws InterruptedException {
        myLeave.removeLeaveStatus();
}


    private void setupData() {
        myLeave = new MyLeave(webDriver);
        login=new Login(webDriver);
    }
}
