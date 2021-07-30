package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage extends PageObject {



    public TshirtPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Add to cart']")
    WebElement btn_addToCart;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement btn_proceedToCheckout;
    public void selectItem(WebDriver driver) throws InterruptedException {
        Dimension dimension = new Dimension(900,900);
        driver.manage().window().setSize(dimension);
        btn_addToCart.click();
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }

    public void clickInProceedToCheckout() {
        btn_proceedToCheckout.click();
    }
}
