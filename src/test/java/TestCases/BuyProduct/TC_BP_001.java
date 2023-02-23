package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_001;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_001 extends OB_BP_001 {
    //Validate by a product with all information sending correctly.
    @Test
    public void Test1(){
        Log.info("Validate by a product with all information sending correctly.");
        OB_BP_001 OB = new OB_BP_001();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressCorrect();
        OB.ClickOnSubmit();
        OB.ValidateConfirmationMessage("Your Order has been successfully placed.");
    }
}
