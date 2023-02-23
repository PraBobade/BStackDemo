package TestCases.Vendors;

import PageObject.Vendors.OB_VN_007;
import PageObject.Vendors.OB_VN_008;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_008 extends OB_VN_008 {
    //Validate Vendors option For Google and Samsung product only
    @Test
    public void Test8() throws InterruptedException {
Log.info("//Validate Vendors option For Google and Samsung product only");
        OB_VN_008 OB =new OB_VN_008();
        OB.LoginToApplication();
        OB.SelectVendorGoogleAndSamsung();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
