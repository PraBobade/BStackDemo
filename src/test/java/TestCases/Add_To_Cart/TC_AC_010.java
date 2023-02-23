package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_010;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_AC_010 extends OB_AC_010 {
    // Validate CheckOut Option is present or not in BAG.
    @Test
    public void Test10(){
        OB_AC_010 OB = new TC_AC_010();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ValidateCheckoutOptionIsPresentOrNot();

    }
}
