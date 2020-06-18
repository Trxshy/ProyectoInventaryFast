/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Usuario;
import controladores.CargaComboBox;
import controladores.ControladoresUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class ModificarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarUsuario
     */
    CargaComboBox carga = new CargaComboBox();
    Usuario user;
    ControladoresUsuario met = new ControladoresUsuario();
    public ModificarUsuario() {
        initComponents();
        carga.cmbCargo(cmbCargo);
    }
        private void limpiarCajas(){
        this.txtID.setText("");
        this.txtNombre.setText("");
        this.txtApellidopat.setText("");
        this.txtApellidomat.setText("");
        this.txtCorreo.setText("");
        this.txtUsuario.setText("");
        this.txtRun.setText("");
        this.txtDv.setText("");
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
        txtRun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidopat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidomat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Modificar Usuario");

        jLabel2.setText("Run:");

        jLabel3.setText("-");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido paterno:");

        jLabel6.setText("Apellido materno:");

        jLabel7.setText("E-mail:");

        jLabel9.setText("Cargo:");

        jLabel8.setText("ID:");

        txtID.setEditable(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel10.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel9)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidomat)
                            .addComponent(txtApellidopat)
                            .addComponent(txtNombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCorreo)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Volver)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidopat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidomat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(Volver))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
                this.user = new Usuario(ModificarUsuario.txtNombre.getText(), ModificarUsuario.txtRun.getText(),ModificarUsuario.txtDv.getText(), ModificarUsuario.txtApellidopat.getText(), this.txtApellidomat.getText(), met.nomUsu(this.txtNombre.getText(), this.txtApellidopat.getText()), met.contrasenia(this.txtNombre.getText(), this.txtRun.getText()), this.txtCorreo.getText(),(String)this.cmbCargo.getSelectedItem());
        try {
            met.modificarUsuario(user, this.txtID.getText());
            JOptionPane.showMessageDialog(null, "Modificado correctamente");
            limpiarCajas();
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        try {
            ModificarUsuarioLista ventanaModificarUsuarioLista = new ModificarUsuarioLista();
            MenuPrincipal.jdpEscritorio.add(ventanaModificarUsuarioLista);
            ventanaModificarUsuarioLista.toFront();
            ventanaModificarUsuarioLista.show();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnModificar;
    public static javax.swing.JComboBox cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField txtApellidomat;
    public static javax.swing.JTextField txtApellidopat;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDv;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtRun;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
