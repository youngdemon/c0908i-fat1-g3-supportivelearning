/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementStudent;
import Model.Entities.Admin.Student;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class StudentAction extends org.apache.struts.action.Action {
    
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
//        StudentActionForm f= (StudentActionForm) form;
//        ManagementStudent MS=new ManagementStudent();
//        Student s=new Student();
//        s.setStudentId(f.getTxtStudentId());
//        s.setAccountId(f.getTxtAccountId());
//        s.setRollNumber(f.getTxtRollNumber());
//        s.setBatchId(f.getTxtBatchId());
//        System.out.println(s.getAccountId());
//        MS.addNewStudent(s);
        return mapping.findForward("success");
    }
}
