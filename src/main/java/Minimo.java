public class Minimo extends EstacionCelcius{

    public Minimo(WeatherData component) {
        super(component,"Minimo");
    }

    public String displayData(){
        return " " + super.displayData() + "Mínimo: " + this.getMinimo();
    }
}
