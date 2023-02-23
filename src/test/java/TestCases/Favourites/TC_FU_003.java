package TestCases.Favourites;

import PageObject.Favourite.OB_FU_002;
import PageObject.Favourite.OB_FU_003;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_FU_003 extends OB_FU_003 {
    //validate Adding product favourite and check in favourite section product available or not.
    @Test
    public void Test3() throws InterruptedException {
        Log.info("//validate Adding product favourite and check in favourite section product available or not.");
        OB_FU_003 OB = new OB_FU_003();
        OB.LoginToApplication();
        OB.AddProductsToFavourite();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite();
    }
}
