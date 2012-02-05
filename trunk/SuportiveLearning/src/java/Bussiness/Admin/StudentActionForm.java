/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Administrator
 */
public class StudentActionForm extends org.apache.struts.action.ActionForm {

    private String txtStudentId;
    private String txtAccountId;
    private String txtRollNumber;
    private String txtBatchId;

    public String getTxtAccountId() {
        return txtAccountId;
    }

    public void setTxtAccountId(String txtAccountId) {
        this.txtAccountId = txtAccountId;
    }

    public String getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(String txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtRollNumber() {
        return txtRollNumber;
    }

    public void setTxtRollNumber(String txtRollNumber) {
        this.txtRollNumber = txtRollNumber;
    }

    public String getTxtStudentId() {
        return txtStudentId;
    }

    public void setTxtStudentId(String txtStudentId) {
        this.txtStudentId = txtStudentId;
    }
    
    public StudentActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
