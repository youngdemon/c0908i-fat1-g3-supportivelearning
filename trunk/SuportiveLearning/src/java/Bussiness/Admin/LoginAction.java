/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementAccount;
import Model.Entities.Admin.Account;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class LoginAction extends org.apache.struts.action.Action {
    
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
        HttpSession session=request.getSession();
        LoginActionForm f=(LoginActionForm) form;
        ManagementAccount MA=new ManagementAccount();
        Account a=new Account();
        a.setUserName(f.getTxtUserName());
        a.setPassWord(f.getTxtPassword());
        if(MA.checkLogin(a))
        {
            session.setAttribute("user",a.getUserName());
            session.setAttribute("role",MA.getRoleByUserName(a));

            return mapping.findForward("home");

        }
        else
        {
            session.setAttribute("err_mess","* Invalid password or username");
            return mapping.findForward("home");
        }
    }
}
