
package baitaplon;

import java.sql.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Books extends javax.swing.JFrame  {

    static void setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    public Books() {
        initComponents();
        DisplayBooks();
    }
    
private void DisplayBooks() {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from Book");
        BooksTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        e.printStackTrace();
    }
}
int Id;
private void CountBooks()
{
    try {
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("Select Max(Id) from Book");
        Rs1.next();
        Id = Rs1.getInt(1) + 1;
    } catch (Exception e) {
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Author = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bookCover = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        editbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        reset = new javax.swing.JToggleButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quản lý sách");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Hệ thống quản lý thư viện");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(457, 457, 457))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(543, 543, 543))))
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
        jLabel3.setText("Thêm sách");

        Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setText("Sách");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Số lượng");

        Author.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });

        Qty.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setText("Tác Giả");

        Price.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Giá");

        bookCover.setText("bookCover");

        Browse.setText("Duyệt");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("Ảnh Sách");

        editbtn.setText("Sửa");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        savebtn.setText("Lưu");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("xoá");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        BooksTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BooksTable.setRowHeight(25);
        BooksTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        Back.setText("Trở lại");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn sách", "Hết sách", " " }));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Tình trạng");

        category.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Hài hước", "Anime", "Trinh thám", " " }));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setText("Thể loại");

        reset.setText("làm mới");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        search.setText("Tìm kiếm");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel3)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Browse)
                .addGap(363, 363, 363))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel4)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel6)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Author, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(Price)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(60, 60, 60)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(savebtn)
                        .addGap(18, 18, 18)
                        .addComponent(editbtn)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addGap(18, 18, 18)
                        .addComponent(Back)))
                .addGap(20, 20, 20)
                .addComponent(Browse)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(15, 15, 15)
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

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed
public ImageIcon ResizeCover(String ImagePath, byte[] pic)
{
    ImageIcon MyImage = null;
    if(ImagePath != null)
    {
        MyImage = new ImageIcon(ImagePath);
    } else {
        MyImage = new ImageIcon(pic);
    }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(bookCover.getWidth(), bookCover.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
       String imgPath;
    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
       //Browse to Image
//       JFileChooser file = new JFileChooser();
//       file.setCurrentDirectory(new File(System.getProperty("user.home")));
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
//        file.addChoosableFileFilter(filter);
//        int result = file.showSaveDialog(file);
//        if(result == JFileChooser.APPROVE_OPTION)
//        {
//            File selectedFile = file.getSelectedFile();
//            String path = selectedFile.getAbsolutePath();
//            bookCover.setIcon(ResizeCover(path,null));
//            imgPath = path;
//        } else if (result == JFileChooser.CANCEL_OPTION)
//        {
//            JOptionPane.showMessageDialog(this, "No File Selected");
//        }

//        Trên là ưtf file home lấy ảnh dưới là chạy thẳng vào nơi chứa ảnh luôn
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("E:\\ảnh demo")); // Thay "ĐƯỜNG DẪN MỚI CỦA BẠN" bằng đường dẫn thực tế bạn muốn sử dụng
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            bookCover.setIcon(ResizeCover(path,null));
            imgPath = path;
        } else if (result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(null, "No File Selected");
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        if(Name.getText().isEmpty()|| Author.getText().isEmpty()|| category.getSelectedItem() ==null ||Qty.getText().isEmpty()||Price.getText().isEmpty()||status.getSelectedItem() == null)
{
    JOptionPane.showConfirmDialog(this, "Thông tin bị thiếu!!!");
}else{
    try {
        CountBooks();
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        PreparedStatement Save = Con.prepareStatement("insert into Book values(?,?,?,?,?,?,?,?)");
        Save.setInt(1, Id);
        Save.setString(2, Name.getText());
        Save.setString(3, Author.getText());
        String categoryvalue = category.getSelectedItem().toString();
        Save.setString(4, categoryvalue);
        Save.setInt(5, Integer.valueOf(Qty.getText()));
        Save.setInt(6, Integer.valueOf(Price.getText()));
        String statusValue = status.getSelectedItem().toString();
        Save.setString(7, statusValue);


        InputStream img = new FileInputStream(imgPath);
        Save.setBlob(8,img);
        int row = Save.executeUpdate();
        JOptionPane.showMessageDialog(this,"Sách đã thêm!!!");
        Con.close();
        DisplayBooks();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Thêm sách thất bại vui lòng thử lại");
    }
}
    }//GEN-LAST:event_savebtnActionPerformed
