package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBegin {

    WebDriver driver;
    private static WebDriverWait wait;
    private static Actions actions;

    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.evotor.ru/store/category/5ab418e8-23a7-49e9-9ccc-888367d64e9d");
    }

    public void stop(){
        driver.quit();
        driver = null;
    }

    public static void clickableElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollToElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }
}
