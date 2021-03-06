package framesHabitacions;

import Moduls.ModulHabitacio;
import classesPrincipals.EstructuraDades;
import classesPrincipals.Habitacio;
import java.util.Iterator;
import javax.swing.JOptionPane;
import gestio_hotel.PrincipalHotel;
/**
 * JFrame de Gestio Habitacions, és la finestra principal de l'aplicatiu
 * @author Evaldas Casas
 * @version v0.1
 */

public class JFrameGestioHabitacions extends javax.swing.JFrame {

    /**
     * Creates new form GestioHabitacions
     */
    public JFrameGestioHabitacions() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnLlistar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSortir = new javax.swing.JButton();
        btnCercar = new javax.swing.JButton();
        btnGenerarInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestió habitacions");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("Gestió d'habitacions");

        jLabel2.setText("Què vols fer?");

        btnCrear.setText("Donar d'alta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLlistar.setText("Llistar");
        btnLlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlistarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Donar de baixa");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSortir.setText("Sortir");
        btnSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirActionPerformed(evt);
            }
        });

        btnCercar.setText("Cercar");
        btnCercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercarActionPerformed(evt);
            }
        });

        btnGenerarInforme.setText("Generar llistat d'habitacions");
        btnGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSortir)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLlistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCercar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLlistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCercar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarInforme)
                .addGap(32, 32, 32)
                .addComponent(btnSortir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botó ALTA -> mostra la finestra de Alta Habitació
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameAltaHabitacio altaHabitacio = new JFrameAltaHabitacio();
        altaHabitacio.setVisible(true);
    }//GEN-LAST:event_btnCrearActionPerformed

    // Botó BAIXA -> mostra la finestra de Baixa Habitació
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameBaixaHabitacio baixaHabitacio = new JFrameBaixaHabitacio();
        baixaHabitacio.setVisible(true);
        
        /* Comprovar si el array no esta buit i si ho està mostrar finestra d'error i tornar a la finestra inicial */
        if(EstructuraDades.arrayHabitacio.isEmpty()) {
            int resultat = JOptionPane.showOptionDialog(null, "No hi ha registres creats!", "Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
            if (resultat == 0) {
                baixaHabitacio.setVisible(false);
                JFrameGestioHabitacions gestioHabitacions = new JFrameGestioHabitacions();
                gestioHabitacions.setVisible(true);
            }
        }
        else {
            /* Omplir els ComboBox amb dades */
            baixaHabitacio.carregarInterficie();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Botó LLISTAR -> mostra la finestra de Llistar Habitacions
    private void btnLlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlistarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameLlistarHabitacio llistarHab = new JFrameLlistarHabitacio();
        llistarHab.setVisible(true);
        
        //ModulHabitacio.llistarHabitacio(Habitacio.arrayHabitacio);

        /* Comprovar si el array no esta buit i si ho està mostrar finestra d'error i tornar a la finestra inicial */
        if(EstructuraDades.arrayHabitacio.isEmpty()) {
            int resultat = JOptionPane.showOptionDialog(null, "No hi ha registres creats!", "Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
            if (resultat == 0) {
                llistarHab.setVisible(false);
                JFrameGestioHabitacions gestioHabitacions = new JFrameGestioHabitacions();
                gestioHabitacions.setVisible(true);
            }
        }
        else {
            llistarHab.carregarInterficie();
            Iterator<Habitacio> habIterator = EstructuraDades.arrayHabitacio.iterator();
            while (habIterator.hasNext()) {
                Habitacio hab = habIterator.next();
                //System.out.println(habitacio);
                llistarHab.mostrarDades(hab);
            }
        }
    }//GEN-LAST:event_btnLlistarActionPerformed

    // Botó MODIFICAR -> mostra la finestra de Modificar Habitació
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameModHabitacio modHabitacio = new JFrameModHabitacio();
        modHabitacio.setVisible(true);
        
        /* Comprovar si el array no esta buit i si ho està mostrar finestra d'error i tornar a la finestra inicial */
        if(EstructuraDades.arrayHabitacio.isEmpty()) {
            int resultat = JOptionPane.showOptionDialog(null, "No hi ha registres creats!", "Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
            if (resultat == 0) {
                modHabitacio.setVisible(false);
                JFrameGestioHabitacions gestioHabitacions = new JFrameGestioHabitacions();
                gestioHabitacions.setVisible(true);
            }
        }
        else {
            modHabitacio.carregarInterficie();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // Botó SORTIR -> tanca l'aplicatiu
    private void btnSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirActionPerformed
        PrincipalHotel menu = new PrincipalHotel();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSortirActionPerformed

    // Botó CERCAR -> mostra la finestra de Cercar Habitació
    private void btnCercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        JFrameCercarHabitacio cercaHab = new JFrameCercarHabitacio();
        cercaHab.setVisible(true);
        
        /* Comprovar si el array no esta buit i si ho està mostrar finestra d'error i tornar a la finestra inicial */
        if(EstructuraDades.arrayHabitacio.isEmpty()) {
            int resultat = JOptionPane.showOptionDialog(null, "No hi ha registres creats!", "Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
            if (resultat == 0) {
                cercaHab.setVisible(false);
                JFrameGestioHabitacions gestioHabitacions = new JFrameGestioHabitacions();
                gestioHabitacions.setVisible(true);
            }
        }
        else {
            cercaHab.carregarInterficie();
            for (int i = 0; i < EstructuraDades.arrayHabitacio.size(); i++) {
                Habitacio hab = EstructuraDades.arrayHabitacio.get(i);
                cercaHab.mostrarDades(hab);
            }
        }
    }//GEN-LAST:event_btnCercarActionPerformed

    private void btnGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformeActionPerformed
        // TODO add your handling code here:
        if(EstructuraDades.arrayHabitacio.isEmpty()) {
            JOptionPane.showOptionDialog(null, "No hi ha registres creats!", "Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
        }
        else {
            ModulHabitacio.guardarInforme();
            JOptionPane.showOptionDialog(null, "S'ha generat el informe correctament!", "Informació", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    }//GEN-LAST:event_btnGenerarInformeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGestioHabitacions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioHabitacions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioHabitacions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestioHabitacions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestioHabitacions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarInforme;
    private javax.swing.JButton btnLlistar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSortir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
