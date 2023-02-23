package TestCases.Favourites;

import PageObject.Favourite.OB_FU_001;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_FU_001 extends OB_FU_001 {
    //Validate Adding the product to favourites.
    @Test
    public void Test1() throws InterruptedException {
        Log.info("Validate Adding the product to favourites.");
        OB_FU_001 OB = new OB_FU_001();
        OB.LoginToApplication();
        OB.AddProductToFavourite();
        OB.GoToFavoriteOption();

    }
}
