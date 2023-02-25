package TestCases.HomeScreen;

import PageObject.HomeScreen.OB_HC_004;
import org.testng.annotations.Test;

public class TC_HC_004 extends OB_HC_004 {
    @Test(description = "Validate Total Vendors Present on Home Screen")
    public void Test4(){
        OB_HC_004 OB = new TC_HC_004();
        OB.getVendorCount();
        OB.ValidateTotalVendors(4);
    }
}
