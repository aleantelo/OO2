import java.util.Arrays;
import java.util.List;

public class Mixta extends Topografia {

    private List<Topografia> partes;

    public Mixta(Topografia... topografias) {
        partes = Arrays.asList(topografias);
    }

    @Override
    public int proporcionDeAgua() {
        return partes.stream().mapToInt(topografia -> topografia.proporcionDeAgua()).sum() / 4;
    }

    public boolean igualMixta(Mixta otraTopografia) {
        //TODO No estoy seguro que este bien.
        return this.partes.equals(otraTopografia.partes);
    }


    public boolean equals(Topografia otraTopografia) {
        return otraTopografia.igualMixta(this);
    }
}
