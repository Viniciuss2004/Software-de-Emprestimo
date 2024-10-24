package View;

import Model.Amigos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class CadastrarAmigos extends javax.swing.JFrame {

    private final Amigos objAmigo;

    public CadastrarAmigos() {
        initComponents();
        this.objAmigo = new Amigos();
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
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        c_telefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(137, 88, 47, 15);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefone:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 120, 60, 15);

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar);
        b_cadastrar.setBounds(270, 170, 100, 25);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(160, 170, 90, 25);

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.setForeground(new java.awt.Color(0, 0, 0));
        c_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(c_nome);
        c_nome.setBounds(187, 86, 160, 20);

        c_telefone.setBackground(new java.awt.Color(204, 204, 204));
        c_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c_telefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            c_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(c_telefone);
        c_telefone.setBounds(187, 118, 111, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar Amigos.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 300);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 50, 70, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {

            String nome = "";
            String telefone = "";

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

            if (this.c_telefone.getText().length() == 0) {
                throw new Mensagens("O campo Telefone está vazio..");
           
            } else {
                telefone = this.c_telefone.getText();
            }

            if (this.c_telefone.getText().length() > 16) {
                throw new Mensagens("Número inválido!");
            
            } else {
                telefone = this.c_telefone.getText();
            }

            if (this.objAmigo.InsertAmigosBD(nome, telefone)) {

                this.c_nome.setText("");
                this.c_telefone.setText("");
                
                JOptionPane.showMessageDialog(rootPane, "Amigo cadastrado com Sucesso!");
            }
            
            System.out.println(this.objAmigo.getMinhaLista().toString());
            
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAmigos.class.getName()).log(Level.SEVERE, null, ex);
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
            new CadastrarAmigos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_nome;
    private javax.swing.JFormattedTextField c_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
