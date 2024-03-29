/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementBatch;
import Model.DBConnection;
import Model.Entities.Admin.Batch;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class BatchAction extends org.apache.struts.action.Action {
    
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
        BatchActionForm f= (BatchActionForm) form;
        ManagementBatch MC=new ManagementBatch();
        Batch s=new Batch();
        s.setBatchName(f.getTxtBatchName());
        s.setStartDate(DBConnection.convertStringToDate(f.getTxtStartDate()));
        s.setStaffId(Integer.valueOf(f.getTxtStaffId()));
        s.setSemesterId(Integer.valueOf(f.getTxtsemesterId()));
        MC.addNewBatch(s);
        request.setAttribute("action","listBatch");
        return mapping.findForward("home");
    }
}
