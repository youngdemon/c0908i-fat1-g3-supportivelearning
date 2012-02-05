/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Account;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ncuong
 */
public class ManagementAccount {
    Connection conn = null;
    public ManagementAccount()
    {
        conn = DBConnection.getConnect();
    }
    public boolean addNewAccount(Account a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into Account values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, a.getAccountId());
        ps.setString(1, a.getRoleId());
        ps.setString(1, a.getUserName());
        ps.setString(1, a.getPassWord());
        ps.setDate(1, (Date) a.getDateCreate());
        ps.setString(1, a.getFullName());
        ps.setDate(1, (Date) a.getBirthday());
        ps.setInt(1, a.getGender());
        ps.setString(1, a.getPhone());
        ps.setString(1, a.getEmail());
        ps.setString(1, a.getAddress());
        ps.setInt(1, a.getStatus());
        ps.setDate(1, (Date) a.getLastLogin());
        ps.setInt(1, a.getAlowLogin());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean updateAccount(Account a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Account set RoleId=?,UserName=?,PassWord=?,DateCreate=?,FullName=?,Birthday=?,Gender=?,Phone=?,Email=?,Address=?,Status=?,LastLogin=?,AlowLogin=? where AccountId=?)");
        ps.setString(1, a.getRoleId());
        ps.setString(1, a.getUserName());
        ps.setString(1, a.getPassWord());
        ps.setDate(1, (Date) a.getDateCreate());
        ps.setString(1, a.getFullName());
        ps.setDate(1, (Date) a.getBirthday());
        ps.setInt(1, a.getGender());
        ps.setString(1, a.getPhone());
        ps.setString(1, a.getEmail());
        ps.setString(1, a.getAddress());
        ps.setInt(1, a.getStatus());
        ps.setDate(1, (Date) a.getLastLogin());
        ps.setInt(1, a.getAlowLogin());
        ps.setString(1, a.getAccountId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteAccount(Account a) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Account where AccountId=?");
        ps.setString(1, a.getAccountId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkLogin(Account a)
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Account where UserName like ? and PassWord like ?");
            ps.setString(1, a.getUserName());
            ps.setString(2, a.getPassWord());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }
}
