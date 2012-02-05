/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Administrator
 */
public class FAQActionForm extends org.apache.struts.action.ActionForm {
    
    private String txtFAQId;
    private String txtQuestion;
    private String txtAnswer;
    private String txtFAQDate;

    public String getTxtAnswer() {
        return txtAnswer;
    }

    public void setTxtAnswer(String txtAnswer) {
        this.txtAnswer = txtAnswer;
    }

    public String getTxtFAQDate() {
        return txtFAQDate;
    }

    public void setTxtFAQDate(String txtFAQDate) {
        this.txtFAQDate = txtFAQDate;
    }

    public String getTxtFAQId() {
        return txtFAQId;
    }

    public void setTxtFAQId(String txtFAQId) {
        this.txtFAQId = txtFAQId;
    }

    public String getTxtQuestion() {
        return txtQuestion;
    }

    public void setTxtQuestion(String txtQuestion) {
        this.txtQuestion = txtQuestion;
    }

  
    public FAQActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
