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
 * @author Ncuong
 */
public class FAQActionForm extends org.apache.struts.action.ActionForm {
    
    private int txtFAQId;
    private String txtAnswer;
    private String txtQuestion;
    private String txtFAQDate;

    public String getTxtAnswer() {
        return txtAnswer;
    }

    public void setTxtAnswer(String txtAnswer) {
        this.txtAnswer = txtAnswer;
    }

    public int getTxtFAQId() {
        return txtFAQId;
    }

    public void setTxtFAQId(int txtFAQId) {
        this.txtFAQId = txtFAQId;
    }

    public String getTxtFAQDate() {
        return txtFAQDate;
    }

    public void setTxtFAQDate(String txtFAQDate) {
        this.txtFAQDate = txtFAQDate;
    }
 
    public String getTxtQuestion() {
        return txtQuestion;
    }

    public void setTxtQuestion(String txtQuestion) {
        this.txtQuestion = txtQuestion;
    }
}
