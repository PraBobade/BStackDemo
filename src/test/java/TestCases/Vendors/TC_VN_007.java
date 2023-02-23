package TestCases.Vendors;

import PageObject.Vendors.OB_VN_006;
import PageObject.Vendors.OB_VN_007;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_007 extends OB_VN_007 {
    //Validate Vendors option For Apple and OnePlus product only
    @Test
    public void Test7() throws InterruptedException {
        Log.info("Validate Vendors option For Apple and OnePlus product only");
        OB_VN_007 OB =new OB_VN_007();
        OB.LoginToApplication();
        OB.SelectVendorAppleAndOnePlus();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
