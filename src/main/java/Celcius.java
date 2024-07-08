import java.util.ArrayList;
import java.util.List;

public class Celcius extends EstacionCelcius{

    public Celcius(WeatherData component) {
        super(component,"Celcius");
    }

    public String displayData(){
        return super.displayData() + "Temperatura C: " + this.getTaemperatura();
    }
}
