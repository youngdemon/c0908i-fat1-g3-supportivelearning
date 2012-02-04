/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Staff;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Answer
{
    private String AnswerId;
    private String FeedBackId;
    private String Anser;
    private Date AnswerDate;

    public String getAnser() {
        return Anser;
    }

    public void setAnser(String Anser) {
        this.Anser = Anser;
    }

    public Date getAnswerDate() {
        return AnswerDate;
    }

    public void setAnswerDate(Date AnswerDate) {
        this.AnswerDate = AnswerDate;
    }

    public String getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(String AnswerId) {
        this.AnswerId = AnswerId;
    }

    public String getFeedBackId() {
        return FeedBackId;
    }

    public void setFeedBackId(String FeedBackId) {
        this.FeedBackId = FeedBackId;
    }


}
