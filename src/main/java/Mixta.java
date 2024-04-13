import java.util.List;

public class Mixta extends Topografia {

    private List<Topografia> partes;

    public Mixta(List<Topografia> topografias) {
        partes = topografias;
    }

    public int proporcionDeAgua() {
        return partes.stream().mapToInt(topografia -> topografia.proporcionDeAgua()).sum() / 4;
    }

    public boolean igualMixta(Mixta otraTopografia){
        //TODO No estoy seguro que este bien.
        return partes.equals(otraTopografia.partes);
    }

    public boolean equals(Mixta otraTopografia){
        return otraTopografia.igualMixta(this);
    }
}
