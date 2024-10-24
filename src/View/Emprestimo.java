package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Emprestimo_M;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Emprestimo extends javax.swing.JFrame {

    private Map<String, String> partesMap;
    private Emprestimo_M objEmp;
    private Connection conexao;
    private ResultSet resultSet;

    public Emprestimo() {
        initComponents();
        setIcon();
        this.objEmp = new Emprestimo_M();
        this.partesMap = new HashMap<>(); 

        try {
            
            String url = "jdbc:mysql://localhost/trabalho";
            String usuario = "root";
            String senha = "Vini240804";
            conexao = DriverManager.getConnection(url, usuario, senha);

            String consulta = "SELECT Nome FROM amigos";
            Statement statement = conexao.createStatement();
            resultSet = statement.executeQuery(consulta);

            while (resultSet.next()) {
                cbxAmigos.addItem(resultSet.getString("Nome"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o Banco de Dados");
        }

        try {

            String url = "jdbc:mysql://localhost/trabalho";
            String usuario = "root";
            String senha = "Vini240804";
            conexao = DriverManager.getConnection(url, usuario, senha);

            String consulta = "SELECT CONCAT(Id_f, ' - ',Nome) AS IdeNome FROM ferramentas";
            Statement statement = conexao.createStatement();
            resultSet = statement.executeQuery(consulta);

            while (resultSet.next()) {
                String ferramentaCompleta = resultSet.getString("IdeNome");
                String[] partes = ferramentaCompleta.split(" - ");
                partesMap.put(partes[1], partes[0]);
                cbxFerramentas.addItem(partes[1]);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o Banco de Dados");
        }
    }

    private void setIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Icone.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Emprestar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        data_e = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data_d = new javax.swing.JFormattedTextField();
        cbxAmigos = new javax.swing.JComboBox<>();
        cbxFerramentas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setTitle("Software");
        setMinimumSize(new java.awt.Dimension(540, 325));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 60, 40, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ferramenta: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 90, 72, 15);

        Emprestar.setText("Emprestar");
        Emprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmprestarActionPerformed(evt);
            }
        });
        getContentPane().add(Emprestar);
        Emprestar.setBounds(280, 200, 100, 25);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(160, 200, 100, 25);

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
        data_e.setBounds(220, 120, 90, 17);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Data de Empréstimo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 120, 120, 15);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data de Devolução:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 150, 109, 20);

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
        data_d.setBounds(220, 150, 90, 17);

        cbxAmigos.setBackground(new java.awt.Color(204, 204, 204));
        cbxAmigos.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        cbxAmigos.setForeground(new java.awt.Color(0, 0, 0));
        cbxAmigos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxAmigos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione"}) {
            @Override
            public void setSelectedItem(Object anObject) {
                if ("Selecione".equals(anObject)) {
                    // Ignorar a seleção da primeira linha
                } else {
                    super.setSelectedItem(anObject);
                }
            }
        });
        cbxAmigos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAmigosActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAmigos);
        cbxAmigos.setBounds(220, 60, 140, 20);

        cbxFerramentas.setBackground(new java.awt.Color(204, 204, 204));
        cbxFerramentas.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        cbxFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        cbxFerramentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxFerramentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione"}) {
            @Override
            public void setSelectedItem(Object anObject) {
                if ("Selecione".equals(anObject)) {
                    // Ignorar a seleção da primeira linha
                } else {
                    super.setSelectedItem(anObject);
                }
            }
        });
        cbxFerramentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFerramentasActionPerformed(evt);
            }
        });
        getContentPane().add(cbxFerramentas);
        cbxFerramentas.setBounds(220, 90, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Empréstimo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 290);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmprestarActionPerformed

        try {

            int id_f = 0;
            String nome_e = "";
            String ferramenta = "";
            Date data_e = null;
            Date data_d = null;
            int cod = 0;

            if ("Selecione".equals(this.cbxFerramentas.getSelectedItem().toString())) {
               
                throw new Mensagens("Selecione uma Ferramenta!");
                
            } else {

                id_f = Integer.parseInt(partesMap.get(cbxFerramentas.getSelectedItem().toString()));
            }

            if ("Selecione".equals(this.cbxAmigos.getSelectedItem().toString())) {
               
                throw new Mensagens("Selecione uma Pessoa!");
           
            } else {

                nome_e = cbxAmigos.getSelectedItem().toString();
            }

            if ("Selecione".equals(this.cbxFerramentas.getSelectedItem().toString())) {
               
                throw new Mensagens("Selecione uma Ferramenta!");
           
            } else {
                
                String ferramentaCompleta = this.cbxFerramentas.getSelectedItem().toString();
                String[] partes = ferramentaCompleta.split(" - ");
                ferramenta = partes[0];
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
                    data_e = data;
                    
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
                  
                    data_d = data;
                } catch (ParseException ex) {
                }
            }

            if ("Selecione".equals(this.cbxFerramentas.getSelectedItem().toString())) {
               
                throw new Mensagens("Selecione uma Pessoa!");
           
            } else {

                cod = Integer.parseInt(partesMap.get(cbxFerramentas.getSelectedItem().toString()));

            }

            String updateQuery = "UPDATE ferramentas SET Status = 'Emprestado' WHERE Id_f = " + id_f;
            Statement statement = conexao.createStatement();
            statement.executeUpdate(updateQuery);
            conexao.prepareStatement(updateQuery);

            String insertQuery = "INSERT INTO emprestimos (Nome, Ferramenta, Data_Emprestimo, Data_Devolucao, Cod) VALUES (?, ?, ?, ?, ?)";
            var preparedStatement = conexao.prepareStatement(insertQuery);
            
            preparedStatement.setString(1, nome_e);
            preparedStatement.setString(2, ferramenta);
            preparedStatement.setDate(3, new java.sql.Date(data_e.getTime()));
            preparedStatement.setDate(4, new java.sql.Date(data_d.getTime()));
            preparedStatement.setInt(5, cod);

            preparedStatement.executeUpdate();

            this.data_e.setText("");
            this.data_d.setText("");

            JOptionPane.showMessageDialog(rootPane, "Empréstimo realizado com sucesso!");

            System.out.println(this.objEmp.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Emprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_EmprestarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    private void data_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_eActionPerformed

    }//GEN-LAST:event_data_eActionPerformed

    private void data_eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_eFocusLost

    }//GEN-LAST:event_data_eFocusLost

    private void data_dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_dFocusLost
        
    }//GEN-LAST:event_data_dFocusLost

    private void data_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_dActionPerformed
        
    }//GEN-LAST:event_data_dActionPerformed

    private void cbxAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAmigosActionPerformed
        
    }//GEN-LAST:event_cbxAmigosActionPerformed

    private void cbxFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFerramentasActionPerformed
        
    }//GEN-LAST:event_cbxFerramentasActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emprestar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JComboBox<String> cbxAmigos;
    private javax.swing.JComboBox<String> cbxFerramentas;
    private javax.swing.JFormattedTextField data_d;
    private javax.swing.JFormattedTextField data_e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

    private Date SimpleDataFormat(String text) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(" dd / MM / yyyy");
            return dateFormat.parse(text);
        } catch (ParseException ex) {
            throw new RuntimeException("Erro ao converter data: " + ex.getMessage());
        }
    }
}