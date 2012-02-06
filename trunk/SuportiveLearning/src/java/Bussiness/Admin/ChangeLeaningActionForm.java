/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

/**
 *
 * @author Administrator
 */
public class ChangeLeaningActionForm extends org.apache.struts.action.ActionForm {
    
    private String txtChangeLeaningId;
    private String txtStudentId;
    private String txtBatchId;
    private String txtReason;
    private String txtDateChange;

    public String getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(String txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtChangeLeaningId() {
        return txtChangeLeaningId;
    }

    public void setTxtChangeLeaningId(String txtChangeLeaningId) {
        this.txtChangeLeaningId = txtChangeLeaningId;
    }

    public String getTxtDateChange() {
        return txtDateChange;
    }

    public void setTxtDateChange(String txtDateChange) {
        this.txtDateChange = txtDateChange;
    }

    public String getTxtReason() {
        return txtReason;
    }

    public void setTxtReason(String txtReason) {
        this.txtReason = txtReason;
    }

    public String getTxtStudentId() {
        return txtStudentId;
    }

    public void setTxtStudentId(String txtStudentId) {
        this.txtStudentId = txtStudentId;
    }

    public ChangeLeaningActionForm() {
        super();
        // TODO Auto-generated constructor stub

    }
}

