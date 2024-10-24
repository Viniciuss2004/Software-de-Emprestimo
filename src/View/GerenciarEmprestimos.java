package View;

import Model.Emprestimo_M;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class GerenciarEmprestimos extends javax.swing.JFrame {

    private final Emprestimo_M objEmp;

    public GerenciarEmprestimos() {
        initComponents();
        this.objEmp = new Emprestimo_M();
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        e_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        e_ferramenta = new javax.swing.JTextField();
        data_e = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data_d = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(590, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Ferramenta", "Data de Empréstimo", "Data de Devolução", "Cod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tabela.getColumnModel().getColumn(1).setMinWidth(100);
            tabela.getColumnModel().getColumn(1).setMaxWidth(130);
            tabela.getColumnModel().getColumn(2).setMinWidth(90);
            tabela.getColumnModel().getColumn(2).setMaxWidth(90);
            tabela.getColumnModel().getColumn(3).setMinWidth(130);
            tabela.getColumnModel().getColumn(3).setMaxWidth(130);
            tabela.getColumnModel().getColumn(4).setMinWidth(120);
            tabela.getColumnModel().getColumn(4).setMaxWidth(120);
            tabela.getColumnModel().getColumn(5).setMinWidth(0);
            tabela.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 500, 151);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(190, 370, 90, 25);

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(b_alterar);
        b_alterar.setBounds(310, 370, 90, 25);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 230, 50, 20);

        e_nome.setBackground(new java.awt.Color(204, 204, 204));
        e_nome.setForeground(new java.awt.Color(0, 0, 0));
        e_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        e_nome.setCaretColor(new java.awt.Color(51, 51, 51));
        e_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(e_nome);
        e_nome.setBounds(210, 230, 219, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ferramenta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 260, 80, 15);

        e_ferramenta.setBackground(new java.awt.Color(204, 204, 204));
        e_ferramenta.setForeground(new java.awt.Color(0, 0, 0));
        e_ferramenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        e_ferramenta.setCaretColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(e_ferramenta);
        e_ferramenta.setBounds(210, 260, 120, 17);

        data_e.setBackground(new java.awt.Color(204, 204, 204));
        data_e.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        data_e.setForeground(new java.awt.Color(0, 0, 0));
        try {
            data_e.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_e.setCaretColor(new java.awt.Color(0, 0, 0));
        data_e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                data_eFocusLost(evt);
            }
        });
        data_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_eActionPerformed(evt);
            }
        });
        getContentPane().add(data_e);
        data_e.setBounds(210, 290, 90, 17);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Data de Empréstimo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 290, 120, 15);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data de Devolução:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 320, 109, 20);

        data_d.setBackground(new java.awt.Color(204, 204, 204));
        data_d.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        data_d.setForeground(new java.awt.Color(0, 0, 0));
        try {
            data_d.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_d.setCaretColor(new java.awt.Color(0, 0, 0));
        data_d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                data_dFocusLost(evt);
            }
        });
        data_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_dActionPerformed(evt);
            }
        });
        getContentPane().add(data_d);
        data_d.setBounds(210, 320, 90, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerenciar Empréstimo Ativos.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {

            int id_e = 0;
            String nome = "";
            String ferramenta = "";
            String data_e = "";
            String data_d = "";

            if (this.e_nome.getText().length() == 0) {
                throw new Mensagens("O campo Nome está vazio.");

            } else {
                nome = this.e_nome.getText();
            }

            if (this.e_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");

            } else {
                nome = this.e_nome.getText();
            }

            if (this.e_ferramenta.getText().length() == 0) {
                throw new Mensagens("O campo Marca está vazio.");

            } else {
                ferramenta = this.e_ferramenta.getText();
            }

            if (this.e_ferramenta.getText().length() < 2) {
                throw new Mensagens("Marca deve ter pelo menos 2 caracteres.");

            } else {
                ferramenta = this.e_ferramenta.getText();
            }

            if (this.data_e.getText().length() == 0) {
                throw new Mensagens("Data inválida!");

            } else {
                String dataTexto = this.data_e.getText();
                SimpleDateFormat sdf = new SimpleDateFormat(" dd / MM / yyyy");
                java.util.Date parsedDate;
                try {
                    parsedDate = sdf.parse(dataTexto);
                    java.sql.Date data = new java.sql.Date(parsedDate.getTime());
                    Date data2 = data;
                    data_e = data2.toString();

                } catch (ParseException ex) {
                }
            }

            if (this.data_d.getText().length() == 0) {
                throw new Mensagens("Data inválida!");
            } else {
                String dataTexto = this.data_d.getText();
                SimpleDateFormat sdf = new SimpleDateFormat(" dd / MM / yyyy");
                java.util.Date parsedDate;
                try {
                    parsedDate = sdf.parse(dataTexto);
                    java.sql.Date data = new java.sql.Date(parsedDate.getTime());
                    Date data2 = data;
                    data_d = data2.toString();
                    // Agora você pode usar a variável 'data_e' como um objeto java.sql.Date
                } catch (ParseException ex) {
                    ex.printStackTrace();
                    // Trate o erro de parsing de data aqui
                }
            }

            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id_e = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objEmp.UpdateEmprestimoBD(id_e, nome, ferramenta, data_e, data_d, null)) {

                // limpa os campos
                this.e_nome.setText("");
                this.e_ferramenta.setText("");
                this.data_e.setText("");
                this.data_d.setText("");

                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterada com Sucesso!");

            }
            System.out.println(this.objEmp.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (this.tabela.getSelectedRow() != -1) {

            String nome = this.tabela.getValueAt(this.tabela.getSelectedRow(), 1).toString();
            String ferramenta = this.tabela.getValueAt(this.tabela.getSelectedRow(), 2).toString();
            String data_e = this.tabela.getValueAt(this.tabela.getSelectedRow(), 3).toString();
            String data_d = this.tabela.getValueAt(this.tabela.getSelectedRow(), 4).toString();

            this.e_nome.setText(nome);
            this.e_ferramenta.setText(ferramenta);
            this.data_e.setText(data_e);
            this.data_d.setText(data_d);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void e_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_nomeActionPerformed

    }//GEN-LAST:event_e_nomeActionPerformed

    private void data_eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_eFocusLost

    }//GEN-LAST:event_data_eFocusLost

    private void data_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_eActionPerformed

    }//GEN-LAST:event_data_eActionPerformed

    private void data_dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_dFocusLost

    }//GEN-LAST:event_data_dFocusLost

    private void data_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_dActionPerformed

    }//GEN-LAST:event_data_dActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabela.getColumnModel().getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        ArrayList<Emprestimo_M> minhalista = new ArrayList<>();
        minhalista = objEmp.getMinhaLista();

        for (Emprestimo_M a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId_e(),
                a.getNome_e(),
                a.getFerramenta(),
                a.getData_e(),
                a.getData_d()

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
            java.util.logging.Logger.getLogger(GerenciarEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GerenciarEmprestimos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JFormattedTextField data_d;
    private javax.swing.JFormattedTextField data_e;
    private javax.swing.JTextField e_ferramenta;
    private javax.swing.JTextField e_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
