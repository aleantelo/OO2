public class Agua extends Topografia{

    public Agua(){
    }

    public int proporcionDeAgua(){
        return 1;
    }

    @Override
    public boolean igualAgua(){
        return true;
    }

    public boolean equals(Topografia otraTopografia){
        return otraTopografia.igualAgua();
    }
}
