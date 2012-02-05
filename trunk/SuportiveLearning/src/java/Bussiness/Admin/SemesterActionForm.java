/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import java.sql.Date;
/**
 *
 * @author Administrator
 */
public class SemesterActionForm extends org.apache.struts.action.ActionForm {
    
    private String txtSemesterID;
    private String txtSemesterName;
    private String txtSemesterDate;

    public String getTxtSemesterDate() {
        return txtSemesterDate;
    }

    public void setTxtSemesterDate(String txtSemesterDate) {
        this.txtSemesterDate = txtSemesterDate;
    }

    public String getTxtSemesterID() {
        return txtSemesterID;
    }

    public void setTxtSemesterID(String txtSemesterID) {
        this.txtSemesterID = txtSemesterID;
    }

    public String getTxtSemesterName() {
        return txtSemesterName;
    }

    public void setTxtSemesterName(String txtSemesterName) {
        this.txtSemesterName = txtSemesterName;
    }
    public SemesterActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
