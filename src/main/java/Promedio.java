public class Promedio extends EstacionCelcius{

    public Promedio(WeatherData component) {
        super(component,"Promedio");
    }

    public String displayData(){
        return " " + super.displayData() + " Promedio" + this.getPromedio();
    }
}
