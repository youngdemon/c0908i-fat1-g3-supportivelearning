/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBConnection {
Connection conn = null;

    public Connection getConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String uri = "jdbc:sqlserver://PC2012020317SGB\\VANGND;databaseName=SupportiveLearning";
            conn = DriverManager.getConnection(uri, "sa", "fat123456");
            
        } catch (SQLException ex) {
            conn=null;
        } catch (ClassNotFoundException ex) {
            conn=null;
        }
        return conn;
    }

}
