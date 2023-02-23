package TestCases.Vendors;

import PageObject.Vendors.OB_VN_001;
import org.testng.annotations.Test;

public class TC_VN_001 extends OB_VN_001 {
    //Validate Vendors option For Apple product only
    @Test
    public void Test1() throws InterruptedException {
        Log.info("Validate Vendors option For Apple product only");
        OB_VN_001 OB = new OB_VN_001();
        OB.LoginToApplication();
        OB.SelectVendorApple();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
