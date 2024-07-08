public class Presion extends EstacionCelcius{

    public Presion(WeatherData component) {
        super(component,"Presion");
    }

    public String displayData(){
        return " " + super.displayData() + " Presion: " + this.getPresion();
    }
}
