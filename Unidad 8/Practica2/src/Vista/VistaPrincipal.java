/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW07
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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
        MIaltaC = new javax.swing.JMenuItem();
        MIbajaC = new javax.swing.JMenuItem();
        MImodificarC = new javax.swing.JMenuItem();
        MIconsultaC = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MIaltaCaso = new javax.swing.JMenuItem();
        MIbaja = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MIsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cliente");

        MIaltaC.setText("Alta");
        MIaltaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIaltaCActionPerformed(evt);
            }
        });
        jMenu1.add(MIaltaC);

        MIbajaC.setText("Baja");
        MIbajaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIbajaCActionPerformed(evt);
            }
        });
        jMenu1.add(MIbajaC);

        MImodificarC.setText("Modificar");
        MImodificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MImodificarCActionPerformed(evt);
            }
        });
        jMenu1.add(MImodificarC);

        MIconsultaC.setText("Consulta");
        MIconsultaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIconsultaCActionPerformed(evt);
            }
        });
        jMenu1.add(MIconsultaC);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abogado");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Casos");

        MIaltaCaso.setText("Alta");
        MIaltaCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIaltaCasoActionPerformed(evt);
            }
        });
        jMenu3.add(MIaltaCaso);

        MIbaja.setText("Baja");
        MIbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIbajaActionPerformed(evt);
            }
        });
        jMenu3.add(MIbaja);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        MIsalir.setText("Salir");
        MIsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIsalirActionPerformed(evt);
            }
        });
        jMenu4.add(MIsalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIaltaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIaltaCActionPerformed
        Controlador.VentanaAltaCliente();
    }//GEN-LAST:event_MIaltaCActionPerformed

    private void MIbajaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIbajaCActionPerformed
        Controlador.VentanaBajaCliente();
    }//GEN-LAST:event_MIbajaCActionPerformed

    private void MImodificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MImodificarCActionPerformed
        String dni=JOptionPane.showInputDialog(this,"Introduce el dni del cliente, si no se acuerda que clientes tiene, introduce 'obtener datos'");
        String c="";
        if(dni.equals("obtener datos")){
            c=Controlador.Consulta();
            JOptionPane.showMessageDialog(this,c+"\n");
        }
        else
            Controlador.VentanaModificacionCliente(dni);
    }//GEN-LAST:event_MImodificarCActionPerformed

    private void MIconsultaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIconsultaCActionPerformed
        Controlador.VentanaOpciones();
    }//GEN-LAST:event_MIconsultaCActionPerformed

    private void MIsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIsalirActionPerformed
       Controlador.Salir();
    }//GEN-LAST:event_MIsalirActionPerformed

    private void MIaltaCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIaltaCasoActionPerformed
       Controlador.VentanaAltaCaso();
    }//GEN-LAST:event_MIaltaCasoActionPerformed

    private void MIbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIbajaActionPerformed
        Controlador.VentanaBajaCaso();
    }//GEN-LAST:event_MIbajaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIaltaC;
    private javax.swing.JMenuItem MIaltaCaso;
    private javax.swing.JMenuItem MIbaja;
    private javax.swing.JMenuItem MIbajaC;
    private javax.swing.JMenuItem MIconsultaC;
    private javax.swing.JMenuItem MImodificarC;
    private javax.swing.JMenuItem MIsalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}