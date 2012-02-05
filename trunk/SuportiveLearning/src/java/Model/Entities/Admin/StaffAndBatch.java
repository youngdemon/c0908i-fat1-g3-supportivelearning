/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

/**
 *
 * @author Administrator
 */
public class StaffAndBatch {

    public StaffAndBatch()
    {

    }

    private String StaffAndBatchId;
    private String StaffId;
    private String BatchId;

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getStaffAndBatchId() {
        return StaffAndBatchId;
    }

    public void setStaffAndBatchId(String StaffAndBatchId) {
        this.StaffAndBatchId = StaffAndBatchId;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

}
