import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CriterioStrategy {

    public List<Pelicula> busqueda(List<Pelicula> peliculas){
        return filtrar(peliculasReciente(peliculas));
    }

    private List<Pelicula> peliculasReciente(List<Pelicula> peliculas){
        return peliculas
                .stream()
                .sorted(Comparator.comparing(Pelicula::getAnio).reversed())
                .collect(Collectors.toList());
    }

    public abstract List<Pelicula> filtrar(List<Pelicula> peliculas);

    public List<Pelicula> peliculasNoReproducidas(List<Pelicula> peliculas){
        return peliculas.stream().filter( p -> !p.isVista()).collect(Collectors.toList());
    }

}
