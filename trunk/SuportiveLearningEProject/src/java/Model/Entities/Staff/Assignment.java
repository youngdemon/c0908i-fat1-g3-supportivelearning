/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Staff;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Assignment
{
    public Assignment()
    {
        
    }
    private String AssignmentId;
    private String AssignmentName;
    private String AssignmentFile;
    private String Assignment;
    private Date AssignmentStartDate;
    private Date AssignmentEndDate;
    private String SubjectId;
    private String StaffId;
    private String BatchId;

    public String getAssignment() {
        return Assignment;
    }

    public void setAssignment(String Assignment) {
        this.Assignment = Assignment;
    }

    public Date getAssignmentEndDate() {
        return AssignmentEndDate;
    }

    public void setAssignmentEndDate(Date AssignmentEndDate) {
        this.AssignmentEndDate = AssignmentEndDate;
    }

    public String getAssignmentFile() {
        return AssignmentFile;
    }

    public void setAssignmentFile(String AssignmentFile) {
        this.AssignmentFile = AssignmentFile;
    }

    public String getAssignmentId() {
        return AssignmentId;
    }

    public void setAssignmentId(String AssignmentId) {
        this.AssignmentId = AssignmentId;
    }

    public String getAssignmentName() {
        return AssignmentName;
    }

    public void setAssignmentName(String AssignmentName) {
        this.AssignmentName = AssignmentName;
    }

    public Date getAssignmentStartDate() {
        return AssignmentStartDate;
    }

    public void setAssignmentStartDate(Date AssignmentStartDate) {
        this.AssignmentStartDate = AssignmentStartDate;
    }

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }
    
    

}
