package TestCases.Favourites;

import PageObject.Favourite.OB_FU_003;
import PageObject.Favourite.OB_FU_006;
import org.testng.annotations.Test;

public class TC_FU_006 extends OB_FU_006 {
    //Validate Add product to favorite then select same product vendor and check Product is available in favorite or not.
    @Test
    public void Test6() throws InterruptedException {
        Log.info("Validate Add product to favorite then select same product vendor and check Product is available in favorite or not.");
        OB_FU_006 OB = new OB_FU_006();
        OB.LoginToApplication();
        OB.AddProductToFavourite();
        OB.SelectVendorApple();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite();


    }
}
