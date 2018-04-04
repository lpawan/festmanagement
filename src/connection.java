import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connection {
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pawanl","hr","hr");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"LOGIN FAILED!!!");
        }
        return null;
    }
}
