import java.sql.*;

public class ConnectionDB {
    public static void main(String[] args) throws SQLException {
        final String HOST = "localhost:3306/Final";
        final String DB_URL = String.format("jdbc:mysql://%s", HOST);
        final Connection con = DriverManager.getConnection(DB_URL,"progra","Guate2021+");
        final Statement stmt = con.createStatement();
        
        instertDB(con,stmt);
        System.out.println("\nDatos Ingresados");
        showTable(con,stmt);
    }
    public static void instertDB(Connection con, Statement stmt){
        try{ 
            String sql = "INSERT INTO Profesor (Nombre, Profesion) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, "Allan");
            ps.setString(3, "Ingeniero");
            ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }        
    }
}
