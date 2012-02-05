/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class News {

    public News()
    {

    }
    private String NewsId;
    private String Title;
    private String News;
    private String Images;
    private Date NewsDate;

    public String getImages() {
        return Images;
    }

    public void setImages(String Images) {
        this.Images = Images;
    }

    public String getNews() {
        return News;
    }

    public void setNews(String News) {
        this.News = News;
    }

    public Date getNewsDate() {
        return NewsDate;
    }

    public void setNewsDate(Date NewsDate) {
        this.NewsDate = NewsDate;
    }

    public String getNewsId() {
        return NewsId;
    }

    public void setNewsId(String NewsId) {
        this.NewsId = NewsId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    


}
