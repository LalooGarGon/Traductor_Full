package traductor;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    private ImageIcon imgs[];
    private JButton btns[][];
    private int ma[][];
    private int mr[][];
    private boolean uno;
    private JButton tmp;
    private int p1, p2;

    public MainFrame() {
        initComponents();
        setSize(450, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        
        ArrayList<String> pal = new ArrayList();
        for (Palabras aux : Aprender.regist.traer_Palabra()) {
            pal.add(aux.getIma());
        }

        int v[] = new int[10];
        int cv = 0;

        String v2[] = new String[10];
        System.out.println("Tamaño arreglo: " + pal.size());
        while (cv < 10) {
            boolean val = true;
            int ran = (int) (Math.random() * ((pal.size() - 1) - 0 + 1) + 0);
            for (int i = 0; i < 10; i++) {
                if (ran == v[i]) {
                    val = false;
                }
            }
            if (val == true) {
                v[cv] = ran;
                v2[cv] = pal.get(ran);
                cv++;
            }

        }

        imgs = new ImageIcon[11];
        imgs[0] = new ImageIcon(getClass().getResource("Archivos/" + v2[0]));
        imgs[1] = new ImageIcon(getClass().getResource("Archivos/" + v2[1]));
        imgs[2] = new ImageIcon(getClass().getResource("Archivos/" + v2[2]));
        imgs[3] = new ImageIcon(getClass().getResource("Archivos/" + v2[3]));
        imgs[4] = new ImageIcon(getClass().getResource("Archivos/" + v2[4]));
        imgs[5] = new ImageIcon(getClass().getResource("Archivos/" + v2[5]));
        imgs[6] = new ImageIcon(getClass().getResource("Archivos/" + v2[6]));
        imgs[7] = new ImageIcon(getClass().getResource("Archivos/" + v2[7]));
        imgs[8] = new ImageIcon(getClass().getResource("Archivos/" + v2[8]));
        imgs[9] = new ImageIcon(getClass().getResource("Archivos/" + v2[9]));
        imgs[10] = new ImageIcon(getClass().getResource("Archivos/juju.png"));

        btns = new JButton[4][5];
        btns[0][0] = bt1;
        btns[0][1] = bt2;
        btns[0][2] = bt3;
        btns[0][3] = bt4;
        btns[0][4] = bt5;

        btns[1][0] = bt6;
        btns[1][1] = bt7;
        btns[1][2] = bt8;
        btns[1][3] = bt9;
        btns[1][4] = bt10;

        btns[2][0] = bt11;
        btns[2][1] = bt12;
        btns[2][2] = bt13;
        btns[2][3] = bt14;
        btns[2][4] = bt15;

        btns[3][0] = bt16;
        btns[3][1] = bt17;
        btns[3][2] = bt18;
        btns[3][3] = bt19;
        btns[3][4] = bt20;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                btns[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        voltear(e);
                    }
                });
            }
        }
        iniciar();
    }

    private void iniciar() {
        ma = new int[4][5];
        mr = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                ma[i][j] = -1;
                mr[i][j] = 0;
                btns[i][j].setEnabled(true);

                Icon icono = new ImageIcon(imgs[10].getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));

                btns[i][j].setIcon(icono);
            }
        }
        Login.Music.Play("Archivos/mega.mp3");
        for (int i = 0; i < 10; i++) {
            boolean existe = true;
            while (existe) {
                int x = (int) Math.floor(Math.random() * (0 - (3 + 1)) + (3 + 1));
                int y = (int) Math.floor(Math.random() * (0 - (4 + 1)) + (4 + 1));
                if (ma[x][y] == -1) {
                    ma[x][y] = i;
                    existe = false;
                }
            }
            existe = true;
            while (existe) {
                int x = (int) Math.floor(Math.random() * (0 - (3 + 1)) + (3 + 1));
                int y = (int) Math.floor(Math.random() * (0 - (4 + 1)) + (4 + 1));
                if (ma[x][y] == -1) {
                    ma[x][y] = i;
                    existe = false;
                }
            }
        }

        uno = false;
    }

    private void voltear(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (bt == btns[i][j]) {
                    if (mr[i][j] == 1) {
                        return;
                    }

                    if (uno) {
                        if (tmp == bt) {
                            return;
                        }
                        if (ma[i][j] == ma[p1][p2]) {
                            mr[i][j] = 1;
                            mr[p1][p2] = 1;
                            Icon icoa = new ImageIcon(imgs[ma[i][j]].getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                            bt.setIcon(icoa);
                            bt.setEnabled(false);
                            tmp.setEnabled(false);
                            for (int k = 0; k < 4; k++) {
                                for (int l = 0; l < 5; l++) {
                                    if (mr[k][l] == 0) {
                                        uno = false;
                                        return;
                                    }
                                }
                            }
                            Login.nivJug = Login.nivJug + 3;
                            Inicio.lNivel.setText("Level " + Login.nivJug);
                            Ejercicios.mar++;
                            JOptionPane.showMessageDialog(this, "You Win!!!");
                            Ejercicios abrir = new Ejercicios();
                            abrir.setVisible(true);
                            if (Ejercicios.mar == 3) {
                                Marcianito m = new Marcianito();
                                m.setVisible(true);
                                Ejercicios.mar = 0;
                            }

                            this.setVisible(false);

                        } else {
                            ImageIcon im = imgs[ma[i][j]];
                            Icon ico = new ImageIcon(imgs[ma[i][j]].getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                            Thread hilo = new Thread() {
                                @Override
                                public synchronized void run() {
                                    try {
                                        bt.setIcon(ico);
                                        sleep(300);
                                        Icon icou = new ImageIcon(imgs[10].getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                                        bt.setIcon(icou);
                                        tmp.setIcon(icou);
                                    } catch (InterruptedException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            };
                            hilo.start();
                            jPanel1.setEnabled(false);
                        }
                        uno = false;
                    } else {
                        tmp = bt;
                        p1 = i;
                        p2 = j;
                        uno = true;
                        Icon iconos = new ImageIcon(imgs[ma[i][j]].getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                        bt.setIcon(iconos);
                    }
                    break;
                }
            }
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

        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt17 = new javax.swing.JButton();
        bt18 = new javax.swing.JButton();
        bt19 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        bt1.setBackground(new java.awt.Color(255, 169, 84));
        bt1.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt2.setBackground(new java.awt.Color(255, 169, 84));
        bt2.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt3.setBackground(new java.awt.Color(255, 169, 84));
        bt3.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt4.setBackground(new java.awt.Color(255, 169, 84));
        bt4.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt5.setBackground(new java.awt.Color(255, 169, 84));
        bt5.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt6.setBackground(new java.awt.Color(255, 169, 84));
        bt6.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt7.setBackground(new java.awt.Color(255, 169, 84));
        bt7.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt8.setBackground(new java.awt.Color(255, 169, 84));
        bt8.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt9.setBackground(new java.awt.Color(255, 169, 84));
        bt9.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt10.setBackground(new java.awt.Color(255, 169, 84));
        bt10.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt11.setBackground(new java.awt.Color(255, 169, 84));
        bt11.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt12.setBackground(new java.awt.Color(255, 169, 84));
        bt12.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt13.setBackground(new java.awt.Color(255, 169, 84));
        bt13.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt14.setBackground(new java.awt.Color(255, 169, 84));
        bt14.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt15.setBackground(new java.awt.Color(255, 169, 84));
        bt15.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt16.setBackground(new java.awt.Color(255, 169, 84));
        bt16.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt17.setBackground(new java.awt.Color(255, 169, 84));
        bt17.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt18.setBackground(new java.awt.Color(255, 169, 84));
        bt18.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt19.setBackground(new java.awt.Color(255, 169, 84));
        bt19.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        bt20.setBackground(new java.awt.Color(255, 169, 84));
        bt20.setIcon(new javax.swing.ImageIcon("Archivo/juju.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(jButton1)))
                        .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bt5)
                                .addComponent(bt4)
                                .addComponent(bt3)
                                .addComponent(bt2)
                                .addComponent(bt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bt6)
                                .addComponent(bt7)
                                .addComponent(bt8)
                                .addComponent(bt9)
                                .addComponent(bt10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bt11)
                                .addComponent(bt12)
                                .addComponent(bt13)
                                .addComponent(bt14)
                                .addComponent(bt15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bt16)
                                .addComponent(bt17)
                                .addComponent(bt18)
                                .addComponent(bt19)
                                .addComponent(bt20))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Do you want to go out?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            Login.nivJug = Login.nivJug - 1;
            Inicio.lNivel.setText("Level " + Login.nivJug);
            Ejercicios.mar = 0;
            Ejercicios abrir = new Ejercicios();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
