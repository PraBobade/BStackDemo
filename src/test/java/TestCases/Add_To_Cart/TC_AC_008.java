package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_008;
import org.testng.annotations.Test;

public class TC_AC_008 extends OB_AC_008 {
    //Validate Closing the 'Bag' by clicking on cross.
    @Test
    public void Test8() throws InterruptedException {
        Log.info("Validate Closing the 'Bag' by clicking on cross button.");
        OB_AC_008 OB = new TC_AC_008();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCrossToCloseBag();
        OB.ValidateBagClosedOrNot();
    }
}
