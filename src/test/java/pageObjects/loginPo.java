package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class loginPo extends WebBasePage{
    private  String xpathLabelLogin = "//button[text() ='Replaceable']";

    @FindBy (id = "form-input--alias")
    private WebElement userEmail;

    @FindBy (id = "form-input--alias")
    private WebElement userPassword;

    @FindBy(id = "primary-button")
    private WebElement buttonContinue;

    @FindBy(xpath = "//span[text() ='Iniciar sesión']")
    private WebElement buttonLoginUser;

    @FindBy (xpath = "//span[text() ='Latam Airlines']")
    private WebElement labelLatamAirlines;

    public void clickButtonLabelLogin( String name){
        WebElement element = getElement(xpathLabelLogin, name);
        waitUntilElementIsVisible(element);
        element.click();
    }

    public void sendKeyEmailLogin(String email){
        waitUntilElementIsVisible(userEmail);
        userEmail.sendKeys(email);
    }

    public void sendKeyPasswordLogin(String password){
        waitUntilElementIsVisible(userPassword);
        userPassword.sendKeys(password);
    }

    public void clickButtonContinue(){
        waitUntilElementIsVisible(buttonContinue);
        buttonContinue.click();
    }

    public void clickButtonLogin(){
        waitUntilElementIsVisible(buttonLoginUser);
        buttonLoginUser.click();
    }

    public boolean isVisibleLabelLatam(){
        return isVisible(labelLatamAirlines);
    }
}
