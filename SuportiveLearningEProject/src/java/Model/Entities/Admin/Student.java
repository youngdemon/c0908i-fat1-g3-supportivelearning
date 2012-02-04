/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Entities.Admin;

/**
 *
 * @author Administrator
 */
public class Student {

    public Student()
    {

    }

    private String StudentId;
    private String AccountId;
    private String RollNumber;
    private String BatchId;

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(String RollNumber) {
        this.RollNumber = RollNumber;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }
}
