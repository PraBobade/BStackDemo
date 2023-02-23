package TestCases.Login;

import PageObject.Login.OB_LG_010;
import org.testng.annotations.Test;

public class TC_LF_010 extends OB_LG_010 {
    // Validate the copying of the text entered into the Password field
    @Test
    public void Test10(){
        Log.info("Validate the copying of the text entered into the Password field");
        OB_LG_010 OB = new TC_LF_010();
        OB.ClickOnSignIn();
        OB.setUserName("demouser");
        OB.SelectTextFromUserName();
        Log.error("Not able to Select the text");
    }
}
