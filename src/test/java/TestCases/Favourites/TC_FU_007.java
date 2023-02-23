package TestCases.Favourites;


import PageObject.Favourite.OB_FU_007;
import org.testng.annotations.Test;

public class TC_FU_007 extends OB_FU_007 {
    //Validate Add product to favorite then select different product vendor and check Product is available in favorite or not.

    @Test
    public void Test7() throws InterruptedException {
        Log.info("Validate Add product to favorite then select different product vendor and check Product is available in favorite or not.");
        OB_FU_007 OB = new OB_FU_007();
        OB.LoginToApplication();
        OB.AddProductToFavourite();
        OB.SelectVendorSamsung();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite("1 Product(s) found.");

    }
}
