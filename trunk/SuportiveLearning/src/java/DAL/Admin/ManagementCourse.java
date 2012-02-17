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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        PreparedStatement ps=conn.prepareStatement("insert into Course values (?,?,?)");
        ps.setString(1, c.getCourseName());
        ps.setDate(2,c.getDateStart());
        ps.setDate(3,c.getDateEnd());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
//    public boolean updateCourse(Course c) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("update Course set CourseName = ?, DateStart = ?, DateEnd = ? where CourseId = ?");
//        ps.setString(1, c.getCourseName());
//        ps.setDate(2, (Date) c.getDateStart());
//        ps.setDate(3, (Date) c.getDateEnd());
//        ps.setString(4, c.getCourseId());
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//    public boolean deleteCourse(Course c) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("delete from Course where CourseId = ?");
//        ps.setString(1, c.getCourseId());
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

    //display table course
    public Iterator getAllCourse()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Course");
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Course c=new Course();
                c.setCourseId(rs.getInt(1));
                c.setCourseName(rs.getString(2));
                c.setDateStart(rs.getDate(3));
                c.setDateEnd(rs.getDate(4));
                arr.add(c);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
