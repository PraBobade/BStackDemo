package TestCases.Login;

import PageObject.Login.OB_LG_009;
import org.testng.annotations.Test;

public class TC_LF_009 extends OB_LG_009 {
    // Validate the number of unsuccessful login attempts
    @Test
    public void Test9() throws InterruptedException {
        OB_LG_009 OB = new TC_LF_009();
        OB.ClickOnSignIn();
        OB.ClickOnLogin();
        Log.info("Clicking again and again on Login button to check attempts");
        OB.ClickOnLogin();
        OB.ClickOnLogin();
        OB.ClickOnLogin();
        OB.ClickOnLogin();


    }
}
