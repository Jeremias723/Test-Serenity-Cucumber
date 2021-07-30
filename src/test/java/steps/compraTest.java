package steps;


import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class compraTest extends baseTestSuite{

    @Given("El usuario ingresa a automationpractice")
    public void goToPage(){
        openDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("El usuario hace click en 'Sign in'")
    public void goToSignin(){
        indexPage.clickInSignIn();
    }

    @And("El usuario se loguea con los datos email: (.*) y contraseña: (.*)")
    public void logIn(String email,String pass){
        loginPage.completeFields(email,pass);
    }
    @And("hace click en el boton de 'Sign in' para loguearse")
    public void goToIndex(){
        loginPage.clickSubmit();
    }

    @And("El usuario ingresa al apartado de 'T-shirts'")
    public void goToTshirts(){
        indexPage.clickInTshirts();
    }
    @And("Selecciona el producto 'Faded Short Sleeve T-shirts'")
    public void selectTshirt() throws InterruptedException {
        tshirtPage.selectItem(driver);
    }
    @And("El usuario procede al checkout")
    public void goToCheckout(){
        tshirtPage.clickInProceedToCheckout();
    }
    @And("El usuario procede en el checkout")
    public void goToCheckout2(){
        checkoutPage.clickInProceedToCheckout();
    }
    @And("El usuario ingresa el comentario: (.*) y continua")
    public void comentAndContinue(String text){
        checkoutPage.addComent(text);
    }

    @And("El usuario aceptara los terminos y condiciones y procedera a la pestaña de payment")
    public void goToPayment(){
        checkoutPage.proceedToPayment();
    }
    @And("Seleccionara el metodo de pago, en este caso cheque")
    public void selectPayment(){
        checkoutPage.clickinPaymentMethod();
    }
    @And("El usuario confirma la orden")
    public void confirmOrder(){
        checkoutPage.clickInConfirmOrder();
    }
    @Then("El usuario verifica que su orden fue realizada")
    public void verify(){
        checkoutPage.validateResult("Your order on My Store is complete.");
    }


}
