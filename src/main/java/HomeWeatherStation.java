import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{


    private String nombre = "HomeWeatherStation";
    @Override
    public Double getPresion() {
        return 1008.00;
    }

    @Override
    public Double getradiacionSolar() {
        return 200.00;
    }

    @Override
    public Double getTaemperatura() {
        return 86.00;
    }

    @Override
    public List<Double> getTaemperaturas() {
        List<Double> lista = new ArrayList<>() ;
        lista.add(89.6);
        lista.add(88.00);
        lista.add(87.00);
        lista.add(80.6);
        return lista;
    }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTaemperatura() +
                "Presión atmosf: " + this.getPresion() +
                "Radiación solar: " + this.getradiacionSolar();
    }
}
