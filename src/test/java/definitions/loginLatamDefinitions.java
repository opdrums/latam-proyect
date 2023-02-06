package definitions;
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
}
