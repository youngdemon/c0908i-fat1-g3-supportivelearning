/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.FAQ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ncuong
 */
public class ManagementFAQ {
    Connection conn;
    public ManagementFAQ()
    {
        conn = DBConnection.getConnect();
    }

    public boolean addNewFAQ(FAQ f) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into FAQ values(?,?,?)");
        ps.setString(1, f.getAnswer());
        ps.setString(2, f.getQuestion());
        ps.setDate(3, f.getfAQDate());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Iterator getAllFAQ()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from FAQ");
            ResultSet rs = ps.executeQuery();
            ArrayList arrayList = new ArrayList();
            while(rs.next())
            {
                FAQ f = new FAQ();
                f.setfAQId(rs.getInt(1));
                f.setAnswer(rs.getString(2));
                f.setQuestion(rs.getString(3));
                f.setfAQDate(rs.getDate(4));
                arrayList.add(f);
            }
            return arrayList.iterator();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
