public class Tierra extends Topografia{

    public Tierra(){
    }

    public boolean equals(Topografia otraTopografia) {
        return otraTopografia.igualTierra();
    }

    @Override
    public int proporcionDeAgua() {
        return 0;
    }

    @Override
    public boolean igualTierra(){
        return true;
    }

}
