/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import practica1_ejercicio2_p.Controlador;

/**
 *
 * @author 1GDAW07
 */
public class Vprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Vprincipal
     */
    public Vprincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MIalta = new javax.swing.JMenuItem();
        MIbaja = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MImodificar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MIinscripccion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MIsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Alta");

        MIalta.setText("Alta");
        MIalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIaltaActionPerformed(evt);
            }
        });
        jMenu1.add(MIalta);

        jMenuBar1.add(jMenu1);

        MIbaja.setText("Baja");

        jMenuItem1.setText("Baja");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MIbaja.add(jMenuItem1);

        jMenuBar1.add(MIbaja);

        jMenu3.setText("Modificar");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        MImodificar.setText("Modificar");
        jMenu3.add(MImodificar);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Inscripccion");

        MIinscripccion.setText("Inscripccion");
        MIinscripccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIinscripccionActionPerformed(evt);
            }
        });
        jMenu6.add(MIinscripccion);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Listado");

        jMenuItem2.setText("MIlistado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        MIsalir.setText("Salir");
        MIsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIsalirActionPerformed(evt);
            }
        });
        jMenu5.add(MIsalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIaltaActionPerformed
       Controlador.VAlta();
    }//GEN-LAST:event_MIaltaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Controlador.VBaja();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
      Controlador.VModificar();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void MIinscripccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIinscripccionActionPerformed
       Controlador.VInscripccion();
    }//GEN-LAST:event_MIinscripccionActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Controlador.Listado();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MIsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIsalirActionPerformed
        Controlador.Salir();
    }//GEN-LAST:event_MIsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIalta;
    private javax.swing.JMenu MIbaja;
    private javax.swing.JMenuItem MIinscripccion;
    private javax.swing.JMenuItem MImodificar;
    private javax.swing.JMenuItem MIsalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
