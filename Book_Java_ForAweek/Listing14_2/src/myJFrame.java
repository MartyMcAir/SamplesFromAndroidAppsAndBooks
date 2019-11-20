import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class myJFrame extends javax.swing.JFrame {
    // ���������� ���� ������ 
    private final SimpleAttributeSet mySet;

    public myJFrame() {
        // ����������� ������ �� ������ ��������� ������
        this.mySet = new SimpleAttributeSet();
        initComponents();
        setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        myPane = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        boldButton = new javax.swing.JButton();
        italicButton = new javax.swing.JButton();
        underlineButton = new javax.swing.JButton();
        plainButton = new javax.swing.JButton();
        separatorButton = new javax.swing.JButton();
        checkboxButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(myPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        boldButton.setText("Bold");
        boldButton.setFocusable(false);
        boldButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boldButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(boldButton);

        italicButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        italicButton.setText("Italic");
        italicButton.setFocusable(false);
        italicButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        italicButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        italicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(italicButton);

        underlineButton.setText("Underline");
        underlineButton.setFocusable(false);
        underlineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        underlineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        underlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(underlineButton);

        plainButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        plainButton.setText("Plain");
        plainButton.setFocusable(false);
        plainButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plainButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        plainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(plainButton);

        separatorButton.setText("Separator");
        separatorButton.setFocusable(false);
        separatorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separatorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        separatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separatorButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(separatorButton);

        checkboxButton.setText("Checkbox");
        checkboxButton.setFocusable(false);
        checkboxButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkboxButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        checkboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(checkboxButton);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldButtonActionPerformed
        StyleConstants.setBold(mySet, true);
        myPane.setCharacterAttributes(mySet, rootPaneCheckingEnabled);
        myPane.requestFocus();
        System.out.println(mySet.toString());
    }//GEN-LAST:event_boldButtonActionPerformed

    private void italicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicButtonActionPerformed
        StyleConstants.setItalic(mySet, true);
        myPane.setCharacterAttributes(mySet, rootPaneCheckingEnabled);
        myPane.requestFocus();
    }//GEN-LAST:event_italicButtonActionPerformed

    private void underlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineButtonActionPerformed
        StyleConstants.setUnderline(mySet, true);
        myPane.setCharacterAttributes(mySet, rootPaneCheckingEnabled);
        myPane.requestFocus();
    }//GEN-LAST:event_underlineButtonActionPerformed

    private void plainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainButtonActionPerformed
        StyleConstants.setBold(mySet, false);
        StyleConstants.setItalic(mySet, false);
        StyleConstants.setUnderline(mySet, false);
        myPane.setCharacterAttributes(mySet, rootPaneCheckingEnabled);
        myPane.requestFocus();
    }//GEN-LAST:event_plainButtonActionPerformed

    private void separatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separatorButtonActionPerformed
        myPane.insertComponent(new javax.swing.JSeparator());
        myPane.requestFocus();
    }//GEN-LAST:event_separatorButtonActionPerformed

    private void checkboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxButtonActionPerformed
        myPane.insertComponent(new javax.swing.JCheckBox());
        myPane.requestFocus();
    }//GEN-LAST:event_checkboxButtonActionPerformed

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
            java.util.logging.Logger.getLogger(myJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boldButton;
    private javax.swing.JButton checkboxButton;
    private javax.swing.JButton italicButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextPane myPane;
    private javax.swing.JButton plainButton;
    private javax.swing.JButton separatorButton;
    private javax.swing.JButton underlineButton;
    // End of variables declaration//GEN-END:variables
}
