public class Radiacion extends EstacionCelcius{
    public Radiacion(WeatherData component) {
        super(component,"Radiacion");
    }

    public String displayData(){
        return " " + super.displayData() + " Radiacion:" + this.getradiacionSolar();
    }
}
