package traductor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Final fin;
    JLabel letra[][];
    JLabel palabra[];
    String palabras[];
    int iniciox[];
    int inicioy[];
    boolean gano;
    boolean direccion[];

    public Principal() {
        initComponents();
        Login.Music.Play("Archivos/mega.mp3");
        cargarLabel();
        palabra = new JLabel[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        this.setLocationRelativeTo(null);
        cargar();
        palabras = new String[10];
        palabra = new JLabel[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};//
        for (int i = 0; i < letra.length; i++) {
            palabras[i] = palabra[i].getText();
        }
    }

    public void cargarLabel() {

        ArrayList<String> pal = new ArrayList();
        for (Palabras aux : Aprender.regist.traer_Palabra()) {
            if (aux.getNivel() == Ejercicios.niv || aux.getNivel() == (Ejercicios.niv - 1)) {
                String p = aux.getEnglish();
                if(p.length() < 10){
                    pal.add(p);
                }
            }
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

        p1.setText(v2[0].toUpperCase());
        p2.setText(v2[1].toUpperCase());
        p3.setText(v2[2].toUpperCase());
        p4.setText(v2[3].toUpperCase());
        p5.setText(v2[4].toUpperCase());
        p6.setText(v2[5].toUpperCase());
        p7.setText(v2[6].toUpperCase());
        p8.setText(v2[7].toUpperCase());
        p9.setText(v2[8].toUpperCase());
        p10.setText(v2[9].toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegre = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        Sopa_de_letra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALPHABET SOUP");

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WORDS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnRegre.setText("Return");
        btnRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        Sopa_de_letra.setBackground(new java.awt.Color(153, 255, 153));
        Sopa_de_letra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sopa_de_letra.setLayout(new java.awt.GridLayout(10, 14));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2.setBackground(new java.awt.Color(16, 173, 0));
        p2.setForeground(new java.awt.Color(0, 0, 0));
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText(" ");
        p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.setOpaque(true);

        p1.setBackground(new java.awt.Color(16, 173, 0));
        p1.setForeground(new java.awt.Color(0, 0, 0));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText(" ");
        p1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.setOpaque(true);

        p4.setBackground(new java.awt.Color(16, 173, 0));
        p4.setForeground(new java.awt.Color(0, 0, 0));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setText(" ");
        p4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.setOpaque(true);

        p3.setBackground(new java.awt.Color(16, 173, 0));
        p3.setForeground(new java.awt.Color(0, 0, 0));
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText(" ");
        p3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.setOpaque(true);

        p6.setBackground(new java.awt.Color(16, 173, 0));
        p6.setForeground(new java.awt.Color(0, 0, 0));
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setText(" ");
        p6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.setOpaque(true);

        p5.setBackground(new java.awt.Color(16, 173, 0));
        p5.setForeground(new java.awt.Color(0, 0, 0));
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setText(" ");
        p5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.setOpaque(true);

        p8.setBackground(new java.awt.Color(16, 173, 0));
        p8.setForeground(new java.awt.Color(0, 0, 0));
        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setText(" ");
        p8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.setOpaque(true);

        p7.setBackground(new java.awt.Color(16, 173, 0));
        p7.setForeground(new java.awt.Color(0, 0, 0));
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setText(" ");
        p7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.setOpaque(true);

        p9.setBackground(new java.awt.Color(16, 173, 0));
        p9.setForeground(new java.awt.Color(0, 0, 0));
        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setText(" ");
        p9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.setOpaque(true);

        p10.setBackground(new java.awt.Color(16, 173, 0));
        p10.setForeground(new java.awt.Color(0, 0, 0));
        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setText(" ");
        p10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2)
                .addGap(18, 18, 18)
                .addComponent(p3)
                .addGap(18, 18, 18)
                .addComponent(p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6)
                .addGap(18, 18, 18)
                .addComponent(p7)
                .addGap(18, 18, 18)
                .addComponent(p8)
                .addGap(18, 18, 18)
                .addComponent(p9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p10)
                .addGap(38, 38, 38))
        );

        escritorio.setLayer(Sopa_de_letra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(Sopa_de_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sopa_de_letra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 588, 396));

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 102));

        jMenu1.setBackground(new java.awt.Color(102, 255, 102));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Restart");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
 
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                Sopa_de_letra.remove(letra[i][j]);
            }
        }
        cargar();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Do you want to go out?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            Login.nivJug = Login.nivJug -1;
            Inicio.lNivel.setText("Level " + Login.nivJug);
            Ejercicios.mar = 0;
            Ejercicios abrir = new Ejercicios();
            abrir.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnRegreActionPerformed
    public void cargar() {
        gano = false;
        iniciox = new int[10];
        inicioy = new int[10];
        direccion = new boolean[10];
        celdasdeletras();
        colocarpalabras();
        llenarespaciosvacios();
    }

    public void celdasdeletras() {
        letra = new JLabel[10][14];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                letra[i][j] = new JLabel("", javax.swing.SwingConstants.CENTER);
                letra[i][j].setName("");
                letra[i][j].setBackground(Color.WHITE);
                letra[i][j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
                letra[i][j].setForeground(new java.awt.Color(0, 5, 2));
                letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                letra[i][j].setOpaque(true);
                letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
                letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        presioneClic(evt);
                    }
                });
                Sopa_de_letra.add(letra[i][j]);
            }
        }
    }

    
    public void presioneClic(java.awt.event.MouseEvent evt) {
        if (!gano) {
            if (evt.getComponent().getBackground().equals(Color.WHITE)) 
            {
                evt.getComponent().setBackground(new java.awt.Color(102, 255, 102));
                tachar();
            } else if (evt.getComponent().getName().equals(""))
            {
                evt.getComponent().setBackground(Color.WHITE);
            }
        }
    }

    public void tachar() {
        for (int i = 0; i < 10; i++) {
            if (!palabra[i].getText().substring(0, 1).equals("<")) {
                if (tacharLetra(iniciox[i], inicioy[i], palabra[i].getText().length(), direccion[i]))
                {
                    palabra[i].setText("<html><body><s>" + palabra[i].getText() + "</s></body></html>");
                    break;
                }
            }
        }
        boolean aux = true;
        for (int i = 0; i < letra.length; i++) {
            if (!palabra[i].getText().substring(0, 1).equals("<")) {
                aux = false;
                break;
            }
        }
        if (aux) {
            if (!(fin instanceof Final)) { 
                fin = new Final();
                gano = true;
                Login.nivJug = Login.nivJug + 10;
                Inicio.lNivel.setText("Level " + Login.nivJug);
                JOptionPane.showMessageDialog(null, "You win!!!");
                Ejercicios.mar++;
                Ejercicios abrir = new Ejercicios();
                abrir.setVisible(true);
                if(Ejercicios.mar == 3){
                    Marcianito m = new Marcianito();
                m.setVisible(true);
                Ejercicios.mar = 0;
                }
                this.setVisible(false);
            }
            CentrarVentanaInterna(fin);
        }
    }

    public void CentrarVentanaInterna(JInternalFrame internalFrame) { 
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2; 
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {
            internalFrame.setLocation(x, y);
        } else {
            escritorio.add(internalFrame);
            internalFrame.setLocation(x, y);
            internalFrame.show(); 
        }
    }

    public boolean tacharLetra(int x, int y, int tamaño, boolean direccion) {
        boolean respuesta = true;
        if (direccion) {
            for (int i = y; i < tamaño + y; i++) {
                if (letra[x][i].getBackground().equals(Color.WHITE)) {
                    respuesta = false;
                    break;
                }
            }
        } else {
            for (int j = y; j > y - tamaño; j--) {
                if (letra[x][j].getBackground().equals(Color.WHITE)) {
                    respuesta = false;
                    break;
                }
            }
        }
        return respuesta;
    }

    public void colocarpalabras() {
        String palabra[] = {p1.getText(), p2.getText(), p3.getText(), p4.getText(), p5.getText(), p6.getText(), p7.getText(), p8.getText(), p9.getText(), p10.getText()};
        Random random = new Random();
        int iniciax = 0;
        int iniciay;
        int unico[] = NumerosSinRepeticiones(10);
        iniciox = unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() < 14) {
                iniciax = unico[i];
                iniciay = (int) (random.nextDouble() * 14 - 1);
                int estrae = 0;
                if (iniciay + palabra[i].length() < 14) {
                    for (int j = iniciay; j < iniciay + palabra[i].length(); j++) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae + 1));
                        letra[iniciax][j].setName("1");
                        estrae++;
                        inicioy[i] = iniciay;
                        direccion[i] = true;
                    }
                } else if (iniciay - palabra[i].length() > 0) {
                    for (int j = iniciay; j > iniciay - palabra[i].length(); j--) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae + 1));
                        letra[iniciax][j].setName("1");
                        estrae++;
                        inicioy[i] = iniciay;
                        direccion[i] = false;
                    }
                }
            }
        }
    }

    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[] = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            numeros[i] = -1;
        }
        Random random = new Random();
        boolean aux;
        int numero = 0;
        for (int x = 0; x < repeticiones; x++) {
            aux = true;
            while (aux) {
                aux = false;
                numero = (int) (random.nextDouble() * 11 - 1);
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j] == numero) {
                        aux = true;
                        break;
                    }
                }
            }
            numeros[x] = numero;
        }
        return numeros;
    }

    public void llenarespaciosvacios() {
        
        String abc[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letra[i][j].getText().equals("")) {
                    letra[i][j].setText(abc[(int) (random.nextDouble() * abc.length - 1)]);
                }
            }
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel Sopa_de_letra;
    javax.swing.JButton btnRegre;
    javax.swing.JDesktopPane escritorio;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JLabel p1;
    javax.swing.JLabel p10;
    javax.swing.JLabel p2;
    javax.swing.JLabel p3;
    javax.swing.JLabel p4;
    javax.swing.JLabel p5;
    javax.swing.JLabel p6;
    javax.swing.JLabel p7;
    javax.swing.JLabel p8;
    javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
