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

    public boolean addNewNews(News s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into News values (?,?,?,?,?)");
        ps.setString(1, s.getNewsId());
        ps.setString(1, s.getTitle());
        ps.setString(1, s.getNews());
        ps.setString(1, s.getImages());
        ps.setDate(1, (java.sql.Date) s.getNewsDate());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean updateNews(News s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update News set Title=?, News=?, Images=?, NewsDate=? where NewsId=?");
        ps.setString(1, s.getTitle());
        ps.setString(1, s.getNews());
        ps.setString(1, s.getImages());
        ps.setDate(1, (Date) s.getNewsDate());
        ps.setString(1, s.getNewsId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return true;
        }
    }
    public boolean deleteNews(News s) throws SQLException
    {

        PreparedStatement ps = conn.prepareStatement("delete from News where NewsId = ?");
        ps.setString(1, s.getNewsId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
