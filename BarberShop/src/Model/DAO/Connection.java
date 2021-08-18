/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author skees
 */
public class Connection {
 
    private final String ip = "localhost";
    private final Integer port = 5432;
    private final String user = "postgres";
    private final String password = "postgres";
    //private final String server = "FBD_EaD";
    private final String database = "Hair Stylist";
    
    public Connection getConnection() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:postgresql://"+ip+":"+port+"/"+database, user, password);
        return conexao;
    }
    
}
