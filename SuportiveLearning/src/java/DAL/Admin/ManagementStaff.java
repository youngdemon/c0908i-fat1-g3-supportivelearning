/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public boolean addNewStaff(Staff s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into Staff values(?,?)");
        ps.setString(1, s.getStaffId());
        ps.setString(1, s.getAccountId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean updateStaff(Staff s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Staff set AccountId = ? where StaffId = ?");
        ps.setString(1, s.getStaffId());
        ps.setString(1, s.getAccountId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteStaff(Staff s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Staff where StaffId=?");
        ps.setString(1, s.getStaffId());

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
