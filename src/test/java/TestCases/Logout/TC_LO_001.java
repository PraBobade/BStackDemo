package TestCases.Logout;

import PageObject.Logout.OB_LO_001;
import org.testng.annotations.Test;

public class TC_LO_001 extends OB_LO_001 {
    //Validate Functionality Of Logout Button.
    @Test
    public void Test1() throws InterruptedException {
        Log.info("Validate Functionality Of Logout Button.");
        OB_LO_001 OB = new OB_LO_001();
        OB.LoginToApplication();
        OB.ClickOnLogoutButton();
        OB.ValidateUserIsLogout();
    }
}
