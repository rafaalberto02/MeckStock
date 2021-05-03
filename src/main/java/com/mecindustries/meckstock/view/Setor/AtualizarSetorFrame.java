package com.mecindustries.meckstock.view.Setor;

import com.mecindustries.meckstock.controller.CategoriaController;
import com.mecindustries.meckstock.controller.ItemController;
import com.mecindustries.meckstock.controller.MovimentacaoController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.dao.SetorDao;
import com.mecindustries.meckstock.model.Item;
import com.mecindustries.meckstock.model.Patrimonio;
import com.mecindustries.meckstock.model.Setor;
import com.mecindustries.meckstock.model.Usuario;
import com.mecindustries.meckstock.view.item.AtualizarItemFrame;
import com.mecindustries.meckstock.view.movimentacao.RealizarMovimentacaoFrame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fael
 */
public class AtualizarSetorFrame extends javax.swing.JFrame {

    private List<Setor> setores;
    private List<Item> itens;
    private Usuario usuario;

    public AtualizarSetorFrame() {
        initComponents();
        initializeComboBox();
    }

    public AtualizarSetorFrame(Usuario usuario) {
        initComponents();
        initializeComboBox();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        panelId = new javax.swing.JPanel();
        labelCategoria1 = new javax.swing.JLabel();
        comboBoxSetor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItens = new javax.swing.JTable();
        buttonEditarItem = new javax.swing.JButton();
        buttonRealizarMovimentacao = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelCategoria1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria1.setText("Setor:");

        comboBoxSetor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboBoxSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIdLayout = new javax.swing.GroupLayout(panelId);
        panelId.setLayout(panelIdLayout);
        panelIdLayout.setHorizontalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria1)
                .addGap(18, 18, 18)
                .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIdLayout.setVerticalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCategoria1))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tableItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Categoria", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableItens);

        buttonEditarItem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonEditarItem.setText("Editar Item");
        buttonEditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarItemActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 302, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonEditarItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRealizarMovimentacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVoltar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(labelLogo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonEditarItem, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRealizarMovimentacao)
                            .addComponent(buttonVoltar))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSetorActionPerformed
        searchItens();
    }//GEN-LAST:event_comboBoxSetorActionPerformed

    private void buttonEditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarItemActionPerformed
        if (tableItens.getSelectedRow() > 0) {
            new AtualizarItemFrame(this.itens.get(tableItens.getSelectedRow())).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar ao menos um item da tabela");
        }
    }//GEN-LAST:event_buttonEditarItemActionPerformed

    private void buttonRealizarMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRealizarMovimentacaoActionPerformed
        if (tableItens.getSelectedRow() > 0) {
            if (!MovimentacaoController.hasOpenMove(this.itens.get(tableItens.getSelectedRow()).getId())) {
                new RealizarMovimentacaoFrame(this.itens.get(tableItens.getSelectedRow()), this.usuario).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Já existe uma movimentação em aberto com este item");
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar ao menos um item da tabela");
        }
    }//GEN-LAST:event_buttonRealizarMovimentacaoActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        searchItens();
    }//GEN-LAST:event_formWindowGainedFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarItem;
    private javax.swing.JButton buttonRealizarMovimentacao;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelId;
    private javax.swing.JTable tableItens;
    // End of variables declaration//GEN-END:variables

    private void initializeComboBox() {
        this.setores = SetorDao.getAll();

        this.setores.forEach(setor -> {
            comboBoxSetor.addItem(setor.getId() + " - " + setor.getNome());
        });

        comboBoxSetor.setSelectedIndex(-1);
    }

    private void listarItens(List<Item> itens) {
        DefaultTableModel model = (DefaultTableModel) tableItens.getModel();
        model.setRowCount(0);

        itens.forEach(item -> {
            model.addRow(addLine(item));
        });
    }

    private Object[] addLine(Item item) {
        Patrimonio patrimonioItem = PatrimonioController.searchById(item.getIdPatrimonio());
        Object[] linha = {
            item.getId(),
            patrimonioItem.getNome(),
            CategoriaController.searchById(patrimonioItem.getIdCategoria()).getNome(),
            item.getEstado().toString()
        };

        return linha;
    }

    private void searchItens() {
        if (comboBoxSetor.getSelectedIndex() > 0) {
            Setor setor = this.setores.get(comboBoxSetor.getSelectedIndex());
            this.itens = ItemController.getBySetor(setor.getId());

            listarItens(this.itens);
        }
    }
}
