
package registropadillo.DB;
import java.sql.*;

/** @author RaulO */
public class connect {
    
  
    public static Connection getConnection(){
          String strConnectDB = "jdbc:sqlite:C:/Users/Public/Documents/DB/UsuariosPadillo.s3db";
          Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(strConnectDB);
            
            System.out.println("Conexión establecida");
            
        } catch (Exception e) {
            
            System.out.println("Error de conexion" + e);
        }
        
        return con;
    }
}
