package services.dataService;

import daos.GenericMongoDAO;
import daos.MongoConnection;
import dummies.SerieRepositorio;
import model.Serie;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.List;


public class SeriesServiceImplement extends GenericMongoDAO<Serie> {

    private Jongo jongo = MongoConnection.getInstance().getJongo();
    private MongoCollection registros  = jongo.getCollection("serie");
    private SerieRepositorio seriesRepository = new SerieRepositorio();

    public SeriesServiceImplement() {
        super();
    }

    public void crearSetDatosIniciales() {
        for (Serie serie : seriesRepository.getSeries()) {
            registros.insert(serie);
        }
    }

    public List<Serie> todasLasSeries(){
        return (copyToList(registros.find().as(Serie.class)));
    }

    public void eliminarDatos() {
        registros.drop();
    }
}