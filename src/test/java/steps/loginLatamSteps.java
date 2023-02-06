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
}
