
package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author anavalle
 */
public class InicioForm extends javax.swing.JFrame {


    public InicioForm() {
        init();
        
    }
    public void init(){
        initComponents();
        setResizable(false); //para no hacer la ventana mas pequeña o mas grande
        setLocationRelativeTo(null); //para que la ventana aparezca en el centro de la pantalla
        PanelBackground.requestFocus(); //para que el cursor ya no se encuentre en ningun label.
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelPlayer2 = new javax.swing.JTextField();
        LablePlayer1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        PanelBackground.setPreferredSize(new java.awt.Dimension(416, 315));
        PanelBackground.setLayout(null);

        jLabel1.setFont(new java.awt.Font("October Devanagari", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        PanelBackground.add(jLabel1);
        jLabel1.setBounds(0, 10, 430, 60);

        LabelPlayer2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        LabelPlayer2.setText("Player 2");
        LabelPlayer2.setBorder(null);
        LabelPlayer2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LabelPlayer2FocusGained(evt);
            }
        });
        LabelPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelPlayer2MouseExited(evt);
            }
        });
        LabelPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelPlayer2ActionPerformed(evt);
            }
        });
        PanelBackground.add(LabelPlayer2);
        LabelPlayer2.setBounds(150, 160, 110, 40);

        LablePlayer1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        LablePlayer1.setText("Player 1");
        LablePlayer1.setBorder(null);
        LablePlayer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LablePlayer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LablePlayer1FocusLost(evt);
            }
        });
        LablePlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LablePlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LablePlayer1MouseExited(evt);
            }
        });
        PanelBackground.add(LablePlayer1);
        LablePlayer1.setBounds(150, 100, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelPlayer2ActionPerformed

    private void LabelPlayer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelPlayer2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(255, 192, 203),2);
        LabelPlayer2.setBorder(borde);
    }//GEN-LAST:event_LabelPlayer2MouseEntered

    private void LablePlayer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LablePlayer1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(245, 245, 220),2);
        LablePlayer1.setBorder(borde);
    }//GEN-LAST:event_LablePlayer1MouseEntered

    private void LablePlayer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LablePlayer1MouseExited
        LablePlayer1.setBorder(null);
    }//GEN-LAST:event_LablePlayer1MouseExited

    private void LabelPlayer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelPlayer2MouseExited
        LabelPlayer2.setBorder(null);
    }//GEN-LAST:event_LabelPlayer2MouseExited

    private void LablePlayer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LablePlayer1FocusGained
        if(LablePlayer1.getText().equals("Player 1"))
            LablePlayer1.setText("");
    }//GEN-LAST:event_LablePlayer1FocusGained

    private void LabelPlayer2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LabelPlayer2FocusGained
        if(LabelPlayer2.getText().equals("Player 1"))
            LabelPlayer2.setText("");
    }//GEN-LAST:event_LabelPlayer2FocusGained

    private void LablePlayer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LablePlayer1FocusLost
        if(LablePlayer1)
    }//GEN-LAST:event_LablePlayer1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LabelPlayer2;
    private javax.swing.JTextField LablePlayer1;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
