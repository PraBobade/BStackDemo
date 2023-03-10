package TestCases.Logout;


import PageObject.Logout.OB_LO_002;
import org.testng.annotations.Test;

public class TC_LO_002 extends OB_LO_002 {
    //Validate logging out Using browsers back button.

    @Test(description = "Validate logging out Using browsers back button.")
    public void Test2()  {
        Log.info("Validate logging out Using browsers back button.");
        OB_LO_002 OB = new OB_LO_002();
        OB.LoginToApplication();
        OB.ClickOnLogoutButton();
        OB.ClickBrowsersBackButton();
    }
}
