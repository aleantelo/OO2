public class EnEvaluacion extends StateProyect{

    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        proyecto.setEstado(new Confirmada());
    }

    @Override
    public void modificarMargen(Proyecto proyecto, double nuevoMargen){
        if(proyecto.getMargenDeGanancia()>=11 && proyecto.getMargenDeGanancia() <= 15){
            proyecto.setMargenDeGanancia(nuevoMargen);
        }
    };

}
