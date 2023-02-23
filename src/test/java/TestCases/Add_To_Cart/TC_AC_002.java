package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_002;
import org.testng.annotations.Test;

public class TC_AC_002 extends OB_AC_002 {
    //Validate adding the product to Cart from 'Wish List' Page
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Validate adding the product to Cart from 'Wish List' Page");
        OB_AC_002 OB = new TC_AC_002();
        Log.info("Login to application");
        OB.LoginToApplication();
        Log.info("Click on add to favourite button");
        OB.AddProductToFavourite();
        Log.info("Go to Favourite option");
        OB.GoToFavoriteOption();
        Log.info("Add Product to cart.");
        OB.AddProductToCart();
        Log.info("Check Product Added To Cart Or Not");
        OB.CheckProductAddedToCartOrNot();
    }
}