private void getbookCover() {
    String query = "SELECT Image FROM Book WHERE Id = " + key;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query)) {
        if (rs.next()) {
            bookCover.setIcon(ResizeCover(null, rs.getBytes("Image")));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
      if(key == 0) {
    JOptionPane.showMessageDialog(this, "Select a Book!!");
} else {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String Query = "delete from Book where Id = " + key;
        Statement Del = Con.createStatement();
        Del.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Sách đã xoá!!!");
        
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
      try {
        String UpdateQuery = null;
        PreparedStatement Save = null;
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        
        if(imgPath != null && !imgPath.equals(bookCover)) {
        InputStream img = new FileInputStream(imgPath);
        UpdateQuery = "UPDATE Book SET Name=?, Author=?, category=?, Qty=?, Price=?, status=?, Image=? WHERE ID=?";
        Save = Con.prepareStatement(UpdateQuery);
        Save.setBlob(7, img);
        Save.setInt(8, key);
        } else {
            UpdateQuery = "UPDATE Book SET Name=?, Author=?, category=?, Qty=?, Price=?, status=? WHERE ID=?";
            Save = Con.prepareStatement(UpdateQuery);
            Save.setInt(7, key);
        }
        Save.setString(1, Name.getText());
        Save.setString(2, Author.getText());
        String categoryvalue = category.getSelectedItem().toString();
        Save.setString(3, categoryvalue);
        Save.setInt(4, Integer.valueOf(Qty.getText()));
        Save.setInt(5, Integer.valueOf(Price.getText()));
        String statusValue = status.getSelectedItem().toString();
        Save.setString(6, statusValue);


        if(Save.executeUpdate() == 1) {
            DisplayBooks();
            JOptionPane.showMessageDialog(this, "Sửa thông tin sách thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thông tin thất bại");
        }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_editbtnActionPerformed
int key = 0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
    DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
    int MyIndex = BooksTable.getSelectedRow();
    key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
    Name.setText(model.getValueAt(MyIndex, 1).toString());
    Author.setText(model.getValueAt(MyIndex, 2).toString());

    // Thêm dòng này để lấy giá trị từ JComboBox category
    String categoryValue = model.getValueAt(MyIndex, 3).toString();
    category.setSelectedItem(categoryValue);

    Qty.setText(model.getValueAt(MyIndex, 4).toString());
    Price.setText(model.getValueAt(MyIndex, 5).toString());

    // Thêm dòng này để lấy giá trị từ JComboBox status
    String statusValue = model.getValueAt(MyIndex, 6).toString();
    status.setSelectedItem(statusValue);

    getbookCover();
    }//GEN-LAST:event_BooksTableMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       new Menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        Name.setText("");
        Author.setText("");
        Qty.setText("");
        Price.setText("");
    }//GEN-LAST:event_resetMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String query;
        PreparedStatement pst;
        if(Name.getText().isEmpty() && Author.getText().isEmpty() && category.getSelectedItem().toString().isEmpty()){
            query = "SELECT * FROM book";
            pst = Con.prepareStatement(query);
        } else {
            query = "SELECT * FROM book WHERE 1=1";
            if(!Name.getText().isEmpty()){
                query += " AND name LIKE ?";
            }
            if(!Author.getText().isEmpty()){
                query += " AND author LIKE ?";
            }
            if(!category.getSelectedItem().toString().isEmpty()){
                query += " AND category LIKE ?";
            }
            pst = Con.prepareStatement(query);
            int index = 1;
            if(!Name.getText().isEmpty()){
                pst.setString(index++, "%" + Name.getText() + "%");
            }
            if(!Author.getText().isEmpty()){
                pst.setString(index++, "%" + Author.getText() + "%");
            }
            if(!category.getSelectedItem().toString().isEmpty()){
                pst.setString(index++, "%" + category.getSelectedItem().toString() + "%");
            }
        }
        ResultSet rs = pst.executeQuery();
        BooksTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JButton Back;
    private javax.swing.JTable BooksTable;
    private javax.swing.JButton Browse;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel bookCover;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton reset;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
