import java.util.List;

public class Pelicula {

    private String titulo;

    private int anio;

    private List<Pelicula> peliculasSimilares;

    private double puntaje;

    private boolean vista;

    public Pelicula(String titulo, int anio, List<Pelicula> peliculasSimilares, double puntaje, boolean vista) {
        this.titulo = titulo;
        this.anio = anio;
        this.peliculasSimilares = peliculasSimilares;
        this.puntaje = puntaje;
        this.vista = vista;
    }

    public void agregarPeliculaSimilar(Pelicula pelicula){
        if(!peliculasSimilares.contains(pelicula)){
            peliculasSimilares.add(pelicula);
            pelicula.agregarPeliculaSimilar(this);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Pelicula> getPeliculasSimilares() {
        return peliculasSimilares;
    }

    public void setPeliculasSimilares(List<Pelicula> peliculasSimilares) {
        this.peliculasSimilares = peliculasSimilares;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }
}
