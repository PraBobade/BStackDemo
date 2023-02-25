package TestCases.HomeScreen;

import PageObject.HomeScreen.OB_HC_001;
import org.testng.annotations.Test;

public class TC_HC_001 extends OB_HC_001 {

    @Test(description = "Validate The Logo is Present Or not")
    public void Test1(){
        OB_HC_001 OB = new TC_HC_001();
        OB.ValidateLogoIsPresentOrNot();
    }

}
