package TestCases.HomeScreen;

import PageObject.HomeScreen.OB_HC_003;
import org.testng.annotations.Test;

public class TC_HC_003 extends OB_HC_003 {
    @Test(description = "Validate Total Products display on screen")
    public void Test3(){
        OB_HC_003 OB = new TC_HC_003();
        OB.GetTotalProductDisplayOnScreen();
        OB.ValidateTotalProduct("2");
    }
}
