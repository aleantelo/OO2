public class EnConstruccion extends StateProyect{
    /***
     * El proyecto pasa a etapa “En evaluación“ siempre y cuando su precio no sea 0 (cero).
     * De lo contrario genera un error.
     */

    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        if(proyecto.costoProyecto() > 0){
            proyecto.setEstado(new EnEvaluacion());
        }else{
            throw new RuntimeException("El precio es 0");
        }
    }

    @Override
    public void modificarMargen(Proyecto proyecto, double nuevoMargen){
        if(proyecto.getMargenDeGanancia()>=8 && proyecto.getMargenDeGanancia() <= 10){
            proyecto.setMargenDeGanancia(nuevoMargen);
        }
    };
}
