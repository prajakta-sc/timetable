/*
 * TimeTableRequisitionForm.java
 *
 * Created on October 10, 2007, 1:41 PM
 */

package com.krcl.cc;

/**
 *
 * @author  Prajakta
 */
public class TimeTableRequisitionForm extends javax.swing.JInternalFrame {
    
    /** Creates new form TimeTableRequisitionForm */
    public TimeTableRequisitionForm () {
        initComponents ();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblIssuedTo = new javax.swing.JLabel();
        txtIssuedTo = new javax.swing.JTextField();
        lblIssueNo = new javax.swing.JLabel();
        txtIssueNo = new javax.swing.JTextField();
        lblIssueDate = new javax.swing.JLabel();
        txtIssueDate = new javax.swing.JTextField();
        lblFirstNo = new javax.swing.JLabel();
        txtFirstNo = new javax.swing.JTextField();
        lblLastNo = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtLastNo = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnIssue = new javax.swing.JButton();
        lblImprest = new javax.swing.JLabel();
        txtImprest = new javax.swing.JTextField();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setTitle("Time Table Requisition");
        setPreferredSize(new java.awt.Dimension(500, 500));
        lblIssuedTo.setText("Issued To :");
        getContentPane().add(lblIssuedTo);
        lblIssuedTo.setBounds(60, 40, 70, 20);

        txtIssuedTo.setColumns(10);
        txtIssuedTo.setEditable(false);
        getContentPane().add(txtIssuedTo);
        txtIssuedTo.setBounds(140, 40, 90, 19);

        lblIssueNo.setText("Issue No           :");
        getContentPane().add(lblIssueNo);
        lblIssueNo.setBounds(250, 40, 120, 20);

        txtIssueNo.setColumns(10);
        txtIssueNo.setEditable(false);
        getContentPane().add(txtIssueNo);
        txtIssueNo.setBounds(390, 40, 80, 20);

        lblIssueDate.setText("Issue Date :");
        getContentPane().add(lblIssueDate);
        lblIssueDate.setBounds(60, 80, 70, 20);

        txtIssueDate.setEditable(false);
        txtIssueDate.setText(" ");
        getContentPane().add(txtIssueDate);
        txtIssueDate.setBounds(140, 80, 90, 19);

        lblFirstNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstNo.setText("Start TimeTable No");
        getContentPane().add(lblFirstNo);
        lblFirstNo.setBounds(60, 120, 125, 20);

        txtFirstNo.setColumns(15);
        txtFirstNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNoFocusLost(evt);
            }
        });

        getContentPane().add(txtFirstNo);
        txtFirstNo.setBounds(60, 150, 125, 19);

        lblLastNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastNo.setText(" End TimeTable No");
        getContentPane().add(lblLastNo);
        lblLastNo.setBounds(210, 120, 125, 20);

        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");
        getContentPane().add(lblQuantity);
        lblQuantity.setBounds(360, 120, 125, 20);

        txtLastNo.setColumns(15);
        txtLastNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNoFocusLost(evt);
            }
        });

        getContentPane().add(txtLastNo);
        txtLastNo.setBounds(210, 150, 125, 19);

        txtQuantity.setColumns(15);
        txtQuantity.setEditable(false);
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(360, 150, 125, 19);

        btnIssue.setText("Generate");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        getContentPane().add(btnIssue);
        btnIssue.setBounds(240, 230, 90, 25);

        lblImprest.setText("Imprest Cash      :");
        getContentPane().add(lblImprest);
        lblImprest.setBounds(250, 80, 120, 20);

        getContentPane().add(txtImprest);
        txtImprest.setBounds(390, 80, 80, 20);

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(140, 200, 90, 25);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        getContentPane().add(btnNext);
        btnNext.setBounds(340, 200, 90, 25);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        getContentPane().add(btnExit);
        btnExit.setBounds(340, 230, 90, 25);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        getContentPane().add(btnClear);
        btnClear.setBounds(240, 200, 90, 25);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        getContentPane().add(btnNew);
        btnNew.setBounds(140, 230, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
// TODO add your handling code here:
        txtIssuedTo.setText("");
        txtIssueNo.setText("");
        txtIssueDate.setText("");
        txtImprest.setText("");
        txtFirstNo.setText("");
        txtLastNo.setText("");
        txtQuantity.setText("");
        txtImprest.requestFocusInWindow();
        getNextIssueNo();
        txtIssueNo.setText("" + issue_no);
        java.util.Date today_dt = new java.util.Date();
        java.sql.Date issue_dt = new java.sql.Date(today_dt.getTime());
        txtIssueDate.setText(String.valueOf(issue_dt));
        txtIssuedTo.setText(Login.userName);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
// TODO add your handling code here:
        txtIssuedTo.setText("");
        txtIssueNo.setText("");
        txtIssueDate.setText("");
        txtImprest.setText("");
        txtFirstNo.setText("");
        txtLastNo.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
// TODO add your handling code here:
        boolean nextRow = false;
        try {
            nextRow = rs.next();
            if(nextRow) {
                txtIssuedTo.setText(rs.getString(1));
                txtIssueNo.setText(String.valueOf(rs.getInt(2)));
                txtIssueDate.setText(String.valueOf(rs.getDate(3)));
                txtImprest.setText(String.valueOf(rs.getFloat(4)));
                txtFirstNo.setText(String.valueOf(rs.getInt(5)));
                txtLastNo.setText(String.valueOf(rs.getInt(6)));
                txtQuantity.setText(String.valueOf(rs.getInt(7)));
            }
        } catch(Exception e) {
            Message msg = new Message(new javax.swing.JFrame(),true);
            msg.setMessage("There are no more rows in forward direction");
            msg.isCancelRequired(false);
            msg.show();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
// TODO add your handling code here:
        boolean previousRow = false;
        try {
            previousRow = rs.previous();
            if(previousRow) {
                txtIssuedTo.setText(rs.getString(1));
                txtIssueNo.setText(String.valueOf(rs.getInt(2)));
                txtIssueDate.setText(String.valueOf(rs.getDate(3)));
                txtImprest.setText(String.valueOf(rs.getFloat(4)));
                txtFirstNo.setText(String.valueOf(rs.getInt(5)));
                txtLastNo.setText(String.valueOf(rs.getInt(6)));
                txtQuantity.setText(String.valueOf(rs.getInt(7)));
            }
        } catch(Exception e) {
            Message msg = new Message(new javax.swing.JFrame(),true);
            msg.setMessage("There are no more rows in reverse direction");
            msg.isCancelRequired(false);
            msg.show();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        try {
            if(TimeTable.getMode().equals("Add") ) {
                if(checkReceipt()) {
                    String sql1 =  "SELECT cctk_timetable_issue.* FROM cctk_timetable_issue " +
                            "WHERE cctk_timetable_issue.first_no = ? " +
                            "AND cctk_timetable_issue.stn_no = 'RN' " +
                            "AND cctk_timetable_issue.user_id = ? ";
                    System.out.println(sql1);
                    pst = con.prepareStatement(sql1);
                    pst.setInt(1, first_no);
                    pst.setString(2, Login.userName);
                    rs = pst.executeQuery();
                    if(rs.next()) {
                        System.out.println(" combination entered");
                        Message msg = new Message(new javax.swing.JFrame(), true);
                        msg.setMessage("This combination has already been entered.");
                        msg.isCancelRequired(false);
                        msg.show();
                        txtFirstNo.setText("");
                        txtFirstNo.requestFocus();
                    } else {
                        java.util.Date today_dt = new java.util.Date();
                        java.sql.Date issue_dt = new java.sql.Date(today_dt.getTime());
                        pst = con.prepareStatement("insert into cctk_timetable_issue values (?,?,?,?,?,?,?,?,?,?) ",
                                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        pst.setString(1,"RN");
                        pst.setString(2, Login.userName);
                        
                        pst.setInt(3, Integer.parseInt(txtIssueNo.getText()));
                        pst.setDate(4, issue_dt);
                        txtIssueDate.setText(String.valueOf(issue_dt));
                        pst.setInt(5, first_no);
                        pst.setInt(6, last_no);
                        pst.setInt(7, quantity);
                        pst.setInt(8, first_no);
                        pst.setDouble(9, Double.parseDouble(txtImprest.getText()));
                        pst.setString(10, "I" );
                        int no_rows = pst.executeUpdate();
                        if (no_rows == 1) {
                            Message msg = new Message(new javax.swing.JFrame(), true);
                            msg.setMessage("1 Record Added Sucessfully.");
                            msg.isCancelRequired(false);
                            msg.show();
                        }
                        
                        pst= null;
                        pst= con.prepareStatement("DELETE FROM cctk_timetable_stock WHERE first_no = ? AND last_no = ? AND stn_no = 'RN'", ResultSet.TYPE_SCROLL_SENSITIVE,
                                ResultSet.CONCUR_UPDATABLE);
                        pst.setInt(1, first_no);
                        pst.setInt(2, last_no);
                        no_rows = pst.executeUpdate();
                        if (no_rows == 1) {
                            Message msg = new Message(new javax.swing.JFrame(), true);
                            msg.setMessage("1 Record Deleted Sucessfully.");
                            msg.isCancelRequired(false);
                            msg.show();
                        }
                    }
                }
            } else {
                sql = null;
                sql = "SELECT cctk_timetable_issue.user_id, cctk_timetable_issue.issue_no, " +
                        "cctk_timetable_issue.issue_date, cctk_timetable_issue.imprest_cash, " +
                        "cctk_timetable_issue.first_no, cctk_timetable_issue.last_no, " +
                        "cctk_timetable_issue.qty_issued " +
                        "FROM otm_station, cctk_timetable_issue " +
                        "WHERE otm_station.stn_no = cctk_timetable_issue.stn_no "
                        ;
                
                if(txtIssuedTo.getText() != null && txtIssuedTo.getText().length() > 0) {
                    sql = sql.concat("AND cctk_timetable_issue.user_id = ? " );
                }
                if(txtIssueNo.getText() != null && txtIssueNo.getText().length() > 0 ) {
                    sql = sql.concat("AND cctk_timetable_issue.issue_no = ? " );
                }
                if(txtFirstNo.getText() != null && txtFirstNo.getText().length() > 0 ){
                    sql = sql.concat("AND cctk_timetable_issue.first_no = ? " );
                }
                
                pst = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int index = 1;
                if(txtIssuedTo.getText() != null && txtIssuedTo.getText().length() > 0) {
                    pst.setString(index, txtIssuedTo.getText());
                    index++;
                }
                if(txtIssueNo.getText() != null && txtIssueNo.getText().length() > 0 ) {
                    pst.setInt(index, Integer.parseInt(txtIssueNo.getText()));
                    index++;
                }
                if(txtFirstNo.getText() != null && txtFirstNo.getText().length() > 0 ) {
                    pst.setInt(index, Integer.parseInt(txtFirstNo.getText()));
                    index++;
                }
                if(pst.execute()) {
                    rs = pst.getResultSet();
                }
                rs.next();
                txtIssuedTo.setText(rs.getString(1));
                txtIssueNo.setText(String.valueOf(rs.getInt(2)));
                txtIssueDate.setText(String.valueOf(rs.getDate(3)));
                txtImprest.setText(String.valueOf(rs.getFloat(4)));
                txtFirstNo.setText(String.valueOf(rs.getInt(5)));
                txtLastNo.setText(String.valueOf(rs.getInt(6)));
                txtQuantity.setText(String.valueOf(rs.getInt(7)));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnIssueActionPerformed

    private void txtLastNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNoFocusLost
// TODO add your handling code here:
        String strLast = txtLastNo.getText();
        System.out.println(strLast);
        if(strLast != null && strLast.length() > 0)
            last_no = Integer.parseInt(strLast);
        else
            last_no = 0;
        quantity = last_no - first_no + 1;
        txtQuantity.setText("" + quantity);
    }//GEN-LAST:event_txtLastNoFocusLost

    private void txtFirstNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNoFocusLost
// TODO add your handling code here:
        String strFirst = txtFirstNo.getText();
        System.out.println(strFirst);
        if(strFirst != null && strFirst.length() > 0)
            first_no = Integer.parseInt(strFirst);
        else
            first_no = 0;
        quantity = last_no - first_no + 1;
        txtQuantity.setText("" + quantity);
    }//GEN-LAST:event_txtFirstNoFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel lblFirstNo;
    private javax.swing.JLabel lblImprest;
    private javax.swing.JLabel lblIssueDate;
    private javax.swing.JLabel lblIssueNo;
    private javax.swing.JLabel lblIssuedTo;
    private javax.swing.JLabel lblLastNo;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTextField txtFirstNo;
    private javax.swing.JTextField txtImprest;
    private javax.swing.JTextField txtIssueDate;
    private javax.swing.JTextField txtIssueNo;
    private javax.swing.JTextField txtIssuedTo;
    private javax.swing.JTextField txtLastNo;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
    
}
