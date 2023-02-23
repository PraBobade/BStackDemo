package TestCases.Login;


import PageObject.Login.OB_LG_006;
import org.testng.annotations.Test;

public class TC_LF_006 extends OB_LG_006 {
    // Validate logging into the Application using Keyboard keys (Tab and Enter)
    @Test
    public void Test6() throws InterruptedException {
        Log.info("Validate logging into the Application using Keyboard keys (Tab and Enter)");
        OB_LG_006 OB = new OB_LG_006();
        OB.ClickOnSignIn();
        OB.PressTabForUserName();
        OB.PressTabForPassword();
        OB.PressEnterForLogin();
    }
}
