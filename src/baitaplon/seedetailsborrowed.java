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


public class seedetailsborrowed extends javax.swing.JFrame {

  
    public seedetailsborrowed() {
        initComponents();
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    ArrayList<Integer> totalsachmuon = new ArrayList<Integer>();
    ArrayList<Integer> totaltheloai = new ArrayList<Integer>();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Seedetailsborrowed = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tongsachmuon = new javax.swing.JTextField();
        theloai = new javax.swing.JTextField();
        hienthi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Seedetailsborrowed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Seedetailsborrowed.setModel(new javax.swing.table.DefaultTableModel(
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
        Seedetailsborrowed.setRowHeight(25);
        Seedetailsborrowed.setSelectionBackground(new java.awt.Color(102, 255, 102));
        Seedetailsborrowed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeedetailsborrowedMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Seedetailsborrowed);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Tổng số sách đã mượn");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Tổng sách đã mượn là :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel22.setText("Thể loại được mượn nhiều nhất là:");

        tongsachmuon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        theloai.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        hienthi.setText("Hiển thị");
        hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(theloai, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(tongsachmuon))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tongsachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(theloai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new statistics().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienthiActionPerformed
try {
    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
    St = Con.createStatement();
    // Query for 'borrowbooks'
        Rs = St.executeQuery("SELECT COUNT(*) FROM borrowbooks");
        if (Rs.next()) {
            totalsachmuon.add(Rs.getInt(1));
        }
        if (!totalsachmuon.isEmpty()) {
    tongsachmuon.setText(totalsachmuon.get(0).toString());
} else {
    tongsachmuon.setText("0");
}
    // Query to get the category with the highest count of borrowed books from 'book' table based on 'BookIssued' from 'borrowbooks' table
    Rs = St.executeQuery("SELECT category, COUNT(*) as count FROM book JOIN borrowbooks ON book.Id = borrowbooks.BookIssued GROUP BY category ORDER BY count DESC LIMIT 1");

    if (Rs.next()) {
        theloai.setText(Rs.getString("category") + " - " + Rs.getInt("count") + " quyển");
    } else {
        theloai.setText("0");
    }

} catch (Exception e) {
    throw new RuntimeException(e);
}

    }//GEN-LAST:event_hienthiActionPerformed

    private void SeedetailsborrowedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeedetailsborrowedMouseClicked
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();

            // Execute first query to get book issued details from 'borrowbooks' table
            ResultSet rs1 = st1.executeQuery("SELECT * FROM borrowbooks");

            Vector<String> columnNames = new Vector<>();
            columnNames.add("STT");
            columnNames.add("Id Sinh viên");
            columnNames.add("Số sách");
            columnNames.add("Tên Sách");
            columnNames.add("Tác giả");
            columnNames.add("Thể loại");
            columnNames.add("Ngày Mượn");

            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Create empty table model

            while(rs1.next()) {
                String bookIssued = rs1.getString("BookIssued");

                // Execute second query to get book details from 'book' table using 'bookIssued' as Id
                ResultSet rs2 = st2.executeQuery("SELECT * FROM book WHERE Id = " + bookIssued);

                if(rs2.next()) {
                    Vector<String> row = new Vector<>();
                    row.add(rs1.getString("Number"));
                    row.add(rs1.getString("Idbr"));
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

            Seedetailsborrowed.setModel(tableModel); // Set table model after iterating through result set

            st1.close();
            st2.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_SeedetailsborrowedMouseClicked

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
            java.util.logging.Logger.getLogger(seedetailsborrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seedetailsborrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seedetailsborrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seedetailsborrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seedetailsborrowed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Seedetailsborrowed;
    private javax.swing.JButton hienthi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField theloai;
    private javax.swing.JTextField tongsachmuon;
    // End of variables declaration//GEN-END:variables
}
