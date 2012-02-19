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
public class SemesterActionForm extends org.apache.struts.action.ActionForm {

    private int txtsemesterId;
    private int txtcourseId;
    private String txtsemesterName;

    public int getTxtcourseId() {
        return txtcourseId;
    }

    public void setTxtcourseId(int txtcourseId) {
        this.txtcourseId = txtcourseId;
    }

    public int getTxtsemesterId() {
        return txtsemesterId;
    }

    public void setTxtsemesterId(int txtsemesterId) {
        this.txtsemesterId = txtsemesterId;
    }

    public String getTxtsemesterName() {
        return txtsemesterName;
    }

    public void setTxtsemesterName(String txtsemesterName) {
        this.txtsemesterName = txtsemesterName;
    }
    
    public SemesterActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
