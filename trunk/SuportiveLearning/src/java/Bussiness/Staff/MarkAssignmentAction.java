/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Staff;

import DAL.Staff.ManagementMarkAssignment;
import Model.Entities.Staff.MarkAssignment;
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
public class MarkAssignmentAction extends org.apache.struts.action.Action {
    
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
        MarkAssignmentActionForm f=(MarkAssignmentActionForm) form;
        String filePatch = getServlet().getServletContext().getRealPath("/") + "Student_Assignment_Upload";
        FormFile file = f.getFileUp();
        String fileName = file.getFileName();
        if (!fileName.equals("")) {
            fileName=f.getStudentId()+"_"+f.getAssignmentId()+"_"+fileName;
            File fileToCreate = new File(filePatch, fileName);
            if (!fileToCreate.exists()) {
                FileOutputStream fos = new FileOutputStream(fileToCreate);
                fos.write(file.getFileData());
                fos.flush();
                fos.close();
            }
        }
        
        ManagementMarkAssignment MMA=new ManagementMarkAssignment();
        MarkAssignment MA=new MarkAssignment();
        MA.setStudentId(Integer.valueOf(f.getStudentId()));
        MA.setAssignmentId(Integer.valueOf(f.getAssignmentId()));
        MA.setFileUpload(fileName);
        if(MMA.submitAssigment(MA))
        {
            return mapping.findForward("home");
        }
        return mapping.findForward("home");
    }
}
