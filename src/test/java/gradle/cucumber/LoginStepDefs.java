package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Usuario;
import services.dataService.LoginService;

import static org.junit.Assert.assertTrue;


public class LoginStepDefs {
    private Usuario usuario;
    private LoginService loginService;

    @Given("^Un usuario$")
    public void unUsuario() throws Throwable {
            this.usuario = new Usuario("Juancito","1234","Juan","Gomez");

    }

    @When("^Ingreso mi usuario \"([^\"]*)\" y mi contraseña \"([^\"]*)\"$")
    public void ingresoMiUsuarioYMiContraseña(String user, String password) throws Throwable {
        
           this.usuario.setUsuario(user);
           this.usuario.setContrasena(password);
    }

    @Then("^Me logeo exitosamente$")
    public void meLogeoExitosamente() throws Throwable {
        this.loginService = new LoginService();
        assertTrue(this.loginService.login(this.usuario));
    }

    @Then("^El sistema registro al usuario de forma exitosa$")
    public void elSistemaRegistroAlUsuarioDeFormaExitosa() throws Throwable {
        this.loginService = new LoginService();
        assertTrue(this.loginService.signUp(this.usuario));
    }
}
