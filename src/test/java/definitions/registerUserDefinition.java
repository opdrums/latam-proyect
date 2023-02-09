package definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.registerUserSteps;

public class registerUserDefinition {
    @Steps
    registerUserSteps registerUserSteps;

    public registerUserDefinition() {
        this.registerUserSteps = new registerUserSteps();
    }

    @When("^doy click en el boton label (.*)$")
    public void clickLabelCreateAccount(String name){
        registerUserSteps.clickButtonCrearCuenta(name);

    }

    @And("^selecciono el (.*) y (.*)$")
    public void selectFormCountryAndFiscal(String country, String fiscal){
        registerUserSteps.selectInputCountry(country);
        registerUserSteps.selectTypeDocument(fiscal);
    }

    @And("^lleno el formulario de registro (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void fieldFormRegisterUser(String fiscal, String firtsName, String lastName, String date, String gender, String phone ,String email, String password){
        registerUserSteps.fieldRegisterUser(fiscal,firtsName,lastName,date,gender,phone,email,password);
    }

    @Then("^que se cree la cuenta con la opcion(.*)$")
    public void createAccount(String name){
        registerUserSteps.createAccount(name.trim());

    }
}
