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
public class MarkAssignment
{
    private String MarkAssignmentId;
    private String StudentId;
    private String Assignment;
    private String FileUpload;
    private Integer MarkAssignment;
    private Date DateUpload;

    public String getAssignment() {
        return Assignment;
    }

    public void setAssignment(String Assignment) {
        this.Assignment = Assignment;
    }

    public Date getDateUpload() {
        return DateUpload;
    }

    public void setDateUpload(Date DateUpload) {
        this.DateUpload = DateUpload;
    }

    public String getFileUpload() {
        return FileUpload;
    }

    public void setFileUpload(String FileUpload) {
        this.FileUpload = FileUpload;
    }

    public Integer getMarkAssignment() {
        return MarkAssignment;
    }

    public void setMarkAssignment(Integer MarkAssignment) {
        this.MarkAssignment = MarkAssignment;
    }

    public String getMarkAssignmentId() {
        return MarkAssignmentId;
    }

    public void setMarkAssignmentId(String MarkAssignmentId) {
        this.MarkAssignmentId = MarkAssignmentId;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }
    

}
