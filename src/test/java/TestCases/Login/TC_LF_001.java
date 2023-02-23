package TestCases.Login;

import PageObject.Login.OB_LG_001;
import org.testng.annotations.Test;

public class TC_LF_001 extends OB_LG_001 {
    // Login into the Application using valid Credentials.
    @Test
    public void Test1()  {
        Log.info("Validating Login into the Application using valid Credentials.");
        OB_LG_001 OB = new OB_LG_001();
        OB.ClickOnSignIn();
        Log.info("Click on Sing in button on Home Page");
        OB.setUserName("demouser");
        OB.setPassword("testingisfun99");
        OB.ClickOnLogin();
        Log.info("Login with Valid Username and password.");
    }
}
