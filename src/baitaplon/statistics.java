package baitaplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;


public class statistics extends javax.swing.JFrame {


    public statistics() {
        initComponents();
        
        
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    ArrayList<Integer> totalsachmuon = new ArrayList<Integer>();
    ArrayList<Integer> totalsachtra = new ArrayList<Integer>();
    ArrayList<Integer> totalsach = new ArrayList<Integer>();



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tongsosach = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tongsodatra = new javax.swing.JTextField();
        tongsosachdangmuon = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        returnmenu = new javax.swing.JButton();
        xemchitietsachmuon = new javax.swing.JButton();
        xemchitietsachtra = new javax.swing.JButton();
        xemtongsosach = new javax.swing.JButton();
        capnhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Thống kê sách");

        tongsosach.setEditable(false);
        tongsosach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongsosachActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Tổng số sách đã mượn");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel22.setText("Tổng số sách đã trả");

        tongsodatra.setEditable(false);
        tongsodatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongsodatraActionPerformed(evt);
            }
        });

        tongsosachdangmuon.setEditable(false);
        tongsosachdangmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongsosachdangmuonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel23.setText("Tổng số sách trong kho");

        returnmenu.setText("Trở lại");
        returnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnmenuActionPerformed(evt);
            }
        });

        xemchitietsachmuon.setText("Xem chi tiết sách mượn");
        xemchitietsachmuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xemchitietsachmuonMouseClicked(evt);
            }
        });
        xemchitietsachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemchitietsachmuonActionPerformed(evt);
            }
        });

        xemchitietsachtra.setText("Xem chi tiết sách đã trả");
        xemchitietsachtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemchitietsachtraActionPerformed(evt);
            }
        });

        xemtongsosach.setText("Xem tổng số sách");
        xemtongsosach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemtongsosachActionPerformed(evt);
            }
        });

        capnhap.setText("Cập Nhập");
        capnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(returnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(capnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tongsosachdangmuon, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(tongsodatra)
                            .addComponent(tongsosach))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xemchitietsachtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xemchitietsachmuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xemtongsosach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 46, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(xemchitietsachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tongsosachdangmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(xemchitietsachtra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongsodatra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemtongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tongsosachdangmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongsosachdangmuonActionPerformed

    }//GEN-LAST:event_tongsosachdangmuonActionPerformed

    private void tongsodatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongsodatraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongsodatraActionPerformed

    private void tongsosachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongsosachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongsosachActionPerformed

    private void returnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnmenuActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnmenuActionPerformed

    private void xemchitietsachmuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xemchitietsachmuonMouseClicked
        
    }//GEN-LAST:event_xemchitietsachmuonMouseClicked

    private void xemchitietsachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemchitietsachmuonActionPerformed
        new seedetailsborrowed().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_xemchitietsachmuonActionPerformed

    private void xemchitietsachtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemchitietsachtraActionPerformed
        new seepaymentdetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_xemchitietsachtraActionPerformed

    private void xemtongsosachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemtongsosachActionPerformed
        new seebookdetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_xemtongsosachActionPerformed

    private void capnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhapActionPerformed
   try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        St = Con.createStatement();
        
        // Query for 'borrowbooks'
        Rs = St.executeQuery("SELECT COUNT(*) FROM borrowbooks");
        if (Rs.next()) {
            totalsachmuon.add(Rs.getInt(1));
        }
        
        // Query for 'givebookback'
        Rs = St.executeQuery("SELECT COUNT(*) FROM givebookback");
        if (Rs.next()) {
            totalsachtra.add(Rs.getInt(1));
        }
        
        // Query for 'book'
        Rs = St.executeQuery("SELECT SUM(QTY) FROM book");
        if (Rs.next()) {
            totalsach.add(Rs.getInt(1));
        }
        
        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Assuming 'tongsosachdangmuon', 'totalsachtra', and 'totalsach' are your JTextFields
if (!totalsachmuon.isEmpty()) {
    tongsosachdangmuon.setText(totalsachmuon.get(0).toString());
} else {
    tongsosachdangmuon.setText("0");
}

if (!totalsachtra.isEmpty()) {
    tongsodatra.setText(totalsachtra.get(0).toString());
} else {
    tongsodatra.setText("0");
}

if (!totalsach.isEmpty()) {
    tongsosach.setText(totalsach.get(0).toString());
} else {
    tongsosach.setText("0");
}
    }//GEN-LAST:event_capnhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnmenu;
    private javax.swing.JTextField tongsodatra;
    private javax.swing.JTextField tongsosach;
    private javax.swing.JTextField tongsosachdangmuon;
    private javax.swing.JButton xemchitietsachmuon;
    private javax.swing.JButton xemchitietsachtra;
    private javax.swing.JButton xemtongsosach;
    // End of variables declaration//GEN-END:variables
}
