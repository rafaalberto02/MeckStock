package com.mecindustries.meckstock.view.movimentacao;

import com.mecindustries.meckstock.controller.ItemController;
import com.mecindustries.meckstock.controller.MovimentacaoController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.controller.SetorController;
import com.mecindustries.meckstock.model.HistoricoMovimentacao;
import com.mecindustries.meckstock.model.Item;
import com.mecindustries.meckstock.model.Setor;
import com.mecindustries.meckstock.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fael
 */
public class RealizarMovimentacaoFrame extends javax.swing.JFrame {

    private Item item;
    private List<Setor> setores;
    private final Usuario usuario;

    public RealizarMovimentacaoFrame(Usuario usuario) {
        initComponents();
        loadComboBoxes();
        this.usuario = usuario;
    }

    public RealizarMovimentacaoFrame(Item itemToPatch, Usuario usuario) {
        initComponents();
        loadComboBoxes();
        this.item = itemToPatch;
        patchValues();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        panelId = new javax.swing.JPanel();
        labelCategoria1 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        panelId1 = new javax.swing.JPanel();
        labelCategoria2 = new javax.swing.JLabel();
        comboBoxSetorAtual = new javax.swing.JComboBox<>();
        panelId3 = new javax.swing.JPanel();
        labelCategoria4 = new javax.swing.JLabel();
        comboBoxSetorDestino = new javax.swing.JComboBox<>();
        panelId2 = new javax.swing.JPanel();
        labelCategoria3 = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        buttonRealizarMovimentacao = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelCategoria1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria1.setText("ID Item:");

        textFieldId.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldIdKeyTyped(evt);
            }
        });

        buttonPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPesquisarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelIdLayout = new javax.swing.GroupLayout(panelId);
        panelId.setLayout(panelIdLayout);
        panelIdLayout.setHorizontalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria1)
                .addGap(18, 18, 18)
                .addComponent(textFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );
        panelIdLayout.setVerticalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria1)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCategoria2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria2.setText("Setor atual:");

        comboBoxSetorAtual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBoxSetorAtual.setEnabled(false);
        comboBoxSetorAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSetorAtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelId1Layout = new javax.swing.GroupLayout(panelId1);
        panelId1.setLayout(panelId1Layout);
        panelId1Layout.setHorizontalGroup(
            panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelCategoria2)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelId1Layout.createSequentialGroup()
                    .addContainerGap(262, Short.MAX_VALUE)
                    .addComponent(comboBoxSetorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );
        panelId1Layout.setVerticalGroup(
            panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria2)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelId1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(comboBoxSetorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        labelCategoria4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria4.setText("Setor destino:");

        comboBoxSetorDestino.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBoxSetorDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSetorDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelId3Layout = new javax.swing.GroupLayout(panelId3);
        panelId3.setLayout(panelId3Layout);
        panelId3Layout.setHorizontalGroup(
            panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria4)
                .addGap(18, 18, 18)
                .addComponent(comboBoxSetorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panelId3Layout.setVerticalGroup(
            panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelId3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxSetorDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(panelId3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCategoria4)))
                .addContainerGap())
        );

        labelCategoria3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria3.setText("Nome:");

        textFieldNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelId2Layout = new javax.swing.GroupLayout(panelId2);
        panelId2.setLayout(panelId2Layout);
        panelId2Layout.setHorizontalGroup(
            panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria3)
                .addGap(18, 18, 18)
                .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(141, 141, 141))
        );
        panelId2Layout.setVerticalGroup(
            panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria3)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonRealizarMovimentacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonRealizarMovimentacao.setText("Realizar Movimentação");
        buttonRealizarMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRealizarMovimentacaoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonRealizarMovimentacao)
                                .addGap(335, 335, 335)
                                .addComponent(buttonVoltar))
                            .addComponent(panelId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panelId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panelId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRealizarMovimentacao)
                    .addComponent(buttonVoltar))
                .addGap(95, 95, 95)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldIdKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_textFieldIdKeyTyped

    private void buttonPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseClicked
        searchItem();
    }//GEN-LAST:event_buttonPesquisarMouseClicked

    private void comboBoxSetorAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSetorAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSetorAtualActionPerformed

    private void comboBoxSetorDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSetorDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSetorDestinoActionPerformed

    private void textFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeKeyTyped

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonRealizarMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRealizarMovimentacaoActionPerformed
        HistoricoMovimentacao movimentacao = new HistoricoMovimentacao(this.usuario.getId(), getSelectedSetor().getId(), this.item.getId());
        MovimentacaoController.create(movimentacao);
    }//GEN-LAST:event_buttonRealizarMovimentacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonRealizarMovimentacao;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxSetorAtual;
    private javax.swing.JComboBox<String> comboBoxSetorDestino;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelCategoria2;
    private javax.swing.JLabel labelCategoria3;
    private javax.swing.JLabel labelCategoria4;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelId;
    private javax.swing.JPanel panelId1;
    private javax.swing.JPanel panelId2;
    private javax.swing.JPanel panelId3;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

    private void loadComboBoxes() {

        this.setores = SetorController.getAll();

        this.setores.forEach(setor -> {
            comboBoxSetorAtual.addItem(setor.getId() + " - " + setor.getNome());
            comboBoxSetorDestino.addItem(setor.getId() + " - " + setor.getNome());

        });

        comboBoxSetorAtual.setSelectedIndex(-1);
        comboBoxSetorDestino.setSelectedIndex(-1);
    }

    private void searchItem() {
        int id = Integer.valueOf(textFieldId.getText());

        this.item = ItemController.getById(id);
        if (item != null) {
            patchValues();
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado");
        }
    }

    private void patchValues() {
        if (!MovimentacaoController.hasOpenMove(item.getId())) {

            textFieldId.setText(item.getId() + "");
            textFieldNome.setText(PatrimonioController.searchById(item.getIdPatrimonio()).getNome());
            for (int i = 0; i < this.setores.size(); i++) {
                if (this.setores.get(i).getId() == item.getIdSetor()) {
                    comboBoxSetorAtual.setSelectedIndex(i);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma movimentação em aberto com este item");
        }
    }

    private Setor getSelectedSetor() {
        return this.setores.get(comboBoxSetorDestino.getSelectedIndex());
    }
}
