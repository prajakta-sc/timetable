/*
 * LogOut.java
 *
 * Created on October 10, 2007, 12:58 PM
 */

package com.krcl.cc;

/**
 *
 * @author  Prajakta
 */
import java.sql.*;
import javax.swing.*;

public class LogOut extends javax.swing.JDialog {
    
    /** Creates new form LogOut */
    public LogOut (java.awt.Frame parent, boolean modal) {
        super (parent, modal);
        initComponents ();
        try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection("jdbc:odbc:timetable");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        lblQuestion = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Logout");
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Do you want to logout ?");
        getContentPane().add(lblQuestion);
        lblQuestion.setBounds(20, 20, 170, 40);

        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        getContentPane().add(btnYes);
        btnYes.setBounds(20, 80, 70, 23);

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        getContentPane().add(btnNo);
        btnNo.setBounds(110, 80, 80, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-217)/2, (screenSize.height-155)/2, 217, 155);
    }//GEN-END:initComponents

    private void btnNoActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        this.dispose ();
        
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnYesActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:timetable");
            String sql = "UPDATE cctk_login SET status = 'C', " +
                            "logout_date = ? , " +
                            "logout_time = ? " +
                            "WHERE user_id = ? " +
                            "AND stn_no = 'RN' " +
                            "AND status = 'O' ";
            pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
            java.util.Date today_dt = new java.util.Date();
            java.sql.Date today_date = new java.sql.Date(today_dt.getTime());
            java.sql.Time today_time = new java.sql.Time(today_dt.getTime());
            pstmt.setDate(1, today_date);
            pstmt.setTime(2, today_time);
            pstmt.setString(3,  Login.userName);
            int no_rows  = pstmt.executeUpdate();
            String upmsg = null;
            if(no_rows > 0 ) {
                upmsg = "" + no_rows + " rows updated sucessfully";
                javax.swing.JOptionPane.showMessageDialog(this, upmsg, "Update", JOptionPane.INFORMATION_MESSAGE);
            }
            updateIssue();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_btnYesActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        new LogOut (new javax.swing.JFrame (), false).show ();
    }
    
    public void updateIssue() {
        try {
            pst = null;
            System.out.println(Login.userName);
            String newsql = "UPDATE cctk_timetable_issue SET status = 'I' " +
                            "WHERE user_id = ? " +
                            "AND stn_no = 'RN' " +
                            "AND status = 'O' ";
            System.out.println(newsql);
            pst = con.prepareStatement(newsql, ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, Login.userName);
            
            int no_rows  = pst.executeUpdate();
    
            System.out.println(no_rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables

    private java.sql.Connection con = null;
    private java.sql.PreparedStatement pstmt = null;
    private java.sql.PreparedStatement pst = null;
    private java.sql.ResultSet rs = null;
}
