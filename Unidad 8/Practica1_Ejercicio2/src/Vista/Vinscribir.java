/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Excepciones.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW07
 */
public class Vinscribir extends javax.swing.JDialog {
private String nP;
private String apellido;
private String dni;
private String nE;
private String dirE;
private String nif;
private String nEv;
    /**
     * Creates new form Vinscribir
     */
    public Vinscribir(java.awt.Frame parent, boolean modal) {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnombreP = new javax.swing.JTextField();
        TFapellido = new javax.swing.JTextField();
        FTFdni = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFnombreE = new javax.swing.JTextField();
        TFdireccion = new javax.swing.JTextField();
        TFnif = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TFnombreEvento = new javax.swing.JTextField();
        Baceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Inscribir");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DNI");

        TFnombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombrePActionPerformed(evt);
            }
        });

        TFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoActionPerformed(evt);
            }
        });

        try {
            FTFdni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFdniActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Nombre Empresa");

        jLabel6.setText("Direccion Empresa");

        jLabel7.setText("NIF ");

        TFnombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreEActionPerformed(evt);
            }
        });

        TFdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdireccionActionPerformed(evt);
            }
        });

        TFnif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFnombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(TFnif, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFnombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Nombre Evento");

        TFnombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(TFnombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFnombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(Baceptar)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Baceptar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFnombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombrePActionPerformed
       try{
            if(TFnombreP.getText().isEmpty())
                throw new Llenar("El nombre tiene que aparecer obligatoriamente");
            else
                if(TFnombreP.getText().length()<2)
                    throw new DatoNoValido("El nombre tiene que tener más de dos carácteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z][a-z]*");
                    Matcher m=patron.matcher(TFnombreP.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El nombre tiene que ser todo letras");
                    else
                        nP=TFnombreP.getText();
                        TFapellido.requestFocus();
                    
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
    }//GEN-LAST:event_TFnombrePActionPerformed

    private void TFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoActionPerformed
        try{
            if(TFapellido.getText().isEmpty())
                throw new Llenar("El apellido tiene que aparecer obligatoriamente");
            else
                if(TFapellido.getText().length()<2)
                    throw new DatoNoValido("El apellido tiene que tener más de dos carácteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z][a-z]*");
                    Matcher m=patron.matcher(TFapellido.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El apellido tiene que ser todo letras");
                    else
                        apellido=TFapellido.getText();
                        FTFdni.requestFocus();
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
    }//GEN-LAST:event_TFapellidoActionPerformed

    private void FTFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFdniActionPerformed
        try{
            if(FTFdni.getText().isEmpty())
                throw new Llenar("El dni tiene que aparecer obligatoriamente");
            else
                if(FTFdni.getText().length()!=9)
                    throw new DatoNoValido("El dni tiene que tener 9 caracteres");
                else{
                    Pattern patron =Pattern.compile("[0-9]{8}[A-Z]");
                    Matcher m=patron.matcher(FTFdni.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El dni tiene que tener 8 numeros y 9 letras");
                    else
                        dni=FTFdni.getText();
                        TFnombreE.requestFocus();
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
    }//GEN-LAST:event_FTFdniActionPerformed

    private void TFnombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreEActionPerformed
       try{
            if(TFnombreE.getText().isEmpty())
                throw new Llenar("El nombre de la empresa tiene que aparecer obligatoriamente");
            else
                if(TFnombreE.getText().length()<2)
                    throw new DatoNoValido("El nombre de la empresa tiene que tener más de dos carácteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z][a-z]*");
                    Matcher m=patron.matcher(TFnombreE.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El nombre de la empresa tiene que ser todo letras");
                    else
                        nE=TFnombreE.getText();
                        TFdireccion.requestFocus();
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
    }//GEN-LAST:event_TFnombreEActionPerformed

    private void TFdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdireccionActionPerformed
        try{
            if(TFdireccion.getText().isEmpty())
                throw new Llenar("La direccion de la empresa tiene que aparecer obligatoriamente");
            else
                if(TFdireccion.getText().length()<2)
                    throw new DatoNoValido("La direccion de la empresa tiene que tener más de dos carácteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z][a-z]*");
                    Matcher m=patron.matcher(TFdireccion.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("la direccion  de la empresa tiene que ser todo letras");
                    else
                        dirE=TFdireccion.getText();
                        TFnif.requestFocus();
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
    }//GEN-LAST:event_TFdireccionActionPerformed

    private void TFnifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnifActionPerformed
        try{
            if(TFnif.getText().isEmpty())
                throw new Llenar("El nif de la empresa tiene que aparecer obligatoriamente");
            else
                if(TFnif.getText().length()!=9)
                    throw new DatoNoValido("El nif de la empresa tiene que tener 9 caracteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z]+[0-9]{8}");
                    Matcher m=patron.matcher(TFnif.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El nif de la empresa tiene que tener una letra y 8 numeros");
                    else
                        nif=TFnif.getText();
                        TFnombreEvento.requestFocus();
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
    }//GEN-LAST:event_TFnifActionPerformed

    private void TFnombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreEventoActionPerformed
        try{
            if(TFnombreEvento.getText().isEmpty())
                throw new Llenar("El nombre del evento tiene que aparecer obligatoriamente");
            else
                if(TFnombreEvento.getText().length()<2)
                    throw new DatoNoValido("El nombre del evento tiene que tener más de dos carácteres");
                else{
                    Pattern patron =Pattern.compile("[A-Z][a-z]*");
                    Matcher m=patron.matcher(TFnombreEvento.getText());
                    if(!m.matches())
                        throw new DatoNoValido ("El nombre del evento tiene que ser todo letras");
                    else
                        nEv=TFnombreEvento.getText();
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
    }//GEN-LAST:event_TFnombreEventoActionPerformed

    private void BaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaceptarActionPerformed
     String n="vi";
        boolean i=false;
        i=Controlador.InsertarPEE(nE,dirE,nif,nP,apellido,dni,nEv);
        if(i==true)
            JOptionPane.showMessageDialog(this,"Persona inscrita correctamente");
            
        else
            JOptionPane.showMessageDialog(this,"Persona no inscrita correctamente");
            
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
            java.util.logging.Logger.getLogger(Vinscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vinscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vinscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vinscribir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vinscribir dialog = new Vinscribir(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField FTFdni;
    private javax.swing.JTextField TFapellido;
    private javax.swing.JTextField TFdireccion;
    private javax.swing.JTextField TFnif;
    private javax.swing.JTextField TFnombreE;
    private javax.swing.JTextField TFnombreEvento;
    private javax.swing.JTextField TFnombreP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
