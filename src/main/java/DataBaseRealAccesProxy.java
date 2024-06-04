import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseRealAccesProxy implements DatabaseAccess {
    private static Logger logger = Logger.getLogger("");
    private String password;

    private boolean logeado;

    private DatabaseRealAccess databaseRealAccess;

    public DataBaseRealAccesProxy() {
        this.password = "123";
        this.logeado = false;
        logger.setLevel(Level.INFO);
    }

    public boolean login(String password) {
        if (this.password.equals(password)) {
            this.logeado = true;
            databaseRealAccess = new DatabaseRealAccess();
        }else {
            logger.severe("Acceso invalido");
        }
        return this.logeado;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (logeado) {
            logger.info("Acceso valido para la busqueda");
            return databaseRealAccess.getSearchResults(queryString);
        }
        return null;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (logeado) {
            logger.warning("Acceso valido para insercion");
            return databaseRealAccess.insertNewRow(rowData);
        }
        return -1;
    }
}
