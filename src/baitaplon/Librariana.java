
package baitaplon;

import java.sql.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Librariana extends javax.swing.JFrame {


    public Librariana() {
        initComponents();
        DisplayLibs();
    }
        Connection Con = null;
        PreparedStatement Pst = null;
        ResultSet Rs = null, Rs1 = null;
        Statement St = null, St1 = null;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LibNameTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PasswordTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Savebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        EmailTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LibrarianaTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý Thủ thư");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hệ thống quản lý thư viện");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setText("Quản Lý thủ thư");

        LibNameTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LibNameTb.setForeground(new java.awt.Color(51, 51, 51));
        LibNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibNameTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setText("Họ và tên");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Số điện thoại");

        PasswordTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PasswordTb.setForeground(new java.awt.Color(51, 51, 51));
        PasswordTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setText("Mật khẩu");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("Email");

        Savebtn.setText("Lưu");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        editbtn.setText("Sửa");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Xoá");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        PhoneTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(51, 51, 51));
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        EmailTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EmailTb.setForeground(new java.awt.Color(51, 51, 51));
        EmailTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTbActionPerformed(evt);
            }
        });

        LibrarianaTable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LibrarianaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Họ và tên", "Mật khẩu", "Email", "Số điện thoại"
            }
        ));
        LibrarianaTable.setRowHeight(25);
        LibrarianaTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        LibrarianaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibrarianaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LibrarianaTable);

        Back.setText("Trở lại");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Tài khoản");

        fullname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fullname.setForeground(new java.awt.Color(51, 51, 51));
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)))
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(77, 77, 77)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(Savebtn)
                        .addGap(36, 36, 36)
                        .addComponent(editbtn)
                        .addGap(40, 40, 40)
                        .addComponent(deletebtn)
                        .addGap(40, 40, 40)
                        .addComponent(Back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(LibNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LibNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(editbtn)
                    .addComponent(deletebtn)
                    .addComponent(Back))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed

    }//GEN-LAST:event_PhoneTbActionPerformed
private void DisplayLibs() {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        Statement st = con.createStatement();
        ResultSet Rs = st.executeQuery("Select * from librariana");
        LibrarianaTable.setModel(DbUtils.resultSetToTableModel(Rs));
       
    } catch (Exception e) {
        e.printStackTrace();
    }
}
int LibId;
private void CountLibs()
{
    try {
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("Select Max(Id) from librariana ");
        Rs1.next();
        LibId = Rs1.getInt(1) + 1;
    } catch (Exception e) {
    }
}
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
 if(fullname.getText().isEmpty() ||LibNameTb.getText().isEmpty() || PasswordTb.getText().isEmpty() || EmailTb.getText().isEmpty() || PhoneTb.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên!!!");
} else {
    try {
        String UpdateQuery = "UPDATE librariana SET fullname=?, Name=?, Pass=?, Email=?, Phone=? WHERE ID=?";
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement Save = Con.prepareStatement(UpdateQuery);
        Save.setInt(6, key);
        Save.setString(1, fullname.getText());
        Save.setString(2, LibNameTb.getText());
        Save.setString(3, PasswordTb.getText());
        Save.setString(4, EmailTb.getText());
        Save.setString(5, PhoneTb.getText());
        if(Save.executeUpdate() == 1) {
            DisplayLibs();
            JOptionPane.showMessageDialog(this, "Sửa thông tin sinh viên thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thông tin sinh viên thất bại");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_editbtnActionPerformed

    private void PasswordTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTbActionPerformed

    private void LibNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibNameTbActionPerformed

    private void EmailTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTbActionPerformed


    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        if(fullname.getText().isEmpty() ||LibNameTb.getText().isEmpty()|| PasswordTb.getText().isEmpty()|| EmailTb.getText().isEmpty() || PhoneTb.getText().isEmpty())
{
    JOptionPane.showConfirmDialog(this, "Thông tin bị thiếu!!!");
}else{
    try {
        CountLibs();
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement Save = Con.prepareStatement("insert into librariana values(?,?,?,?,?,?)");
        Save.setInt(1, LibId );
        Save.setString(2, fullname.getText());
        Save.setString(3, LibNameTb.getText());
        Save.setString(4, PasswordTb.getText());
        Save.setString(5, EmailTb.getText());
        Save.setString(6, PhoneTb.getText());
       
        int row = Save.executeUpdate();
        JOptionPane.showMessageDialog(this,"Hội viên đã thêm!!!");
        Con.close();
        DisplayLibs();
       
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "lỗi thêm thủ thư vui lòng sửa lại");
    }
}    
    }//GEN-LAST:event_SavebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
              if(key == -1) {
    JOptionPane.showMessageDialog(this, "Chọn Sinh viên!!");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String Query = "delete from librariana where Id = " + key;
        Statement Del = Con.createStatement();
        Del.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Xoá sinh viên thành công!!!");
        DisplayLibs();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_deletebtnActionPerformed
int key = 0;
    private void LibrarianaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrarianaTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) LibrarianaTable.getModel();
        int MyIndex = LibrarianaTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        fullname.setText(model.getValueAt(MyIndex, 1).toString());
        LibNameTb.setText(model.getValueAt(MyIndex, 2).toString());
        PasswordTb.setText(model.getValueAt(MyIndex, 3).toString());
        EmailTb.setText(model.getValueAt(MyIndex, 4).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_LibrarianaTableMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

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
            java.util.logging.Logger.getLogger(Librariana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librariana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librariana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librariana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librariana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField EmailTb;
    private javax.swing.JTextField LibNameTb;
    private javax.swing.JTable LibrarianaTable;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
