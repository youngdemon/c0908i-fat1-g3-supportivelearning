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
public class SubjectActionForm extends org.apache.struts.action.ActionForm {

    private String txtsubjectId;
    private String txtsemesterId;
    private String txtsubjectName;

    public String getTxtsemesterId() {
        return txtsemesterId;
    }

    public void setTxtsemesterId(String txtsemesterId) {
        this.txtsemesterId = txtsemesterId;
    }

    public String getTxtsubjectId() {
        return txtsubjectId;
    }

    public void setTxtsubjectId(String txtsubjectId) {
        this.txtsubjectId = txtsubjectId;
    }

    public String getTxtsubjectName() {
        return txtsubjectName;
    }

    public void setTxtsubjectName(String txtsubjectName) {
        this.txtsubjectName = txtsubjectName;
    }

    

    
    public SubjectActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
