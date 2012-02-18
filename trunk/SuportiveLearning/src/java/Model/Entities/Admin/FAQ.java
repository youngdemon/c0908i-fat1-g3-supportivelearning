/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

import java.sql.Date;

/**
 *
 * @author Ncuong
 */
public class FAQ {
    public FAQ()
    {

    }
    private int fAQId;
    private String answer;
    private String question;
    private Date fAQDate;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getfAQDate() {
        return fAQDate;
    }

    public void setfAQDate(Date fAQDate) {
        this.fAQDate = fAQDate;
    }

    public int getfAQId() {
        return fAQId;
    }

    public void setfAQId(int fAQId) {
        this.fAQId = fAQId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
