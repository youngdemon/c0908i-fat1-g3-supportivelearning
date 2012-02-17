/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

/**
 *
 * @author Administrator
 */
public class CourseActionForm extends org.apache.struts.action.ActionForm {

    private String CourseId;
    private String CourseName;
    private String DateStart;
    private String DateEnd;

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String CourseId) {
        this.CourseId = CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
    }

    public String getDateStart() {
        return DateStart;
    }

    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    public CourseActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
