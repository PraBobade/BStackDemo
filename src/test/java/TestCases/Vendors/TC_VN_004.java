package TestCases.Vendors;

import PageObject.Vendors.OB_VN_004;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_004 extends OB_VN_004 {
    //Validate Vendors option For OnePlus product only
    @Test
    public void Test4() throws InterruptedException {
        Log.info("Validate Vendors option For OnePlus product only");
        OB_VN_004 OB =new OB_VN_004();
        OB.LoginToApplication();
        OB.SelectVendorOnePlus();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();
    }

}
