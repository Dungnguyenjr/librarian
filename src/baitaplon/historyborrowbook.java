package baitaplon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;


public class historyborrowbook extends javax.swing.JFrame {
    private String name;


    public historyborrowbook() {
        initComponents();
        this.name = MenuUser.loggedInUser; // Lấy tên người dùng từ MenuUser
//        historybookuserMouseClicked(java.awt.event.MouseEvent.evt);

        
    }

    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    ArrayList<String> Idsv = new ArrayList<String>();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historybookuser = new javax.swing.JTable();
        tongsachmuon = new javax.swing.JTextField();
        backuser = new javax.swing.JButton();
        displayuser = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        Idsinhvien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lịch sử mượn sách cá nhân");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Bạn đã mượn tổng cộng :");

        historybookuser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        historybookuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Id Sinh viên", "Id Sách", "Tên Sách", "Tác giả", "Thể loại", "Ngày mượn"
            }
        ));
        historybookuser.setRowHeight(25);
        historybookuser.setSelectionBackground(new java.awt.Color(102, 255, 102));
        historybookuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historybookuserMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(historybookuser);

        tongsachmuon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        backuser.setText("Back");
        backuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backuserMouseClicked(evt);
            }
        });
        backuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backuserActionPerformed(evt);
            }
        });

        displayuser.setText("Hiển thị");
        displayuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayuserMouseClicked(evt);
            }
        });
        displayuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayuserActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel22.setText("Id Sinh viên của bạn là :");

        Idsinhvien.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(backuser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(displayuser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Idsinhvien)
                    .addComponent(tongsachmuon))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tongsachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Idsinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historybookuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historybookuserMouseClicked
  try {
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    Statement St1 = Con.createStatement();
    Statement St2 = Con.createStatement();
    Rs = St1.executeQuery("SELECT * FROM student WHERE Name = '" + this.name + "'");

    Vector<String> columnNames = new Vector<>();
    columnNames.add("STT");
    columnNames.add("Số sách");
    columnNames.add("Tên Sách");
    columnNames.add("Tác giả");
    columnNames.add("Thể loại");
    columnNames.add("Ngày Mượn");

    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Create empty table model
//    tableModel.setRowCount(0); // Xóa tất cả các hàng trong tableModel

    // Execute first query to get book issued details from 'borrowbooks' table
    ResultSet rs1 = St1.executeQuery("SELECT * FROM borrowbooks WHERE Idbr IN (SELECT id FROM student WHERE Name = '" + this.name + "')");

    while(rs1.next()) {
        String bookIssued = rs1.getString("BookIssued");

        // Execute second query to get book details from 'book' table using 'bookIssued' as Id
        ResultSet rs2 = St2.executeQuery("SELECT * FROM book WHERE Id = " + bookIssued);

        if(rs2.next()) {
            Vector<String> row = new Vector<>();
            row.add(rs1.getString("Number"));
            row.add(bookIssued);
            row.add(rs2.getString("Name"));
            row.add(rs2.getString("Author"));
            row.add(rs2.getString("category"));
            row.add(rs1.getString("IssueDate"));
            tableModel.addRow(row);
        }
        rs2.close();
    }

    rs1.close();
    
    historybookuser.setModel(tableModel); // Set table model after iterating through result set

    St1.close();
    St2.close();
    Con.close();

} catch (SQLException e) {
    throw new RuntimeException(e);
}

    }//GEN-LAST:event_historybookuserMouseClicked

    private void backuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backuserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backuserMouseClicked

    private void displayuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayuserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayuserMouseClicked

    private void backuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backuserActionPerformed
       new MenuUser().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backuserActionPerformed

    private void displayuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayuserActionPerformed
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement ps = Con.prepareStatement("SELECT * FROM student WHERE Name = ?");
        ps.setString(1, this.name);
        Rs = ps.executeQuery();

        PreparedStatement ps1 = Con.prepareStatement("SELECT COUNT(*) AS count FROM borrowbooks WHERE Idbr IN (SELECT id FROM student WHERE Name = ?)");
        ps1.setString(1, this.name);
        ResultSet rs1 = ps1.executeQuery();

        if (Rs.next() && rs1.next()) {
            Idsinhvien.setText(Rs.getString("id"));
            tongsachmuon.setText(String.valueOf(rs1.getInt("count")));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_displayuserActionPerformed

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
            java.util.logging.Logger.getLogger(historyborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historyborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historyborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historyborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyborrowbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idsinhvien;
    private javax.swing.JButton backuser;
    private javax.swing.JButton displayuser;
    private javax.swing.JTable historybookuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField tongsachmuon;
    // End of variables declaration//GEN-END:variables
}
