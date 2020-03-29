package helpers;

import helpers.TestBegin;
import pages.AppStore;
import pages.Basket;
import pages.CategoryStore;

import java.util.ArrayList;

public class TestSettings extends TestBegin {

    private CategoryStore categoryStore;
    private AppStore appStore;
    private Basket basket;

    public ArrayList<String> settingsTestAddProduct(String nameProduct){

        ArrayList<String> productInBacket;

        categoryStore = new CategoryStore(driver);
        String resultSelectProduct = categoryStore.selectProduct(nameProduct);

        if(resultSelectProduct.equals("Not_found")){
            return productInBacket = null;
        }

        appStore = new AppStore(driver);
        appStore.clickButtonBasket();

        basket = new Basket(driver);
        productInBacket = basket.checkBasketItems();

        return productInBacket;
    }
}
