public class CuatroGConnectionAdapter implements Connection{

    private CuatroGConnection cuatroGConnection;

    public CuatroGConnectionAdapter(CuatroGConnection cuatroGConnection){
        this.cuatroGConnection = cuatroGConnection;
    }

    @Override
    public String sendData(String data, int crc) {
        return cuatroGConnection.transmit(data,crc);
    }

    @Override
    public String pict() {
        return cuatroGConnection.symb();
    }
}
