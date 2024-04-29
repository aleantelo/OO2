public abstract class StateProyect {

    public void aprobarEtapa(Proyecto proyecto){
        System.out.println("No produce efecto alguno en el proyecto");
    };

    public void modificarMargen(Proyecto proyecto, double nuevoMargen){
        System.out.println("No produce efecto alguno en el proyecto");
    };

    public void cancelarProyecto(Proyecto proyecto){
        proyecto.setObjetivo(proyecto.getObjetivo()+"- Cancelado");
        proyecto.setEstado(new Cancelado());
    };
}
