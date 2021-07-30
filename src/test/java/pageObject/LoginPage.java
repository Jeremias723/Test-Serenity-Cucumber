package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    WebElement input_email;
    @FindBy(id="passwd")
    WebElement input_pass;
    @FindBy(id = "SubmitLogin")
    WebElement btn_SubmitLogin;

    public void completeFields(String email,String pass) {
    input_email.clear();
    input_email.sendKeys(email);
    input_pass.clear();
    input_pass.sendKeys(pass);
    }

    public void clickSubmit(){
        btn_SubmitLogin.click();
    }

}
