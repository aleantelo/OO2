public class Dispositivo {

    private Ringer ringer;

    private Display display;

    private Connection connection;

    private CalculatorStrategy calculatorStrategy;

    public Dispositivo(){
        ringer = new Ringer();
        display = new Display();
    }

    public String send(String data){
        int crc = calculatorStrategy.srcFor(data);
        return this.connection.sendData(data,crc);
    }

    public void conectarCon(Connection connection){
        this.connection = connection;
        System.out.println(display.showBanner(connection.pict()));
        ringer.ring();
    }

    public void configurarCRC(CalculatorStrategy calculatorStrategy){
        this.calculatorStrategy = calculatorStrategy;
    }

    public int datos(String data){
        return calculatorStrategy.srcFor(data);
    }
}
