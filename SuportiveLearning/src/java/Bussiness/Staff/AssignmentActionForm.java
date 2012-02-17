/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Staff;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Administrator
 */
public class AssignmentActionForm extends org.apache.struts.action.ActionForm {
    public AssignmentActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String txtAssignmentName;
    private FormFile fileUp;
    private String txaDescription;
    private String txtStartDate;
    private String txtEndDate;
    private String txtBatchId;
    private String txtSubjectId;

    public String getTxtBatchId() {
        return txtBatchId;
    }

    public void setTxtBatchId(String txtBatchId) {
        this.txtBatchId = txtBatchId;
    }

    public String getTxtSubjectId() {
        return txtSubjectId;
    }

    public void setTxtSubjectId(String txtSubjectId) {
        this.txtSubjectId = txtSubjectId;
    }
    public FormFile getFileUp() {
        return fileUp;
    }

    public void setFileUp(FormFile fileUp) {
        this.fileUp = fileUp;
    }

    public String getTxaDescription() {
        return txaDescription;
    }

    public void setTxaDescription(String txaDescription) {
        this.txaDescription = txaDescription;
    }
    public String getTxtAssignmentName() {
        return txtAssignmentName;
    }

    public void setTxtAssignmentName(String txtAssignmentName) {
        this.txtAssignmentName = txtAssignmentName;
    }

    public String getTxtEndDate() {
        return txtEndDate;
    }

    public void setTxtEndDate(String txtEndDate) {
        this.txtEndDate = txtEndDate;
    }

    public String getTxtStartDate() {
        return txtStartDate;
    }

    public void setTxtStartDate(String txtStartDate) {
        this.txtStartDate = txtStartDate;
    }
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
}
