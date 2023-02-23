package TestCases.Vendors;

import PageObject.Vendors.OB_VN_005;
import PageObject.Vendors.OB_VN_006;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_006 extends OB_VN_006 {
    //Validate Vendors option For Apple and Google product only
    @Test
    public void Test6() throws InterruptedException {
Log.info("Validate Vendors option For Apple and Google product only");
        OB_VN_006 OB =new OB_VN_006();
        OB.LoginToApplication();
        OB.SelectVendorAppleAndGoogle();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();

    }

}
