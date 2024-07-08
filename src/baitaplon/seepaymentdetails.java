package baitaplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class seepaymentdetails extends javax.swing.JFrame {


    public seepaymentdetails() {
        initComponents();
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    ArrayList<Integer> totalsachtra = new ArrayList<Integer>();
    ArrayList<Integer> Mostreadauthor = new ArrayList<Integer>();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tongsachmuon = new javax.swing.JTextField();
        tacgia = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        seepaymentdetails = new javax.swing.JTable();
        hienthi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Tổng số sách đã trả");

        Back2.setText("Back");
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Tổng số sách đã trả là :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel22.setText("Tác giả được đọc nhiều nhất là:");

        tongsachmuon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        tacgia.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        seepaymentdetails.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seepaymentdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Id Sinh viên", "Id Sách", "Tên Sách", "Tác giả", "Thể loại", "Ngày trả"
            }
        ));
        seepaymentdetails.setRowHeight(25);
        seepaymentdetails.setSelectionBackground(new java.awt.Color(102, 255, 102));
        seepaymentdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seepaymentdetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(seepaymentdetails);

        hienthi.setText("Hiển thị");
        hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tongsachmuon)
                                    .addComponent(tacgia, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tongsachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
        new statistics().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back2MouseClicked

    private void seepaymentdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seepaymentdetailsMouseClicked
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();

            // Execute first query to get book issued details from 'borrowbooks' table
            ResultSet rs1 = st1.executeQuery("SELECT * FROM givebookback");

            Vector<String> columnNames = new Vector<>();
            columnNames.add("STT");
            columnNames.add("Id Sinh viên");
            columnNames.add("Số sách");
            columnNames.add("Tên Sách");
            columnNames.add("Tác giả");
            columnNames.add("Thể loại");
            columnNames.add("Ngày Trả");

            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Create empty table model

            while(rs1.next()) {
                String BookRet = rs1.getString("BookRet");

                // Execute second query to get book details from 'book' table using 'bookIssued' as Id
                ResultSet rs2 = st2.executeQuery("SELECT * FROM book WHERE Id = " + BookRet);

                if(rs2.next()) {
                    Vector<String> row = new Vector<>();
                    row.add(rs1.getString("Num"));
                    row.add(rs1.getString("Idrt"));
                    row.add(BookRet);
                    row.add(rs2.getString("Name"));
                    row.add(rs2.getString("Author"));
                    row.add(rs2.getString("category"));
                    row.add(rs1.getString("RetDate"));
                    tableModel.addRow(row);
                }
                rs2.close();
            }
            rs1.close();

            seepaymentdetails.setModel(tableModel); // Set table model after iterating through result set

            st1.close();
            st2.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_seepaymentdetailsMouseClicked

    private void hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienthiActionPerformed
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            St = Con.createStatement();
            // Query 
            Rs = St.executeQuery("SELECT COUNT(*) FROM givebookback");
            if (Rs.next()) {
                totalsachtra.add(Rs.getInt(1));
            }
            if (!totalsachtra.isEmpty()) {
                tongsachmuon.setText(totalsachtra.get(0).toString());
            } else {
                tongsachmuon.setText("0");
            }
            // Query to get the category with the highest count of borrowed books from 'book' table based on 'BookIssued' from 'borrowbooks' table
            Rs = St.executeQuery("SELECT Author, COUNT(*) as count FROM book JOIN givebookback ON book.Id = givebookback.BookRet GROUP BY Author ORDER BY count DESC LIMIT 1");

            if (Rs.next()) {
                tacgia.setText(Rs.getString("Author") + " - " + Rs.getInt("count")+ "quyển");
            } else {
                tacgia.setText("0");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_hienthiActionPerformed

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
            java.util.logging.Logger.getLogger(seepaymentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seepaymentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seepaymentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seepaymentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seepaymentdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back2;
    private javax.swing.JButton hienthi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable seepaymentdetails;
    private javax.swing.JTextField tacgia;
    private javax.swing.JTextField tongsachmuon;
    // End of variables declaration//GEN-END:variables
}
