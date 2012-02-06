/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ncuong
 */
public class ManagementAdmin {
    Connection conn = null;
    public ManagementAdmin()
    {
        conn = DBConnection.getConnect();
    }
    public boolean addNewAdmin(Admin a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("?,?");
        ps.setString(1, a.getAdminId());
        ps.setString(2, a.getAccountId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean updateAdmin(Admin a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Admin set AccountId = ? where AdminId = ?");
        ps.setString(1, a.getAccountId());
        ps.setString(2, a.getAdminId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteStaff(Admin a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Admin where AdminId=?");
        ps.setString(1, a.getAdminId());

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
