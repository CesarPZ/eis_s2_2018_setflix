package setflix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import services.dataService.LoginService;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class SaveUserTest
{
    private LoginService mongoService;

    @Before
    public void setUp() {
        mongoService = new LoginService();
        mongoService.crearSetDatosIniciales();
    }

    @After
    public void cleanUp(){
        mongoService.eliminarDatos();
    }

    @Test
    public void usuariosGuardadas(){

        System.out.print(mongoService.getUsuarios().get(0).getUsuario());
        assertTrue(this.mongoService.getUsuarios().size() == 8);
    }

}
