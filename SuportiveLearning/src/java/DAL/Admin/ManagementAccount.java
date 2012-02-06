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
        ps.setString(2, a.getRoleId());
        ps.setString(3, a.getUserName());
        ps.setString(4, a.getPassWord());
        ps.setDate(5, (Date) a.getDateCreate());
        ps.setString(6, a.getFullName());
        ps.setDate(7, (Date) a.getBirthday());
        ps.setInt(8, a.getGender());
        ps.setString(9, a.getPhone());
        ps.setString(10, a.getEmail());
        ps.setString(11, a.getAddress());
        ps.setInt(12, a.getStatus());
        ps.setDate(13, (Date) a.getLastLogin());
        ps.setInt(14, a.getAlowLogin());

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
        ps.setString(2, a.getUserName());
        ps.setString(3, a.getPassWord());
        ps.setDate(4, (Date) a.getDateCreate());
        ps.setString(5, a.getFullName());
        ps.setDate(6, (Date) a.getBirthday());
        ps.setInt(7, a.getGender());
        ps.setString(8, a.getPhone());
        ps.setString(9, a.getEmail());
        ps.setString(10, a.getAddress());
        ps.setInt(11, a.getStatus());
        ps.setDate(12, (Date) a.getLastLogin());
        ps.setInt(13, a.getAlowLogin());
        ps.setString(14, a.getAccountId());
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
    public String getRoleByUserName(Account a)
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Account where UserName like ?");
            ps.setString(1,a.getUserName());
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            return rs.getString("RoleId");

        } catch (SQLException ex) {
            Logger.getLogger(ManagementAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;

    }
}
