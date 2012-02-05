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

    private String txtSubjectId;
    private String txtSubjectName;

    public String getTxtSubjectId() {
        return txtSubjectId;
    }

    public void setTxtSubjectId(String txtSubjectId) {
        this.txtSubjectId = txtSubjectId;
    }

    public String getTxtSubjectName() {
        return txtSubjectName;
    }

    public void setTxtSubjectName(String txtSubjectName) {
        this.txtSubjectName = txtSubjectName;
    }
    public SubjectActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
