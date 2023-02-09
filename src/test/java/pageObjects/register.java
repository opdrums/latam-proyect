package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class register extends WebBasePage {
    private  String xpathLabelCreateCuenta = "//span[text() ='Replaceable']";
    private String xpathSelectElementList = "//div/ul/li[contains(text(),'Replaceable')]";

    private  String xpathSelectGender = "//span[contains(text(),'Replaceable')]";

    @FindBy(id = "mui-component-select-residencyCountry")
    private WebElement buttonCountry;

    @FindBy (id = "mui-component-select-documentType")
    private WebElement buttonTypeDocument;

    @FindBy (id = "documentCode")
    private WebElement fieldIdentification;

    @FindBy (id = "name")
    private WebElement fieldName;

    @FindBy (id = "lastName")
    private WebElement lastName;

    @FindBy (id = "birthDate")
    private WebElement birthdate;

    @FindBy (id = "contactCode")
    private WebElement fieldPhone;

    @FindBy (id = "email")
    private WebElement fieldEmail;

    @FindBy (id = "password")
    private WebElement fieldPassword;

    @FindBy (xpath = "//span[@data-testid ='termsAndConditions']")
    private WebElement checkBossTermAndCondition;

    @FindBy (xpath = "//span[@data-testid ='privacyPolicy']")
    private WebElement checkBossPrivacyPolicy;

    @FindBy(xpath = "//button[@id='secondary-button']//span[@class='MuiButton-label']")
    private WebElement buttonCreateAccount;

    @FindBy(xpath = "//span[text() ='Politicas de Privacidad']")
    private  WebElement moveScrollText;

    public void labelRegisterUser(String name){
        WebElement element = getElement(xpathLabelCreateCuenta, name);
        waitUntilElementIsVisible(element);
        element.click();
    }

    public  void clickButtonAccount(){
        waitUntilElementIsVisible(buttonCreateAccount);
        buttonCreateAccount.click();
    }

    public void selectElementList(String name){
        WebElement element = getElement(xpathSelectElementList, name);
        waitUntilElementIsVisible(element);
        element.click();
    }

    public  void clickButtonCountry(){
        waitUntilElementIsVisible(buttonCountry);
        buttonCountry.click();
    }

    public  void clickButtonTypeDocument(){
        waitUntilElementIsVisible(buttonTypeDocument);
        buttonTypeDocument.click();
    }

    public void sendKeyFiscalNumber(String fiscal){
        waitUntilElementIsVisible(fieldIdentification);
        fieldIdentification.sendKeys(fiscal);
    }

    public void sendKeyFirstName(String name){
        waitUntilElementIsVisible(fieldName);
        fieldName.sendKeys(name);
    }

    public void sendKeyLastName(String name){
        waitUntilElementIsVisible(lastName);
        lastName.sendKeys(name);
    }

    public void sendKeyBirthDay(String date){
        waitUntilElementIsVisible(birthdate);
        birthdate.sendKeys(date);
    }

    public void selectGenderList(String gender){
        WebElement element = getElement(xpathSelectGender, gender);
        waitUntilElementIsVisible(element);
        element.click();
    }

    public void sendKeyEmail(String email){
        waitUntilElementIsVisible(fieldEmail);
        fieldEmail.sendKeys(email);
    }

    public void sendKeyPassword(String password){
        waitUntilElementIsVisible(fieldPassword);
        fieldPassword.sendKeys(password);
    }

    public void sendKeyPhone(String phone){
        waitUntilElementIsVisible(fieldPhone);
        fieldPhone.sendKeys(phone);
    }

    public void clickButtonTermAnConditionAndPolicy(){
        moverScrollAUnElemento(moveScrollText);
        waitUntilElementIsVisible(checkBossTermAndCondition);
        checkBossTermAndCondition.click();
        waitUntilElementIsVisible(checkBossPrivacyPolicy);
        checkBossPrivacyPolicy.click();
    }
}

