public class Hierro implements Armadura {
    @Override
    public int getDañoPorEspada() {
        return 5;
    }

    @Override
    public int getDañoPorBaston() {
        return 1;
    }

    @Override
    public int getDañoPorArco() {
        return 3;
    }

    @Override
    public int getDañoPorMartillo() {
        return 2;
    }
}
