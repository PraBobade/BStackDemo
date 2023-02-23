package TestCases.Login;

import PageObject.Login.OB_LG_001;
import PageObject.Login.OB_LG_002;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_LF_002 extends OB_LG_002 {
    // Login into the Application using Invalid Username and Invalid password.
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Login into the Application using Invalid Username and Invalid password.");
        OB_LG_002 OB = new OB_LG_002();
        OB.ClickOnSignIn();
        Log.info("Click on Sing in button on Home Page");
        OB.setUserName("demouser");
        OB.setPassword("testingisfun99");
        OB.ClickOnLogin();
        Log.info("Login with Valid Username and password.");
        OB.ValidateErrorMessage("Invalid Username");

    }
}
