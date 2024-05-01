import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {

    private List<Pelicula> peliculas;

    private CriterioStrategy criterio;

    public Decodificador(List<Pelicula> peliculas, CriterioStrategy criterio) {
        this.peliculas = peliculas;
        this.criterio = criterio;
    }

    public List<Pelicula> buscarPorCriterio(CriterioStrategy criterio){
        this.setCriterio(criterio);
        return criterio.busqueda(peliculas);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }


    public CriterioStrategy getCriterio() {
        return criterio;
    }

    public void setCriterio(CriterioStrategy criterio) {
        this.criterio = criterio;
    }
}
