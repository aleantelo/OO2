public class Martillo implements Arma{

    @Override
    public int getDaño(Armadura armadura) {
        return armadura.getDañoPorMartillo();
    }
}
