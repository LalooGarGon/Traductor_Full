/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMN
 */
public class Sign extends javax.swing.JFrame {

    public static ConsultasBD registro = new ConsultasBD();

    /**
     * Creates new form Sign
     */
    public Sign() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void nuevoRegistro() {

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String ed = txtEdad.getText();
        String usuario = txtNUsuario.getText();
        String passs = passCon.getText();
        String pass2 = passCon2.getText();
        String correo = txtCorreo.getText();
        Boolean bn = false, ba = false, be = false, bu = false;
        Boolean bp1 = false, bp2 = false, bc = false;
        String nn = "\n* Nombre", aa = "\n* Apellido", ee = "\n* Edad";
        String uu = "\n* Usuario", p1 = "\n* Contraseña";
        String p2 = "\n* Confirma Contraseña", cc = "\n* Correo", ftu = "\n* Foto";
        int edad = 0;
        if (nombre.compareTo("") != 0) {
            bn = true;
            nn = "";
        }
        if (apellido.compareTo("") != 0) {
            ba = true;
            aa = "";
        }
        if (ed.compareTo("") != 0) {
            be = true;
            ee = "";
            edad = Integer.parseInt(txtEdad.getText());
        }
        if (usuario.compareTo("") != 0) {
            bu = true;
            uu = "";
        }
        if (passs.compareTo("") != 0) {
            bp1 = true;
            p1 = "";
        }
        if (pass2.compareTo("") != 0) {
            bp2 = true;
            p2 = "";
        }
        if (correo.compareTo("") != 0) {
            bc = true;
            cc = "";
        }
        if(fotu == 0){
            ftu = "";
        }
        boolean valo;
        String us = "";
        IPersona buscado = registro.buscarUser(usuario);
        if(buscado != null){
            us = buscado.getUsuario();
        }
        //JOptionPane.showMessageDialog(null, us);
        if (bn == true && ba == true && be == true && bu == true && bp1 == true && bp2 == true && bc == true && fotu == 0) {
            if (us.compareTo(usuario) != 0) {
                if (passs.compareTo(pass2) == 0) {
                    copiar_Imagen(usuario);
                    registro.insertarUsuario(nombre, apellido, edad, usuario, passs, correo, 1, usuario + "_"+fichero.getName());
                    JOptionPane.showMessageDialog(null, "¡Registro Exitoso!");
                    Login abrir = new Login();
                    abrir.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ya registrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Faltan Datos" + nn + aa + ee + uu + p1 + p2 + cc + ftu);
        }
    }

    public void copiar_Imagen(String u) {
        String ini = "";
        File dir = new File(".");
        try {
            ini = (dir.getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ini);
        File origen = new File(fichero.toString());
        File crear = new File(ini + "/Fotos/");
        crear.mkdir();
        File destino = new File(ini + "/Fotos/" + u +  "_" + fichero.getName());
        InputStream in = null;
        try {
            in = new FileInputStream(origen);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }
        OutputStream out = null;
        try {
            out = new FileOutputStream(destino);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                try {
                    out.write(buf, 0, len);
                } catch (IOException ex) {
                    Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNUsuario = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        passCon = new javax.swing.JPasswordField();
        passCon2 = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        lFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 627));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 0, 210, 40);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 180, 70, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 230, 70, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 280, 60, 30);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 330, 70, 30);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 380, 90, 30);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirma Contraseña:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 420, 150, 40);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo Electrónico:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 469, 130, 40);

        txtNombre.setBackground(new java.awt.Color(104, 54, 31));
        txtNombre.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(190, 180, 170, 25);

        txtApellido.setBackground(new java.awt.Color(104, 54, 31));
        txtApellido.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido);
        txtApellido.setBounds(190, 230, 170, 25);

        txtEdad.setBackground(new java.awt.Color(104, 54, 31));
        txtEdad.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad);
        txtEdad.setBounds(190, 280, 170, 25);

        txtNUsuario.setBackground(new java.awt.Color(104, 54, 31));
        txtNUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        txtNUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNUsuario);
        txtNUsuario.setBounds(190, 330, 170, 25);

        txtCorreo.setBackground(new java.awt.Color(104, 54, 31));
        txtCorreo.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(190, 480, 170, 25);

        passCon.setBackground(new java.awt.Color(104, 54, 31));
        passCon.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        passCon.setForeground(new java.awt.Color(255, 255, 255));
        passCon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(passCon);
        passCon.setBounds(190, 380, 170, 25);

        passCon2.setBackground(new java.awt.Color(104, 54, 31));
        passCon2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        passCon2.setForeground(new java.awt.Color(255, 255, 255));
        passCon2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(passCon2);
        passCon2.setBounds(190, 430, 170, 25);

        btnAceptar.setBackground(new java.awt.Color(255, 102, 51));
        btnAceptar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(230, 540, 82, 26);

        lFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/User_Account_Avatar_Person_Profile_Login_Persona-512.png"))); // NOI18N
        lFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lFoto);
        lFoto.setBounds(40, 60, 104, 100);

        btnFoto.setBackground(new java.awt.Color(255, 102, 51));
        btnFoto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnFoto.setText("Agregar Foto");
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto);
        btnFoto.setBounds(220, 100, 114, 26);

        btnCancelar.setBackground(new java.awt.Color(58, 31, 8));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(60, 540, 85, 26);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traductor/h (2).jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 410, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        nuevoRegistro();
    }//GEN-LAST:event_btnAceptarActionPerformed

    public File fichero;
    public int fotu = 1;
    public String msg1 = "FOTO ", ima = null;
    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
        int resultado;
        Elegir ventana = new Elegir();
        ventana.setLocationRelativeTo(null);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG y GIF", "jpg", "png", "gif");
        ventana.jfFotos.setFileFilter(filtro);
        resultado = ventana.jfFotos.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jfFotos.getSelectedFile();
            fotu = 0;
            msg1 = " ";
            ima = ("" + fichero.getName());
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lFoto.getWidth(), lFoto.getHeight(), Image.SCALE_DEFAULT));
                lFoto.setText(null);
                lFoto.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir..." + ex);
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "¿Desea cancelar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_OPTION){
            Login abrir = new Login();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c < '0' || c > '9'){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

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
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lFoto;
    private javax.swing.JPasswordField passCon;
    private javax.swing.JPasswordField passCon2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
