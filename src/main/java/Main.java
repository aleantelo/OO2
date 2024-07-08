public class Main {

    public static void main(String[] args) {
        HomeWeatherStation concrectComponent = new ConcreteComponent();

        Celcius celcius = new Celcius(concrectComponent);
        WeatherData presion = new Presion(celcius);
        WeatherData radiacion = new Radiacion(presion);
        WeatherData minimo = new Minimo(radiacion);
        WeatherData maximo = new Maximo(minimo);
        WeatherData promedio = new Promedio(maximo);

        System.out.println(promedio.displayData());

    }
}
