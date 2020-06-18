/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Conexion.ConexionBD;
import controladores.ControladorTablaUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexis
 */
public class ModificarUsuarioLista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarUsuarioLista
     */
    ControladorTablaUsuario controller = new ControladorTablaUsuario();
    public ModificarUsuarioLista() throws SQLException {
        initComponents();
        controller.mostrar(tblUsuarios);
    }

        private void limpiarCajas(){
            this.txtRun.setText("");
        }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtRun = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Debe ingresar el run del usuario sin puntos \nni digito verificador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        ModificarUsuario ventanaModificarUsuario = new ModificarUsuario();
        MenuPrincipal.jdpEscritorio.add(ventanaModificarUsuario);
        ventanaModificarUsuario.toFront();
        ventanaModificarUsuario.show();
        this.setVisible(false);
        int cor = tblUsuarios.getSelectedRow();
        ventanaModificarUsuario.txtID.setText(tblUsuarios.getValueAt(cor, 0).toString());
        ventanaModificarUsuario.txtRun.setText(tblUsuarios.getValueAt(cor, 1).toString());
        ventanaModificarUsuario.txtDv.setText(tblUsuarios.getValueAt(cor, 2).toString());
        ventanaModificarUsuario.txtUsuario.setText(tblUsuarios.getValueAt(cor, 3).toString());
        ventanaModificarUsuario.txtNombre.setText(tblUsuarios.getValueAt(cor, 4).toString());
        ventanaModificarUsuario.txtApellidopat.setText(tblUsuarios.getValueAt(cor, 5).toString());
        ventanaModificarUsuario.txtApellidomat.setText(tblUsuarios.getValueAt(cor, 6).toString());
        ventanaModificarUsuario.txtCorreo.setText(tblUsuarios.getValueAt(cor, 7).toString());
        ventanaModificarUsuario.cmbCargo.setSelectedItem(tblUsuarios.getValueAt(cor, 8).toString()); 
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // TODO add your handling code here:
            controller.mostrardatos(txtRun.getText(),tblUsuarios);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuarioLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtRun;
    // End of variables declaration//GEN-END:variables
}
