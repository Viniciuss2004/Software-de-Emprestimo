package View;

import Model.Ferramentas;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class GerenciarFerramentas extends javax.swing.JFrame {

    private String estado;
    private final Ferramentas objFerramenta;

    public GerenciarFerramentas() {
        initComponents();
        this.objFerramenta = new Ferramentas();
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
        g_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        g_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        g_custoAq = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(566, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Status", "Marca", "Custo de Aquisição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(30);
            tabela.getColumnModel().getColumn(0).setMaxWidth(30);
            tabela.getColumnModel().getColumn(1).setMinWidth(60);
            tabela.getColumnModel().getColumn(1).setMaxWidth(100);
            tabela.getColumnModel().getColumn(2).setMinWidth(0);
            tabela.getColumnModel().getColumn(2).setMaxWidth(0);
            tabela.getColumnModel().getColumn(3).setMinWidth(80);
            tabela.getColumnModel().getColumn(3).setMaxWidth(80);
            tabela.getColumnModel().getColumn(4).setMinWidth(80);
            tabela.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 60, 310, 151);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(127, 320, 90, 25);

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(b_alterar);
        b_alterar.setBounds(240, 320, 90, 25);

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(b_apagar);
        b_apagar.setBounds(350, 320, 90, 25);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 220, 50, 20);

        g_nome.setBackground(new java.awt.Color(204, 204, 204));
        g_nome.setForeground(new java.awt.Color(0, 0, 0));
        g_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_nome.setCaretColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(g_nome);
        g_nome.setBounds(180, 220, 219, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 250, 50, 15);

        g_marca.setBackground(new java.awt.Color(204, 204, 204));
        g_marca.setForeground(new java.awt.Color(0, 0, 0));
        g_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_marca.setCaretColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(g_marca);
        g_marca.setBounds(180, 250, 120, 17);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Custo de Aquisição:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 280, 120, 15);

        g_custoAq.setBackground(new java.awt.Color(204, 204, 204));
        g_custoAq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_custoAq.setForeground(new java.awt.Color(0, 0, 0));
        g_custoAq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        getContentPane().add(g_custoAq);
        g_custoAq.setBounds(180, 130, 120, 20);
        g_custoAq.setBackground(new java.awt.Color(204, 204, 204));
        g_custoAq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g_custoAq.setForeground(new java.awt.Color(0, 0, 0));
        g_custoAq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_custoAqActionPerformed(evt);
            }
        });
        getContentPane().add(g_custoAq);
        g_custoAq.setBounds(180, 280, 110, 19);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerenciar Ferramentas.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 570, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {

            int id_f = 0;
            String nome = "";
            String status = "";
            String marca = "";
            String aquisicao = "";

            if (this.g_nome.getText().length() == 0) {
                throw new Mensagens("O campo Nome está vazio.");

            } else {
                nome = this.g_nome.getText();
            }

            if (this.g_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");

            } else {
                nome = this.g_nome.getText();

            }

            if (estado.equals("Emprestado")) {

                status = "Emprestado";
            }

            if (estado.equals("Disponível")) {

                status = "Disponível";
            }

            if (this.g_marca.getText().length() == 0) {
                throw new Mensagens("O campo Marca está vazio.");

            } else {
                marca = this.g_marca.getText();
            }

            if (this.g_marca.getText().length() < 2) {
                throw new Mensagens("Marca deve ter pelo menos 2 caracteres.");

            } else {
                marca = this.g_marca.getText();
            }

            if (this.g_custoAq.getText().length() == 0) {
                throw new Mensagens("O campo Custo de Aquisição está vazio.");

            } else {
                aquisicao = this.g_custoAq.getText();
            }

            if (this.g_custoAq.getText().length() >= 9) {
                throw new Mensagens("O valor da Ferramenta é muito alta.");
            
            } else {
                aquisicao = this.g_custoAq.getText();
            }

            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            
            } else {
                id_f = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            if (this.objFerramenta.UpdateFerramentasBD(id_f, nome, status, marca, aquisicao)) {

                this.g_nome.setText("");
                this.g_marca.setText("");
                this.g_custoAq.setText("");

                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterada com Sucesso!");
            }
            
            System.out.println(this.objFerramenta.getMinhaLista().toString());
            
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela(); 
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (this.tabela.getSelectedRow() != -1) {

            String nome = this.tabela.getValueAt(this.tabela.getSelectedRow(), 1).toString();
            String marca = this.tabela.getValueAt(this.tabela.getSelectedRow(), 3).toString();
            String aquisicao = this.tabela.getValueAt(this.tabela.getSelectedRow(), 4).toString();

            this.g_nome.setText(nome);
            this.g_marca.setText(marca);
            this.g_custoAq.setText(aquisicao);

            String a = this.tabela.getValueAt(this.tabela.getSelectedRow(), 2).toString();
            estado = a;
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {

            int id_f = 0;
            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para APAGAR");
           
            } else {
                id_f = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta Ferramenta?");

            if (resposta_usuario == 0) {
                
                if (this.objFerramenta.DeleteFerramentasBD(id_f)) {

                    this.g_nome.setText("");
                    this.g_marca.setText("");
                    this.g_custoAq.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");
                }
            }

            System.out.println(this.objFerramenta.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void g_custoAqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_custoAqActionPerformed

    }//GEN-LAST:event_g_custoAqActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabela.getColumnModel().getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        ArrayList<Ferramentas> minhalista = new ArrayList<>();
        minhalista = objFerramenta.getMinhaLista();

        for (Ferramentas a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId_f(),
                a.getNome_f(),
                a.getStatus(),
                a.getMarca(),
                a.getAquisicao()
            });
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GerenciarFerramentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JFormattedTextField g_custoAq;
    private javax.swing.JTextField g_marca;
    private javax.swing.JTextField g_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}