public class ThorCreator extends PersonajeBuilder{

    public void getArma(){
        this.personaje.setArma( new Martillo());
    }
    public void getArmadura(){
        this.personaje.setArmadura( new Hierro());
    }

    public void getHabilidad(){
        this.personaje.agregarHabilidad(new Distancia());
        this.personaje.agregarHabilidad(new LanzarRayo());
    }
}
