package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_005;
import PageObject.BuyProduct.OB_BP_006;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_006 extends OB_BP_006 {
    //Validate Checkout only sending First name and Last name in Shipping address.
    @Test
    public void Test6() throws InterruptedException {
        Log.info("Validate Checkout only sending First name and Last name in Shipping address.");
        OB_BP_006 OB  = new OB_BP_006();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressOnlyFirstNameAndLastName("Rahul","Dixit");
        OB.ClickOnSubmit();
        OB.ValidateMsg("true");
    }
}
