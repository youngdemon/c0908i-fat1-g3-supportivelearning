/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

/**
 *
 * @author Administrator
 */
public class Semester {

    public Semester() {
    }

    private int semesterId;
    private int courseId;
    private String semesterName;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

}
