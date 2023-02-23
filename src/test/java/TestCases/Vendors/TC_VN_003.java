package TestCases.Vendors;

import PageObject.Vendors.OB_VN_003;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_003 extends OB_VN_003 {
    //Validate Vendors option For Google product only
    @Test
    public void Test3() throws InterruptedException {
        Log.info("Validate Vendors option For Google product only");
        OB_VN_003 OB = new TC_VN_003();
        OB.LoginToApplication();
        OB.SelectVendorGoogle();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();

    }

}
