package DAL;

import DTO.DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO{
    private static String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=PHONE_ACCESORIES";
    private static String DataBaseUser = "sa";
    private static String DataBasePass = "14112002";
   
//    private static String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=PHONE_ACCESORIES";
//    private static String DataBaseUser = "Manager";
//    private static String DataBasePass = "Manager";
    
    protected static Connection con;
    protected PreparedStatement pstm;
    protected ResultSet rs;
    protected String getAllSQL;
    protected String insertSQL;
    protected String updateSQL;
    protected String deleteSQL;
    
    public abstract ArrayList<? extends DTO> getAllData();
    public abstract boolean insertItem(DTO dto);
    public abstract boolean updateItem(DTO dto);
    public abstract boolean deleteItem(DTO dto);
    
    public static void start(){
        System.out.println("Connected to Database.");
        try {
            con = DriverManager.getConnection(connectionURL,DataBaseUser,DataBasePass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void end(){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
