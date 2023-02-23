package TestCases.Login;

import PageObject.Login.OB_LG_008;
import org.testng.annotations.Test;

public class TC_LF_008 extends OB_LG_008 {
    // Validate Logging into the Application and browsing back using Browser back button
    @Test
    public void Test8(){
        Log.info("Validate Logging into the Application and browsing back using Browser back button");
        OB_LG_008 OB =new TC_LF_008();
        OB.ClickOnSignIn();
        OB.setUserName("demouser");
        OB.setPassword("testingisfun99");
        OB.ClickOnLogin();
        OB.ClickBrowserBackButton();
    }
}
