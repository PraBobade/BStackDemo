package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_011;
import org.testng.annotations.Test;

public class TC_AC_011 extends OB_AC_011 {
    //validate after increasing the quantity of product the price also increases.

    @Test
    public void Test11(){
        Log.info("validate after increasing the quantity of product the price also increases.");
        OB_AC_011 OB = new OB_AC_011();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.AddProductQuantityInBag();
        OB.ValidateThePrice();
    }
}
