/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Staff;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Administrator
 */
public class MarkAssignmentActionForm extends org.apache.struts.action.ActionForm {
    private String studentId;
    private String assignmentId;
    private String txtMarkAssignment;
    private String txtMarkAssignmentId;
    public String getAssignmentId() {
        return assignmentId;
    }

    public String getTxtMarkAssignment() {
        return txtMarkAssignment;
    }

    public void setTxtMarkAssignment(String txtMarkAssignment) {
        this.txtMarkAssignment = txtMarkAssignment;
    }

    public String getTxtMarkAssignmentId() {
        return txtMarkAssignmentId;
    }

    public void setTxtMarkAssignmentId(String txtMarkAssignmentId) {
        this.txtMarkAssignmentId = txtMarkAssignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public FormFile getFileUp() {
        return fileUp;
    }

    public void setFileUp(FormFile fileUp) {
        this.fileUp = fileUp;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    private FormFile fileUp;
    public MarkAssignmentActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
}
