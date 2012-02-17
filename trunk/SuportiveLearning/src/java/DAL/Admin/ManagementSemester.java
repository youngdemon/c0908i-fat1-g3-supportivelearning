/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Semester;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ManagementSemester {
    Connection conn;
    public ManagementSemester()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addNewSemester(Semester c) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into Semester values (?,?)");
        ps.setInt(1,c.getCourseId());
        ps.setString(2,c.getSemesterName());
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
    public Iterator getAllSemester()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Semester");
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Semester c=new Semester();
                c.setSemesterId(rs.getInt(1));
                c.setCourseId(rs.getInt(2));
                c.setSemesterName(rs.getString(3));
                arr.add(c);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
