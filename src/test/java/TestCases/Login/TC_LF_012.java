package TestCases.Login;

import PageObject.Login.OB_LG_012;
import org.testng.annotations.Test;

public class TC_LF_012 extends OB_LG_012 {
    //Login page User Interference.
    @Test
    public void Test12(){
        Log.info("Login page User Interference.");
        OB_LG_012 OB = new TC_LF_012();
        OB.ClickOnSignIn();
        OB.ValidateIMGisPresentOrNot();
    }
}
