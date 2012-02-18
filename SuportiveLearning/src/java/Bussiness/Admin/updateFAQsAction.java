/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementFAQ;
import Model.DBConnection;
import Model.Entities.Admin.FAQ;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Ncuong
 */
public class updateFAQsAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        FAQActionForm f=(FAQActionForm) form;

        ManagementFAQ MF=new ManagementFAQ();
        FAQ temp=new FAQ();
        temp.setfAQId(f.getTxtFAQId());
        temp.setAnswer(f.getTxtAnswer());
        temp.setQuestion(f.getTxtQuestion());
        temp.setfAQDate(DBConnection.convertStringToDate(f.getTxtFAQDate()));
        MF.update(temp);
        request.setAttribute("action", "listFAQ");
        return mapping.findForward("home");
    }
}