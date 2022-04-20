import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionToAccess {
    public static Connection con;
    public static String dbFile = "‪C:\\Assignment2Java\\database.accdb";
    public static String dbUrl = "jdbc:ucanaccess://C:\\Assignment2Java\\database.accdb" + ";memory=true";
    public static Connection getConnection()
    {
        try {
            con = DriverManager.getConnection(dbUrl, "", "");
        }catch (Exception ex)
        {
            System.out.println("" + ex);
        }
        return con;
    }
}
