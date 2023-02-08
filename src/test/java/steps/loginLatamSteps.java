package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObjects.loginPo;
import utils.Utils;
import utils.driver_factory.DriverFactory;
import utils.reporting.Reporte;

public class loginLatamSteps {

    private  loginPo loginPo;

    public loginLatamSteps() {

        loginPo = new loginPo();
        loginPo.setDriver(DriverFactory.getDriver());
    }

    @Step
    public void abrirNavegador(String ambiente) {
        try {
            loginPo.getDriver().get(Utils.readProperty("configurations", "Latam_" + ambiente));
        } catch (Exception e) {
        }
    }

    @Step
    public void clickButtonLoginUser(String name){
        loginPo.clickButtonLabelLogin(name);
    }

    public void sendKeyEmailAndPssword(String email, String password){
        loginPo.sendKeyEmailLogin(email);
        loginPo.clickButtonContinue();
        loginPo.sendKeyPasswordLogin(password);
        loginPo.clickButtonLogin();
    }

    public void isVisibleLogo(){
        if(loginPo.isVisibleLabelLatam()){
            Reporte.reports("PASS", "inicio de session exitoso", Reporte.takeSnapShot(DriverFactory.getDriver()));
        }
        Reporte.reports("FAIL", "inicio de session no exitosa", Reporte.takeSnapShot(DriverFactory.getDriver()));

    }
}
