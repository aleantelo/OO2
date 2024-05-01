import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedades extends CriterioStrategy{


    @Override
    public List<Pelicula> filtrar(List<Pelicula> peliculas) {
        return this.peliculasNoReproducidas(peliculas)
                .stream()
                .limit(3)
                .collect(Collectors.toList());
   }
}
