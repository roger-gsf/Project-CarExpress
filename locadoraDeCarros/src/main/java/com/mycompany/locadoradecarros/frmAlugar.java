package com.mycompany.locadoradecarros;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmAlugar extends javax.swing.JFrame {

    private frmHome frmHomee;

    public frmAlugar(frmHome frmHomee) {
        initComponents();
        this.frmHomee = frmHomee;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarroInformacoes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAlugarCarro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlacaCarro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ftxtDataDevolucao = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ftxtDataInicio = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Carros disponiveis");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblCarroInformacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Potência", "Cor", "Ano", "Placa", "Status", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarroInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarroInformacoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarroInformacoes);

        btnAlugarCarro.setText("Alugar carro");
        btnAlugarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarCarroActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do cliente:");

        jLabel2.setText("Placa do carro:");

        txtPlacaCarro.setEditable(false);

        jLabel4.setText("Data de devolução:");

        try {
            ftxtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Pro Heavy", 0, 24)); // NOI18N
        jLabel3.setText("Locação de carro");

        jLabel5.setText("Data de inicio:");

        try {
            ftxtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ftxtDataInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ftxtDataDevolucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnAlugarCarro)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftxtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnAlugarCarro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        frmHomee.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            exibirRegistros();
            tblCarroInformacoes.setRowSelectionInterval(0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(frmAlugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tblCarroInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarroInformacoesMouseClicked
        txtPlacaCarro.setText((String) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 5));

    }//GEN-LAST:event_tblCarroInformacoesMouseClicked

    private void btnAlugarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarCarroActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar este cliente?", "Mensagem de confirmacao", JOptionPane.YES_NO_OPTION) == 0
                && (Boolean) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 6) != false
                && (int) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 7) != -1
                && (buscarId(txtNomeCliente.getText())) != -1) {

            try {
                Connection conexao = conectarBanco();

                String sql = "INSERT INTO Locacao (carro_id, cliente_id, data_inicio, data_fim, statusCarro) VALUES (?, ?, ?, ?, ?)";

                PreparedStatement pstmt = conexao.prepareStatement(sql);
                // buscarId(txtNomeCliente.getText())
                String valor = (String) txtNomeCliente.getText();
                int idCliente = buscarId(valor); // -1 == não encontrado

                int idCarro = (int) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 7); // -1 == não encontrado

                //Date dataInicio = Date.valueOf(LocalDate.now());
                // ftxtDataInicio
                String dataString = ftxtDataInicio.getText();
                DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataString, formatterEntrada);

                Date dataInicio = Date.valueOf(data);

                String dataString2 = ftxtDataDevolucao.getText();
                DateTimeFormatter formatterEntrada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data2 = LocalDate.parse(dataString2, formatterEntrada2);

                Date dataFinal = Date.valueOf(data2);

                // Date dataFinal = Date.valueOf(dataFormatada);
                //String nome = txtNome.getText();
                pstmt.setInt(1, idCarro);
                pstmt.setInt(2, idCliente); // posições do String sql
                pstmt.setDate(3, dataInicio);
                pstmt.setDate(4, dataFinal);
                pstmt.setBoolean(5, false);

                pstmt.executeUpdate();
                pstmt.close();
                conexao.close();

                atualizarStatus(idCarro);

                txtNomeCliente.setText("");
                txtPlacaCarro.setText("");
                ftxtDataDevolucao.setText("");
                //tblCarroInformacoes.clearSelection();
                tblCarroInformacoes.setRowSelectionInterval(0, 0);
                exibirRegistros();

            } catch (SQLException | HeadlessException ex) {
                Logger.getLogger(frmCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Coloque uma data de devolução adequada!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if ((Boolean) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 6) == false) {
                JOptionPane.showMessageDialog(null, "Este carro já esta sendo alugado por alguém!", "Tentativa de locação anulada", JOptionPane.ERROR_MESSAGE);
                limparCampos();
            } else if ((int) tblCarroInformacoes.getValueAt(tblCarroInformacoes.getSelectedRow(), 7) == -1) {
                JOptionPane.showMessageDialog(null, "Carro não selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
                limparCampos();
            } else if ((buscarId(txtNomeCliente.getText())) == -1) {
                JOptionPane.showMessageDialog(null, "Cliente não registrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                limparCampos();
            }

        }
    }//GEN-LAST:event_btnAlugarCarroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmAlugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlugar(new frmHome()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugarCarro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtDataDevolucao;
    private javax.swing.JFormattedTextField ftxtDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarroInformacoes;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPlacaCarro;
    // End of variables declaration//GEN-END:variables

    private void exibirRegistros() throws SQLException {

        String sql = "SELECT Carro.id AS ID, Marca.nome AS marca, Modelo.nome AS Modelo, Carro.potencia_motor AS Potência, Carro.cor AS Cor, Carro.ano AS Ano, Carro.placa AS Placa, Carro.disponivel AS STATUS FROM carro INNER JOIN Modelo ON Carro.modelo_id = Modelo.id INNER JOIN Marca ON Modelo.marca_id = Marca.id";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblCarroInformacoes.getModel();
            model.setRowCount(0);

            while (rs.next()) {

                int id = rs.getInt("ID");
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                float potencia = rs.getFloat("Potência");
                String cor = rs.getString("Cor");
                int ano = rs.getInt("Ano");
                String placa = rs.getString("Placa");
                boolean status = rs.getBoolean("Status");

                model.addRow(new Object[]{marca, modelo, potencia, cor, ano, placa, status, id});

            }
        } catch (SQLException ex) {
            // Lidar com erros de banco de dados
            JOptionPane.showMessageDialog(this, "Erro ao buscar registros: " + ex.getMessage());
        }

    }

    private int buscarId(String valor) {

        String sql = "SELECT id FROM Cliente WHERE nome = ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            pstmt.setString(1, valor);

            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao buscar registros: " + ex.getMessage());
        }
        return -1;
    }

    private void atualizarStatus(int idCarro) {

        String sql = "UPDATE Carro SET disponivel = FALSE WHERE id = ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCarro);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(frmCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limparCampos() {
        txtNomeCliente.setText("");
        txtPlacaCarro.setText("");
        ftxtDataDevolucao.setText("");
        tblCarroInformacoes.setRowSelectionInterval(0, 0);
}