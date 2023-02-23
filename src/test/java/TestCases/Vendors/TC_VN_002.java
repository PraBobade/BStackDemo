package TestCases.Vendors;


import PageObject.Vendors.OB_VN_002;
import org.testng.annotations.Test;

public class TC_VN_002 extends OB_VN_002 {
    //Validate Vendors option For Samsung product only
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Validate Vendors option For Samsung product only");
        OB_VN_002 OB = new OB_VN_002();
        OB.LoginToApplication();
        OB.SelectVendorSamsung();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
