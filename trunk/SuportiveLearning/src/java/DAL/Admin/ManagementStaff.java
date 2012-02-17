/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ncuong
 */
public class ManagementStaff {
    Connection conn = null;
    public ManagementStaff()
    {
        conn = DBConnection.getConnect();
    }

//    public boolean addNewStaff(Staff s) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("insert into Staff values(?,?)");
//        ps.setString(1, s.getStaffId());
//        ps.setString(1, s.getAccountId());
//
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
//    public boolean updateStaff(Staff s) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("update Staff set AccountId = ? where StaffId = ?");
//        ps.setString(1, s.getStaffId());
//        ps.setString(1, s.getAccountId());
//
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//    public boolean deleteStaff(Staff s) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("delete from Staff where StaffId=?");
//        ps.setString(1, s.getStaffId());
//
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

    public Iterator getAllStaff()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Staff");
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Staff c=new Staff();
                c.setStaffId(rs.getInt(1));
                c.setAccountId(rs.getString(2));
                arr.add(c);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
