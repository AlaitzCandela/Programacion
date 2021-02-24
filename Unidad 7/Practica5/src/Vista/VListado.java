/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import practica5.Controlador;

/**
 *
 * @author Alaitzutzu
 */
public class VListado extends javax.swing.JDialog {
private int x=0; 
    /**
     * Creates new form VListado
     */
    public VListado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Controlador.TipoContrato(CBcontratos);
        Controlador.Departamento(CBdepartamento);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBopciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAlistado = new javax.swing.JTextArea();
        CBcontratos = new javax.swing.JComboBox<>();
        BAceptar = new javax.swing.JButton();
        CBdepartamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CBopciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------Selecciona----------", "--Por Numero de Empleado--", "--Por Contrato--", "--Por Departamento--" }));
        CBopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBopcionesActionPerformed(evt);
            }
        });

        TAlistado.setEditable(false);
        TAlistado.setColumns(20);
        TAlistado.setRows(5);
        jScrollPane1.setViewportView(TAlistado);

        CBcontratos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--" }));
        CBcontratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBcontratosActionPerformed(evt);
            }
        });

        BAceptar.setText("Aceptar");

        CBdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--" }));
        CBdepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBdepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(CBopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(CBdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBcontratos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BAceptar)
                .addGap(262, 262, 262))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBcontratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CBdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBopcionesActionPerformed
        int num=0;
        if(CBopciones.getItemAt(0).equals("Por Numero de Empleado")){
            num = Integer.parseInt(JOptionPane.showInputDialog(this,"Introduce el numero de empleado"));
            NumEmpleado(num);
        }
        else{
            if(CBopciones.getItemAt(0).equals("Por Contrato ")){
                Contrato();
            }
            else{
                if(CBopciones.getItemAt(0).equals("Por Departamento")){
                Departamento();
                }
            }
            
        }
      
    }//GEN-LAST:event_CBopcionesActionPerformed

    private void CBcontratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBcontratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBcontratosActionPerformed

    private void CBdepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBdepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBdepartamentoActionPerformed
    public void NumEmpleado(int n){
        ArrayList <Empleado> emple=new ArrayList();
        String opc=" ";
        emple=Controlador.Empleados();
        
        for(x=0;x<emple.size()&&n!=emple.get(x).getNumempleado();x++){}
        if(x!=emple.size()){
             opc="Nombre: " +emple.get(x).getNombre()+"\n"
                + "Apellido: "+emple.get(x).getApellidos()+"\n"
                + "DNI: "+emple.get(x).getDNI()+"\n"
                + "NSS: "+emple.get(x).getNSS()+"\n"
                + "Sexo: "+emple.get(x).getSexo()+"\n"
                    + "Estado: "+emple.get(x).getEstado()+"ªn"
                    + "Telefono: "+emple.get(x).getTelefono()+"\n"
                    + "Num empleado: "+emple.get(x).getNumempleado()+" \n"
                    + "Fecha Alta: "+emple.get(x).getFechaAlta();
        }
         
            
        TAlistado.setText(opc);
    }
    public void Contrato(){
        CBopciones.setVisible(false);
        CBcontratos.setVisible(true);
        ArrayList <Empleado> e=new ArrayList();
        String opc=" ",lista=" ";
        e=Controlador.TenDepartamento(Integer.parseInt(CBdepartamento.getItemAt(0)));
       for(int x=0;x<e.size();x++){
            opc="Nombre: " +e.get(x).getNombre()+"\n"
                + "Apellido: "+e.get(x).getApellidos()+"\n"
                + "DNI: "+e.get(x).getDNI()+"\n"
                + "NSS: "+e.get(x).getNSS()+"\n"
                + "Sexo: "+e.get(x).getSexo()+"\n"
                    + "Estado: "+e.get(x).getEstado()+"ªn"
                    + "Telefono: "+e.get(x).getTelefono()+"\n"
                    + "Num empleado: "+e.get(x).getNumempleado()+" \n"
                    + "Fecha Alta: "+e.get(x).getFechaAlta();
           lista+=opc;
       }
       TAlistado.setText(lista);
       
    }
    public void Departamento(){
        CBopciones.setVisible(false);
        CBdepartamento.setVisible(true);
        ArrayList <Empleado> d=new ArrayList();
        String opc=" ",lista=" ";
        d=Controlador.TenContrato(CBcontratos.getItemAt(0));
       for(int x=0;x<d.size();x++){
            opc="Nombre: " +d.get(x).getNombre()+"\n"
                + "Apellido: "+d.get(x).getApellidos()+"\n"
                + "DNI: "+d.get(x).getDNI()+"\n"
                + "NSS: "+d.get(x).getNSS()+"\n"
                + "Sexo: "+d.get(x).getSexo()+"\n"
                    + "Estado: "+d.get(x).getEstado()+"ªn"
                    + "Telefono: "+d.get(x).getTelefono()+"\n"
                    + "Num empleado: "+d.get(x).getNumempleado()+" \n"
                    + "Fecha Alta: "+d.get(x).getFechaAlta();
           lista+=opc;
       }
       TAlistado.setText(lista);
    }
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
            java.util.logging.Logger.getLogger(VListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VListado dialog = new VListado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BAceptar;
    private javax.swing.JComboBox<String> CBcontratos;
    private javax.swing.JComboBox<String> CBdepartamento;
    private javax.swing.JComboBox<String> CBopciones;
    private javax.swing.JTextArea TAlistado;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}