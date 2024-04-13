import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

    private Topografia topografiaMixta1;
    private Topografia topografiaMixta;

    private Topografia topografiaMixta2;
    @BeforeEach
    public void setUp() {
        topografiaMixta1 = new Mixta(new Agua(),new Agua(),new Tierra(),new Tierra());
        topografiaMixta = new Mixta(topografiaMixta1, new Agua(),new Tierra(),new Tierra());
        topografiaMixta2 = new Mixta(topografiaMixta1, new Agua(),new Tierra(),new Tierra());
    }

    @Test
    public void topografiaMixtaTest() {
        Assertions.assertTrue(topografiaMixta2.equals(topografiaMixta));
    }
}
