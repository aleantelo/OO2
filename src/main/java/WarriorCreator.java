public class WarriorCreator extends PersonajeBuilder{

    public void getArma(){
        this.personaje.setArma( new Espada());
    }
    public void getArmadura(){
        this.personaje.setArmadura( new Hierro());
    }

    public void getHabilidad(){
        this.personaje.agregarHabilidad(new CuerpoACuerpo());
    }
}
