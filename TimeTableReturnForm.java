/*
 * TimeTableReturnForm.java
 *
 * Created on October 10, 2007, 1:50 PM
 */

package com.krcl.cc;

import java.sql.*;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  Prajakta
 */
public class TimeTableReturnForm extends JInternalFrame {
    
    /** Creates new form TimeTableReturnForm */
    public TimeTableReturnForm () {
        initComponents ();
        try {
            Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection ("jdbc:odbc:timetable");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        javax.swing.JLabel lblReturnDate;
        javax.swing.JLabel lblReturnedBy;

        lblReturnedBy = new javax.swing.JLabel();
        txtReturnedBy = new javax.swing.JTextField();
        lblReturnNo = new javax.swing.JLabel();
        txtReturnNo = new javax.swing.JTextField();
        lblReturnDate = new javax.swing.JLabel();
        txtReturnDate = new javax.swing.JTextField();
        lblStartNo = new javax.swing.JLabel();
        txtFirstNo = new javax.swing.JTextField();
        lblEndNo = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtLastNo = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Time Table Return");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblReturnedBy.setText("Returned By  ");
        getContentPane().add(lblReturnedBy);
        lblReturnedBy.setBounds(20, 40, 80, 20);

        txtReturnedBy.setColumns(10);
        txtReturnedBy.setEditable(false);
        getContentPane().add(txtReturnedBy);
        txtReturnedBy.setBounds(110, 40, 90, 20);

        lblReturnNo.setText(" Return No");
        getContentPane().add(lblReturnNo);
        lblReturnNo.setBounds(220, 40, 90, 20);

        txtReturnNo.setColumns(10);
        txtReturnNo.setEditable(false);
        getContentPane().add(txtReturnNo);
        txtReturnNo.setBounds(330, 40, 80, 20);

        lblReturnDate.setText("Return Date ");
        getContentPane().add(lblReturnDate);
        lblReturnDate.setBounds(20, 80, 80, 20);

        txtReturnDate.setEditable(false);
        txtReturnDate.setText(" ");
        getContentPane().add(txtReturnDate);
        txtReturnDate.setBounds(110, 80, 90, 20);

        lblStartNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartNo.setText("Start TimeTable No");
        getContentPane().add(lblStartNo);
        lblStartNo.setBounds(20, 130, 125, 20);

        txtFirstNo.setColumns(15);
        txtFirstNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNoFocusLost(evt);
            }
        });

        getContentPane().add(txtFirstNo);
        txtFirstNo.setBounds(20, 160, 125, 20);

        lblEndNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndNo.setText(" End TimeTable No");
        getContentPane().add(lblEndNo);
        lblEndNo.setBounds(170, 130, 125, 20);

        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");
        getContentPane().add(lblQuantity);
        lblQuantity.setBounds(320, 130, 125, 20);

        txtLastNo.setColumns(15);
        txtLastNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNoFocusLost(evt);
            }
        });

        getContentPane().add(txtLastNo);
        txtLastNo.setBounds(170, 160, 125, 20);

        txtQuantity.setColumns(15);
        txtQuantity.setEditable(false);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(320, 160, 125, 20);

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        getContentPane().add(btnReturn);
        btnReturn.setBounds(180, 260, 100, 23);

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(80, 230, 90, 23);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        getContentPane().add(btnClear);
        btnClear.setBounds(180, 230, 100, 23);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        getContentPane().add(btnNext);
        btnNext.setBounds(290, 230, 90, 23);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        getContentPane().add(btnNew);
        btnNew.setBounds(80, 260, 90, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        getContentPane().add(btnExit);
        btnExit.setBounds(290, 260, 90, 23);

        pack();
    }//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtLastNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNoFocusLost
        // TODO add your handling code here:
        last_no = Integer.parseInt(txtLastNo.getText());
        quantity = last_no - first_no + 1;
        txtQuantity.setText(""+ quantity);
    }//GEN-LAST:event_txtLastNoFocusLost

    private void txtFirstNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNoFocusLost
        // TODO add your handling code here:
        first_no = Integer.parseInt(txtFirstNo.getText());
        quantity = last_no - first_no + 1;
        txtQuantity.setText(""+ quantity);
    }//GEN-LAST:event_txtFirstNoFocusLost

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        try {
            if(TimeTable.getMode().equals ("Add") ) {
                quantity = Integer.parseInt (txtQuantity.getText ());
                last_no = first_no + quantity;
                java.util.Date today_dt = new java.util.Date();
                java.sql.Date today_date = new java.sql.Date(today_dt.getTime ());
                
                pst = con.prepareStatement ("INSERT INTO cctk_timetable_return values (?, ?, ?, ?, ?, ?, ? ) ",
                        ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1,"RN");
                pst.setString (2, Login.userName);
                pst.setInt(3, Integer.parseInt (txtReturnNo.getText()));
                pst.setDate(4, today_date);
                pst.setInt(5, first_no);
                pst.setInt(6,  last_no);
                pst.setInt(7, Integer.parseInt (txtQuantity.getText ()));
                
                int no_rows = pst.executeUpdate ();
                
                pst = null;
                String delsql = "DELETE FROM cctk_timetable_issue WHERE user_id = ? AND stn_no = ? AND first_no = ? AND last_no = ? ";
                pst = con.prepareStatement(delsql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString (1,  Login.userName);
                pst.setString (2, "RN");
                pst.setInt(3,  first_no);
                pst.setInt(4,  last_no);
                no_rows = pst.executeUpdate ();
                
                pst = null;
                String upsql = "UPDATE cctk_login SET status = 'R' WHERE user_id = ? AND stn_no = ? AND status = 'O'";
                pst = con.prepareStatement(upsql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString (1,  Login.userName);
                pst.setString (2, "RN");
                no_rows = pst.executeUpdate ();
            } else {
                sql = null;
                sql = "SELECT  cctk_timetable_return.return_no, " +
                            "cctk_timetable_return.user_id, " + 
                            "cctk_timetable_return.return_date, " +
                            "cctk_timetable_return.first_no, " +
                            "cctk_timetable_return.last_no, " +
                            "cctk_timetable_return.qty_returned " + 
                        "FROM cctk_timetable_return  " +
                        "WHERE stn_no = 'RN' ";
                
                if(txtReturnNo.getText () != null && txtReturnNo.getText().length () > 0 ) {
                    sql = sql.concat ("AND cctk_timetable_return.return_no = ? " );
                }                
                if(txtReturnedBy.getText () != null && txtReturnedBy.getText().length () > 0) {
                    sql = sql.concat ("AND cctk_timetable_return.user_id = ? " );
                }
                if(txtQuantity.getText () != null && txtQuantity.getText().length () > 0 ){
                    sql = sql.concat ("AND cctk_timetable_return.qty_returned = ? " );
                }
                System.out.println(sql);
                pst = con.prepareStatement (sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int index = 1;
                if(txtReturnNo.getText () != null && txtReturnNo.getText().length () > 0 ) {
                    pst.setInt (index, Integer.parseInt (txtReturnNo.getText ()));
                    index++;
                }
                if(txtReturnedBy.getText () != null && txtReturnedBy.getText().length () > 0 ) {
                    pst.setString (index, txtReturnedBy.getText ()); 
                    index++;
                }
                if(txtQuantity.getText () != null && txtQuantity.getText().length () > 0 ) {
                    pst.setInt (index, Integer.parseInt (txtQuantity.getText ()));
                    index++;
                }
                rs = pst.executeQuery();
                rs.next ();
                
                txtReturnNo.setText (String.valueOf (rs.getInt (1)));
                txtReturnedBy.setText (rs.getString (2));
                txtReturnDate.setText(String.valueOf(rs.getDate(3)));
                txtFirstNo.setText (String.valueOf (rs.getInt(4)));
                txtLastNo.setText (String.valueOf (rs.getInt(5)));
                txtQuantity.setText (String.valueOf (rs.getInt(6)));
            }
        } catch(Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtReturnNo.setText ("");
        txtReturnedBy.setText ("");
        txtQuantity.setText ("");
        txtQuantity.requestFocusInWindow ();
        getNextReturnNo();
        txtReturnedBy.setText (Login.userName);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        boolean nextRow = false;
        try {
            nextRow = rs.next ();
            if(nextRow) {
                txtReturnNo.setText (String.valueOf (rs.getInt (1)));
                txtReturnedBy.setText (rs.getString (2));
                txtReturnDate.setText(String.valueOf(rs.getDate(3)));
                txtFirstNo.setText (String.valueOf (rs.getInt(4)));
                txtLastNo.setText (String.valueOf (rs.getInt(5)));
                txtQuantity.setText (String.valueOf (rs.getInt(6)));
            }
        } catch(Exception e) {
            Message msg = new Message(new JFrame (),true);
            msg.setMessage ("There are no more rows in forward direction");
            msg.isCancelRequired (false);
            msg.show();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtReturnNo.setText ("");
        txtReturnedBy.setText ("");
        txtReturnDate.setText("");
        txtFirstNo.setText("");
        txtLastNo.setText("");
        txtQuantity.setText ("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        boolean previousRow = false;
        try {
            previousRow = rs.previous ();
            if(previousRow) {
                txtReturnNo.setText (String.valueOf (rs.getInt (1)));
                txtReturnedBy.setText (rs.getString (2));
                txtReturnDate.setText(String.valueOf(rs.getDate(3)));
                txtFirstNo.setText (String.valueOf (rs.getInt(4)));
                txtLastNo.setText (String.valueOf (rs.getInt(5)));
                txtQuantity.setText (String.valueOf (rs.getInt(6)));
            }
        } catch(Exception e) {
            Message msg = new Message(new JFrame (),true);
            msg.setMessage ("There are no more rows in reverse direction");
            msg.isCancelRequired (false);
            msg.show();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        txtReturnedBy.setText (Login.userName);
        java.util.Date today_dt = new java.util.Date();
        java.sql.Date today_date = new java.sql.Date(today_dt.getTime ());
        txtReturnDate.setText(String.valueOf(today_date));
        checkMode (TimeTable.getMode ());
        connect();
        txtQuantity.requestFocusInWindow ();
    }//GEN-LAST:event_formInternalFrameOpened
  
    public void connect () {
        try {
            st = con.createStatement ();
            rs = st.executeQuery("select charge from ccmk_timetable ");
            rs.next();
            if(TimeTable.getMode().equals ("Add")) {
                getNextReturnNo();
            }
        } catch (Exception se) {
            se.printStackTrace ();
        }
    }
    
    /**
     * Obtains next sale no
     */    
    public void getNextReturnNo() {
        try {
            st = con.createStatement ();
            rs = st.executeQuery ("select max(return_no) from cctk_timetable_return");
            rs.next ();
            return_no = rs.getInt (1);
            
            if(return_no == 0)
                return_no = 1;
            else 
                return_no = return_no + 1;
            
            txtReturnNo.setText (String.valueOf (return_no));
            
        } catch (Exception se) {
            se.printStackTrace ();
        } finally {
            try {
                rs.close();
                st.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
    }
    
    /**
     * Obtains timetable no to be sold now
     */    
    
    
    /**
     * Mode in which program has been opened
     * options are "Add" & "Query"
     * @param mode Add / Query
     */    
    public void checkMode (java.lang.String mode) {
         if(TimeTable.getMode().equals ("Add")) {
            setAddMode ();
        } else {
            setQueryMode ();
        }
    }
    
    /**
     * Set interface for Query mode
     */    
    public void setQueryMode () {
        txtReturnNo.setEditable (true);
        txtReturnedBy.setEditable (true);
        txtQuantity.setEditable (true);
        btnPrevious.setVisible (true);
        btnNext.setVisible (true);
        btnClear.setVisible (true);
        btnNew.setVisible (false);
        btnReturn.setText ("Query");
    }
    
    /**
     * Set interface for Add mode
     */    
    public void setAddMode () {
        txtReturnNo.setEditable (false);
        txtReturnedBy.setEditable (false);
        btnPrevious.setVisible (false);
        btnNext.setVisible (false);
        btnClear.setVisible (false);
        btnNew.setVisible (true);
        btnReturn.setText ("Return");
        getNextReturnNo ();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblEndNo;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblReturnNo;
    private javax.swing.JLabel lblStartNo;
    private javax.swing.JTextField txtFirstNo;
    private javax.swing.JTextField txtLastNo;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReturnDate;
    private javax.swing.JTextField txtReturnNo;
    private javax.swing.JTextField txtReturnedBy;
    // End of variables declaration//GEN-END:variables
    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static Statement st = null;
    private static ResultSet rs = null;
    private int first_no = 0;
    private int last_no = 0;
    private int max_no = 0;
    private int quantity = 0;
    private String sql;
    private int return_no;
}
