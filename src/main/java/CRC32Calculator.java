import java.util.zip.CRC32;

public class CRC32Calculator implements CalculatorStrategy{
    @Override
    public int srcFor(String data) {
        CRC32 crc = new CRC32();
        String datos = "un mensaje";
        crc.update(datos.getBytes());
        long result = crc.getValue();
        return 32;
    }
}
