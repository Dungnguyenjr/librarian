package baitaplon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.StringTemplate.STR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class seachbook extends javax.swing.JFrame {


    public seachbook() {
        initComponents();
        addStyle(nhaptukhoa);
        
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    
    public void addStyle(JTextField textfeild){
        textfeild.setFont(new Font("Serif", Font.ITALIC, 12));
        textfeild.setForeground(Color.GRAY);
    }

    public void delStyle(JTextField textfeild){
        textfeild.setFont(new Font("Serif", Font.BOLD, 12));
        textfeild.setForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nhaptukhoa = new javax.swing.JTextField();
        seach = new javax.swing.JButton();
        loc = new javax.swing.JButton();
        locsach = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        seachbooktable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        bookCoveruser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Idbook = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        categoryus = new javax.swing.JTextField();
        qtyuser = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tìm kiếm sách");

        nhaptukhoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nhaptukhoa.setText("Vui lòng nhập từ khoá tìm kiếm");
        nhaptukhoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhaptukhoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhaptukhoaFocusLost(evt);
            }
        });
        nhaptukhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptukhoaActionPerformed(evt);
            }
        });

        seach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        seach.setText("Tìm kiếm");
        seach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seachMouseClicked(evt);
            }
        });
        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });

        loc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        loc.setText("Lọc Sách");
        loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locMouseClicked(evt);
            }
        });
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });

        locsach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Hài hước", "Anime", "Trinh thám" }));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tìm kiếm theo tên sách hoặc tác giả");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Lọc theo thể loại");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Hiện thị Sách");

        seachbooktable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seachbooktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên sách", "Tác giả", "Số lượng", "Giá"
            }
        ));
        seachbooktable.setRowHeight(25);
        seachbooktable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        seachbooktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seachbooktableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(seachbooktable);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("Ảnh Sách");

        bookCoveruser.setText("vui lòng chọn sách để hiển thị");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Id Sách");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setText("Sách");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Tác giả");

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

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Thể loại");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setText("Số lượng");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setText("Tình trạng");

        categoryus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        qtyuser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        qtyuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyuserActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel9)
                .addGap(196, 196, 196)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(bookCoveruser, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryus, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(Idbook))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(143, 143, 143)
                                .addComponent(jLabel7)
                                .addGap(127, 127, 127))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(qtyuser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72)
                                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72)
                                            .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nhaptukhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel2)))
                                .addGap(26, 26, 26)
                                .addComponent(seach, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(locsach, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(seach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nhaptukhoa)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locsach, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idbook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyuser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bookCoveruser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seachbooktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seachbooktableMouseClicked
        DefaultTableModel model = (DefaultTableModel) seachbooktable.getModel();
        int MyIndex = seachbooktable.getSelectedRow();
        Idbook.setText(model.getValueAt(MyIndex, 0).toString());
        Name.setText(model.getValueAt(MyIndex, 1).toString());
        Author.setText(model.getValueAt(MyIndex, 2).toString());
        categoryus.setText(model.getValueAt(MyIndex, 3).toString());
        status.setText(model.getValueAt(MyIndex, 6).toString());
        qtyuser.setText(model.getValueAt(MyIndex, 5).toString());

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
                double targetWidth = 200.0;
                double targetHeight = 173.0;

                double scaleX = targetWidth / image.getWidth();
                double scaleY = targetHeight / image.getHeight();
                transform.scale(scaleX, scaleY);
                AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BICUBIC);
                BufferedImage scaledImage = op.filter(image, null);

                // Chuyển Image thành ImageIcon
                ImageIcon imageIcon = new ImageIcon(scaledImage);

                // Đặt ImageIcon cho JLabel
                bookCoveruser.setIcon(imageIcon);
            }

            // Đóng kết nối
            con.close();
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_seachbooktableMouseClicked

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void qtyuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyuserActionPerformed

    private void nhaptukhoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhaptukhoaFocusGained
    if(nhaptukhoa.getText().equals("Vui lòng nhập từ khoá tìm kiếm")){
            nhaptukhoa.setText(null);
            nhaptukhoa.requestFocus();
            
            delStyle(nhaptukhoa);
        }
    }//GEN-LAST:event_nhaptukhoaFocusGained

    private void nhaptukhoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhaptukhoaFocusLost
        if(nhaptukhoa.getText().length() ==0){
            addStyle(nhaptukhoa);
            nhaptukhoa.setText("Vui lòng nhập từ khoá tìm kiếm");
        }
    }//GEN-LAST:event_nhaptukhoaFocusLost

    private void nhaptukhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptukhoaActionPerformed
        this.requestFocus();
    }//GEN-LAST:event_nhaptukhoaActionPerformed

    private void seachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seachMouseClicked
        if(nhaptukhoa.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "sai tên sách hoặc tác giả vui lòng nhập lại");
        }
        else
        {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                PreparedStatement st;
                ResultSet rs;
//                nếu không nhập sẽ lấy toàn bộ dữ liệu về sách
                if(nhaptukhoa.getText().isEmpty()){
                    st = con.prepareStatement("SELECT * FROM book");
                    rs = st.executeQuery();
                    seachbooktable.setModel(DbUtils.resultSetToTableModel(rs));
                }else {
//                    nếu như đã nhập từ kháo là tên hoặc tác giả thì dùng dấu % để tìm tên sách và tác giả trong sql chứa từ khoá
                    String searchKeyword = nhaptukhoa.getText();
                    st = con.prepareStatement("SELECT * FROM book WHERE name LIKE ? OR author LIKE ?");
                    st.setString(1, "%" + searchKeyword + "%");
                    st.setString(2, "%" + searchKeyword + "%");
                    rs = st.executeQuery();
                    seachbooktable.setModel(DbUtils.resultSetToTableModel(rs));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_seachMouseClicked

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed

    }//GEN-LAST:event_seachActionPerformed

    private void locMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locMouseClicked
        
    }//GEN-LAST:event_locMouseClicked

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
            if(locsach.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "không tìm thấy thể loại này");
        }
        else
        {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                PreparedStatement st;
                ResultSet rs;
                // nếu không nhập sẽ lấy toàn bộ dữ liệu về sách
                if(nhaptukhoa.getText().isEmpty()){
                    st = con.prepareStatement("SELECT * FROM book");
                    rs = st.executeQuery();
                    seachbooktable.setModel(DbUtils.resultSetToTableModel(rs));
                }else {
                    // nếu như đã nhập từ khóa là tên hoặc tác giả thì dùng dấu % để tìm tên sách và tác giả trong sql chứa từ khoá
                    String searchKeyword = nhaptukhoa.getText();
                    String category = locsach.getSelectedItem().toString();
                    st = con.prepareStatement("SELECT * FROM book WHERE category LIKE ?");
                    st.setString(1, "%" + category + "%");

                    rs = st.executeQuery();
                    seachbooktable.setModel(DbUtils.resultSetToTableModel(rs));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_locActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new MenuUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(seachbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seachbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seachbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seachbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seachbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Idbook;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel bookCoveruser;
    private javax.swing.JTextField categoryus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loc;
    private javax.swing.JComboBox<String> locsach;
    private javax.swing.JTextField nhaptukhoa;
    private javax.swing.JTextField qtyuser;
    private javax.swing.JButton seach;
    private javax.swing.JTable seachbooktable;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
