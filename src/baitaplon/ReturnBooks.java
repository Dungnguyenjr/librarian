package baitaplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class ReturnBooks extends javax.swing.JFrame {
    

    public ReturnBooks() {
        initComponents();
        RentedBooks();
        DisplayRentedBooks();
        
    }

    // Phương thức lấy thông tin sách từ ID sách
public String getBookInfo(int Id) {
    String bookInfo = null;
    try {
        // Chuẩn bị câu truy vấn SQL
        String sql = "SELECT * FROM book WHERE id = ?";
        PreparedStatement statement = Con.prepareStatement(sql);
        statement.setInt(1, Id);

        // Thực thi câu truy vấn
        ResultSet resultSet = statement.executeQuery();

        // Xử lý kết quả
        if (resultSet.next()) {
            // Lấy thông tin sách từ kết quả truy vấn
            String Name = resultSet.getString("name"); // Đảm bảo tên cột là "name"
            String bookAuthor = resultSet.getString("author"); // Đảm bảo tên cột là "author"
            // Gộp thông tin sách vào chuỗi kết quả
            bookInfo = "Sách: " + Name + " - Tác giả: " + bookAuthor;

            // Cập nhật BookIdFromModel
            BookIdFromModel = Id;
        }

        // Đóng các tài nguyên
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return bookInfo;
}
public String getStudentInfo(int Id) {
    String studentInfo = null;
    try {
        // Chuẩn bị câu truy vấn SQL
        String sql = "SELECT * FROM student WHERE id = ?";
        PreparedStatement statement = Con.prepareStatement(sql);
        statement.setInt(1, Id);

        // Thực thi câu truy vấn
        ResultSet resultSet = statement.executeQuery();

        // Xử lý kết quả
        if (resultSet.next()) {
            // Lấy thông tin sinh viên từ kết quả truy vấn
            String studentName = resultSet.getString("name"); // Đảm bảo tên cột là "name"
            String studentPhone = resultSet.getString("phone"); // Đảm bảo tên cột là "phone"
            // Gộp thông tin sinh viên vào chuỗi kết quả
            studentInfo = " " + studentName + " - sdt: " + studentPhone;
        }

        // Đóng các tài nguyên
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return studentInfo;
}

    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    
   private void RentedBooks() {
       try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from issue");
           RentedBooks.setModel(DbUtils.resultSetToTableModel(Rs));
           
       } catch (Exception e) {
           e.printStackTrace();
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
        BookTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SaveTb = new javax.swing.JButton();
        Resetbtn = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbDay = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbmonth = new javax.swing.JComboBox<>();
        returnmenu = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        RentedBooks = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        cbyear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        RentDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rtsudent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quản lý trả sách");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Hệ thống quản lý thư viện");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel3.setText("Danh sách hội trả sách");

        BookTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BookTb.setForeground(new java.awt.Color(51, 51, 51));
        BookTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setText("Sách");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Ngày");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setText("Hội viên");

        SaveTb.setText("Trả sách");
        SaveTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTbActionPerformed(evt);
            }
        });

        Resetbtn.setText("làm mới");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Danh sách người đã Trả Sách");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("Thông tin sách mượn");

        cbDay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Tháng");

        cbmonth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        returnmenu.setText("Trở lại");
        returnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnmenuActionPerformed(evt);
            }
        });

        RentedBooks.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RentedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Book", "Date"
            }
        ));
        RentedBooks.setRowHeight(25);
        RentedBooks.setSelectionBackground(new java.awt.Color(102, 255, 102));
        RentedBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentedBooksMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(RentedBooks);

        ReturnTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Book", "Date"
            }
        ));
        ReturnTable.setRowHeight(25);
        ReturnTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ReturnTable);

        cbyear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel10.setText("Năm");

        RentDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RentDate.setForeground(new java.awt.Color(51, 51, 51));
        RentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentDateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setText("Ngày mượn");

        rtsudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rtsudent.setForeground(new java.awt.Color(51, 51, 51));
        rtsudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtsudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel4)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(SaveTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(BookTb, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(rtsudent, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(returnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTextField5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookTb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtsudent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbyear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbDay))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveTb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane5)))
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookTbActionPerformed
   private void DisplayRentedBooks() {
       try {
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from returntbl");
           ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
           
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    
    
    int RId;
    private void CountRenturn(){
    
            try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(Num) from returntbl");
            Rs1.next();
            RId = Rs1.getInt(1)+1;
        } catch (Exception e) {
        }
    }
    private void GetAvailabelQTY(){
         try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Qty from book where "+ BookIdFromModel);
            Rs1.next();
            AvailBook = Rs1.getInt(1);
        } catch (Exception e) {
        }

}
    private void DeleteRenal(){
         
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        String Query = "delete from issue where Num = " + RentId;
        Statement Del = Con.createStatement();
        Del.executeUpdate(Query);
        JOptionPane.showMessageDialog(this, "Sách đã xoá!!!");
        
        
    } catch (Exception e) {
        e.printStackTrace();
  }
    }
    int AvailBook;
    private void UpdateBook() {
    try {
         GetAvailabelQTY(); // Make sure to get the updated quantity before updating the book
        String updateQuery = "UPDATE book SET Qty = Qty+1 WHERE Id = ?";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        PreparedStatement save = con.prepareStatement(updateQuery);
//        save.setInt(1, newQty);
        save.setInt(1, BookIdFromModel );
        save.executeUpdate();
//        if ( save.executeUpdate() )
//        {
//            JOptionPane.showMessageDialog(this, "Cập nhật số lượng sách thành công");
//        }else{
//            JOptionPane.showMessageDialog(this, "Cập nhật số lượng sách thất bại");
//        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    private void SaveTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveTbActionPerformed
       if (RentId == -1) {
        JOptionPane.showMessageDialog(this, "Chọn sách trả");
    } else {
        CountRenturn();
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            PreparedStatement Save = Con.prepareStatement("INSERT INTO returntbl VALUES(?,?,?,?,?,?)");
            PreparedStatement Save1 = Con.prepareStatement("INSERT INTO givebookback VALUES(?,?,?,?,?,?)");
            
            // Assuming RId and StId are class variables representing ReturnId and StudentId respectively
            Save.setInt(1, RId); 
            Save.setInt(2, Integer.valueOf(StudentId));
            Save.setInt(3, Integer.valueOf(BookIdFromModel));
            Save.setInt(4, 1);

            // Get selected day, month, year from the comboboxes
            String day = cbDay.getSelectedItem().toString();
            String month = cbmonth.getSelectedItem().toString();
            String year = cbyear.getSelectedItem().toString();

            // Combine day, month, year into a complete date string
            String dateString = day + "-" + month + "-" + year;

            // Set the date in the prepared statement
            Save.setString(5, dateString);

            // Assuming this.RentDate is a JTextField containing RentDate
            String RentDate = this.RentDate.getText();
            Save.setString(6, RentDate);
            
            // Execute the update
            int row = Save.executeUpdate();
            
            Save1.setInt(1, RId); 
            Save1.setInt(2, Integer.valueOf(StudentId));
            Save1.setInt(3, Integer.valueOf(BookIdFromModel));
            Save1.setInt(4, 1);
            Save1.setString(5, dateString);
            Save1.setString(6, RentDate);

            int row1 = Save1.executeUpdate();
            
            // Check if any row was affected
            if(row > 0) {
                JOptionPane.showMessageDialog(this, "Đã trả sách!!!");
                Con.close();
                UpdateBook();
                DisplayRentedBooks();
                DeleteRenal();
                RentedBooks();
            } else {
                JOptionPane.showMessageDialog(this, "Không thể trả sách, vui lòng thử lại.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Trả sách có thể bị lỗi vui lòng ấn lại :)");
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
    }//GEN-LAST:event_SaveTbActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
//    int StId;
//    int Bookidd;
    int StudentId;
    int RentId = -1;
        int BookIdFromModel;
    private void RentedBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentedBooksMouseClicked
       DefaultTableModel model = (DefaultTableModel) RentedBooks.getModel();
    int MyIndex = RentedBooks.getSelectedRow();
     BookIdFromModel = Integer.valueOf(model.getValueAt(MyIndex, 2).toString()); // Đảm bảo lấy dữ liệu từ cột ID sách
     StudentId = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
    // Lấy thông tin sách từ bảng 'books' dựa trên BookId
    String bookInfo = getBookInfo(BookIdFromModel);

    // In ra ID và tên sách trong bảng 'books'
    BookTb.setText(bookInfo);
    
    String studentInfo = getStudentInfo(StudentId);
    rtsudent.setText(studentInfo);

    // Update RentId when a book is selected
    RentId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());

    // Lấy thông tin khác nếu cần
    RentDate.setText(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_RentedBooksMouseClicked

    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTableMouseClicked

    private void RentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentDateActionPerformed

    private void rtsudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtsudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtsudentActionPerformed

    private void returnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnmenuActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnmenuActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
       try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        St = Con.createStatement();
        St.executeUpdate("DELETE FROM returntbl");
        Rs = St.executeQuery("Select * from returntbl");
        ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
        JOptionPane.showMessageDialog(this, "Đã xóa và làm mới bảng!"); // Thông báo sau khi làm mới bảng
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_ResetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookTb;
    private javax.swing.JTextField RentDate;
    private javax.swing.JTable RentedBooks;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JButton SaveTb;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbmonth;
    private javax.swing.JComboBox<String> cbyear;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton returnmenu;
    private javax.swing.JTextField rtsudent;
    // End of variables declaration//GEN-END:variables
}
