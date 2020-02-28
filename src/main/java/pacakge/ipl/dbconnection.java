package pacakge.ipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;


public class dbconnection {

    private final String url = "jdbc:postgresql://localhost/firstproject";
    private final String user = "postgres";
    private final String password = "mountblue";


    public Connection dbconnect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
