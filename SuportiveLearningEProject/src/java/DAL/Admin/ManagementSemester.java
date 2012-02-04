/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Semester;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class ManagementSemester {

    Connection conn;
    public ManagementSemester()
    {
        conn=DBConnection.getConnect();
    }

    public boolean addNewSemester(Semester s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into Semester values (?,?,?)");
        ps.setString(1, s.getSemesterId());
        ps.setString(1, s.getSemesterName());
        ps.setDate(1, (Date) s.getSemesterTime());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean updateSemester(Semester s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update News set SemesterName=?,SemesterTime=? where SemesterId=?");
        ps.setString(1, s.getSemesterName());
        ps.setDate(1, (Date) s.getSemesterTime());
        ps.setString(1, s.getSemesterId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return true;
        }
    }
    public boolean deleteSemester(Semester s) throws SQLException
    {

        PreparedStatement ps = conn.prepareStatement("delete from Semester where SemesterId = ?");
        ps.setString(1, s.getSemesterId());
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
