/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Admin;

import Model.DBConnection;
import Model.Entities.Admin.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.StyledEditorKit.ItalicAction;

/**
 *
 * @author Administrator
 */
public class ManagementSubject {

    Connection conn;

    public ManagementSubject() {
        conn = DBConnection.getConnect();
    }

    public boolean addNewSubject(Subject s) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into Subject values (?,?)");
        ps.setInt(1, s.getSemesterId());
        ps.setString(2, s.getSubjectName());
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateSubject(Subject s) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("update Subject set SemesterId = ?, SubjectName = ? where SubjectId = ?");
        ps.setInt(1, s.getSemesterId());
        ps.setString(2, s.getSubjectName());
        ps.setInt(3, s.getSubjectId());

        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteSubject(int id) throws SQLException {
        try {
            PreparedStatement ps = conn.prepareStatement("delete from Subject where SubjectId = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }

    }

    public Iterator getAllSubject() {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Subject ");
            ResultSet rs = ps.executeQuery();
            ArrayList arr = new ArrayList();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectId(rs.getInt(1));
                s.setSemesterId(rs.getInt(2));
                s.setSubjectName(rs.getString(3));
                arr.add(s);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private int semesterId;

    public Iterator getSubjectBySemesterId() {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Subject where semesterId =? ");
            ps.setInt(1, semesterId);
            ResultSet rs = ps.executeQuery();
            ArrayList arr = new ArrayList();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectId(rs.getInt(1));
                s.setSubjectName(rs.getString(3));
                arr.add(s);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }

    public String getSubjectNameById() {
        try {
            PreparedStatement ps = conn.prepareStatement("select SubjectName from Subject where SubjectId = ?");
            //ca'nt find subject id huhu
            ps.setInt(1, semesterId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Null";
    }
    private int subjectId;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Iterator getSubjectById() {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Subject where SubjectId=?");
            ps.setInt(1, subjectId);
            ResultSet rs = ps.executeQuery();
            ArrayList arr = new ArrayList();
            while (rs.next()) {
                Subject temp = new Subject();
                temp.setSubjectId(rs.getInt(1));
                temp.setSemesterId(rs.getInt(2));
                temp.setSubjectName(rs.getString(3));
                arr.add(temp);
            }
            return arr.iterator();
        } catch (SQLException ex) {
            Logger.getLogger(ManagementSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
