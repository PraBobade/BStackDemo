package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_005;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_AC_005 extends OB_AC_005 {
    //Validate adding Quantity more than one in Bag using + button.
    @Test
    public void Test5(){
        OB_AC_005 OB = new OB_AC_005();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.AddProductQuantityInBag();
        OB.ValidateQuantityAddedOrNot();

    }
}
