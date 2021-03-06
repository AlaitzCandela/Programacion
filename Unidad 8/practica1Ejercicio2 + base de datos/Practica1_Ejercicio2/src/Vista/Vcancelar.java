/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Excepciones.DatoNoValido;
import Excepciones.Llenar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW07
 */
public class Vcancelar extends javax.swing.JDialog {
private String nombre;
    /**
     * Creates new form Vcancelar
     */
    public Vcancelar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Baceptar.setVisible(false);
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
        TFnombre = new javax.swing.JTextField();
        Baceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cancelar Eventos");

        jLabel2.setText("Nombre");

        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        Baceptar.setText("Aceptar");
        Baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Baceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(Baceptar)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        try{
        if(TFnombre.getText().isEmpty())
            throw new Llenar("El campo nombre no puede estar vacio");
        else
            if(TFnombre.getText().length()<2)
                throw new DatoNoValido("El nombre tiene que tener más de dos cáracteres");
            else{
                Pattern patron=Pattern.compile("[A-Z][a-z]*");
                Matcher m=patron.matcher(TFnombre.getText());
                if(!m.matches())
                    throw new DatoNoValido("El nombre tiene que ser todo letras");
                else
                    nombre=TFnombre.getText();
                    Baceptar.setVisible(true);
                }    
            }
        catch(Llenar e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        catch(DatoNoValido e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getClass()+e.getMessage());
        }
    }//GEN-LAST:event_TFnombreActionPerformed

    private void BaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaceptarActionPerformed
        int n=0;
        String nom="vc";
        boolean borrar=true;
        n=JOptionPane.showConfirmDialog(this,"¿Estas Seguro que quieres cancelar el evento "+nombre+"?");
        if(n==0)
            borrar=Controlador.Borrar(nombre);
        else
            JOptionPane.showMessageDialog(this,"Operación cancelada");
        
        if(borrar==true){
            JOptionPane.showMessageDialog(this,"El evento "+nombre+"ha sido borrado correctamente");
            Controlador.Volver(nom);
        }
        else
            JOptionPane.showMessageDialog(this,"El evento "+nombre+"no ha sido borrado correctamente");
            Controlador.Volver(nom);
    }//GEN-LAST:event_BaceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Vcancelar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vcancelar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vcancelar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vcancelar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vcancelar dialog = new Vcancelar(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
