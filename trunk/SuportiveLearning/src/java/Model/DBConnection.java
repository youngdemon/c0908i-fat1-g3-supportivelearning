/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DBConnection {

    static Connection conn = null;

    public static Connection getConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String uri = "jdbc:sqlserver://PC2012020317SGB\\VANGND;databaseName=SupportiveLearning";
            conn = DriverManager.getConnection(uri, "sa", "fat123456");

        } catch (SQLException ex) {
            conn = null;
        } catch (ClassNotFoundException ex) {
            conn = null;
        }
        return conn;
    }
    public static Date convertStringToDate(String sDate)
    {
        Date date=null;

        try {
             date = new Date(format.parse(sDate).getTime());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        finally {
            return date;
        }
    }

    public static String convertDateToString(Date date)
    {
        return format.format(date);
    }
    private  String strDate;
    public String getConvertToDate()
    {
        try {
            return format.format(format2.parse(strDate));
        } catch (ParseException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }
    public static boolean isDate(String sDate){
        try {
            format.setLenient(false);
            Date date = new Date(format.parse(sDate).getTime());
            if(date.compareTo(new Date(0,0,1))<0) {
                return false;
            }
            return true;
        } catch (ParseException ex) {
            return false;
        } catch ( Exception ex) {
            return false;
        }
    }
    private static SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");

    private static SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
}
