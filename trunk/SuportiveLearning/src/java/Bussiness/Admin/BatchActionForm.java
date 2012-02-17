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
public class BatchActionForm extends org.apache.struts.action.ActionForm {
    
    private int txtBatchId;

    public int getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(int txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtBatchName() {
        return txtBatchName;
    }

    public void setTxtBatchName(String txtBatchName) {
        this.txtBatchName = txtBatchName;
    }

    public String getTxtStaffId() {
        return txtStaffId;
    }

    public void setTxtStaffId(String txtStaffId) {
        this.txtStaffId = txtStaffId;
    }

    public String getTxtStartDate() {
        return txtStartDate;
    }

    public void setTxtStartDate(String txtStartDate) {
        this.txtStartDate = txtStartDate;
    }

    public String getTxtsemesterId() {
        return txtsemesterId;
    }

    public void setTxtsemesterId(String txtsemesterId) {
        this.txtsemesterId = txtsemesterId;
    }
    private String txtBatchName;
    private String txtStartDate;
    private String txtStaffId;
    private String txtsemesterId;
    public BatchActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
