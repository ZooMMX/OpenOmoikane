/*
 * LeerHuella.java
 *
 * Created on 17 de septiembre de 2007, 10:25 AM
 */

package omoikane.formularios;

import java.awt.Image;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author  Octavio
 */
public class MiniLeerHuella extends javax.swing.JPanel {

    /** Creates new form LeerHuella */
    public MiniLeerHuella() {
        initComponents();
        this.setOpaque(false);
        setLectorActivo(false);
    }
    
    public void setLectorActivo(boolean edo)
    {
        if(edo)
        {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-128x128.png")));
            this.lblOK.setText("Esperando huella...");
        } else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/important-128x128.png")));
            this.lblOK.setText("Lector desconectado");
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        lblOK = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setMinimumSize(new java.awt.Dimension(170, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(415, 540));
        setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 250));
        jPanel2.setOpaque(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("cerrar");
        btnCancelar.setEnabled(false);

        lblOK.setForeground(new java.awt.Color(255, 255, 255));
        lblOK.setText("Esperando huella...");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-128x128.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblOK, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(34, 34, 34))
        );

        add(jPanel2);
        jPanel2.setBounds(10, 10, 160, 230);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblOK;
    // End of variables declaration//GEN-END:variables
    
}
