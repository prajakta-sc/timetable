/*
 * TimeTableReceiptForm.java
 *
 * Created on October 10, 2007, 1:49 PM
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
public class TimeTableReceiptForm extends javax.swing.JInternalFrame {
    
    /** Creates new form TimeTableReceiptForm */
    public TimeTableReceiptForm () {
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
        lblStnNo = new javax.swing.JLabel();
        txtStnNo = new javax.swing.JTextField();
        txtStnName = new javax.swing.JTextField();
        lblReceiptNo = new javax.swing.JLabel();
        txtReceiptNo = new javax.swing.JTextField();
        lblReceiptDate = new javax.swing.JLabel();
        txtReceiptDate = new javax.swing.JTextField();
        lblReceivedBy = new javax.swing.JLabel();
        txtReceivedBy = new javax.swing.JTextField();
        txtReceiverName = new javax.swing.JTextField();
        lblReason = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        lblFirstNo = new javax.swing.JLabel();
        txtFirstNo = new javax.swing.JTextField();
        lblNo2 = new javax.swing.JLabel();
        lblLastNo = new javax.swing.JLabel();
        lblNo3 = new javax.swing.JLabel();
        txtLastNo = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblLotNo = new javax.swing.JLabel();
        lblNo4 = new javax.swing.JLabel();
        txtLotNo = new javax.swing.JTextField();
        lblAccept = new javax.swing.JLabel();
        lblReject = new javax.swing.JLabel();
        txtAccept = new javax.swing.JTextField();
        btnReceipt = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Time Table Receipt");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
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

        lblStnNo.setText("Station No :");
        getContentPane().add(lblStnNo);
        lblStnNo.setBounds(40, 40, 100, 20);

        txtStnNo.setColumns(10);
        txtStnNo.setEditable(false);
        getContentPane().add(txtStnNo);
        txtStnNo.setBounds(140, 40, 90, 21);

        txtStnName.setEditable(false);
        getContentPane().add(txtStnName);
        txtStnName.setBounds(250, 40, 200, 21);

        lblReceiptNo.setText("Receipt No :");
        getContentPane().add(lblReceiptNo);
        lblReceiptNo.setBounds(40, 70, 100, 20);

        txtReceiptNo.setColumns(10);
        txtReceiptNo.setEditable(false);
        getContentPane().add(txtReceiptNo);
        txtReceiptNo.setBounds(140, 70, 90, 21);

        lblReceiptDate.setText("Receipt Date   :");
        getContentPane().add(lblReceiptDate);
        lblReceiptDate.setBounds(250, 70, 90, 20);

        txtReceiptDate.setEditable(false);
        txtReceiptDate.setText(" ");
        getContentPane().add(txtReceiptDate);
        txtReceiptDate.setBounds(340, 70, 110, 21);

        lblReceivedBy.setText("Received By : ");
        getContentPane().add(lblReceivedBy);
        lblReceivedBy.setBounds(40, 100, 90, 20);

        txtReceivedBy.setColumns(10);
        getContentPane().add(txtReceivedBy);
        txtReceivedBy.setBounds(140, 100, 90, 21);

        txtReceiverName.setEditable(false);
        getContentPane().add(txtReceiverName);
        txtReceiverName.setBounds(250, 100, 200, 21);

        lblReason.setText("Reason for rejection");
        getContentPane().add(lblReason);
        lblReason.setBounds(30, 230, 140, 20);

        txtReason.setEditable(false);
        getContentPane().add(txtReason);
        txtReason.setBounds(170, 230, 290, 20);

        lblFirstNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstNo.setText("First");
        getContentPane().add(lblFirstNo);
        lblFirstNo.setBounds(40, 140, 70, 20);

        txtFirstNo.setColumns(10);
        txtFirstNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNoFocusLost(evt);
            }
        });

        getContentPane().add(txtFirstNo);
        txtFirstNo.setBounds(40, 190, 70, 20);

        lblNo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNo2.setText("No");
        getContentPane().add(lblNo2);
        lblNo2.setBounds(40, 160, 70, 20);

        lblLastNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastNo.setText("Last");
        getContentPane().add(lblLastNo);
        lblLastNo.setBounds(130, 140, 70, 20);

        lblNo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNo3.setText("No");
        getContentPane().add(lblNo3);
        lblNo3.setBounds(130, 160, 70, 20);

        txtLastNo.setColumns(15);
        txtLastNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNoFocusLost(evt);
            }
        });

        getContentPane().add(txtLastNo);
        txtLastNo.setBounds(130, 190, 70, 20);

        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");
        getContentPane().add(lblQuantity);
        lblQuantity.setBounds(220, 140, 70, 20);

        txtQuantity.setColumns(15);
        txtQuantity.setEditable(false);
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(220, 190, 70, 20);

        lblLotNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLotNo.setText("Lot");
        getContentPane().add(lblLotNo);
        lblLotNo.setBounds(310, 140, 70, 20);

        lblNo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNo4.setText("No");
        getContentPane().add(lblNo4);
        lblNo4.setBounds(310, 160, 70, 20);

        txtLotNo.setColumns(10);
        getContentPane().add(txtLotNo);
        txtLotNo.setBounds(310, 190, 70, 20);

        lblAccept.setText("Accept/");
        getContentPane().add(lblAccept);
        lblAccept.setBounds(400, 140, 50, 20);

        lblReject.setText("Reject");
        getContentPane().add(lblReject);
        lblReject.setBounds(400, 160, 50, 20);

        txtAccept.setColumns(1);
        txtAccept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcceptFocusLost(evt);
            }
        });

        getContentPane().add(txtAccept);
        txtAccept.setBounds(400, 190, 50, 20);

        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        getContentPane().add(btnReceipt);
        btnReceipt.setBounds(190, 300, 100, 25);

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(90, 270, 90, 25);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        getContentPane().add(btnClear);
        btnClear.setBounds(190, 270, 100, 25);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        getContentPane().add(btnNext);
        btnNext.setBounds(300, 270, 90, 25);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        getContentPane().add(btnNew);
        btnNew.setBounds(90, 300, 90, 25);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        getContentPane().add(btnExit);
        btnExit.setBounds(300, 300, 90, 25);

        pack();
    }//GEN-END:initComponents

    private void txtAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcceptFocusLost
        // TODO add your handling code here:
        String choice = txtAccept.getText();
        if(choice.equals("A")) {
            qtyAccept = true;
            txtReason.setEditable(false);
            txtReason.setText("");
        } else if(choice.equals("R")) {
            qtyAccept = false;
            txtReason.setEditable(true);
        } else {
            Message msg = new Message(new javax.swing.JFrame(), true);
            msg.isCancelRequired(false);
            msg.setMessage("Invalid Value. Please enter 'A' or 'R'");
            msg.show();
        }
    }//GEN-LAST:event_txtAcceptFocusLost

    private void txtLastNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNoFocusLost
        // TODO add your handling code here:
        last_no = Integer.parseInt(txtLastNo.getText());
        quantity = last_no - first_no;
        txtQuantity.setText(""+ quantity);
    }//GEN-LAST:event_txtLastNoFocusLost

    private void txtFirstNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNoFocusLost
        // TODO add your handling code here:
        first_no = Integer.parseInt(txtFirstNo.getText());
        quantity = last_no - first_no;
    }//GEN-LAST:event_txtFirstNoFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        txtStnNo.setText("RN");
        txtStnName.setText("RATNAGIRI");
        txtReceivedBy.setText (Login.userName);
        txtReceiverName.setText(getReceiverName(Login.userName));
        java.util.Date today_dt = new java.util.Date();
        java.sql.Date today_date = new java.sql.Date(today_dt.getTime ());
        txtReceiptDate.setText(String.valueOf(today_date));
        checkMode (TimeTable.getMode ());
        connect();
        txtQuantity.requestFocusInWindow ();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtReceiptNo.setText ("");
        txtReceivedBy.setText ("");
        txtQuantity.setText ("");
        txtQuantity.requestFocusInWindow ();
        getNextReceiptNo();
        txtReceivedBy.setText (Login.userName);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        boolean nextRow = false;
        try {
            nextRow = rs.next ();
            if(nextRow) {
                txtReceiptNo.setText (String.valueOf (rs.getInt (1)));
                txtReceivedBy.setText (rs.getString (2));
                txtReceiptDate.setText(String.valueOf(rs.getDate(3)));
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
        txtReceiptNo.setText ("");
        txtReceivedBy.setText ("");
        txtReceiptDate.setText("");
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
                txtReceiptNo.setText (String.valueOf (rs.getInt (1)));
                txtReceivedBy.setText (rs.getString (2));
                txtReceiptDate.setText(String.valueOf(rs.getDate(3)));
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

    private void btnReceiptActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        // TODO add your handling code here:
        try {
            if(TimeTable.getMode().equals ("Add") ) {
                quantity = Integer.parseInt (txtQuantity.getText ());
                last_no = first_no + quantity;
                java.util.Date today_dt = new java.util.Date();
                java.sql.Date today_date = new java.sql.Date(today_dt.getTime ());
                
                pst = con.prepareStatement ("INSERT INTO cctk_timetable_receipt values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ",
                        ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1,"RN");
                pst.setString (2, Login.userName);
                pst.setInt(3, Integer.parseInt (txtReceiptNo.getText()));
                pst.setDate(4, today_date);
                pst.setInt(5, first_no);
                pst.setInt(6,  last_no);
                pst.setInt(7, quantity);
                if(qtyAccept) {
                    pst.setInt(8, quantity);
                    pst.setInt(9, 0);
                } else {
                    pst.setInt(8, 0);
                    pst.setInt(9, quantity);
                }
                pst.setString(10, txtReason.getText());
                int no_rows = pst.executeUpdate ();
                
                int stockQty = 0;
                pst = null;
                String qtysql = "SELECT qty_in_stock FROM cctk_cur_stock WHERE stn_no = 'RN'";
                st = con.createStatement();
                rs = st.executeQuery(qtysql);
                if(rs.next()) {
                    stockQty = rs.getInt(1);
                }
                stockQty = stockQty + quantity;
                pst = null;
                String upsql = "UPDATE cctk_cur_stock SET qty_in_stock = ? WHERE stn_no = ? ";
                pst = con.prepareStatement(upsql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setInt (1, stockQty);
                pst.setString (2, "RN");
                no_rows = pst.executeUpdate ();
            } else {
                sql = null;
                sql = "SELECT  cctk_timetable_receipt.receipt_no, " +
                            "cctk_timetable_receipt.user_id, " + 
                            "cctk_timetable_receipt.return_date, " +
                            "cctk_timetable_receipt.first_no, " +
                            "cctk_tinetable_return.last_no, " +
                            "cctk_timetable_receipt.quantity " + 
                        "FROM cctk_timetable_receipt  " +
                        "WHERE stn_no = 'RN' ";
                
                if(txtReceiptNo.getText () != null && txtReceiptNo.getText().length () > 0 ) {
                    sql = sql.concat ("AND cctk_timetable_receipt.receipt_no = ? " );
                }                
                if(txtReceivedBy.getText () != null && txtReceivedBy.getText().length () > 0) {
                    sql = sql.concat ("AND cctk_timetable_receipt.user_id = ? " );
                }
                if(txtQuantity.getText () != null && txtQuantity.getText().length () > 0 ){
                    sql = sql.concat ("AND cctk_timetable_receipt.quantity = ? " );
                }
                System.out.println(sql);
                pst = con.prepareStatement (sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int index = 1;
                if(txtReceiptNo.getText () != null && txtReceiptNo.getText().length () > 0 ) {
                    pst.setInt (index, Integer.parseInt (txtReceiptNo.getText ()));
                    index++;
                }
                if(txtReceivedBy.getText () != null && txtReceivedBy.getText().length () > 0 ) {
                    pst.setString (index, txtReceivedBy.getText ()); 
                    index++;
                }
                if(txtQuantity.getText () != null && txtQuantity.getText().length () > 0 ) {
                    pst.setInt (index, Integer.parseInt (txtQuantity.getText ()));
                    index++;
                }
                rs = pst.executeQuery();
                rs.next ();
                
                txtReceiptNo.setText (String.valueOf (rs.getInt (1)));
                txtReceivedBy.setText (rs.getString (2));
                txtReceiptDate.setText(String.valueOf(rs.getDate(3)));
                txtFirstNo.setText (String.valueOf (rs.getInt(4)));
                txtLastNo.setText (String.valueOf (rs.getInt(5)));
                txtQuantity.setText (String.valueOf (rs.getInt(6)));
            }
        } catch(Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnReceiptActionPerformed
    
    public void connect () {
        try {
            st = con.createStatement ();
            rs = st.executeQuery("select charge from ccmk_timetable ");
            rs.next();
            if(TimeTable.getMode().equals ("Add")) {
                getNextReceiptNo();
            }
        } catch (Exception se) {
            se.printStackTrace ();
        }
    }
    
    /**
     * Obtains next sale no
     */    
    public void getNextReceiptNo() {
        try {
            st = con.createStatement ();
            rs = st.executeQuery ("select max(receipt_no) from cctk_timetable_receipt");
            rs.next ();
            receipt_no = rs.getInt (1);
            
            if(receipt_no == 0)
                receipt_no = 1;
            else 
                receipt_no = receipt_no + 1;
            
            txtReceiptNo.setText (String.valueOf (receipt_no));
            
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
        txtReceiptNo.setEditable (true);
        txtReceivedBy.setEditable (true);
        txtQuantity.setEditable (true);
        btnPrevious.setVisible (true);
        btnNext.setVisible (true);
        btnClear.setVisible (true);
        btnNew.setVisible (false);
        btnReceipt.setText ("Query");
    }
    
    /**
     * Set interface for Add mode
     */    
    public void setAddMode () {
        txtReceiptNo.setEditable (false);
        txtReceivedBy.setEditable (false);
        btnPrevious.setVisible (false);
        btnNext.setVisible (false);
        btnClear.setVisible (false);
        btnNew.setVisible (true);
        btnReceipt.setText ("Receipt");
        getNextReceiptNo ();
    }
    
    public String getReceiverName(java.lang.String receivedBy) {
        String receiverName = "NULL";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT emp_short_name FROM pmm_employee WHERE user_id = '" + receivedBy + "'");
            if(rs.next()) {
                receiverName = rs.getString(1);
            } else {
                receiverName = "NULL";
            }
        } catch (Exception e) {
            receiverName = "NULL";
            e.printStackTrace();
        }
        return receiverName;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JLabel lblAccept;
    private javax.swing.JLabel lblFirstNo;
    private javax.swing.JLabel lblLastNo;
    private javax.swing.JLabel lblLotNo;
    private javax.swing.JLabel lblNo2;
    private javax.swing.JLabel lblNo3;
    private javax.swing.JLabel lblNo4;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblReceiptDate;
    private javax.swing.JLabel lblReceiptNo;
    private javax.swing.JLabel lblReceivedBy;
    private javax.swing.JLabel lblReject;
    private javax.swing.JLabel lblStnNo;
    private javax.swing.JTextField txtAccept;
    private javax.swing.JTextField txtFirstNo;
    private javax.swing.JTextField txtLastNo;
    private javax.swing.JTextField txtLotNo;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtReceiptDate;
    private javax.swing.JTextField txtReceiptNo;
    private javax.swing.JTextField txtReceivedBy;
    private javax.swing.JTextField txtReceiverName;
    private javax.swing.JTextField txtStnName;
    private javax.swing.JTextField txtStnNo;
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
    private int receipt_no;    
    private boolean qtyAccept = false;
}