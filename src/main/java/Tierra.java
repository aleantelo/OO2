public class Tierra extends Topografia{

    public Tierra(){
    }

    public boolean equals(Topografia otraTopografia) {
        return otraTopografia.igualTierra();
    }

    public boolean igualTierra(){
        return true;
    }
}
