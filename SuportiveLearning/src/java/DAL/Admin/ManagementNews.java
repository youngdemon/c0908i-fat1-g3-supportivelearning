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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.New;
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

    public boolean addNewNews(News n) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into News values (?,?,?,?)");
        ps.setString(1, n.getTitle());
        ps.setString(2, n.getNews());
        ps.setString(3, n.getImages());
        ps.setDate(4,n.getNewsDate());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
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
    public Iterator getAllNews()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from News");
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                News c=new News();
                c.setNewsId(rs.getInt(1));
                c.setTitle(rs.getString(2));
                c.setNews(rs.getString(3));
                c.setImages(rs.getString(4));
                c.setNewsDate(rs.getDate(5));
                arr.add(c);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementNews.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
