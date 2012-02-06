/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class FAQ {

    public FAQ()
    {

    }

    private String FAQId;
    private String Question;
    private String Answer;
    private Date FAQDate;

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public Date getFAQDate() {
        return FAQDate;
    }

    public void setFAQDate(Date FAQDate) {
        this.FAQDate = FAQDate;
    }

    public String getFAQId() {
        return FAQId;
    }

    public void setFAQId(String FAQId) {
        this.FAQId = FAQId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }
}
