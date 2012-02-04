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
    private String MarAssignmentId;
    private String StudentId;
    private String Assignment;
    private String FileUpload;
    private Float MarkAssignment;
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

    public String getMarAssignmentId() {
        return MarAssignmentId;
    }

    public void setMarAssignmentId(String MarAssignmentId) {
        this.MarAssignmentId = MarAssignmentId;
    }

    public Float getMarkAssignment() {
        return MarkAssignment;
    }

    public void setMarkAssignment(Float MarkAssignment) {
        this.MarkAssignment = MarkAssignment;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }
    
    

}
