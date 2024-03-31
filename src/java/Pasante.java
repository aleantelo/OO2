public class Pasante extends Personal {


    private int examenesRendidos;

    @Override
    public double basico() {
        return 20000;
    }

    @Override
    public double adicional() {
        return 2000 * examenesRendidos;
    }
}
