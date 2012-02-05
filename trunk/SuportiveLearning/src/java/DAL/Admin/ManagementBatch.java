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
import java.sql.SQLException;

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
        PreparedStatement ps = conn.prepareStatement("insert into Batch values(?,?,?,?,?)");
        ps.setString(1, b.getBatchId());
        ps.setString(1, b.getBatchName());
        ps.setDate(1, (Date) b.getStartDate());
        ps.setString(1, b.getCourseId());
        ps.setString(1, b.getSemesterId());

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
        PreparedStatement ps = conn.prepareStatement("update Batcg set BatchName=?,StartDate=?,CourseId=?,SemesterId=? where BatchId=?");
        ps.setString(1, b.getBatchName());
        ps.setDate(1, (Date) b.getStartDate());
        ps.setString(1, b.getCourseId());
        ps.setString(1, b.getSemesterId());
        ps.setString(1, b.getBatchId());

        if(ps.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteBatch(Batch b) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from Batch where BatchId=?");
        ps.setString(1, b.getBatchId());

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
