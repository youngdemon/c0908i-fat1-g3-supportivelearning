/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;


import DAL.Admin.ManagementSemester;
import Model.DBConnection;
import Model.Entities.Admin.Semester;
import java.sql.Date;
import DAL.Admin.ManagementBatch;
import Model.Entities.Admin.Batch;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author DELL
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

//        SemesterActionForm f= (SemesterActionForm) form;
//        ManagementSemester MS=new ManagementSemester();
//        Semester s=new Semester();
//        s.setSemesterId(f.getTxtSemesterID());
//        s.setSemesterName(f.getTxtSemesterName());
//        s.setSemesterTime(DBConnection.convertStringToDate(f.getTxtSemesterDate()));
//        //System.out.println(s.getSemesterId());
//        MS.addNewSemester(s);

        BatchActionForm bf= (BatchActionForm) form;
        ManagementBatch MB = new ManagementBatch();
        Batch s = new Batch();
        s.setBatchId(bf.getTxtBatchId());
        s.setBatchName(bf.getTxtBatchName());
        s.setStartDate(DBConnection.convertStringToDate(bf.getTxtStartDate()));
        s.setCourseId(bf.getTxtCourseId());
        s.setSemesterId(bf.getTxtSemesterId());
        System.out.println(s.getBatchId());
        MB.addNewBatch(s);
        


        return mapping.findForward("success");
    }
}
