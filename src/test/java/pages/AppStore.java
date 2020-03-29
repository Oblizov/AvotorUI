package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.TestSettings;

public class AppStore {

    private WebDriver driver;

    @FindBy(css=".plan-item-controls > button:nth-child(1)")
    private WebElement buttonBasket;

    public AppStore (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonBasket(){
        TestSettings.scrollToElement(buttonBasket);
        TestSettings.clickableElement(buttonBasket);
        buttonBasket.click();
    }
}
