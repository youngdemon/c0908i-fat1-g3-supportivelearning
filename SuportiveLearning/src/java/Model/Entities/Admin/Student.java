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

    private int studentId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    private String accountId;
    private String batchId;
}
