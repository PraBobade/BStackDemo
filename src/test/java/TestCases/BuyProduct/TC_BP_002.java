package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_002;
import org.testng.annotations.Test;

public class TC_BP_002 extends OB_BP_002 {
    //Validate CheckOut option in BAG after product added to cart.
    @Test
    public void Test2(){
        Log.info("Validate CheckOut option in BAG after product added to cart.\n");
        OB_BP_002 OB = new OB_BP_002();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressCorrect();
        OB.ClickOnSubmit();
        OB.ValidateConfirmationMessage("Your Order has been successfully placed.");

    }
}
