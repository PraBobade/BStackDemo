package TestCases.Login;

import PageObject.Login.OB_LG_004;
import org.testng.annotations.Test;

public class TC_LF_004 extends OB_LG_004 {
    // Login into the Application using valid Email and Invalid password.
    @Test
    public void Test4() throws InterruptedException {
        Log.info("Login into the Application using valid Email and Invalid password.");
        OB_LG_004 OB = new TC_LF_004();
        OB.ClickOnSignIn();
        OB.setUserName("image_not_loading_user");
        OB.setPassword("wrongpassword");
        OB.ClickOnLogin();
        OB.ValidateErrorMessage("Invalid Password");
    }
}
