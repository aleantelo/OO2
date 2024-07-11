public class MagoCreator extends PersonajeBuilder {

    public void getArma() {
        this.personaje.setArma(new Baston());
    }

    public void getArmadura() {
        this.personaje.setArmadura(new Cuero());
    }

    public void getHabilidad() {
        this.personaje.agregarHabilidad(new Distancia());
        this.personaje.agregarHabilidad(new Magia());
    }
}
