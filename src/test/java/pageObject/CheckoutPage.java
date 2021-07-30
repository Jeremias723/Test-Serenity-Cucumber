package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends PageObject {

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
    WebElement btn_proceedToCHeckout;
    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElement textArea;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
    WebElement btn_proceedToCHeckout2;
    @FindBy(id = "cgv")
    WebElement checkbox;
    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement btn_proceedToCHeckout3;
    @FindBy(className = "cheque")
    WebElement cheque;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement btn_IConfirmMyOrder;
    @FindBy(className = "alert")
    private WebElement stringOrden;

    public void clickInProceedToCheckout() {
        btn_proceedToCHeckout.click();
    }
    public void clickInProceedToCheckout2() {
        btn_proceedToCHeckout2.click();
    }


    public void addComent(String text) {
        textArea.sendKeys(text);
        btn_proceedToCHeckout2.click();
    }

    public void proceedToPayment() {
        checkbox.click();
        btn_proceedToCHeckout3.click();
    }

    public void clickinPaymentMethod() {
        cheque.click();
    }

    public void clickInConfirmOrder() {
        btn_IConfirmMyOrder.click();
    }
    public boolean validateResult(String mensaje){
        System.out.println(mensaje);
        System.out.println(stringOrden.getText());
        return mensaje.equals(stringOrden.getText());
    }
}
