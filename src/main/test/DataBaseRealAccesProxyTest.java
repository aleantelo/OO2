import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DataBaseRealAccesProxyTest {

    /**
     * SE INSTANCIA ESTA CLASE ( PROXY).... DEBERIA INSTANACIAR DATABASEACCES (INTERFACE) Y ¿AGREGAR EL LOGIN EN DATABASEREALACCES?
     */
    
    private DataBaseRealAccesProxy dataBaseRealAccesProxy;

    @BeforeEach
    void setUp() throws Exception {
        this.dataBaseRealAccesProxy = new DataBaseRealAccesProxy();
    }

    @Test
    void testGetSearchResultsSinLoggin() {
        assertNull(this.dataBaseRealAccesProxy.getSearchResults("select * from comics where id=1"));
        assertNull( this.dataBaseRealAccesProxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testGetSearchResults() {
        this.dataBaseRealAccesProxy.login("123");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dataBaseRealAccesProxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.dataBaseRealAccesProxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        this.dataBaseRealAccesProxy.login("123");

        assertEquals(3, this.dataBaseRealAccesProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dataBaseRealAccesProxy.getSearchResults("select * from comics where id=3"));
    }

}
