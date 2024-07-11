public class Espada implements Arma{

    @Override
    public int getDaño(Armadura armadura) {
        return armadura.getDañoPorEspada();
    }
}
