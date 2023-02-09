package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.register;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;

import java.util.Locale;

public class registerUserSteps {
    private register register;

    public registerUserSteps(){
        register = new register();
        register.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void clickButtonCrearCuenta(String name){
        //registerPo.labelRegisterUser(name);
        register.clickButtonAccount();
    }
    @Step
    public void selectInputCountry(String name){
        register.clickButtonCountry();
        register.selectElementList(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
    }
    @Step
    public void selectTypeDocument(String name){
        register.clickButtonTypeDocument();
        register.selectElementList(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
    }

    @Step
    public  void fieldRegisterUser(String fiscal, String firtsName, String lastName, String date, String gender, String phone ,String email, String password ){
        register.sendKeyFiscalNumber(fiscal);
        register.sendKeyFirstName(firtsName);
        register.sendKeyLastName(lastName);
        register.sendKeyBirthDay(date);
        register.selectGenderList(gender.substring(0,1).toUpperCase() + gender.substring(1).toLowerCase());
        register.sendKeyPhone(phone);
        register.sendKeyEmail(email);
        register.sendKeyPassword(password);
    }

    @Step
    public void createAccount(String name){
        register.clickButtonTermAnConditionAndPolicy();
        register.labelRegisterUser(name);
    }

}
