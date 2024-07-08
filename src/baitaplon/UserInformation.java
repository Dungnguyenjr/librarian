package baitaplon;


import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; // Import DefaultTableModel từ gói javax.swing.table
import java.sql.*;
import java.util.Vector;

public class UserInformation extends javax.swing.JFrame {
   private String name;
    private String id;

    public UserInformation() {
        initComponents();
        this.name = MenuUser.loggedInUser; // Lấy tên người dùng từ MenuUser
         loadData();
    }

   private void loadData(){
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student WHERE Name = '" + this.name + "'");
        
        Vector<String> columnNames = new Vector<>();
        columnNames.add("ID");
        columnNames.add("Tài khoản");
        columnNames.add("Họ và tên");
        columnNames.add("Số điện thoại");
        columnNames.add("Khoa");
        columnNames.add("học kì");

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Create empty table model
        
        while(rs.next()) {
            Vector<String> row = new Vector<>();
            row.add(rs.getString("id"));
            row.add(rs.getString("Name"));
            row.add(rs.getString("fullname"));
            row.add(rs.getString("Phone"));
            row.add(rs.getString("Department"));
            row.add(rs.getString("Semester"));
            tableModel.addRow(row);
        }
        
        Infomation.setModel(tableModel); // Set table model after iterating through result set
        
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Infomation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        fullname = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        Depart = new javax.swing.JTextField();
        semester = new javax.swing.JTextField();
        edituser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Back2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Infomation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Infomation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Author", "Qty", "Price", "Image"
            }
        ));
        Infomation.setRowHeight(25);
        Infomation.setSelectionBackground(new java.awt.Color(102, 255, 102));
        Infomation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfomationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Infomation);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Thông tin tài khoản");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        fullname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        Depart.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Depart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartActionPerformed(evt);
            }
        });

        semester.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        edituser.setText("Chỉnh sửa");
        edituser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edituserMouseClicked(evt);
            }
        });
        edituser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edituserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Semester");

        Back2.setText("Làm mới");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Depart, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Depart, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfomationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfomationMouseClicked
                DefaultTableModel model = (DefaultTableModel) Infomation.getModel();
                int MyIndex = Infomation.getSelectedRow();
                fullname.setText(model.getValueAt(MyIndex, 2).toString());
                phone.setText(model.getValueAt(MyIndex, 3).toString());
                Depart.setText(model.getValueAt(MyIndex, 4).toString());
                semester.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_InfomationMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       new MenuUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void DepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void edituserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edituserActionPerformed
//       if(fullname.getText().isEmpty() || phone.getText().isEmpty() || Depart.getText().isEmpty() || semester.getText().isEmpty()) {
//        JOptionPane.showConfirmDialog(this, "chính sửa thất bại!!!");
//    } else {
//        try {
//            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
//            PreparedStatement Save = Con.prepareStatement("update student set fullname = ?, Phone = ?, Department = ?, Semester = ? where Name = ?");
//            String newfullName = fullname.getText();
//            String newPhone = phone.getText();
//            String newDepartment = Depart.getText();
//            String newSemester = semester.getText();
//            String newname = name;
//            
//           
//            Save.setString(1, newfullName);
//            Save.setString(2, newPhone);
//            Save.setString(3, newDepartment);
//            Save.setString(4, newSemester);
//            Save.setString(5, newname);
//            // Execute the update
//            Save.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException("Chỉnh sửa thông tin thành công",e);
//        }
//    }
    }//GEN-LAST:event_edituserActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        fullname.setText("");
        phone.setText("");
        Depart.setText("");
        semester.setText("");
    }//GEN-LAST:event_Back2ActionPerformed

    private void edituserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edituserMouseClicked
//     if(fullname.getText().isEmpty() || phone.getText().isEmpty() || Depart.getText().isEmpty() || semester.getText().isEmpty()) {
//        JOptionPane.showConfirmDialog(this, "chính sửa thất bại!!!");
//    } else {
//        try {
//            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
//            PreparedStatement Save = Con.prepareStatement("update student set fullname = ?, Phone = ?, Department = ?, Semester = ? where Name = ?");
//            String newfullName = fullname.getText();
//            String newPhone = phone.getText();
//            String newDepartment = Depart.getText();
//            String newSemester = semester.getText();
//            String newname = name;
//            
//           
//            Save.setString(1, newfullName);
//            Save.setString(2, newPhone);
//            Save.setString(3, newDepartment);
//            Save.setString(4, newSemester);
//            Save.setString(5, newname);
//            // Execute the update
//            Save.executeUpdate();
//        } catch (SQLException e) {
//            JOptionPane.showConfirmDialog(this, "Chỉnh sửa thông tin thành công");
//        }
//    }
if(fullname.getText().isEmpty() || phone.getText().isEmpty() || Depart.getText().isEmpty() || semester.getText().isEmpty()) {
    JOptionPane.showConfirmDialog(this, "Vui lòng điền đầy đủ thông tin!");
} else {
    try {
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement Save = Con.prepareStatement("update student set fullname = ?, Phone = ?, Department = ?, Semester = ? where Name = ?");
        String newfullName = fullname.getText();
        String newPhone = phone.getText();
        String newDepartment = Depart.getText();
        String newSemester = semester.getText();
        String newname = name;

        Save.setString(1, newfullName);
        Save.setString(2, newPhone);
        Save.setString(3, newDepartment);
        Save.setString(4, newSemester);
        Save.setString(5, newname);
        // Execute the update
        Save.executeUpdate();
        JOptionPane.showConfirmDialog(this, "Chỉnh sửa thông tin thành công");
        new UserInformation().setVisible(true);
        this.dispose();
    } catch (SQLException e) {
        JOptionPane.showConfirmDialog(this, "Chỉnh sửa thất bại!!!");
    }
}
    }//GEN-LAST:event_edituserMouseClicked

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
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                  // Thay "Tên người dùng đã đăng nhập" bằng tên thực sự của người dùng đã đăng nhập
                new UserInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Back2;
    private javax.swing.JTextField Depart;
    private javax.swing.JTable Infomation;
    private javax.swing.JButton edituser;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField semester;
    // End of variables declaration//GEN-END:variables
}
