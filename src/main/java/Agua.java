public class Agua extends Topografia{

    public Agua(){

    }

    public int proporcionDeAgua(){
        return 1;
    }

    public boolean igualAgua(){
        return true;
    }

    public boolean equals(Topografia otraTopografia){
        return otraTopografia.igualAgua();
    }
}
