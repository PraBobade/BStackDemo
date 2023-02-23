package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_003;
import TestCases.BaseClass;
import org.testng.annotations.Test;


public class TC_AC_003 extends OB_AC_003 {
    //Validate Adding more than two product to cart.
    @Test
    public void Test3(){
        OB_AC_003 OB = new OB_AC_003();
        OB.LoginToApplication();
        OB.AddFirstProductToCart();
        OB.AddTwoMoreProductToCart();
        OB.ValidateTotalNumberOfProductInCart();
    }
}
