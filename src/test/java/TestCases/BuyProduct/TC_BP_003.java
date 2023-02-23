package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_003;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_003 extends OB_BP_003 {
    //Validate Order Summery in Checkout Correct or not.
    @Test
    public void Test3(){

        OB_BP_003 OB = new OB_BP_003();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressCorrect();
        OB.ClickOnSubmit();
        OB.ValidateConfirmationMessage("Your Order has been successfully placed.");
        OB.NavigateToOrder();
        OB.ValidateOrderIsPresentOrNot("ORDER PLACED");
    }
}
