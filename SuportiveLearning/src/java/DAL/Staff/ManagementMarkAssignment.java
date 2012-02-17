/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Staff;

import Model.DBConnection;
import Model.Entities.Staff.MarkAssignment;
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
public class ManagementMarkAssignment
{

    Connection conn;
    public ManagementMarkAssignment() {
        conn=DBConnection.getConnect();
    }
    public boolean submitAssigment(MarkAssignment m)
    {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into MarkAssignment(StudentId,AssignmentId,FileUpload) values(?,?,?)");
            ps.setInt(1,m.getStudentId());
            ps.setInt(2,m.getAssignmentId());
            ps.setString(3, m.getFileUpload());
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementMarkAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean changeFileMarkAssignment(MarkAssignment m)
    {
        try {
            PreparedStatement ps = conn.prepareStatement("update MarkAssignment set FileUpload=? where markAssignmentId");
            ps.setInt(1, m.getMarkAssignmentId());
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ManagementMarkAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private int studentId;
    private int assignmentId;
    public Iterator getMarkAssignmentByStudentId()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from MarkAssignment where StudentId=? and AssignmentId=?");
            ps.setInt(1,studentId);
            ps.setInt(2, assignmentId);
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                MarkAssignment temp=new MarkAssignment();
                temp.setMarkAssignmentId(rs.getInt(1));
                temp.setStudentId(rs.getInt(2));
                temp.setAssignmentId(rs.getInt(3));
                temp.setFileUpload(rs.getString(4));
                temp.setMarkAssignment(rs.getFloat(5));
                temp.setDateUpload(rs.getDate(6));
                arr.add(temp);
            }
            if(arr.size()>0)
            {
                return arr.iterator();
            }
            else
            {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementMarkAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public Iterator getMarkAssignmentAssignmentId()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from MarkAssignment where AssignmentId=?");
            ps.setInt(1, assignmentId);
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                MarkAssignment temp=new MarkAssignment();
                temp.setMarkAssignmentId(rs.getInt(1));
                temp.setStudentId(rs.getInt(2));
                temp.setAssignmentId(rs.getInt(3));
                temp.setFileUpload(rs.getString(4));
                temp.setMarkAssignment(rs.getFloat(5));
                temp.setDateUpload(rs.getDate(6));
                arr.add(temp);
            }
            if(arr.size()>0)
            {
                return arr.iterator();
            }
            else
            {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementMarkAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    public boolean UpdateMark(MarkAssignment m)
    {
        try {
            PreparedStatement ps = conn.prepareStatement("Update markAssignment set markAssignment=? where markAssignmentId=?");
            ps.setFloat(1,m.getMarkAssignment());
            ps.setInt(2, m.getMarkAssignmentId());
            if(ps.executeUpdate()>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementMarkAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
