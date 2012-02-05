/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.FAQ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

/**
 *
 * @author DASDCO-S&D
 */
public class ManagementFAQ {
    Connection conn;
    public ManagementFAQ()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addFAQ(FAQ faq) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into FAQ values (?,?,?,?)");
        ps.setString(1, faq.getFAQId());
        ps.setString(2, faq.getQuestion());
        ps.setString(3, faq.getAnswer());
        ps.setDate(4, (Date) faq.getFAQDate());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateFAQ(FAQ faq) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update FAQ set Question = ?, Answer = ?, FAQDate = ? where FAQId = ?");
        ps.setString(1, faq.getQuestion());
        ps.setString(2, faq.getAnswer());
        ps.setDate(3, (Date) faq.getFAQDate());
        ps.setString(4, faq.getFAQId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteFAQ(FAQ faq) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Course where FAQid = ?");
        ps.setString(1, faq.getFAQId());
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
