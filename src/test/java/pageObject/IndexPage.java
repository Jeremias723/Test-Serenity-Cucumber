package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends PageObject {

    public IndexPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "login")
    WebElement btn_SignIn;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement btn_Tshirts;

    public void clickInSignIn() {
        btn_SignIn.click();
    }

    public void clickInTshirts() {
        btn_Tshirts.click();
    }
}
