package framesHabitacions;

import classesPrincipals.EstructuraDades;
import classesPrincipals.Habitacio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * JFrame de Modificació d'Habitacions
 * @author Evaldas Casas
 * @version v0.1
 */

public class JFrameModHabitacio extends javax.swing.JFrame {
    
    /**
     * Creates new form ModHabitacio
     */
    public JFrameModHabitacio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /* Carrega els ComboBox amb totes les dades */
    public void carregarInterficie() {
        String[] numHabitacions = new String[EstructuraDades.arrayHabitacio.size()];
        
        for (int i = 0; i < EstructuraDades.arrayHabitacio.size(); i++) {
            numHabitacions[i] = EstructuraDades.arrayHabitacio.get(i).getNumHabitacio();
        }
        
        DefaultComboBoxModel box = new DefaultComboBoxModel(numHabitacions);
        jComboBox1.setModel(box);
        
        if (jComboBox1.getSelectedItem() == null) {
        }
        else {
            jTextField1.setText(EstructuraDades.arrayHabitacio.get(0).getNumHabitacio());
            jTextField2.setText(EstructuraDades.arrayHabitacio.get(0).getTipusHabitacio());
            jTextField3.setText(String.valueOf(EstructuraDades.arrayHabitacio.get(0).getNumLlits()));
            jTextField4.setText(EstructuraDades.arrayHabitacio.get(0).getTipusLlits());
            jTextField5.setText(EstructuraDades.arrayHabitacio.get(0).getEstatHabitacio());
            
            jComboBox3.setSelectedItem(EstructuraDades.arrayHabitacio.get(0).getTipusHabitacio());
            jComboBox4.setSelectedItem(String.valueOf(EstructuraDades.arrayHabitacio.get(0).getNumLlits()));
            jComboBox5.setSelectedItem(EstructuraDades.arrayHabitacio.get(0).getTipusLlits());
            jComboBox6.setSelectedItem(EstructuraDades.arrayHabitacio.get(0).getEstatHabitacio());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAcceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar habitació");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Modificar habitació");

        btnAcceptar.setText("Acceptar");
        btnAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancel·lar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciona el número d'habitació a modificar");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Número habitació:");

        jLabel4.setText("Tipus habitació:");

        jLabel5.setText("Nº llits:");

        jLabel6.setText("Tipus llits:");

        jLabel7.setText("Estat:");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble" }));
        jComboBox3.setSelectedIndex(-1);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox4.setSelectedIndex(-1);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Doble" }));
        jComboBox5.setSelectedIndex(-1);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "No activa" }));
        jComboBox6.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(124, 124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptar)
                    .addComponent(btnCancelar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameGestioHabitacions gestioHabitacions = new JFrameGestioHabitacions();
        gestioHabitacions.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /* Quan el valor del ComboBox1 canvia es recarreguen les dades amb les que té l'habitació que s'ha triat */
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String numHabitacio = String.valueOf(jComboBox1.getSelectedItem());
        boolean shaTrobat = false;
        
        for(int i = 0; i < EstructuraDades.arrayHabitacio.size() && shaTrobat == false; i++) {
            if (numHabitacio.equals(EstructuraDades.arrayHabitacio.get(i).getNumHabitacio())) {
                shaTrobat = true;
                jTextField1.setText(EstructuraDades.arrayHabitacio.get(i).getNumHabitacio());
                jTextField2.setText(EstructuraDades.arrayHabitacio.get(i).getTipusHabitacio());
                jTextField3.setText(String.valueOf(EstructuraDades.arrayHabitacio.get(i).getNumLlits()));
                jTextField4.setText(EstructuraDades.arrayHabitacio.get(i).getTipusLlits());
                jTextField5.setText(EstructuraDades.arrayHabitacio.get(i).getEstatHabitacio());
                
                jComboBox3.setSelectedItem(EstructuraDades.arrayHabitacio.get(i).getTipusHabitacio());
                jComboBox4.setSelectedItem(String.valueOf(EstructuraDades.arrayHabitacio.get(i).getNumLlits()));
                jComboBox5.setSelectedItem(EstructuraDades.arrayHabitacio.get(i).getTipusLlits());
                jComboBox6.setSelectedItem(EstructuraDades.arrayHabitacio.get(i).getEstatHabitacio());
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /* Es comprova si algun dels valors dels ComboBox de les dades han canviat respecte als que hi ha al array,
    * Si han canviat, s'actualitzen totes les dades en l'array de Habitacions
    * Es recarrega la interfície per actualitzar les dades en pantalla
    */
    private void btnAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarActionPerformed
        // TODO add your handling code here:
        String numHabitacio = String.valueOf(jComboBox1.getSelectedItem());
        boolean shaTrobat = false;
        
        for(int i = 0; i < EstructuraDades.arrayHabitacio.size() && shaTrobat == false; i++) {
            if (numHabitacio.equals(EstructuraDades.arrayHabitacio.get(i).getNumHabitacio())) {
                shaTrobat = true;
                if ( !(jComboBox3.getSelectedItem()).equals(EstructuraDades.arrayHabitacio.get(i).getTipusHabitacio()) || 
                        !(jComboBox4.getSelectedItem()).equals(String.valueOf(EstructuraDades.arrayHabitacio.get(i).getNumLlits())) || 
                            !(jComboBox5.getSelectedItem()).equals(EstructuraDades.arrayHabitacio.get(i).getTipusLlits()) || 
                                !(jComboBox6.getSelectedItem()).equals(EstructuraDades.arrayHabitacio.get(i).getEstatHabitacio()) ) {
                
                    EstructuraDades.arrayHabitacio.get(i).setTipusHabitacio(String.valueOf(jComboBox3.getSelectedItem()));
                    EstructuraDades.arrayHabitacio.get(i).setNumLlits(Integer.parseInt(jComboBox4.getSelectedItem().toString()));
                    EstructuraDades.arrayHabitacio.get(i).setTipusLlits(String.valueOf(jComboBox5.getSelectedItem()));
                    EstructuraDades.arrayHabitacio.get(i).setEstatHabitacio(String.valueOf(jComboBox6.getSelectedItem()));
                    JOptionPane.showMessageDialog(null, "S'ha modificat el registre correctament!");
                    carregarInterficie();
                }
            }
        }
    }//GEN-LAST:event_btnAcceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameModHabitacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameModHabitacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameModHabitacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameModHabitacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameModHabitacio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}