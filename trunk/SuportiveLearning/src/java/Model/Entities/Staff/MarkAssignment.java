/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Staff;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class MarkAssignment
{
    public MarkAssignment()
    {        
    }
    private int markAssignmentId;
    private int studentId;
    private int assignmentId;
    private String fileUpload;

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }

    public Float getMarkAssignment() {
        return markAssignment;
    }

    public void setMarkAssignment(Float markAssignment) {
        this.markAssignment = markAssignment;
    }

    public int getMarkAssignmentId() {
        return markAssignmentId;
    }

    public void setMarkAssignmentId(int markAssignmentId) {
        this.markAssignmentId = markAssignmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    private Float markAssignment;
    private Date dateUpload;
}
