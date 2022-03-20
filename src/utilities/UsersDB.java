package utilities;

import java.sql.*;

public class UsersDB {
    
    private static final String USERS_BD = "Users.db";
    
    String url = "jdbc:sqlite:" + USERS_BD;
    Connection conn = null;
    
    public UsersDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet consultar(String url) {
        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public int ejecutarSentencia(String strSentencia) {
        try {
            PreparedStatement pst = conn.prepareStatement(strSentencia);        
            pst.setString(0, strSentencia);
            pst.setString(1, strSentencia);
            pst.setString(2, strSentencia);
            pst.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
