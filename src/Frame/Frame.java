package Frame;

import Data.BarcodeGenerator;
import Data.Helper;
import java.io.IOException;

/**
 *
 * @author Alejandro, Molano, Manuel
 * @version Pro
 * @since 20/04/2019
 */
public class Frame extends javax.swing.JFrame {

    BarcodeGenerator bg = new BarcodeGenerator();

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("EAN13 & ISBN13 Codes Generator");
        this.setIconImage(new Helper().setFavicon());
        bg.playMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        code = new javax.swing.JTextField();
        generateCode = new javax.swing.JButton();
        searchCode = new javax.swing.JButton();
        seeCode = new javax.swing.JLabel();
        Indication = new javax.swing.JLabel();
        Indication2 = new javax.swing.JLabel();
        information = new javax.swing.JButton();
        chooseEAN13 = new javax.swing.JRadioButton();
        chooseISBN13 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
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
        generateCode.setFocusable(false);
        generateCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCodeActionPerformed(evt);
            }
        });
        background.add(generateCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        searchCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchCode.setBorder(null);
        searchCode.setContentAreaFilled(false);
        searchCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCode.setFocusable(false);
        searchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCodeActionPerformed(evt);
            }
        });
        background.add(searchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        seeCode.setBackground(new java.awt.Color(255, 255, 255));
        seeCode.setFont(new java.awt.Font("EAN-13", 1, 12)); // NOI18N
        seeCode.setForeground(new java.awt.Color(255, 255, 255));
        background.add(seeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 280, 160));

        Indication.setBackground(new java.awt.Color(0, 0, 0));
        Indication.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Indication.setForeground(new java.awt.Color(0, 0, 0));
        Indication.setText("Código:");
        Indication.setFocusable(false);
        background.add(Indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Indication2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Indication2.setForeground(new java.awt.Color(0, 0, 0));
        Indication2.setText("Generar código");
        background.add(Indication2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Status-dialog-information-icon.png"))); // NOI18N
        information.setBorder(null);
        information.setBorderPainted(false);
        information.setContentAreaFilled(false);
        information.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        information.setFocusable(false);
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });
        background.add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        chooseEAN13.setBackground(new java.awt.Color(191, 218, 239));
        chooseEAN13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chooseEAN13.setForeground(new java.awt.Color(0, 0, 0));
        chooseEAN13.setSelected(true);
        chooseEAN13.setText("EAN13");
        chooseEAN13.setBorder(null);
        chooseEAN13.setContentAreaFilled(false);
        chooseEAN13.setFocusable(false);
        chooseEAN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseEAN13ActionPerformed(evt);
            }
        });
        background.add(chooseEAN13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        chooseISBN13.setBackground(new java.awt.Color(191, 218, 239));
        chooseISBN13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chooseISBN13.setForeground(new java.awt.Color(0, 0, 0));
        chooseISBN13.setText("ISBN13");
        chooseISBN13.setToolTipText("");
        chooseISBN13.setBorder(null);
        chooseISBN13.setContentAreaFilled(false);
        chooseISBN13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chooseISBN13.setFocusable(false);
        chooseISBN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseISBN13ActionPerformed(evt);
            }
        });
        background.add(chooseISBN13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar código");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        foreGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RBackGround.jpg"))); // NOI18N
        foreGround.setText("jLabel1");
        background.add(foreGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 390));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCodeActionPerformed

        if (chooseISBN13.isSelected()) {
            if (Helper.checkCodeISBN13(code.getText())) {
                seeCode.setIcon(bg.visualizeISBN13(code.getText()));
            }
        } else if (chooseEAN13.isSelected()) {
            if (Helper.checkCodeEAN13(code.getText())) {
                seeCode.setIcon(bg.visualizeEAN13(code.getText()));
            }
        }

    }//GEN-LAST:event_generateCodeActionPerformed

    private void informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationActionPerformed

        Helper.instructions();

    }//GEN-LAST:event_informationActionPerformed

    private void codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyTyped

        if (Helper.onlyNumber(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_codeKeyTyped

    private void chooseEAN13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseEAN13ActionPerformed

        chooseISBN13.setSelected(false);

    }//GEN-LAST:event_chooseEAN13ActionPerformed

    private void chooseISBN13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseISBN13ActionPerformed

        chooseEAN13.setSelected(false);

    }//GEN-LAST:event_chooseISBN13ActionPerformed

    private void searchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCodeActionPerformed

        String search = code.getText().replace(" ", "");
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.barcodelookup.com/" + search));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_searchCodeActionPerformed

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
    private javax.swing.JRadioButton chooseEAN13;
    private javax.swing.JRadioButton chooseISBN13;
    private javax.swing.JTextField code;
    private javax.swing.JLabel foreGround;
    private javax.swing.JButton generateCode;
    private javax.swing.JButton information;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchCode;
    private javax.swing.JLabel seeCode;
    // End of variables declaration//GEN-END:variables
}
