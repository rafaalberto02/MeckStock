package com.mecindustries.meckstock.view.movimentacao;

import com.mecindustries.meckstock.controller.ItemController;
import com.mecindustries.meckstock.controller.MovimentacaoController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.controller.SetorController;
import com.mecindustries.meckstock.controller.UsuarioController;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;
import com.mecindustries.meckstock.model.Item;
import com.mecindustries.meckstock.model.Patrimonio;
import com.mecindustries.meckstock.model.Setor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fael
 */
public class ListarMovimentacaoFrame extends javax.swing.JFrame {

    public ListarMovimentacaoFrame() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMovimentacoes = new javax.swing.JTable();
        checkBoxEmAberto = new javax.swing.JCheckBox();
        checkBoxDevolvidos = new javax.swing.JCheckBox();
        buttonDevolver = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        tableMovimentacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Usuario", "Setor Origem", "Setor Emprestimo", "Data Retirada", "Data Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMovimentacoes);

        checkBoxEmAberto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkBoxEmAberto.setSelected(true);
        checkBoxEmAberto.setText("Em Aberto");
        checkBoxEmAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxEmAbertoActionPerformed(evt);
            }
        });

        checkBoxDevolvidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        checkBoxDevolvidos.setSelected(true);
        checkBoxDevolvidos.setText("Devolvidos");
        checkBoxDevolvidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDevolvidosActionPerformed(evt);
            }
        });

        buttonDevolver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonDevolver.setText("Devolver");
        buttonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverActionPerformed(evt);
            }
        });

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogo)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxEmAberto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxDevolvidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(buttonDevolver)
                .addGap(310, 310, 310)
                .addComponent(buttonVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(checkBoxEmAberto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxDevolvidos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDevolver)
                    .addComponent(buttonVoltar))
                .addGap(46, 46, 46)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxEmAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxEmAbertoActionPerformed
        listar();
    }//GEN-LAST:event_checkBoxEmAbertoActionPerformed

    private void checkBoxDevolvidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDevolvidosActionPerformed
        listar();
    }//GEN-LAST:event_checkBoxDevolvidosActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverActionPerformed
        if (tableMovimentacoes.getSelectedRow() >= 0) {
            if (tableMovimentacoes.getValueAt(tableMovimentacoes.getSelectedRow(), 6) != null) {
                JOptionPane.showMessageDialog(null, "Este item ja foi devolvido");
            } else {
                int id = Integer.valueOf(String.valueOf(tableMovimentacoes.getValueAt(tableMovimentacoes.getSelectedRow(), 0)));

                if (MovimentacaoController.devolver(id)) {
                    JOptionPane.showMessageDialog(null, "Item devolvido");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao devolver item");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar ao menos um item da tabela");
        }
        listar();
    }//GEN-LAST:event_buttonDevolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ListarMovimentacaoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDevolver;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JCheckBox checkBoxDevolvidos;
    private javax.swing.JCheckBox checkBoxEmAberto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tableMovimentacoes;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        List<HistoricoMovimentacao> movimentacoes = new ArrayList<>();

        if (checkBoxDevolvidos.isSelected()) {
            MovimentacaoController.getClosed().forEach(movimentacao -> {
                movimentacoes.add(movimentacao);
            });
        }

        if (checkBoxEmAberto.isSelected()) {
            MovimentacaoController.getOpen().forEach(movimentacao -> {
                movimentacoes.add(movimentacao);
            });
        }

        System.out.println(movimentacoes);

        DefaultTableModel model = (DefaultTableModel) tableMovimentacoes.getModel();
        model.setRowCount(0);

        movimentacoes.forEach(movimentacao -> {
            model.addRow(addLine(movimentacao));
        });
    }

    private Object[] addLine(HistoricoMovimentacao movimentacao) {
        Item item = ItemController.getById(movimentacao.getIdItem());
        Patrimonio patrimonio = PatrimonioController.searchById(item.getIdPatrimonio());
        Setor setor = SetorController.searchById(item.getIdSetor());

        Object[] linha = {
            movimentacao.getId(),
            patrimonio.getNome(),
            UsuarioController.searchById(movimentacao.getIdUsuario()).getNome(),
            patrimonio.getId() + " - " + setor.getNome(),
            movimentacao.getIdSetor() + " - " + setor.getNome(),
            movimentacao.getDataRetirada().toString(),
            (movimentacao.getDataDevolucao() != null)
            ? movimentacao.getDataDevolucao().toString()
            : null
        };

        return linha;
    }
}
