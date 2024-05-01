public class WifiConn implements Connection{
    private String pict;

    public WifiConn(String pict){
        this.pict=pict;
    }

    @Override
    public String sendData(String data, int crc) {

        return "wifi";
    }

    @Override
    public String pict() {
        return pict;
    }
}
