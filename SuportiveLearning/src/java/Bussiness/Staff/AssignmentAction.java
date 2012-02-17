/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.Staff;

import DAL.Staff.ManagementAssigment;
import Model.DBConnection;
import Model.Entities.Staff.Assignment;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Administrator
 */
public class AssignmentAction extends org.apache.struts.action.Action {

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
        AssignmentActionForm f = (AssignmentActionForm) form;
        String filePatch = getServlet().getServletContext().getRealPath("/") + "Staff_Assignment_Upload";
        FormFile file = f.getFileUp();
        String fileName = file.getFileName();
        if (!fileName.equals("")) {
            File fileToCreate = new File(filePatch, fileName);
            if (!fileToCreate.exists()) {
                FileOutputStream fos = new FileOutputStream(fileToCreate);
                fos.write(file.getFileData());
                fos.flush();
                fos.close();
            }
        }
        Assignment a = new Assignment();
        ManagementAssigment MA = new ManagementAssigment();
        a.setAssignmentName(f.getTxtAssignmentName());
        a.setAssignmentFile(f.getFileUp().getFileName());
        a.setDescriptions(f.getTxaDescription());
        a.setAssignmentStartDate(DBConnection.convertStringToDate(f.getTxtStartDate()));
        a.setAssignmentEndDate(DBConnection.convertStringToDate(f.getTxtEndDate()));
        a.setSubjectId(Integer.valueOf(f.getTxtSubjectId()));
        a.setBatchId(Integer.valueOf(f.getTxtBatchId()));
        if (MA.AddNewAssigment(a)) {
            request.setAttribute("batchId", f.getTxtBatchId());
            request.setAttribute("subjectId", f.getTxtSubjectId());
            request.setAttribute("action","mngAssigmentStaff");
            return mapping.findForward("home");
        } else {
            return mapping.findForward("home");
        }
    }
}
