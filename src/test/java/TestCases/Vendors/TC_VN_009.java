package TestCases.Vendors;

import PageObject.Vendors.OB_VN_008;
import PageObject.Vendors.OB_VN_009;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_009 extends OB_VN_009 {
    //Validate Vendors option For OnePlus and Samsung product only
    @Test
    public void Test9() throws InterruptedException {
        Log.info("Validate Vendors option For OnePlus and Samsung product only");
        OB_VN_009 OB =new OB_VN_009();
        OB.LoginToApplication();
        OB.SelectVendorSamsungAndOnePlus();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();



    }

}
