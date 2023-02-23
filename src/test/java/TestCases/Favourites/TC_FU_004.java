package TestCases.Favourites;

import PageObject.Favourite.OB_FU_004;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_FU_004 extends OB_FU_004 {
    //Validate Removing product from Favourite.
    @Test
    public void Test4() throws InterruptedException {
        Log.info("Validate Removing product from Favourite.");
        OB_FU_004 OB = new OB_FU_004();
        OB.LoginToApplication();
        OB.AddProductsToFavourite();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite();
        OB.RemoveProductsFromFavourite();
        OB.ValidateProductsRemoved();


    }
}
