/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementStaff;
import Model.Entities.Admin.Staff;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author DELL
 */
public class StaffAction extends org.apache.struts.action.Action {
    
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

        StaffActionForm sa=(StaffActionForm) form;
        ManagementStaff ms = new ManagementStaff();
        Staff s = new Staff();
        s.setStaffId(sa.getTxtStaffId());
        s.setAccountId(sa.getTxtAccountId());
        System.out.println(s.getStaffId());
        ms.addNewStaff(s);
        
        
        return mapping.findForward("success");
    }
}
