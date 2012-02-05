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
public class StaffActionForm extends org.apache.struts.action.ActionForm {
    
    private String txtStaffId;
    private String txtAccountId;

    public String getTxtAccountId() {
        return txtAccountId;
    }

    public void setTxtAccountId(String txtAccountId) {
        this.txtAccountId = txtAccountId;
    }

    public String getTxtStaffId() {
        return txtStaffId;
    }

    public void setTxtStaffId(String txtStaffId) {
        this.txtStaffId = txtStaffId;
    }

    public StaffActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
