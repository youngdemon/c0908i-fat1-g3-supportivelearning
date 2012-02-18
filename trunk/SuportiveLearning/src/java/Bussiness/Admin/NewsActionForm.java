/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Bussiness.Admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Ncuong
 */
public class NewsActionForm extends org.apache.struts.action.ActionForm {

    private int txtNewsId;
    private String txtTitle;
    private String txtNews;
    private String txtImages;
    private String txtNewsDate;

    public String getTxtNews() {
        return txtNews;
    }

    public void setTxtNews(String txtNews) {
        this.txtNews = txtNews;
    }

    public String getTxtNewsDate() {
        return txtNewsDate;
    }

    public void setTxtNewsDate(String txtNewsDate) {
        this.txtNewsDate = txtNewsDate;
    }

    public int getTxtNewsId() {
        return txtNewsId;
    }

    public void setTxtNewsId(int txtNewsId) {
        this.txtNewsId = txtNewsId;
    }

    public String getTxtImages() {
        return txtImages;
    }

    public void setTxtImages(String txtImages) {
        this.txtImages = txtImages;
    }


    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }
   
    public NewsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
