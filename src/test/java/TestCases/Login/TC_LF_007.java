package TestCases.Login;

import PageObject.Login.OB_LG_007;
import org.testng.annotations.Test;

public class TC_LF_007 extends OB_LG_007 {
    // Validate E-Mail Address and Password text fields in the Login page have the placeholder text.
    @Test
    public void Test7(){
Log.info("Validate E-Mail Address and Password text fields in the Login page have the placeholder text.");
        OB_LG_007 OB = new OB_LG_007();
        OB.ClickOnSignIn();
        OB.validateUserNamePlaceholder("Select Username");
        OB.validatePasswordPlaceholder("Select Password");
    }
}
