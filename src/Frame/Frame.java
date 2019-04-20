package Frame;

import Data.BarcodeGenerator;
import Data.Helper;

/**
 *
 * @author Alejandro
 */
public class Frame extends javax.swing.JFrame {

    BarcodeGenerator bg = new BarcodeGenerator();

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("EAN13 Codes Generator");
        bg.playMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        code = new javax.swing.JTextField();
        generateCode = new javax.swing.JButton();
        seeCode = new javax.swing.JLabel();
        Indication = new javax.swing.JLabel();
        Indication2 = new javax.swing.JLabel();
        information = new javax.swing.JButton();
        foreGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        code.setBackground(new java.awt.Color(255, 255, 255));
        code.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        code.setForeground(new java.awt.Color(0, 0, 0));
        code.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeKeyTyped(evt);
            }
        });
        background.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 210, -1));

        generateCode.setBackground(new java.awt.Color(255, 255, 255));
        generateCode.setForeground(new java.awt.Color(0, 0, 0));
        generateCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Barcode.png"))); // NOI18N
        generateCode.setBorder(null);
        generateCode.setBorderPainted(false);
        generateCode.setContentAreaFilled(false);
        generateCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCodeActionPerformed(evt);
            }
        });
        background.add(generateCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        seeCode.setBackground(new java.awt.Color(255, 255, 255));
        seeCode.setFont(new java.awt.Font("EAN-13", 1, 12)); // NOI18N
        seeCode.setForeground(new java.awt.Color(255, 255, 255));
        background.add(seeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 280, 160));

        Indication.setBackground(new java.awt.Color(0, 0, 0));
        Indication.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Indication.setForeground(new java.awt.Color(0, 0, 0));
        Indication.setText("Código:");
        background.add(Indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Indication2.setText("Generar código");
        background.add(Indication2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Status-dialog-information-icon.png"))); // NOI18N
        information.setBorder(null);
        information.setBorderPainted(false);
        information.setContentAreaFilled(false);
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });
        background.add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        foreGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RBackGround.jpg"))); // NOI18N
        foreGround.setText("jLabel1");
        background.add(foreGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 390));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCodeActionPerformed

        if (Helper.checkCode(code.getText())) {
            seeCode.setIcon(bg.visualize(code.getText()));
        }

    }//GEN-LAST:event_generateCodeActionPerformed

    private void informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationActionPerformed

        Helper.instructions();

    }//GEN-LAST:event_informationActionPerformed

    private void codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyTyped

        if(Helper.onlyNumber(evt.getKeyChar())){
         evt.consume();
        }
        
    }//GEN-LAST:event_codeKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Indication;
    private javax.swing.JLabel Indication2;
    private javax.swing.JPanel background;
    private javax.swing.JTextField code;
    private javax.swing.JLabel foreGround;
    private javax.swing.JButton generateCode;
    private javax.swing.JButton information;
    private javax.swing.JLabel seeCode;
    // End of variables declaration//GEN-END:variables
}
