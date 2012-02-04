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
public class Subject {

    public Subject()
    {

    }

    private String AnswerId;
    private String FeedBackId;
    private String Answer;
    private Date AnswerDate;

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
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
