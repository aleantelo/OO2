public class Maximo extends EstacionCelcius{


    public Maximo(WeatherData component) {
        super(component,"Maximo");
    }

    public String displayData(){
        return " " +super.displayData() + "Maximo: " + this.getMaximo();
    }
}
