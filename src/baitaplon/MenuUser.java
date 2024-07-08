
package baitaplon;

public class MenuUser extends javax.swing.JFrame {

    public MenuUser() {
        initComponents();
    }
public static String loggedInUser;
      public MenuUser(String lib ) {
        initComponents();
        Lib.setText(lib);
        loggedInUser = lib; // Lưu trữ tên người dùng đã đăng nhập
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lib = new javax.swing.JLabel();
        doimatkhauuser = new javax.swing.JPanel();
        doimatkhauuserr = new javax.swing.JLabel();
        infomation = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        historybook = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        areborrowbook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        returnhistorybooks = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        OUT = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bookuser = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        seachbook = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Thông tin cá nhân");

        Lib.setBackground(new java.awt.Color(255, 255, 255));
        Lib.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Lib.setForeground(new java.awt.Color(51, 51, 51));
        Lib.setText("Libaririan");
        Lib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibMouseClicked(evt);
            }
        });

        doimatkhauuser.setBackground(new java.awt.Color(255, 255, 255));
        doimatkhauuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doimatkhauuserMouseClicked(evt);
            }
        });

        doimatkhauuserr.setBackground(new java.awt.Color(255, 255, 255));
        doimatkhauuserr.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        doimatkhauuserr.setForeground(new java.awt.Color(51, 51, 51));
        doimatkhauuserr.setText("Đổi mật khẩu");
        doimatkhauuserr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doimatkhauuserrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout doimatkhauuserLayout = new javax.swing.GroupLayout(doimatkhauuser);
        doimatkhauuser.setLayout(doimatkhauuserLayout);
        doimatkhauuserLayout.setHorizontalGroup(
            doimatkhauuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doimatkhauuserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doimatkhauuserr)
                .addGap(44, 44, 44))
        );
        doimatkhauuserLayout.setVerticalGroup(
            doimatkhauuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doimatkhauuserLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(doimatkhauuserr)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        infomation.setBackground(new java.awt.Color(255, 255, 255));
        infomation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infomationMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Thông tin cá nhân");

        javax.swing.GroupLayout infomationLayout = new javax.swing.GroupLayout(infomation);
        infomation.setLayout(infomationLayout);
        infomationLayout.setHorizontalGroup(
            infomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infomationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        infomationLayout.setVerticalGroup(
            infomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infomationLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        historybook.setBackground(new java.awt.Color(255, 255, 255));
        historybook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historybookMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Lịch sử mượn sách");

        javax.swing.GroupLayout historybookLayout = new javax.swing.GroupLayout(historybook);
        historybook.setLayout(historybookLayout);
        historybookLayout.setHorizontalGroup(
            historybookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historybookLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        historybookLayout.setVerticalGroup(
            historybookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historybookLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );

        areborrowbook.setBackground(new java.awt.Color(255, 255, 255));
        areborrowbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areborrowbookMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Sách đang mượn");

        javax.swing.GroupLayout areborrowbookLayout = new javax.swing.GroupLayout(areborrowbook);
        areborrowbook.setLayout(areborrowbookLayout);
        areborrowbookLayout.setHorizontalGroup(
            areborrowbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areborrowbookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        areborrowbookLayout.setVerticalGroup(
            areborrowbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areborrowbookLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        returnhistorybooks.setBackground(new java.awt.Color(255, 255, 255));
        returnhistorybooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnhistorybooksMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Lịch sử trả sách");

        javax.swing.GroupLayout returnhistorybooksLayout = new javax.swing.GroupLayout(returnhistorybooks);
        returnhistorybooks.setLayout(returnhistorybooksLayout);
        returnhistorybooksLayout.setHorizontalGroup(
            returnhistorybooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnhistorybooksLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        returnhistorybooksLayout.setVerticalGroup(
            returnhistorybooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnhistorybooksLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        OUT.setBackground(new java.awt.Color(255, 255, 255));
        OUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OUTMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Đăng xuất");

        javax.swing.GroupLayout OUTLayout = new javax.swing.GroupLayout(OUT);
        OUT.setLayout(OUTLayout);
        OUTLayout.setHorizontalGroup(
            OUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OUTLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OUTLayout.setVerticalGroup(
            OUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OUTLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bookuser.setBackground(new java.awt.Color(255, 255, 255));
        bookuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookuserMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Sách Thư Viện");

        javax.swing.GroupLayout bookuserLayout = new javax.swing.GroupLayout(bookuser);
        bookuser.setLayout(bookuserLayout);
        bookuserLayout.setHorizontalGroup(
            bookuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookuserLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookuserLayout.setVerticalGroup(
            bookuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookuserLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(15, 15, 15))
        );

        seachbook.setBackground(new java.awt.Color(255, 255, 255));
        seachbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seachbookMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tìm kiếm sách");

        javax.swing.GroupLayout seachbookLayout = new javax.swing.GroupLayout(seachbook);
        seachbook.setLayout(seachbookLayout);
        seachbookLayout.setHorizontalGroup(
            seachbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seachbookLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seachbookLayout.setVerticalGroup(
            seachbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seachbookLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lib)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(historybook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doimatkhauuser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(infomation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seachbook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areborrowbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnhistorybooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Lib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(infomation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(seachbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bookuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(areborrowbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnhistorybooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historybook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doimatkhauuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LibMouseClicked

    private void OUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OUTMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OUTMouseClicked

    private void infomationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infomationMouseClicked
                new UserInformation().setVisible(true); // Không cần truyền tên người dùng vào UserInformation
        this.dispose();
    }//GEN-LAST:event_infomationMouseClicked

    private void doimatkhauuserrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doimatkhauuserrMouseClicked
         new DoimatkhauUser().setVisible(true); // Không cần truyền tên người dùng vào UserInformation
        this.dispose();
    }//GEN-LAST:event_doimatkhauuserrMouseClicked

    private void doimatkhauuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doimatkhauuserMouseClicked
        new DoimatkhauUser().setVisible(true); // Không cần truyền tên người dùng vào UserInformation
        this.dispose();
    }//GEN-LAST:event_doimatkhauuserMouseClicked

    private void historybookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historybookMouseClicked
        new historyborrowbook().setVisible(true); // Không cần truyền tên người dùng vào UserInformation
        this.dispose();
    }//GEN-LAST:event_historybookMouseClicked

    private void returnhistorybooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnhistorybooksMouseClicked
        new returnhistorybook().setVisible(true); // Không cần truyền tên người dùng vào UserInformation
        this.dispose();
    }//GEN-LAST:event_returnhistorybooksMouseClicked

    private void bookuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookuserMouseClicked
        new bookuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookuserMouseClicked

    private void seachbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seachbookMouseClicked
        new seachbook().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_seachbookMouseClicked

    private void areborrowbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areborrowbookMouseClicked
       new areborrowbook().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_areborrowbookMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lib;
    private javax.swing.JPanel OUT;
    private javax.swing.JPanel areborrowbook;
    private javax.swing.JPanel bookuser;
    private javax.swing.JPanel doimatkhauuser;
    private javax.swing.JLabel doimatkhauuserr;
    private javax.swing.JPanel historybook;
    private javax.swing.JPanel infomation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel returnhistorybooks;
    private javax.swing.JPanel seachbook;
    // End of variables declaration//GEN-END:variables
}
