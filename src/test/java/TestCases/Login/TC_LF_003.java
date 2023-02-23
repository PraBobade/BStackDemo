package TestCases.Login;

import PageObject.Login.OB_LG_003;
import org.testng.annotations.Test;

public class TC_LF_003 extends OB_LG_003 {
    // Login into the Application using Invalid Email and valid password.
    @Test
    public void Test3(){
Log.info("Login into the Application using Invalid Email and valid password.");
        OB_LG_003 OB = new OB_LG_003();
        OB.ClickOnSignIn();
        OB.setUserName("locked_user");
        OB.setPassword("testingisfun99");
        OB.ClickOnLogin();
        Log.info("Checking the error message is present or not");
        OB.ValidateErrorMessage("Your account has been locked.");


    }
}
