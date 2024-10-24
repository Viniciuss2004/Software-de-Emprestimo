package View;

import Model.Emprestimo_M;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Relatorio_E extends javax.swing.JFrame {

    private final Emprestimo_M objEmp;

    public Relatorio_E() {
        initComponents();
        this.objEmp = new Emprestimo_M(); // carrega objeto vazio de aluno
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
        b_sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(570, 445));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Ferramenta", "Data do Empréstimo", "Data de Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tabela.getColumnModel().getColumn(0).setMinWidth(80);
            tabela.getColumnModel().getColumn(1).setMinWidth(30);
            tabela.getColumnModel().getColumn(2).setMinWidth(30);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 522, 220);

        b_sair.setText("Sair");
        b_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sairActionPerformed(evt);
            }
        });
        getContentPane().add(b_sair);
        b_sair.setBounds(250, 340, 80, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório de Empréstimo Ativos.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 570, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sairActionPerformed
       
        this.setVisible(false);
        
    }//GEN-LAST:event_b_sairActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

    }//GEN-LAST:event_tabelaMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

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
                a.getNome_e(),
                a.getFerramenta(),
                a.getData_e(),
                a.getData_d(),
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
            java.util.logging.Logger.getLogger(Relatorio_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Relatorio_E().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_sair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}