/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Batch {

    public Batch()
    {

    }
    
    private String BatchId;
    private String BatchName;
    private Date StartDate;
    private String CourseId;
    private String SemesterId;

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getBatchName() {
        return BatchName;
    }

    public void setBatchName(String BatchName) {
        this.BatchName = BatchName;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String CourseId) {
        this.CourseId = CourseId;
    }

    public String getSemesterId() {
        return SemesterId;
    }

    public void setSemesterId(String SemesterId) {
        this.SemesterId = SemesterId;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

}
