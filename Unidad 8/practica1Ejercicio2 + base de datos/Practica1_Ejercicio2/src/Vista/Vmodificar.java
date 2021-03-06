/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW07
 */
public class Vmodificar extends javax.swing.JDialog {
private String nombre;
private String lugar;
private String fecha;
private String horaI;
private String horaF;
private String aforo;
private String n;
    /**
     * Creates new form Vmodificar
     */
    public Vmodificar(java.awt.Frame parent, boolean modal)  {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Baceptar.setVisible(false);
        try{
        Controlador.Eventos(CBeventos);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        CBeventos = new javax.swing.JComboBox<>();
        Baceptar = new javax.swing.JButton();
        Pdatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        FTFfecha = new javax.swing.JFormattedTextField();
        TFlugar = new javax.swing.JTextField();
        FTFhoraInicio = new javax.swing.JFormattedTextField();
        FTFhoraFin = new javax.swing.JFormattedTextField();
        TFaforo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Modifciar");

        jLabel2.setText("¿Qué evento quieres modificar?");

        CBeventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        CBeventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBeventosActionPerformed(evt);
            }
        });

        Baceptar.setText("Aceptar");
        Baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaceptarActionPerformed(evt);
            }
        });

        Pdatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Nombre");

        jLabel4.setText("Lugar");

        jLabel5.setText("Fecha");

        jLabel6.setText("Hora Inicio");

        jLabel7.setText("Hora Fin");

        jLabel8.setText("Aforo");

        TFnombre.setEditable(false);

        FTFfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFfechaActionPerformed(evt);
            }
        });

        TFlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFlugarActionPerformed(evt);
            }
        });

        FTFhoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFhoraInicioActionPerformed(evt);
            }
        });

        FTFhoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFhoraFinActionPerformed(evt);
            }
        });

        TFaforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFaforoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PdatosLayout = new javax.swing.GroupLayout(Pdatos);
        Pdatos.setLayout(PdatosLayout);
        PdatosLayout.setHorizontalGroup(
            PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PdatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PdatosLayout.createSequentialGroup()
                        .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGap(35, 35, 35)
                        .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFnombre)
                            .addComponent(FTFfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFlugar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(PdatosLayout.createSequentialGroup()
                        .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FTFhoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TFaforo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(FTFhoraFin, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        PdatosLayout.setVerticalGroup(
            PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PdatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFlugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FTFfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FTFhoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FTFhoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFaforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pdatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(CBeventos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(Baceptar)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBeventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Pdatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Baceptar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBeventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBeventosActionPerformed
       n="vm";
        if(CBeventos.getSelectedItem().equals("--Seleccionar--")){
            System.out.println("Evento no seleccionado");
            Controlador.Volver(n);
            
        }
        else{
            String n=CBeventos.getSelectedItem().toString();
            ArrayList <String> datos=new ArrayList();
            datos=Controlador.Consultar(n);
            nombre=datos.get(0);
            lugar=datos.get(1);
            fecha=datos.get(2);
            horaI=datos.get(3);
            horaF=datos.get(4);
            aforo=datos.get(5);
        }
        TFnombre.setText(nombre);
        TFlugar.setText(lugar);
        FTFfecha.setText(fecha);
        FTFhoraInicio.setText(horaI);
        FTFhoraFin.setText(horaF);
        TFaforo.setText(aforo);
        
        
        
    }//GEN-LAST:event_CBeventosActionPerformed

    private void TFlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFlugarActionPerformed
        if(!TFlugar.getText().equals(lugar)){
            lugar=TFlugar.getText();  
        }
        FTFfecha.requestFocus();
    }//GEN-LAST:event_TFlugarActionPerformed

    private void FTFfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFfechaActionPerformed
        if(!FTFfecha.getText().equals(fecha)){
            fecha=FTFfecha.getText();
        }
        FTFhoraInicio.requestFocus();
    }//GEN-LAST:event_FTFfechaActionPerformed

    private void FTFhoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFhoraInicioActionPerformed
        if(!FTFhoraInicio.getText().equals(horaI)){
            horaI=FTFhoraInicio.getText();
        }
        FTFhoraFin.requestFocus();
    }//GEN-LAST:event_FTFhoraInicioActionPerformed

    private void FTFhoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFhoraFinActionPerformed
       if(!FTFhoraFin.getText().equals(horaF)){
            horaF=FTFhoraFin.getText();
        }
       TFaforo.requestFocus();
    }//GEN-LAST:event_FTFhoraFinActionPerformed

    private void TFaforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFaforoActionPerformed
        if(!TFaforo.getText().equals(aforo)){
            aforo=TFaforo.getText();
        }
        Baceptar.setVisible(true);
    }//GEN-LAST:event_TFaforoActionPerformed

    private void BaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaceptarActionPerformed
      boolean mod=false;
        mod=Controlador.Update(nombre,lugar,fecha,horaI, horaF, aforo);
      if(mod==true){
          JOptionPane.showMessageDialog(this,"Evento modificado Correctamente");
      }
      Controlador.Volver(n);
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
            java.util.logging.Logger.getLogger(Vmodificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vmodificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vmodificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vmodificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vmodificar dialog = new Vmodificar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CBeventos;
    private javax.swing.JFormattedTextField FTFfecha;
    private javax.swing.JFormattedTextField FTFhoraFin;
    private javax.swing.JFormattedTextField FTFhoraInicio;
    private javax.swing.JPanel Pdatos;
    private javax.swing.JTextField TFaforo;
    private javax.swing.JTextField TFlugar;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
