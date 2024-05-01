import java.util.Collection;
import java.util.List;

public class DataBaseRealAccesProxy implements DatabaseAccess {

    private String password;

    private boolean logeado;

    private DatabaseRealAccess databaseRealAccess;

    public DataBaseRealAccesProxy() {
        this.password = "123";
        this.logeado = false;
    }

    public boolean login(String password) {
        if (this.password.equals(password)) {
            this.logeado = true;
            databaseRealAccess = new DatabaseRealAccess();
        }
        return this.logeado;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (logeado) {
            return databaseRealAccess.getSearchResults(queryString);
        }
        return null;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (logeado) {
            return databaseRealAccess.insertNewRow(rowData);
        }
        return -1;
    }
}
