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
public class StaffAndBatchActionForm extends org.apache.struts.action.ActionForm {
    
    private String txtStaffAndBatchId;
    private String txtStaffId;
    private String txtBatchId;

    public String getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(String txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtStaffAndBatchId() {
        return txtStaffAndBatchId;
    }

    public void setTxtStaffAndBatchId(String txtStaffAndBatchId) {
        this.txtStaffAndBatchId = txtStaffAndBatchId;
    }

    public String getTxtStaffId() {
        return txtStaffId;
    }

    public void setTxtStaffId(String txtStaffId) {
        this.txtStaffId = txtStaffId;
    }

   

    public StaffAndBatchActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
