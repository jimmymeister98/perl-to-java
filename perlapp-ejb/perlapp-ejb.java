import org.json.JSONObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class perlappejb {
    public getTnbList(JSONObject data) {
        //data is json data?
        JSONObject params = data;
        log.info("Fetching TNB list from the database")
        // fetch data from the database SELECT * FROM tnbs
        Connection databaseconn = db.getConnection();
        databaseconn
        var query = db.query("SELECT * FROM tnbs");
        ResultSet db_data = executeQuery
        String number = params.getString("number");

        if (number != null){

            db_data = db.query("SELECT tnb FROM tnbs WHERE tnb = ?")
        }
        return null;
    }
}
