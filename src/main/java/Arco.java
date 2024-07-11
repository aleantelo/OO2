public class Arco  implements Arma{

    @Override
    public int getDaño(Armadura armadura) {
        return armadura.getDañoPorArco();
    }
}
