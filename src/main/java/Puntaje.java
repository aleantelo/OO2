import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends CriterioStrategy {

    @Override
    public List<Pelicula> filtrar(List<Pelicula> peliculas) {

        return this.peliculasNoReproducidas(peliculas)
                .stream()
                .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
