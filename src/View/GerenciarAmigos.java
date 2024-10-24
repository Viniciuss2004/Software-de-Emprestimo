package View;

import Model.Amigos;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class GerenciarAmigos extends javax.swing.JFrame {

    private final Amigos objAmigo;

    public GerenciarAmigos() {
        initComponents();
        this.objAmigo = new Amigos();
        this.carregaTabela();
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
        tabela = new javax.swing.JTable();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        g_nome = new javax.swing.JTextField();
        g_telefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(566, 413));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(102, 102, 102));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setName(""); // NOI18N
        tabela.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(15);
            tabela.getColumnModel().getColumn(0).setMaxWidth(30);
            tabela.getColumnModel().getColumn(1).setMinWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 60, 330, 151);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(130, 310, 90, 25);

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(b_alterar);
        b_alterar.setBounds(240, 310, 90, 25);

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(b_apagar);
        b_apagar.setBounds(350, 310, 90, 25);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 230, 50, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("  Telefone:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 260, 60, 20);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 282, 0, 0);

        g_nome.setBackground(new java.awt.Color(204, 204, 204));
        g_nome.setForeground(new java.awt.Color(0, 0, 0));
        g_nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        g_nome.setText("  ");
        g_nome.setToolTipText(" ");
        g_nome.setActionCommand("<não definido>");
        g_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_nome.setCaretColor(new java.awt.Color(0, 0, 0));
        g_nome.setDragEnabled(true);
        g_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(g_nome);
        g_nome.setBounds(210, 230, 180, 20);

        g_telefone.setBackground(new java.awt.Color(204, 204, 204));
        g_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_telefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            g_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        g_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(g_telefone);
        g_telefone.setBounds(210, 260, 140, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerenciar Amigos.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 570, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {

            int id_a = 0;
            String nome_a = "";
            String telefone = "";

            if (this.g_nome.getText().length() == 0) {
                throw new Mensagens("O campo Nome está vazio.");
            
            } else {
                nome_a = this.g_nome.getText();
            }

            if (this.g_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
           
            } else {
                nome_a = this.g_nome.getText();
            }

            if (this.g_telefone.getText().length() == 0) {
                throw new Mensagens("O campo Telefone está vazio..");
            
            } else {
                telefone = this.g_telefone.getText();
            }

            if (this.g_telefone.getText().length() > 16) {
                throw new Mensagens("Número inválido!");
            
            } else {
                telefone = this.g_telefone.getText();
            }

            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para Alterar");
           
            } else {
                id_a = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            if (this.objAmigo.UpdateAmigosBD(id_a, nome_a, telefone)) {

                this.g_nome.setText(" ");
                this.g_telefone.setText(" ");

                JOptionPane.showMessageDialog(rootPane, "Amigo alterado com Sucesso!");
            }
            
            System.out.println(this.objAmigo.getMinhaLista().toString());
            
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); 
        }
        
    }//GEN-LAST:event_b_alterarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (this.tabela.getSelectedRow() != -1) {

            String nome_a = this.tabela.getValueAt(this.tabela.getSelectedRow(), 1).toString();
            String telefone = this.tabela.getValueAt(this.tabela.getSelectedRow(), 2).toString();

            this.g_nome.setText(nome_a);
            this.g_telefone.setText(telefone);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        
        try {

            int id_a = 0;
            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para APAGAR");
            } else {
                id_a = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Amigo?");

            if (resposta_usuario == 0) {
                
                if (this.objAmigo.DeleteAmigosBD(id_a)) {

                    this.g_nome.setText("");
                    this.g_telefone.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo Apagado com Sucesso!");
                }
            }

            System.out.println(this.objAmigo.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void g_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_nomeActionPerformed

    }//GEN-LAST:event_g_nomeActionPerformed

    private void g_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_telefoneActionPerformed

    }//GEN-LAST:event_g_telefoneActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabela.getColumnModel().getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        ArrayList<Amigos> minhalista = new ArrayList<>();
        minhalista = objAmigo.getMinhaLista();

        for (Amigos a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId_a(),
                a.getNome_a(),
                a.getTelefone()
            });
        }
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GerenciarAmigos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField g_nome;
    private javax.swing.JFormattedTextField g_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}