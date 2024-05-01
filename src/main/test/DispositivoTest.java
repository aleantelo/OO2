import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {

    private Dispositivo dispositivo;
    Connection connection4g;

    Connection wifi;

    CalculatorStrategy calculator32;

    CalculatorStrategy calculator16;

    @BeforeEach
    public void setUp(){
        dispositivo = new Dispositivo();

        calculator16 = new CRC16Calculator();
        calculator32=new CRC32Calculator();

        CuatroGConnection cuatroGConnection = new CuatroGConnection("Simbolo 4G");
        connection4g = new CuatroGConnectionAdapter(cuatroGConnection);
        wifi = new WifiConn("Pict de wifi");

        dispositivo.configurarCRC(calculator16);
        dispositivo.conectarCon(connection4g);
    }

    @Test
    public void sendTest(){
        Assert.assertEquals("4g",dispositivo.send("mensaje"));
    }

    @Test
    public void conectarConTest(){
        dispositivo.conectarCon(wifi);
        Assert.assertEquals("wifi",dispositivo.send("mensaje"));
    }

    @Test
    public void configurarCrcTest(){
        dispositivo.configurarCRC(calculator32);
        Assert.assertEquals(32,dispositivo.datos("mensaje"));
    }
}
