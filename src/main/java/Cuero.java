public class Cuero implements Armadura{
    @Override
    public int getDañoPorEspada() {
        return 8;
    }

    @Override
    public int getDañoPorBaston() {
        return 2;
    }

    @Override
    public int getDañoPorArco() {
        return 5;
    }

    @Override
    public int getDañoPorMartillo() {
        return 100;
    }
}
