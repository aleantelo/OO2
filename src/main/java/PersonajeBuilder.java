public abstract class PersonajeBuilder {

    protected Personaje personaje;

    public void crearPersonaje(){
        personaje = new Personaje();
    }

    public Personaje entregarPersonaje(){
        return personaje;
    }

    public abstract void getArma();

    public abstract void getArmadura();

    public abstract void getHabilidad() ;
}
