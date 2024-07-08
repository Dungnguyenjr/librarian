package baitaplon;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class areborrowbook extends javax.swing.JFrame {
    private String name;
 
    public areborrowbook() {
        initComponents();
         this.name = MenuUser.loggedInUser; // Lấy tên người dùng từ MenuUser
    }
    
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    ArrayList<String> Idsvd = new ArrayList<String>();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areborrowbooktable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Idbook = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        categoryus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Idsinhviendangmuon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Hovatendangmuon = new javax.swing.JTextField();
        sodienthoai = new javax.swing.JTextField();
        nganhhoc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        showbook = new javax.swing.JButton();
        bookare = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Thông tin sách đang mượn");

        areborrowbooktable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        areborrowbooktable.setModel(new javax.swing.table.DefaultTableModel(
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
        areborrowbooktable.setRowHeight(25);
        areborrowbooktable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        areborrowbooktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areborrowbooktableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(areborrowbooktable);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("Ảnh Sách");

        Idbook.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Author.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });

        categoryus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setText("Id Sách");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setText("Tên Sách");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel12.setText("Tác Giả");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel13.setText("Thể loại");

        Idsinhviendangmuon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setText("Id Sinh viên");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setText("Họ và tên");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setText("Số điện thoại");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel17.setText("Ngành học");

        Hovatendangmuon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        sodienthoai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        nganhhoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setText("Trở lại");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        showbook.setText("Hiển thị");
        showbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showbookMouseClicked(evt);
            }
        });

        bookare.setText("vui lòng chọn sách để hiển thị");
        bookare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookareMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bookare, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Idbook)
                            .addComponent(Idsinhviendangmuon)
                            .addComponent(jLabel14))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(59, 59, 59)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addComponent(Hovatendangmuon)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nganhhoc, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(categoryus))
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(showbook, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idbook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hovatendangmuon)
                            .addComponent(nganhhoc)
                            .addComponent(Idsinhviendangmuon, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(sodienthoai)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bookare, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areborrowbooktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areborrowbooktableMouseClicked
        DefaultTableModel model = (DefaultTableModel) areborrowbooktable.getModel();
        int MyIndex = areborrowbooktable.getSelectedRow();
        Idbook.setText(model.getValueAt(MyIndex, 1).toString());
        Name.setText(model.getValueAt(MyIndex, 2).toString());
        Author.setText(model.getValueAt(MyIndex, 3).toString());
        categoryus.setText(model.getValueAt(MyIndex, 4).toString());
try {
    // Tạo kết nối đến cơ sở dữ liệu
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    Statement st = con.createStatement();

    // Tạo câu lệnh SQL để lấy hình ảnh
    String sql = "SELECT Image FROM Book WHERE id = ?";

    // Tạo một PreparedStatement
    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setInt(1, Integer.parseInt(Idbook.getText()));

    // Thực hiện truy vấn và lấy kết quả
    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        // Lấy Blob từ kết quả
        Blob blob = rs.getBlob("Image");

        // Chuyển Blob thành Image
        InputStream in = blob.getBinaryStream();
        BufferedImage image = ImageIO.read(in);

        // Tạo một ma trận biến đổi để thay đổi kích thước hình ảnh
        AffineTransform transform = new AffineTransform();
        double targetWidth = 210.0;
        double targetHeight = 180.0;

        double scaleX = targetWidth / image.getWidth();
        double scaleY = targetHeight / image.getHeight();
        transform.scale(scaleX, scaleY);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BICUBIC);
        BufferedImage scaledImage = op.filter(image, null);

        // Chuyển Image thành ImageIcon
        ImageIcon imageIcon = new ImageIcon(scaledImage);

        // Đặt ImageIcon cho JLabel
        bookare.setIcon(imageIcon);
    }

    // Đóng kết nối
    con.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Lỗi khi kết nối đến cơ sở dữ liệu: " + ex.getMessage());
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "Lỗi khi xử lý hình ảnh: " + ex.getMessage());
}
    }//GEN-LAST:event_areborrowbooktableMouseClicked

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void showbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbookMouseClicked
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement ps = Con.prepareStatement("SELECT * FROM student WHERE Name = ?");
        ps.setString(1, this.name);
        Rs = ps.executeQuery();

        PreparedStatement ps1 = Con.prepareStatement("SELECT COUNT(*) AS count FROM issue WHERE Id IN (SELECT id FROM student WHERE Name = ?)");
        ps1.setString(1, this.name);
        ResultSet rs1 = ps1.executeQuery();

        if (Rs.next() && rs1.next()) {
            Idsinhviendangmuon.setText(Rs.getString("id"));
            Hovatendangmuon.setText(Rs.getString("fullname"));
            sodienthoai.setText(Rs.getString("Phone"));
            nganhhoc.setText(Rs.getString("Department"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
          try {
    // Tạo kết nối đến cơ sở dữ liệu
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    Statement st1 = con.createStatement();
    Statement st2 = con.createStatement();

    // Thực hiện truy vấn đầu tiên để lấy thông tin chi tiết về sách đã mượn từ bảng 'borrowbooks'
    ResultSet rs1 = st1.executeQuery("SELECT * FROM issue WHERE Id IN (SELECT id FROM student WHERE Name = '" + this.name + "')");

    // Tạo một Vector để lưu trữ tên các cột
    Vector<String> columnNames = new Vector<>();
    columnNames.add("STT");
    columnNames.add("Số sách");
    columnNames.add("Tên Sách");
    columnNames.add("Tác giả");
    columnNames.add("Thể loại");
    columnNames.add("Ngày Mượn");

    // Tạo một DefaultTableModel rỗng
    DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

    while(rs1.next()) {
        String bookIssued = rs1.getString("BookIssued");

        // Thực hiện truy vấn thứ hai để lấy thông tin chi tiết về sách từ bảng 'book' sử dụng 'bookIssued' làm Id
        ResultSet rs2 = st2.executeQuery("SELECT * FROM book WHERE Id = " + bookIssued);

        if(rs2.next()) {
            Vector<String> row = new Vector<>();
            row.add(rs1.getString("Num"));
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

    // Đặt table model sau khi duyệt qua result set
    areborrowbooktable.setModel(tableModel);

    st1.close();
    st2.close();
    con.close();
    // Đóng kết nối
} catch (SQLException e) {
    throw new RuntimeException(e);
}
    }//GEN-LAST:event_showbookMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new MenuUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void bookareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookareMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookareMouseClicked

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
            java.util.logging.Logger.getLogger(areborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areborrowbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areborrowbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Hovatendangmuon;
    private javax.swing.JTextField Idbook;
    private javax.swing.JTextField Idsinhviendangmuon;
    private javax.swing.JTextField Name;
    private javax.swing.JTable areborrowbooktable;
    private javax.swing.JLabel bookare;
    private javax.swing.JTextField categoryus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nganhhoc;
    private javax.swing.JButton showbook;
    private javax.swing.JTextField sodienthoai;
    // End of variables declaration//GEN-END:variables
}
