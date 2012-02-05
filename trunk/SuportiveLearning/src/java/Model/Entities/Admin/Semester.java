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
public class Semester {

    public Semester()
    {

    }

    private String SemesterId;
    private String SemesterName;
    private Date SemesterTime;

    public String getSemesterId() {
        return SemesterId;
    }

    public void setSemesterId(String SemesterId) {
        this.SemesterId = SemesterId;
    }

    public String getSemesterName() {
        return SemesterName;
    }

    public void setSemesterName(String SemesterName) {
        this.SemesterName = SemesterName;
    }

    public Date getSemesterTime() {
        return SemesterTime;
    }

    public void setSemesterTime(Date SemesterTime) {
        this.SemesterTime = SemesterTime;
    }
}
