package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.TestSettings;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private WebDriver driver;

    @FindBy(css="a.basket-item__title")
    private List<WebElement> basketItems;

    public Basket(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ArrayList<String> checkBasketItems(){
        ArrayList<String> productsAdded = new ArrayList<String>();

        for(WebElement item : basketItems){
            TestSettings.clickableElement(item);
            productsAdded.add(item.getText());
        }

        return productsAdded;
    }
}
