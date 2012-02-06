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

    private String txtCourseId;
    private String txtCourseName;
    private String txtDateStart;
    private String txtDateEnd;

    public String getTxtCourseId() {
        return txtCourseId;
    }

    public void setTxtCourseId(String txtCourseId) {
        this.txtCourseId = txtCourseId;
    }

    public String getTxtCourseName() {
        return txtCourseName;
    }

    public void setTxtCourseName(String txtCourseName) {
        this.txtCourseName = txtCourseName;
    }

    public String getTxtDateEnd() {
        return txtDateEnd;
    }

    public void setTxtDateEnd(String txtDateEnd) {
        this.txtDateEnd = txtDateEnd;
    }

    public String getTxtDateStart() {
        return txtDateStart;
    }

    public void setTxtDateStart(String txtDateStart) {
        this.txtDateStart = txtDateStart;
    }

    public CourseActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
