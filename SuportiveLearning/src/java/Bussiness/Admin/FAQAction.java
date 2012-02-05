/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementFAQ;
import Model.Entities.Admin.FAQ;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class FAQAction extends org.apache.struts.action.Action {
    
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
        FAQActionForm f= (FAQActionForm) form;
        ManagementFAQ MS=new ManagementFAQ();
        FAQ s=new FAQ();
        s.setFAQId(f.getTxtFAQId());
        s.setQuestion(f.getTxtQuestion());
        s.setAnswer(f.getTxtAnswer());
        s.setFAQDate(Date.valueOf(f.getTxtFAQDate()));
        System.out.println(s.getFAQDate());
        MS.addFAQ(s);

        return mapping.findForward("success");
    }
}