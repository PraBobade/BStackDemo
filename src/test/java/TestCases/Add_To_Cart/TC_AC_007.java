package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_005;
import PageObject.Add_To_Cart.OB_AC_007;
import org.testng.annotations.Test;

public class TC_AC_007 extends OB_AC_007 {
    //Validate adding Quantity more than one in Bag using + button and remove using - button.
    @Test
    public void Test7(){
        Log.info("Validate adding Quantity more than one in Bag using + button and remove using - button.");

        OB_AC_007 OB = new OB_AC_007();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.AddProductQuantityInBag();
        OB.RemoveProductQuantityInBag();
        OB.ValidateQuantityIsCorrectORNot();

    }
}
