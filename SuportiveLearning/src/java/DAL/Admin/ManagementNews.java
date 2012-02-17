/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.News;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class ManagementNews {

    Connection conn;
    public ManagementNews()
    {
        conn=DBConnection.getConnect();
    }
//
//    public boolean addNewNews(News n) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("insert into News values (?,?,?,?,?)");
//        ps.setString(1, n.getNewsId());
//        ps.setString(1, n.getTitle());
//        ps.setString(1, n.getNews());
//        ps.setString(1, n.getImages());
//        ps.setDate(1, (java.sql.Date) n.getNewsDate());
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//
//    }
//    public boolean updateNews(News n) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("update News set Title=?, News=?, Images=?, NewsDate=? where NewsId=?");
//        ps.setString(1, n.getTitle());
//        ps.setString(1, n.getNews());
//        ps.setString(1, n.getImages());
//        ps.setDate(1, (Date) n.getNewsDate());
//        ps.setString(1, n.getNewsId());
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return true;
//        }
//    }
//    public boolean deleteNews(News n) throws SQLException
//    {
//
//        PreparedStatement ps = conn.prepareStatement("delete from News where NewsId = ?");
//        ps.setString(1, n.getNewsId());
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//

}
