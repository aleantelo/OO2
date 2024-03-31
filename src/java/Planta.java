public class Planta extends Personal {

    private int antiguedad;

    private boolean casado;

    private int cantidadDeHijos;

    @Override
    public double basico() {
        return 50000;
    }

    @Override
    public double adicional() {
        return antiguedad * 2000 + cantidadDeHijos * 2000 + adicionalPorCasado();
    }

    private double adicionalPorCasado() {
        return casado ? 5000 : 0;
    }
}
