/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;
import practica1_ejercicio2_p.Controlador;

/**
 *
 * @author 1GDAW07
 */
public class Vlistado extends javax.swing.JDialog {
 private List <String> listaEventos=new ArrayList();
    private List <String> personas=new ArrayList();
    private ArrayList <JRadioButton> rb=new ArrayList();
    private String nombre;
    /**
     * Creates new form Vlistado
     */
    public Vlistado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        rb.add(RB1);
        rb.add(RB2);
        rb.add(RB3);
        rb.add(RB4);
        rb.add(RB5);
        rb.add(RB6);
        TAlistado.setVisible(false);
       listaEventos=Controlador.ListaEvento();
       int x=0;
       for(x=0;x<listaEventos.size();x++){
           rb.get(x).setText(listaEventos.get(x));
       }
       //he echo en diferentes for el insertar el nombre de los eventos en los radio buttons y el mirar si estan
       //vacios y si lo estan no mostrarlo para que pase por todos los radio buttons
       for(int y=0;y<rb.size();y++){
           if(rb.get(x).getText().isEmpty())
               rb.get(x).setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        RB5 = new javax.swing.JRadioButton();
        RB6 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAlistado = new javax.swing.JTextArea();
        Baceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Listado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eventos"));

        RB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB1ActionPerformed(evt);
            }
        });

        RB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB2ActionPerformed(evt);
            }
        });

        RB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB3ActionPerformed(evt);
            }
        });

        RB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB4ActionPerformed(evt);
            }
        });

        RB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB5ActionPerformed(evt);
            }
        });

        RB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB3)
                    .addComponent(RB2)
                    .addComponent(RB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB5)
                    .addComponent(RB4)
                    .addComponent(RB6))
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB3)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        TAlistado.setEditable(false);
        TAlistado.setColumns(20);
        TAlistado.setRows(5);
        jScrollPane1.setViewportView(TAlistado);

        Baceptar.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(Baceptar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Baceptar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB1ActionPerformed
       nombre=RB1.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(0));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB1ActionPerformed

    private void RB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB2ActionPerformed
         nombre=RB2.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(1));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB2ActionPerformed

    private void RB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB3ActionPerformed
         nombre=RB3.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(2));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB3ActionPerformed

    private void RB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB4ActionPerformed
        nombre=RB4.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(3));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB4ActionPerformed

    private void RB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB5ActionPerformed
         nombre=RB5.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(4));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB5ActionPerformed

    private void RB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB6ActionPerformed
         nombre=RB6.getText();
       personas=Controlador.GetPersonas(nombre);
       TAlistado.setText(personas.get(5));
       TAlistado.setVisible(true);
    }//GEN-LAST:event_RB6ActionPerformed

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
            java.util.logging.Logger.getLogger(Vlistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vlistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vlistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vlistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vlistado dialog = new Vlistado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baceptar;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JRadioButton RB5;
    private javax.swing.JRadioButton RB6;
    private javax.swing.JTextArea TAlistado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}