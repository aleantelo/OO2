public class CuatroGConnection {

    private String symb;

    public CuatroGConnection(String symb){
        this.symb=symb;
    }

    public String transmit(String data, int crc){
        return "4g";
    }

    public String symb() {
        return symb;
    }
}
