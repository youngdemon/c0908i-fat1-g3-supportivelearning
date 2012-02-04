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
        ps.setString(1, s.getSubjectName());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateSubject(Subject s)
    {
        return true;
    }
    public boolean deleteSubject(Subject s)
    {
        return true;
    }

}
