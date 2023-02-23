package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_015;
import org.testng.annotations.Test;

public class TC_BP_015 extends OB_BP_015 {
    //Validate Continue Shopping option After Order Placed
    @Test
    public void Test15(){
        Log.info("Validate Continue Shopping option After Order Placed");
        OB_BP_015 OB = new OB_BP_015();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressCorrect();
        OB.ClickOnSubmit();
        OB.ValidateConfirmationMessage("Your Order has been successfully placed.");
        OB.ClickOnContinueShoppingOption();
    }
}
