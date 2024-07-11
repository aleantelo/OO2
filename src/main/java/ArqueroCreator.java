import java.util.ArrayList;

public class ArqueroCreator extends PersonajeBuilder{

    public void getArma(){
        this.personaje.setArma( new Arco());
    }
    public void getArmadura(){
        this.personaje.setArmadura( new Cuero());
    }

    public void getHabilidad(){
        this.personaje.agregarHabilidad(new Distancia());
    }
}
