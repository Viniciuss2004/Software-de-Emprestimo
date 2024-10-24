package View;

import Model.Ferramentas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class CadastrarFerramentas extends javax.swing.JFrame {

    private final Ferramentas objFerramenta;

    public CadastrarFerramentas() {

        initComponents();
        this.objFerramenta = new Ferramentas(); 
        setIcon();
    }

    public void setIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Icone.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        c_custoAq = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Software");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 70, 47, 15);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 100, 47, 15);

        c_marca.setBackground(new java.awt.Color(204, 204, 204));
        c_marca.setForeground(new java.awt.Color(0, 0, 0));
        c_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(c_marca);
        c_marca.setBounds(180, 100, 120, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Custo de Aquisição: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 130, 120, 15);

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.setMaximumSize(new java.awt.Dimension(77, 25));
        b_cadastrar.setMinimumSize(new java.awt.Dimension(77, 25));
        b_cadastrar.setPreferredSize(new java.awt.Dimension(77, 25));
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar);
        b_cadastrar.setBounds(260, 200, 100, 25);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(140, 200, 90, 25);

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.setForeground(new java.awt.Color(0, 0, 0));
        c_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(c_nome);
        c_nome.setBounds(180, 70, 160, 20);

        c_custoAq.setBackground(new java.awt.Color(204, 204, 204));
        c_custoAq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c_custoAq.setForeground(new java.awt.Color(0, 0, 0));
        c_custoAq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        getContentPane().add(c_custoAq);
        c_custoAq.setBounds(180, 130, 120, 20);
        c_custoAq.setBackground(new java.awt.Color(204, 204, 204));
        c_custoAq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c_custoAq.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(c_custoAq);
        c_custoAq.setBounds(180, 130, 110, 19);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar Ferramentas.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 620, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {

            String nome = "";
            String status = "";
            String marca = "";
            String aquisicao = "";

            if (this.c_nome.getText().length() == 0) {
                throw new Mensagens("O campo Nome está vazio.");
            
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_marca.getText().length() == 0) {
                throw new Mensagens("O campo Marca está vazio.");
           
            } else {
                marca = this.c_marca.getText();
            }

            if (this.c_marca.getText().length() < 2) {
                throw new Mensagens("Marca deve ter pelo menos 2 caracteres.");
           
            } else {
                marca = this.c_marca.getText();
            }

            if (this.c_custoAq.getText().length() == 0) {
                throw new Mensagens("O campo Custo de Aquisição está vazio.");
           
            } else {
                aquisicao = this.c_custoAq.getText();
            }

            if (this.c_custoAq.getText().length() >= 9) {
                throw new Mensagens("O valor da Ferramenta é muito alta.");
           
            } else {
                aquisicao = this.c_custoAq.getText();
            }

            if (0 == 0) {
                status = "Disponível";
            }

            if (objFerramenta.InsertFerramentasBD(nome, status, marca, aquisicao)) {

                c_nome.setText("");
                c_marca.setText("");
                c_custoAq.setText("");

                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrada com Sucesso!");
            }
            
            System.out.println(objFerramenta.getMinhaLista().toString());
            
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número sem DDD.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarFerramentas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarFerramentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JFormattedTextField c_custoAq;
    private javax.swing.JTextField c_marca;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
