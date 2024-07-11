public class ConsolaDirector {

    public Personaje construir(PersonajeBuilder personajeBuilder){
        personajeBuilder.crearPersonaje();
        personajeBuilder.getArma();
        personajeBuilder.getArmadura();
        personajeBuilder.getHabilidad();
        return personajeBuilder.entregarPersonaje();
    }
}
