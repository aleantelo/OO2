public class Temporario extends Personal {

    private int horasTrabajadas;

    private boolean casado;

    private int cantidadDeHijos;

    @Override
    public double basico() {
        return 20000 + horasTrabajadas * 300;
    }

    @Override
    public double adicional() {
        return 2000 * cantidadDeHijos + adicionalPorCasado();
    }

    private double adicionalPorCasado() {
        return casado ? 5000 : 0;
    }

}
