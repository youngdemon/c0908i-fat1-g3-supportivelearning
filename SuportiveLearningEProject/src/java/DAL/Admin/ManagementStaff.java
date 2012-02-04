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
 * @author DELL
 */
public class ManagementStaff {

    Connection conn;
    public ManagementStaff()
    {
        conn=DBConnection.getConnect();
    }

    public boolean addNewStaff(Staff s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into Staff values (?,?)");
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
        PreparedStatement ps = conn.prepareStatement("update STaff set AccountId=? where Staff=?");
        ps.setString(1, s.getAccountId());
        ps.setString(1, s.getStaffId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return true;
        }
    }
    public boolean deleteStaff(Staff s) throws SQLException
    {

        PreparedStatement ps = conn.prepareStatement("delete from Staff where StaffId = ?");
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
