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
public class Subject {

    public Subject()
    {

    }
    private int subjectId;
    private int semesterId;
    private String subjectName;


    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
