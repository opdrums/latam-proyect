package definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginLatamSteps;

public class loginLatamDefinitions {
    private static String ambiente = "";
    @Steps
    loginLatamSteps loginLatamSteps;

    public loginLatamDefinitions(){
        this.loginLatamSteps = new loginLatamSteps();
    }

    @Given("^ingreso a latam (.*)$")
    public  void ingresarLatamAmbiente(String ambiente){
        loginLatamDefinitions.ambiente = ambiente.trim();
        loginLatamSteps.abrirNavegador(loginLatamDefinitions.ambiente.toUpperCase());
        loginLatamSteps.abrirNavegador(ambiente);
    }

    @When("^doy click en label (.*)$")
    public void clickLabellogin(String name){
        loginLatamSteps.clickButtonLoginUser(name);
    }

    @And("^las credenciales (.*) y (.*)$")
    public void credentialUser(String user, String password) {
        loginLatamSteps.sendKeyEmailAndPssword(user.trim(), password.trim());
    }

    @Then("visualizar el logo de latam")
    public void visiblelogo(){
        loginLatamSteps.isVisibleLogo();
    }
}
