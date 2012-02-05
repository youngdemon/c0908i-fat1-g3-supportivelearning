/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class ManagementSubject
{

    Connection conn;
    public ManagementSubject()
    {
        conn=DBConnection.getConnect();
    }
    public boolean addNewSubject(Subject s) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into Subject values (?,?)");
        ps.setString(1, s.getSubjectId());
        ps.setString(2, s.getSubjectName());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateSubject(Subject s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Subject set SubjectName = ? where SubjectId = ?");
        ps.setString(1, s.getSubjectName());
        ps.setString(2, s.getSubjectId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteSubject(Subject s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Subject where SubjectId = ?");
        ps.setString(1, s.getSubjectId());
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
