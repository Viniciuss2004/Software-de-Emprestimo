package View;

import javax.swing.ImageIcon;

public final class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setIcon();
    }

    public void setIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Icone.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jColorChooser1 = new javax.swing.JColorChooser();
        jFileChooser1 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        choice1 = new java.awt.Choice();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastrar = new javax.swing.JMenu();
        cadastrar_A = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cadastrar_F = new javax.swing.JMenuItem();
        emp_e_dev = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        gerenciar = new javax.swing.JMenu();
        gerenciar_A = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        gerenciar_F = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        gerenciar_E = new javax.swing.JMenuItem();
        relatorio_f = new javax.swing.JMenu();
        relatorio_A = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        relatorio_F = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        relatorio_E = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTree1);

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(627, 590));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela Principal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 630, 540);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(125, 30));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(125, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(125, 30));

        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("Cadastrar");
        cadastrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        cadastrar_A.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cadastrar_A.setText("Cadastrar Amigos");
        cadastrar_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_AActionPerformed(evt);
            }
        });
        cadastrar.add(cadastrar_A);
        cadastrar.add(jSeparator3);

        cadastrar_F.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cadastrar_F.setText("Cadastrar Ferramentas");
        cadastrar_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_FActionPerformed(evt);
            }
        });
        cadastrar.add(cadastrar_F);

        jMenuBar1.add(cadastrar);

        emp_e_dev.setForeground(new java.awt.Color(255, 255, 255));
        emp_e_dev.setText("Empréstimo e Devolução");
        emp_e_dev.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jMenuItem2.setText("Empréstimo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        emp_e_dev.add(jMenuItem2);
        emp_e_dev.add(jSeparator8);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jMenuItem3.setText("Devolução");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        emp_e_dev.add(jMenuItem3);

        jMenuBar1.add(emp_e_dev);

        gerenciar.setForeground(new java.awt.Color(255, 255, 255));
        gerenciar.setText("Gerenciar");
        gerenciar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarActionPerformed(evt);
            }
        });

        gerenciar_A.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        gerenciar_A.setText("Gerenciar Amigos");
        gerenciar_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciar_AActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciar_A);
        gerenciar.add(jSeparator1);

        gerenciar_F.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        gerenciar_F.setText("Gerenciar Ferramentas");
        gerenciar_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciar_FActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciar_F);
        gerenciar.add(jSeparator4);

        gerenciar_E.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        gerenciar_E.setText("Gerenciar Empréstimo");
        gerenciar_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciar_EActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciar_E);

        jMenuBar1.add(gerenciar);

        relatorio_f.setBackground(new java.awt.Color(51, 51, 51));
        relatorio_f.setForeground(new java.awt.Color(255, 255, 255));
        relatorio_f.setText("Relatório");
        relatorio_f.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        relatorio_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio_fActionPerformed(evt);
            }
        });

        relatorio_A.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        relatorio_A.setText("Relatório de Amigos");
        relatorio_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio_AActionPerformed(evt);
            }
        });
        relatorio_f.add(relatorio_A);
        relatorio_f.add(jSeparator2);

        relatorio_F.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        relatorio_F.setText("Relatório de Ferramentas");
        relatorio_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio_FActionPerformed(evt);
            }
        });
        relatorio_f.add(relatorio_F);
        relatorio_f.add(jSeparator7);

        relatorio_E.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        relatorio_E.setText("Relatório de Empréstimo Ativos");
        relatorio_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorio_EActionPerformed(evt);
            }
        });
        relatorio_f.add(relatorio_E);

        jMenuBar1.add(relatorio_f);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_AActionPerformed

        CadastrarAmigos objeto = new CadastrarAmigos();
        objeto.setVisible(true);

    }//GEN-LAST:event_cadastrar_AActionPerformed

    private void cadastrar_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_FActionPerformed

        CadastrarFerramentas objeto = new CadastrarFerramentas();
        objeto.setVisible(true);

    }//GEN-LAST:event_cadastrar_FActionPerformed

    private void gerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarActionPerformed

    }//GEN-LAST:event_gerenciarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        Emprestimo objeto = new Emprestimo();
        objeto.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void relatorio_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio_FActionPerformed

        Relatorio_F objeto = new Relatorio_F();
        objeto.setVisible(true);

    }//GEN-LAST:event_relatorio_FActionPerformed

    private void relatorio_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio_EActionPerformed

        Relatorio_E objeto = new Relatorio_E();
        objeto.setVisible(true);

    }//GEN-LAST:event_relatorio_EActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        Devolucao objeto = new Devolucao();
        objeto.setVisible(true);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void relatorio_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio_fActionPerformed

    }//GEN-LAST:event_relatorio_fActionPerformed

    private void gerenciar_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciar_AActionPerformed

        GerenciarAmigos objeto = new GerenciarAmigos();
        objeto.setVisible(true);
        
    }//GEN-LAST:event_gerenciar_AActionPerformed

    private void gerenciar_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciar_FActionPerformed

        GerenciarFerramentas objeto = new GerenciarFerramentas();
        objeto.setVisible(true);
        
    }//GEN-LAST:event_gerenciar_FActionPerformed

    private void gerenciar_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciar_EActionPerformed

        GerenciarEmprestimos objeto = new GerenciarEmprestimos();
        objeto.setVisible(true);

    }//GEN-LAST:event_gerenciar_EActionPerformed

    private void relatorio_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorio_AActionPerformed
       
        Relatorio_A objeto = new Relatorio_A();
        objeto.setVisible(true);
        
    }//GEN-LAST:event_relatorio_AActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrar;
    private javax.swing.JMenuItem cadastrar_A;
    private javax.swing.JMenuItem cadastrar_F;
    private java.awt.Choice choice1;
    private javax.swing.JMenu emp_e_dev;
    private javax.swing.JMenu gerenciar;
    private javax.swing.JMenuItem gerenciar_A;
    private javax.swing.JMenuItem gerenciar_E;
    private javax.swing.JMenuItem gerenciar_F;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JTree jTree1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenuItem relatorio_A;
    private javax.swing.JMenuItem relatorio_E;
    private javax.swing.JMenuItem relatorio_F;
    private javax.swing.JMenu relatorio_f;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}