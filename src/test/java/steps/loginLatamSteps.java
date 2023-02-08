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

    @Step
    public void sendKeyEmail(String email){
        loginPo.sendKeyEmailLogin(email);
        loginPo.clickButtonContinue();
        if(loginPo.isVisibleLabelUserNotFound()){
            Reporte.reports("FAIL", "usuario no encontrado", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("Usuario no encontrado");
        }
        Reporte.reports("INFO", "ingreso de email correcto", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }

    @Step
    public  void sendKeyPassword(String password){
        loginPo.sendKeyPasswordLogin(password);
        loginPo.clickButtonLogin();
        if(loginPo.isVisibleLabelPasswordIncorrect()){
            Reporte.reports("FAIL", "contraseña incorrecta", Reporte.takeSnapShot(DriverFactory.getDriver()));
            Assert.fail("contraseña incorrecta");
        }
        Reporte.reports("PASS", "ingreso de contraseña exitoso", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }

    @Step
    public void isVisibleLogo(){
        if(!loginPo.isVisibleLabelLatam()){
            Reporte.reports("FAIL", "inicio de session no exitosa", Reporte.takeSnapShot(DriverFactory.getDriver()));
        }
        Reporte.reports("PASS", "inicio de session exitoso", Reporte.takeSnapShot(DriverFactory.getDriver()));
    }
}
