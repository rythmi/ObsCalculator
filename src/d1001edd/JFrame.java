package d1001edd;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEDD3 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        txtlrmpDD = new javax.swing.JTextField();
        lblEDDdd = new javax.swing.JLabel();
        lblPOA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtlrmpyyyy = new javax.swing.JTextField();
        txtlrmpmm = new javax.swing.JTextField();
        lblWeeks = new javax.swing.JLabel();
        lblEDDmm = new javax.swing.JLabel();
        lblEDDyyyy = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        lblEDD3.setText("EDD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lbl2.setText("POA");

        lb3.setText("EDD");

        lbl1.setText("LRMP");

        lblEDDdd.setText("DD");

        lblPOA.setText("POA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("EDD calculator");

        txtlrmpyyyy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlrmpyyyyActionPerformed(evt);
            }
        });

        lblWeeks.setText("weeks");

        lblEDDmm.setText("MM");

        lblEDDyyyy.setText("YYYY");

        lblDate.setText("jLabel2");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb3)
                    .addComponent(lbl1)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEDDdd)
                            .addComponent(lblPOA)
                            .addComponent(txtlrmpDD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWeeks)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtlrmpmm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnClear)
                                            .addComponent(txtlrmpyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblEDDmm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEDDyyyy)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtlrmpDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlrmpmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlrmpyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblPOA)
                    .addComponent(lblWeeks))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(lblEDDdd)
                    .addComponent(lblEDDyyyy)
                    .addComponent(lblEDDmm))
                .addGap(18, 18, 18)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        int dd;
        int mm;
        int yyyy;
        dd = Integer.parseInt(txtlrmpDD.getText());
        mm = Integer.parseInt(txtlrmpmm.getText()) - 1;
        try {
            yyyy = Integer.parseInt(txtlrmpyyyy.getText());
        } catch (Exception e) {
            System.out.println("e = "+e);
            JOptionPane.showMessageDialog(null, "Please enter year correctly");
            lblEDDyyyy.requestFocus();
            return;}

        Calendar c = Calendar.getInstance();
              
        c.set(Calendar.YEAR, yyyy);
        c.set(Calendar.MONTH, mm);
        c.set(Calendar.DATE, dd);
        
        
        Date lrmp = c.getTime();
        Date today = new Date();
        
        //To calculate EDD
        c.add(Calendar.DATE, 280);         
        lblEDDyyyy.setText(c.get(Calendar.YEAR) + "");
        //The +"" converts integer values to string so that it can be displayed in labels here
        lblEDDmm.setText(c.get(Calendar.MONTH) + 1 + "");
        lblEDDdd.setText(c.get(Calendar.DATE) + "");

        lblDate.setText(c.getTime().toString());

        //Instead of above method" lblEDDyyyy.setText(c.get(Calendar.YEAR)+"");" 
        //can use below alternative two steps
        //int eddyyyy;
        //eddyyyy=c.get(Calendar.YEAR);
        //lblEDDyyyy.setText(eddyyyy+"");    

        long poa = ((today.getTime()-lrmp.getTime())/(1000*60*60*24*7));
        lblPOA.setText(poa + "");

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtlrmpyyyyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlrmpyyyyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlrmpyyyyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lblEDDdd.setText("");
        lblEDDmm.setText("");
        lblEDDyyyy.setText("");
        lblPOA.setText("");
        lblDate.setText("");
        txtlrmpDD.setText("");
        txtlrmpmm.setText("");
        txtlrmpyyyy.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEDD3;
    private javax.swing.JLabel lblEDDdd;
    private javax.swing.JLabel lblEDDmm;
    private javax.swing.JLabel lblEDDyyyy;
    private javax.swing.JLabel lblPOA;
    private javax.swing.JLabel lblWeeks;
    private javax.swing.JTextField txtlrmpDD;
    private javax.swing.JTextField txtlrmpmm;
    private javax.swing.JTextField txtlrmpyyyy;
    // End of variables declaration//GEN-END:variables
}
