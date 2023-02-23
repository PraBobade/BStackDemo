package TestCases.Login;

import PageObject.Login.OB_LG_011;

import org.testng.annotations.Test;

public class TC_LF_011 extends OB_LG_011 {
    // Login into the Application with blocked User.
    @Test
    public void Test11(){
        Log.info("Login into the Application with blocked User.");
        OB_LG_011 OB = new OB_LG_011();
        OB.ClickOnSignIn();
        OB.setUserName("locked_user");
        OB.setPassword("testingisfun99");
        OB.ClickOnLogin();
        OB.ValidateErrorMessage("Your account has been locked.");
    }
}
