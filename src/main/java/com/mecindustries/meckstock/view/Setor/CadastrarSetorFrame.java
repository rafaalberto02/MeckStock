package com.mecindustries.meckstock.view.Setor;

import com.mecindustries.meckstock.controller.CategoriaController;
import com.mecindustries.meckstock.controller.ItemController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.controller.SetorController;
import com.mecindustries.meckstock.model.Enum.Estado;
import com.mecindustries.meckstock.model.Item;
import com.mecindustries.meckstock.model.Patrimonio;
import com.mecindustries.meckstock.model.Setor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fael
 */
public class CadastrarSetorFrame extends javax.swing.JFrame {

    private List<Patrimonio> patrimonios;
    private int idSetor;

    public CadastrarSetorFrame() {
        initComponents();
        listarPatrimonios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        panelNome = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutoToAdd = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAddedProduto = new javax.swing.JTable();
        labelQuantidade = new javax.swing.JLabel();
        textFieldQuantidade = new javax.swing.JTextField();
        buttonAdicionar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        buttonCriar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelNome.setText("Nome:");

        textFieldName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelNomeLayout = new javax.swing.GroupLayout(panelNome);
        panelNome.setLayout(panelNomeLayout);
        panelNomeLayout.setHorizontalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNome)
                .addGap(18, 18, 18)
                .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableProdutoToAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProdutoToAdd);

        tableAddedProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPatrimonio", "Nome", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAddedProduto);

        labelQuantidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQuantidade.setLabelFor(textFieldQuantidade);
        labelQuantidade.setText("Quantidade");
        labelQuantidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textFieldQuantidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldQuantidadeKeyTyped(evt);
            }
        });

        buttonAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonAdicionar.setText("Adicionar ->");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRemover.setText("<- Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        buttonCriar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonCriar.setText("Criar");
        buttonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarActionPerformed(evt);
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
                    .addComponent(panelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCriar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldQuantidade)
                            .addComponent(buttonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonVoltar)
                                .addGap(341, 341, 341)
                                .addComponent(labelLogo))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(labelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonVoltar)
                            .addComponent(buttonCriar))
                        .addGap(33, 33, 33))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldQuantidadeKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_textFieldQuantidadeKeyTyped

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        if (tableProdutoToAdd.getSelectedRow() > 0) {

            Patrimonio patrimonio = this.patrimonios.get(tableProdutoToAdd.getSelectedRow());

            int quantidade = 1;
            try {
                quantidade = Integer.valueOf(textFieldQuantidade.getText());
            } catch (NumberFormatException e) {
                /*Do nothing*/
            }

            DefaultTableModel model = (DefaultTableModel) tableAddedProduto.getModel();

            for (int i = 0; i < quantidade; i++) {
                model.addRow(addLine(patrimonio));
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar ao menos uma linha da tabela à esquerda");
        }
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        if (tableAddedProduto.getSelectedRow() > 0) {

            DefaultTableModel model = (DefaultTableModel) tableAddedProduto.getModel();
            model.removeRow(tableAddedProduto.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar ao menos uma linha da tabela à direita");
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarActionPerformed
        Setor setor = new Setor(textFieldName.getText());

        SetorController.create(setor);

        this.idSetor = SetorController.getLastInsertedId();
        System.out.println(this.idSetor);

        if (tableAddedProduto.getRowCount() > 0) {
            for (int i = 0; i < tableAddedProduto.getRowCount(); i++) {
                ItemController.create(createItemObject(i));
            }
        }
    }//GEN-LAST:event_buttonCriarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCriar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JPanel panelNome;
    private javax.swing.JTable tableAddedProduto;
    private javax.swing.JTable tableProdutoToAdd;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldQuantidade;
    // End of variables declaration//GEN-END:variables

    private void listarPatrimonios() {
        DefaultTableModel model = (DefaultTableModel) tableProdutoToAdd.getModel();
        model.setRowCount(0);

        this.patrimonios = PatrimonioController.getAll();

        this.patrimonios.forEach(patrimonio -> {
            model.addRow(addLine(patrimonio));
        });
    }

    private Object[] addLine(Patrimonio patrimonio) {
        Object[] linha = {
            patrimonio.getId(),
            patrimonio.getNome(),
            CategoriaController.searchById(patrimonio.getIdCategoria()).getNome()
        };

        return linha;
    }

    private Item createItemObject(int i) {
        return new Item(
                (int) tableAddedProduto.getValueAt(i, 0),
                this.idSetor,
                Estado.NOVO
        );
    }
}
