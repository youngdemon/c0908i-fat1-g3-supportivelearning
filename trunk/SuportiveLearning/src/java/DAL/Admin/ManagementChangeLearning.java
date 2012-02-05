/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.ChangeLeaning;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DASDCO-S&D
 */
public class ManagementChangeLearning {
    Connection conn;
    public ManagementChangeLearning()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addNewChangeLeaning(ChangeLeaning cl) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into ChangeLeaning values (?,?,?,?,?)");
        ps.setString(1, cl.getChangeLeaningId());
        ps.setString(2, cl.getStudentId());
        ps.setString(3, cl.getBatchId());
        ps.setString(4, cl.getReason());
        ps.setDate(5, (Date) cl.getDateChange());
        if(ps.executeUpdate()>0)
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }

    public boolean updateChangeLeaning(ChangeLeaning cl) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update ChangeLeaning set StudentId=?,BatchId=?,Reason=?,DateChange=?where ChangeLeaningId=? ");
        ps.setString(1, cl.getStudentId());
        ps.setString(2, cl.getBatchId());
        ps.setString(3, cl.getReason());
        ps.setDate(4, (Date) cl.getDateChange());
        ps.setString(5, cl.getChangeLeaningId());
        if(ps.executeUpdate()>0)
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }

    public boolean deleteChangeLeaning(ChangeLeaning cl) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from ChangeLeaning where getChangeLeaningId=?");
        ps.setString(1, cl.getChangeLeaningId());
        if(ps.executeUpdate()>0)
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }
}
