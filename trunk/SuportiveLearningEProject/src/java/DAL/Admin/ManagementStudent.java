/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class ManagementStudent {

    Connection conn;
    public ManagementStudent()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addNewStudent(Student s) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into Student values (?,?,?,?)");
        ps.setString(1, s.getStudentId());
        ps.setString(2, s.getAccountId());
        ps.setString(3, s.getRollNumber());
        ps.setString(4, s.getBatchId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateStudent(Student s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Student set AccountId = ?, RollNumber = ?, BatchId = ? where StudentId = ?");
        ps.setString(1, s.getAccountId());
        ps.setString(2, s.getRollNumber());
        ps.setString(3, s.getBatchId());
        ps.setString(4, s.getAccountId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteStudent(Student s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Student where StudentId = ?");
        ps.setString(1, s.getStudentId());
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
