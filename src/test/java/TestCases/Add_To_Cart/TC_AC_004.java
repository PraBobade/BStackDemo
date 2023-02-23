package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_004;
import org.testng.annotations.Test;

public class TC_AC_004 extends OB_AC_004 {
    //Validate Bag is open or not when product is added to cart.
    @Test
    public void Test4() {
        OB_AC_004 OB = new TC_AC_004();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.CheckBagIsOpenORNot();
    }
}
