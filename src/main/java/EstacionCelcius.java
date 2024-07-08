import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EstacionCelcius implements WeatherData {

    private WeatherData component;

    private String nombre;

    public EstacionCelcius(WeatherData component, String nombre) {
        this.component = component;
        this.nombre = nombre;
    }

    @Override
    public Double getPresion() {
        return component.getPresion();
    }

    @Override
    public Double getradiacionSolar() {
        return component.getradiacionSolar();
    }

    @Override
    public Double getTaemperatura() {
        return (component.getTaemperatura() - 32) / 1.8;
    }

    private Double getTemperatura(Double promedio){
        return (promedio - 32) / 1.8;
    }
    @Override
    public List<Double> getTaemperaturas() {
        return component.getTaemperaturas();
    }

    public Double getPromedio(){
        Double promedio = component.getTaemperaturas().stream().mapToDouble(temp -> getTemperatura(temp)).average().orElse(0);
        return promedio;
    }

    public Double getMinimo() {
        return this.getTemperatura( this.getTaemperaturas().stream().min((t1, t2) -> Double.compare(
                        t1, t2))
                .orElse(null));

    }

    public Double getMaximo() {
        return this.getTemperatura(this.getTaemperaturas().stream().max((t1, t2) -> Double.compare(
                        t1, t2))
                .orElse(null));
    }

    @Override
    public String displayData() {
        return component.displayData();
    }
}
