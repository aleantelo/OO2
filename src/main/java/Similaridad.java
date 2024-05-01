import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends CriterioStrategy {

    @Override
    public List<Pelicula> filtrar(List<Pelicula> peliculas) {
        Pelicula algunaPeliculaReproducida = this.peliculaReproducida(peliculas);

        return this.peliculasNoReproducidas(algunaPeliculaReproducida.getPeliculasSimilares())
                .stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    private Pelicula peliculaReproducida(List<Pelicula> peliculas) {
        return peliculas
                .stream()
                .filter(Pelicula::isVista)
                .findAny()
                .orElse(null);
    }
}
