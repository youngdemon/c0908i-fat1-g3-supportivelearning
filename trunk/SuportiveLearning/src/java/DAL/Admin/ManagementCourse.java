/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Course;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DASDCO-S&D
 */
public class ManagementCourse {
    Connection conn;
    public ManagementCourse()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addNewCourse(Course c) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into Course values (?,?,?,?)");
        ps.setString(1, c.getCourseId());
        ps.setString(2, c.getCourseName());
        ps.setDate(3, (Date) c.getDateStart());
        ps.setDate(4, (Date) c.getDateEnd());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateCourse(Course c) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Course set CourseName = ?, DateStart = ?, DateEnd = ? where CourseId = ?");
        ps.setString(1, c.getCourseName());
        ps.setDate(2, (Date) c.getDateStart());
        ps.setDate(3, (Date) c.getDateEnd());
        ps.setString(4, c.getCourseId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteCourse(Course c) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Course where CourseId = ?");
        ps.setString(1, c.getCourseId());
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
