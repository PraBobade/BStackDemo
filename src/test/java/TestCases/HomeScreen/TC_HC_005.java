package TestCases.HomeScreen;

import PageObject.HomeScreen.OB_HC_005;
import org.testng.annotations.Test;

public class TC_HC_005 extends OB_HC_005 {

    @Test(description = "Validate Footer Text of Home page")
    public void Test5(){
        OB_HC_005 OB = new  OB_HC_005();
        OB.GetFooterText();
        OB.ValidateFooterText("© 2020 BrowserStack. All rights reserved.");
    }
}
