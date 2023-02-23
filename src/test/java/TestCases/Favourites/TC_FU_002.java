package TestCases.Favourites;

import PageObject.Favourite.OB_FU_002;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_FU_002 extends OB_FU_002 {
    //Validate adding more than two product to favourite.
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Validate adding more than two product to favourite.");
        OB_FU_002 OB = new OB_FU_002();
        OB.LoginToApplication();
        OB.AddProductsToFavourite();
        OB.GoToFavoriteOption();



    }

}
