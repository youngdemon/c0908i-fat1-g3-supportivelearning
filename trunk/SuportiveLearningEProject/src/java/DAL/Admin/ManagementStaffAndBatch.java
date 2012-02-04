/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.StaffAndBatch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Administrator
 */
public class ManagementStaffAndBatch {

    Connection conn;
    public ManagementStaffAndBatch()
    {
        conn= DBConnection.getConnect();
    }
    public boolean addNewStaffAndBatch(StaffAndBatch s) throws SQLException
    {
        PreparedStatement ps=conn.prepareStatement("insert into StaffAndBatch values (?,?,?)");
        ps.setString(1, s.getStaffAndBatchId());
        ps.setString(2, s.getStaffId());
        ps.setString(3, s.getBatchId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public boolean updateStaffAndBatch(StaffAndBatch s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("update StaffAndBatch set StaffId = ?, BatchId = ? where StaffAndBatchId = ?");
        ps.setString(1, s.getStaffId());
        ps.setString(2, s.getBatchId());
        ps.setString(3, s.getStaffAndBatchId());
        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteStaffAndBatch(StaffAndBatch s) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from StaffAndBatch where StaffAndBatchId = ?");
        ps.setString(1, s.getStaffAndBatchId());
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
