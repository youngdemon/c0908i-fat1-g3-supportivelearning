/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Staff;

import Model.DBConnection;
import Model.Entities.Staff.Assignment;
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
 * @author DELL
 */
public class ManagementAssigment {

    Connection conn;

    public ManagementAssigment() {
        conn = DBConnection.getConnect();
    }

    public boolean AddNewAssigment(Assignment a) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into Assignment values(?,?,?,?,?,?,?)");
            ps.setString(1,a.getAssignmentName());
            ps.setString(2, a.getAssignmentFile());
            ps.setString(3, a.getDescriptions());
            ps.setDate(4, a.getAssignmentStartDate());
            ps.setDate(5, a.getAssignmentEndDate());
            ps.setInt(6, a.getSubjectId());
            ps.setInt(7, a.getBatchId());
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementAssigment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private int batchId;
    private int subjectId;

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Iterator getAsssignmentByBatchIdAndSubjectId() {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from assignment where BatchId = ? and subjectId =?");
            ps.setInt(1, batchId);
            ps.setInt(2, subjectId);
            ResultSet rs = ps.executeQuery();
            ArrayList arr = new ArrayList();
            while (rs.next()) {
                Assignment a = new Assignment();
                a.setAssignmentId(rs.getInt(1));
                a.setAssignmentName(rs.getString(2));
                a.setAssignmentFile(rs.getString(3));
                a.setDescriptions(rs.getString(4));
                a.setAssignmentStartDate(rs.getDate(5));
                a.setAssignmentEndDate(rs.getDate(6));
                a.setSubjectId(rs.getInt(7));
                a.setBatchId(rs.getInt(8));
                if(a.getAssignmentEndDate().compareTo(new Date(new java.util.Date().getTime()))>0)
                {
                    a.setStatus(0);
                }
                else
                {
                    a.setStatus(1);
                }
                arr.add(a);

            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementAssigment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    private int assigmentId;
    public Iterator getAsssignmentById() {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from assignment where assignmentId=?");
            ps.setInt(1,assigmentId);
            ResultSet rs = ps.executeQuery();
            ArrayList arr = new ArrayList();
            while (rs.next()) {
                Assignment a = new Assignment();
                a.setAssignmentId(rs.getInt(1));
                a.setAssignmentName(rs.getString(2));
                a.setAssignmentFile(rs.getString(3));
                a.setDescriptions(rs.getString(4));
                a.setAssignmentStartDate(rs.getDate(5));
                a.setAssignmentEndDate(rs.getDate(6));
                a.setSubjectId(rs.getInt(7));
                a.setBatchId(rs.getInt(8));
                arr.add(a);

            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementAssigment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public int getAssigmentId() {
        return assigmentId;
    }

    public void setAssigmentId(int assigmentId) {
        this.assigmentId = assigmentId;
    }

}
