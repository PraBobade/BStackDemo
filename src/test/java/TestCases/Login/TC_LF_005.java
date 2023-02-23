package TestCases.Login;


import PageObject.Login.OB_LG_005;
import org.testng.annotations.Test;

public class TC_LF_005 extends OB_LG_005 {
    // Validate logging into the Application without providing any credentials
    @Test
    public void Test5(){
        Log.info("Validating Login into the Application using valid Credentials.");Log.info("Validating Login into the Application using valid Credentials.");
        OB_LG_005 OB = new OB_LG_005();
        OB.ClickOnSignIn();
        Log.info("Click on Sing in button on Home Page");
        Log.info("Not provided Username and password");
        OB.ClickOnLogin();
        Log.info("Checking the error message is present or not");
        OB.ValidateErrorMessage("Invalid Username");
        Log.info("The Validation of Logging to application without Providing any Credentials successfully");

    }
}
