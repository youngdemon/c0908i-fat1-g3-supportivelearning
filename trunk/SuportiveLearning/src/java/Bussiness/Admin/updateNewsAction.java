/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import DAL.Admin.ManagementNews;
import Model.DBConnection;
import Model.Entities.Admin.News;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ducnt
 */
public class updateNewsAction extends org.apache.struts.action.Action {
    
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
        NewsActionForm f= (NewsActionForm) form;
        ManagementNews MC=new ManagementNews();
        News s=new News();
        s.setNewsId(f.getTxtNewsId());
        s.setTitle(f.getTxtTitle());
        s.setNews(f.getTxtNews());
        s.setImages(f.getTxtImages());
        s.setNewsDate(DBConnection.convertStringToDate(f.getTxtNewsDate()));
        MC.updateNews(s);
        request.setAttribute("action","listNews");
        return mapping.findForward("home");
    }
}
