package TestCases.Vendors;

import PageObject.Vendors.OB_VN_004;
import PageObject.Vendors.OB_VN_005;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_005 extends OB_VN_005 {
    //Validate Vendors option For Apple and Samsung product only
    @Test
    public void Test5() throws InterruptedException {
Log.info("Validate Vendors option For Apple and Samsung product only");
        OB_VN_005 OB =new OB_VN_005();
        OB.LoginToApplication();
        OB.SelectVendorAppleAndSamsung();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
