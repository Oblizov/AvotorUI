package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.TestSettings;

import java.util.List;

public class CategoryStore {

    private WebDriver driver;

    @FindBy(css=".app-category-card.ng-star-inserted .app-title")
    private List<WebElement> allProducts;

    public CategoryStore (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String selectProduct(String productName) {

        String name = "";

        for (WebElement item : allProducts) {
            if (productName.equals(item.getText())) {

                TestSettings.scrollToElement(item);

                name = item.getText();

                TestSettings.clickableElement(item);

                item.click();

                break;
            }
            else {
                name = "Not_found";
            }
        }
        return name;
    }

}
