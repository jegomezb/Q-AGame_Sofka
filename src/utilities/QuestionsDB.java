package utilities;

import java.sql.*;

public class QuestionsDB {
    
    private static final String QUESTIONS_BD = "Q&AGame.db";
    
    String url = "jdbc:sqlite:" + QUESTIONS_BD;
    Connection conn = null;
    
    public QuestionsDB() {
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
}
