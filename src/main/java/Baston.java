public class Baston implements Arma{

    @Override
    public int getDaño(Armadura armadura) {
        return armadura.getDañoPorBaston();
    }
}
