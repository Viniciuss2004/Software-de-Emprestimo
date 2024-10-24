package View;

import java.sql.DriverManager;
import Model.Emprestimo_M;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Devolucao extends javax.swing.JFrame {

    private final Emprestimo_M objEmp;
    private Connection conexao;

    public Devolucao() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        b_apagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(565, 420));
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
                "Id", "Nome", "Ferramenta", "Cod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
            tabela.getColumnModel().getColumn(1).setMinWidth(100);
            tabela.getColumnModel().getColumn(3).setMinWidth(0);
            tabela.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 80, 340, 151);

        b_apagar.setText("Devolver");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(b_apagar);
        b_apagar.setBounds(310, 290, 100, 25);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 282, 0, 0);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(160, 290, 100, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Devolução.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 560, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

    }//GEN-LAST:event_tabelaMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {

            int id_e = 0;
            int id_f = 0;

            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione o Empréstimo");
            } else {
                id_e = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 0).toString());
            }

            if (this.tabela.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione o Empréstimo");
            } else {
                id_f = Integer.parseInt(this.tabela.getValueAt(this.tabela.getSelectedRow(), 3).toString());

            }

            if (this.objEmp.DeleteEmprestimoBD(id_e)) {

                JOptionPane.showMessageDialog(rootPane, "Ferramenta Devolvida com Sucesso!");

            }
            
            String url = "jdbc:mysql://localhost/trabalho";
            String usuario = "root";
            String senha = "Vini240804";
            conexao = DriverManager.getConnection(url, usuario, senha);
            String updateQuery = "UPDATE ferramentas SET Status = 'Disponível' WHERE Id_f = " + id_f;
            Statement statement = conexao.createStatement();
            statement.executeUpdate(updateQuery);
            conexao.prepareStatement(updateQuery);

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Devolucao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabela();
        }

    }//GEN-LAST:event_b_apagarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabela.getColumnModel().getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        try {

            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalho", "root", "Vini240804");

            String sql = "SELECT Id_e, Nome, Ferramenta, Cod FROM emprestimos";
            Statement statement = conexao.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("Id_e");
                String nome = resultSet.getString("Nome");
                String ferramenta = resultSet.getString("Ferramenta");
                String cod = resultSet.getString("cod");

                modelo.addRow(new Object[]{id, nome, ferramenta, cod});
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            
            try {

                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
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
            java.util.logging.Logger.getLogger(Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Devolucao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
