package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends BaseTest {

    protected WebDriver driver;

    public BasePage (WebDriver iDriver) {

        this.driver = iDriver;
    }

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy (id = "pass")
    public WebElement inputPass;

    @FindBy (xpath  = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    public void btnClick (){

        buttonLogIn.click();
    }

    public void inputEnterEmail(String emailAddress){

        inputEmail.sendKeys(emailAddress);
    }

    public void inputEnterPassword (String userPassword){

        inputPass.sendKeys(userPassword);
    }

}
