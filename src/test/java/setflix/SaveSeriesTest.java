package setflix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import services.dataService.SeriesServiceImplement;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class SaveSeriesTest
{

    private SeriesServiceImplement mongoService;

    @Before
    public void setUp() {
        mongoService = new SeriesServiceImplement();
        mongoService.crearSetDatosIniciales();
    }

    @After
    public void cleanUp(){
        mongoService.eliminarDatos();
    }


    @Test
    public void seriesGuardadas(){
        System.out.print(mongoService.todasLasSeries().get(0).getNombre());
       assertTrue(this.mongoService.todasLasSeries().size() == 11);
    }


}
