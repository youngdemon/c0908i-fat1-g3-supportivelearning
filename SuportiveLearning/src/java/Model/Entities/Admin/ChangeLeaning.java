/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class ChangeLeaning {
    
    public ChangeLeaning()
    {

    }

    private String ChangeLeaningId;
    private String StudentId;
    private String BatchId;
    private String Reason;
    private Date DateChange;

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getChangeLeaningId() {
        return ChangeLeaningId;
    }

    public void setChangeLeaningId(String ChangeLeaningId) {
        this.ChangeLeaningId = ChangeLeaningId;
    }

    public Date getDateChange() {
        return DateChange;
    }

    public void setDateChange(Date DateChange) {
        this.DateChange = DateChange;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }
}
