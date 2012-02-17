/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Batch;
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
 * @author Ncuong
 */
public class ManagementBatch {
    Connection conn = null;
    public ManagementBatch()
    {
        conn = DBConnection.getConnect();
    }

    public boolean addNewBatch(Batch b) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("insert into Batch values(?,?,?,?)");
        ps.setString(1, b.getBatchName());
        ps.setDate(2, b.getStartDate());
        ps.setInt(3, b.getStaffId());
        ps.setInt(4, b.getSemesterId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean updateBatch(Batch b) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update Batch set BatchName=?,StartDate=?,StaffId=?,SemesterId=? where BatchId=?");
        ps.setString(1, b.getBatchName());
        ps.setDate(2, b.getStartDate());
        ps.setInt(3, b.getStaffId());
        ps.setInt(4, b.getSemesterId());
        ps.setInt(5, b.getBatchId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//    public boolean deleteBatch(Batch b) throws SQLException
//    {
//        PreparedStatement ps = conn.prepareStatement("delete from Batch where BatchId=?");
//        ps.setString(1, b.getBatchId());
//
//        if(ps.executeUpdate()>0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
    private int StaffId;

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }
    public Iterator getBatchByStaffId()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Batch where StaffId=?");
            ps.setInt(1,StaffId);
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Batch temp=new Batch();
                temp.setBatchId(rs.getInt(1));
                temp.setBatchName(rs.getString(2));
                temp.setStartDate(rs.getDate(3));
                temp.setStaffId(rs.getInt(4));
                temp.setSemesterId(rs.getInt(5));
                arr.add(temp);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private int batchId;
    public Iterator getBatchById()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Batch where BatchId=?");
            ps.setInt(1,batchId);
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Batch temp=new Batch();
                temp.setBatchId(rs.getInt(1));
                temp.setBatchName(rs.getString(2));
                temp.setStartDate(rs.getDate(3));
                temp.setStaffId(rs.getInt(4));
                temp.setSemesterId(rs.getInt(5));
                arr.add(temp);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public Iterator getAllBatch()
    {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Batch");
            ResultSet rs=ps.executeQuery();
            ArrayList arr=new ArrayList();
            while(rs.next())
            {
                Batch b=new Batch();
                b.setBatchId(rs.getInt(1));
                b.setBatchName(rs.getString(2));
                b.setStartDate(rs.getDate(3));
                b.setStaffId(rs.getInt(4));
                b.setSemesterId(rs.getInt(5));
                arr.add(b);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
