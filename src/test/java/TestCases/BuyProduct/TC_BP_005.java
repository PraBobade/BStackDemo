package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_005;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_005 extends OB_BP_005 {
    //Validate Checkout only sending First name in Shipping Address.
    @Test
    public void Test5() throws InterruptedException {
        Log.info("Validate Checkout only sending First name in Shipping Address.\n");
        OB_BP_005 OB  = new OB_BP_005();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressOnlyName();
        OB.ClickOnSubmit();
        OB.ValidateMsg("true");


    }
}
