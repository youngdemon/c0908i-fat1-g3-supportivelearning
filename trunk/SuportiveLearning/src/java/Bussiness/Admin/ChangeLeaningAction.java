/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementChangeLearning;
import Model.DBConnection;
import Model.Entities.Admin.ChangeLeaning;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class ChangeLeaningAction extends org.apache.struts.action.Action {
    
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
        ChangeLeaningActionForm f= (ChangeLeaningActionForm) form;
        ManagementChangeLearning MC=new ManagementChangeLearning();
        ChangeLeaning s=new ChangeLeaning();
        s.setChangeLeaningId(f.getTxtChangeLeaningId());
        s.setStudentId(f.getTxtStudentId());
        s.setBatchId(f.getTxtBatchId());
        s.setReason(f.getTxtReason());
        s.setDateChange(DBConnection.convertStringToDate(f.getTxtDateChange()));
        System.out.println(s.getChangeLeaningId());
        MC.addNewChangeLeaning(s);

        return mapping.findForward("success");
    }
}
