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
 * @author DELL
 */
public class BatchActionForm extends org.apache.struts.action.ActionForm {
    

    private String txtBatchId;
    private String txtBatchName;
    private String txtStartDate;
    private String txtCourseId;
    private String txtSemesterId;

    public String getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(String txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtBatchName() {
        return txtBatchName;
    }

    public void setTxtBatchName(String txtBatchName) {
        this.txtBatchName = txtBatchName;
    }

    public String getTxtCourseId() {
        return txtCourseId;
    }

    public void setTxtCourseId(String txtCourseId) {
        this.txtCourseId = txtCourseId;
    }

    public String getTxtSemesterId() {
        return txtSemesterId;
    }

    public void setTxtSemesterId(String txtSemesterId) {
        this.txtSemesterId = txtSemesterId;
    }

    public String getTxtStartDate() {
        return txtStartDate;
    }

    public void setTxtStartDate(String txtStartDate) {
        this.txtStartDate = txtStartDate;
    }
    

    public BatchActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
