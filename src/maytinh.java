/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class maytinh extends javax.swing.JFrame {

    /**
     * Creates new form maytinh
     */
    String dau;
    double so,soo;
    public maytinh() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        can = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        du = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        phan = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        congtru = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        cotg = new javax.swing.JButton();
        bang = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();

        jPanel1.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setLayout(new java.awt.GridLayout(5, 5, 5, 5));

        so1.setText("1");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel4.add(so1);

        so2.setText("2");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel4.add(so2);

        so3.setText("3");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        jPanel4.add(so3);

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel4.add(cong);

        can.setText("sqrt");
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        jPanel4.add(can);

        so4.setText("4");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        jPanel4.add(so4);

        so5.setText("5");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        jPanel4.add(so5);

        so6.setText("6");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        jPanel4.add(so6);

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel4.add(tru);

        du.setText("%");
        du.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duActionPerformed(evt);
            }
        });
        jPanel4.add(du);

        so7.setText("7");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        jPanel4.add(so7);

        so8.setText("8");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        jPanel4.add(so8);

        so9.setText("9");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        jPanel4.add(so9);

        nhan.setText("*");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel4.add(nhan);

        phan.setText("1/x");
        phan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phanActionPerformed(evt);
            }
        });
        jPanel4.add(phan);

        so0.setText("0");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        jPanel4.add(so0);

        congtru.setText("+/-");
        congtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congtru(evt);
            }
        });
        jPanel4.add(congtru);

        xoa.setText("C");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jPanel4.add(xoa);

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel4.add(chia);

        jButton3.setText("jButton3");
        jPanel4.add(jButton3);

        sin.setText("Sin");
        jPanel4.add(sin);

        cos.setText("Cos");
        jPanel4.add(cos);

        tan.setText("Tan");
        jPanel4.add(tan);

        cotg.setText("Cotg");
        jPanel4.add(cotg);

        bang.setText("=");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        jPanel4.add(bang);

        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so1ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
       String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
       String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so9ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
       String cmd  = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+ cmd);
    }//GEN-LAST:event_so0ActionPerformed

    private void congtru(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congtru
        try {
            double value = Double.parseDouble(txtResult.getText());
            value = - value;
            txtResult.setText(" " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_congtru

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        try {
               this.so = Double.parseDouble(txtResult.getText());
                this.dau = evt.getActionCommand();
                txtResult.setText("");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_nhanActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        this.soo = Double.parseDouble(txtResult.getText());
        if("+".equals(this.dau)){
            txtResult.setText(Double.toString(this.so + this.soo));
        }
        if("-".equals(this.dau)){
            txtResult.setText(Double.toString(this.so - this.soo));
        }
        if("*".equals(this.dau)){
            txtResult.setText(Double.toString(this.so * this.soo));
        }
        if("/".equals(this.dau)){
            txtResult.setText(Double.toString(this.so / this.soo));
        }
        if("%".equals(this.dau)){
            txtResult.setText(Double.toString(this.so % this.soo));
        }
        if("sqrt".equals(this.dau)){
            txtResult.setText(Double.toString(Math.sqrt(this.soo)));
        }
        if("1/x".equals(this.dau)){
            txtResult.setText(Double.toString(1/ this.soo));
        }
    }//GEN-LAST:event_bangActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        txtResult.setText("");
    }//GEN-LAST:event_xoaActionPerformed

    private void duActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duActionPerformed
        try {
               this.so = Double.parseDouble(txtResult.getText());
                this.dau = evt.getActionCommand();
                txtResult.setText("");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_duActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        this.dau = evt.getActionCommand();
    }//GEN-LAST:event_canActionPerformed

    private void phanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phanActionPerformed
        this.dau = evt.getActionCommand();
    }//GEN-LAST:event_phanActionPerformed

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
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maytinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.JButton can;
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JButton congtru;
    private javax.swing.JButton cos;
    private javax.swing.JButton cotg;
    private javax.swing.JButton du;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nhan;
    private javax.swing.JButton phan;
    private javax.swing.JButton sin;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton tan;
    private javax.swing.JButton tru;
    private javax.swing.JTextField txtResult;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}