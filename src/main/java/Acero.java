public class Acero implements Armadura{
    @Override
    public int getDañoPorEspada() {
        return 3;
    }

    @Override
    public int getDañoPorBaston() {
        return 1;
    }

    @Override
    public int getDañoPorArco() {
        return 2;
    }

    @Override
    public int getDañoPorMartillo() {
        return 1;
    }
}
