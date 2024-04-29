import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Proyecto {

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private String objetivo;

    private int cantidadParticipantes;

    private double margenDeGanancia;

    private StateProyect estado;

    private double pagoAParticipantes;

    public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cantidadParticipantes, double pagoAParticipantes) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.cantidadParticipantes = cantidadParticipantes;
        this.margenDeGanancia = 7;
        this.estado = new EnConstruccion();
        this.pagoAParticipantes = pagoAParticipantes;
    }

    public void aprobarEtapa(){
        this.estado.aprobarEtapa(this);
    }

    public double costoProyecto(){
        // Calcular el periodo entre las dos fechas
        Period periodo = Period.between(fechaInicio, fechaFin);

        // Obtener el número de días
        int dias = periodo.getDays();
        return dias * pagoAParticipantes * cantidadParticipantes;
    }

    public double precioProyecto(){
        return this.costoProyecto() + calcularPorcentaje();
    }

    public void modificarMargen(double nuevoMargen){
        estado.modificarMargen(this, nuevoMargen);
    }

    private double calcularPorcentaje(){
        return margenDeGanancia * costoProyecto() /100;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    public double getMargenDeGanancia() {
        return margenDeGanancia;
    }

    public void setMargenDeGanancia(double margenDeGanancia) {
        this.margenDeGanancia = margenDeGanancia;
    }

    public StateProyect getEstado() {
        return estado;
    }

    public void setEstado(StateProyect estado) {
        this.estado = estado;
    }
}
