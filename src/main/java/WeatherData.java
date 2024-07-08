import java.util.List;

public interface WeatherData {

    Double getPresion();

    Double getradiacionSolar();

    Double getTaemperatura();

    List<Double> getTaemperaturas();

    String displayData();
}
