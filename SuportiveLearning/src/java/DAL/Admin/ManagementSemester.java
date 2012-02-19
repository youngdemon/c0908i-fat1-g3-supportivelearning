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
    public boolean updateSemester(Semester s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Semester set CourseId = ?, SemesterName = ? where SemesterId = ?");
        ps.setInt(1, s.getCourseId());
        ps.setString(2, s.getSemesterName());
        ps.setInt(3, s.getSemesterId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteSemester(int s) throws SQLException
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("delete from Semester where SemesterId = ?");
            ps.setInt(1, s);
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }catch(Exception e)
        {
            return false;
        }
    }

    private int semesterId;

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }
    
    public Iterator getSemesterById()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Semester where SemesterId=?");
            ps.setInt(1,semesterId);
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Semester temp=new Semester();
                temp.setSemesterId(rs.getInt(1));
                temp.setCourseId(rs.getInt(2));
                temp.setSemesterName(rs.getString(3));
                
                arr.add(temp);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

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
