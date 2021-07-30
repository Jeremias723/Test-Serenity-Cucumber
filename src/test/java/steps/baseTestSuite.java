package steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.CheckoutPage;
import pageObject.IndexPage;
import pageObject.LoginPage;
import pageObject.TshirtPage;

import java.util.concurrent.TimeUnit;

public class baseTestSuite {

    WebDriver driver;
    IndexPage indexPage;
    LoginPage loginPage;
    TshirtPage tshirtPage;
    CheckoutPage checkoutPage;

    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette",false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        inicializarPaginas(driver);
    }

    @After
    public void closeDriver(){
        driver.close();
    }


    public void inicializarPaginas(WebDriver driver){
        loginPage = new LoginPage(driver);
        indexPage = new IndexPage(driver);
        tshirtPage = new TshirtPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }
}
