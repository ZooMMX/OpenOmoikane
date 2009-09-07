/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPrincipal.java
 *
 * Created on 15/08/2008, 11:31:38 AM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import static omoikane.sistema.Usuarios.*;

/**
 *
 * @author Octavio
 */
public class MenuPrincipal extends javax.swing.JInternalFrame {

    BufferedImage fondo;

    /** Creates new form MenuPrincipal */
    public MenuPrincipal() {
        
        initComponents();

        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);
        
        //Instrucciones para el funcionamiento de las teclas de navegación
        Set newKeys = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        newKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0));
        setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, newKeys);

        newKeys = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        newKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, newKeys);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension labelSize = this.getPreferredSize();

    }

    /** This method is called from within the constructor to
     *< initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCajas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnAlmacenes = new javax.swing.JButton();
        btnMovAlmacen = new javax.swing.JButton();
        btnPreferencias = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLineas = new javax.swing.JButton();
        btnDetallesVentas = new javax.swing.JButton();
        btnCortes = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnGrupos = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setIconifiable(true);
        setTitle("Menú Principal");
        setFocusCycleRoot(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Principal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-manager-128x128.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 230, 60));

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package-toys-128x128.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Artículos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download-manager-128x128.png"))); // NOI18N
        btnCajas.setText("Cajas");
        btnCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 230, 60));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 720, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Almacen");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 720, 10));

        btnAlmacenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server-128x128.png"))); // NOI18N
        btnAlmacenes.setText("Almacenes");
        btnAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 60));

        btnMovAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k-black-box-128x128.png"))); // NOI18N
        btnMovAlmacen.setText("<html>Movimientos<br>Almacén</html>");
        btnMovAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btnMovAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 230, 60));

        btnPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/k-sysguard-128x128.png"))); // NOI18N
        btnPreferencias.setText("Preferencias");
        btnPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreferenciasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 230, 60));

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proxy-128x128.png"))); // NOI18N
        btnUsuarios.setText("Usuarios     ");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 60));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 720, 10));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Administración");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 30, 40));

        btnLineas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usb-128x128.png"))); // NOI18N
        btnLineas.setText("Líneas");
        btnLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineasActionPerformed(evt);
            }
        });
        getContentPane().add(btnLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 230, 60));

        btnDetallesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote-128x128.png"))); // NOI18N
        btnDetallesVentas.setText("<html>Detalles<br>de Ventas</html>");
        btnDetallesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetallesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 230, 60));

        btnCortes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/super-karamba-128x128.png"))); // NOI18N
        btnCortes.setText("Cortes");
        btnCortes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 230, 60));

        btnArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x-mag-128x128.png"))); // NOI18N
        btnArticulos.setText("Catálogo");
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(btnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, 60));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vcard-128x128.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 230, 60));

        btnGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder-blue-128x128.png"))); // NOI18N
        btnGrupos.setText("Grupos");
        btnGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGruposActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 230, 60));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 720, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
//        this.dispose();
//        ((omoikane.principal.Escritorio)omoikane.principal.Principal.getEscritorio()).getFrameEscritorio().dispose();
//        System.exit(0);
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenesActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Almacenes.lanzarCatalogo();
}//GEN-LAST:event_btnAlmacenesActionPerformed

    private void btnCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajasActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Caja.lanzarCatalogo();
}//GEN-LAST:event_btnCajasActionPerformed

    private void btnMovAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovAlmacenActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Almacenes.lanzarMovimientos();
}//GEN-LAST:event_btnMovAlmacenActionPerformed

    private void btnLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineasActionPerformed
        omoikane.principal.Lineas.lanzarCatalogo();
}//GEN-LAST:event_btnLineasActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Caja.lanzar();
}//GEN-LAST:event_btnVenderActionPerformed

    private void btnDetallesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesVentasActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Ventas.lanzarCatalogo();
}//GEN-LAST:event_btnDetallesVentasActionPerformed

    private void btnCortesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortesActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Cortes.lanzarCatalogo();
}//GEN-LAST:event_btnCortesActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Articulos.lanzarCatalogo();
}//GEN-LAST:event_btnArticulosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Clientes.lanzarCatalogo();
}//GEN-LAST:event_btnClientesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Usuarios.lanzarCatalogo();
}//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGruposActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Grupos.lanzarCatalogo();
}//GEN-LAST:event_btnGruposActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        this.btnVender.requestFocusInWindow();
}//GEN-LAST:event_formFocusGained

    private void btnPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreferenciasActionPerformed
        // TODO Cambiar esto por preferencias
       omoikane.principal.LineasDuales.lanzarCatalogo();
    }//GEN-LAST:event_btnPreferenciasActionPerformed

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(55,55,255,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacenes;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnCajas;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCortes;
    private javax.swing.JButton btnDetallesVentas;
    private javax.swing.JButton btnGrupos;
    private javax.swing.JButton btnLineas;
    private javax.swing.JButton btnMovAlmacen;
    private javax.swing.JButton btnPreferencias;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

}
