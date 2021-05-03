package com.mecindustries.meckstock.view.item;

import com.mecindustries.meckstock.controller.CategoriaController;
import com.mecindustries.meckstock.controller.ItemController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.model.Enum.Estado;
import com.mecindustries.meckstock.model.Item;
import com.mecindustries.meckstock.model.Patrimonio;
import javax.swing.JOptionPane;

/**
 *
 * @author Fael
 */
public class AtualizarItemFrame extends javax.swing.JFrame {

    private Item item;

    public AtualizarItemFrame() {
        initComponents();
        loadEstadoComboBox();
    }

    public AtualizarItemFrame(Item item) {
        initComponents();
        loadEstadoComboBox();
        this.item = item;
        patchValues();
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
        textFieldNome = new javax.swing.JTextField();
        panelId2 = new javax.swing.JPanel();
        labelCategoria3 = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        panelId3 = new javax.swing.JPanel();
        labelCategoria4 = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelCategoria1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria1.setText("ID:");

        textFieldId.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldIdKeyTyped(evt);
            }
        });

        buttonPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIdLayout = new javax.swing.GroupLayout(panelId);
        panelId.setLayout(panelIdLayout);
        panelIdLayout.setHorizontalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(labelCategoria1)
                .addGap(18, 18, 18)
                .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );
        panelIdLayout.setVerticalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisar)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCategoria1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCategoria2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria2.setText("Nome:");

        textFieldNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldNome.setEnabled(false);

        javax.swing.GroupLayout panelId1Layout = new javax.swing.GroupLayout(panelId1);
        panelId1.setLayout(panelId1Layout);
        panelId1Layout.setHorizontalGroup(
            panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria2)
                .addGap(18, 18, 18)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelId1Layout.setVerticalGroup(
            panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelId1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria2)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCategoria3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria3.setText("Categoria:");

        textFieldCategoria.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldCategoria.setEnabled(false);

        javax.swing.GroupLayout panelId2Layout = new javax.swing.GroupLayout(panelId2);
        panelId2.setLayout(panelId2Layout);
        panelId2Layout.setHorizontalGroup(
            panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria3)
                .addGap(18, 18, 18)
                .addComponent(textFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelId2Layout.setVerticalGroup(
            panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelId2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria3)
                    .addComponent(textFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCategoria4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria4.setText("Estado:");

        comboBoxEstado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelId3Layout = new javax.swing.GroupLayout(panelId3);
        panelId3.setLayout(panelId3Layout);
        panelId3Layout.setHorizontalGroup(
            panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelId3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(labelCategoria4)
                .addGap(18, 18, 18)
                .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelId3Layout.setVerticalGroup(
            panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelId3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelId3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria4)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
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
                .addContainerGap(371, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelId3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelId1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelId2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSalvar)
                                .addGap(340, 340, 340)
                                .addComponent(buttonVoltar))
                            .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonVoltar))
                .addGap(74, 74, 74)
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

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (ItemController.update(createObjectToUpdate())) {
            JOptionPane.showMessageDialog(null, "Item atualizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar item");
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        int id = Integer.valueOf(textFieldId.getText());

        this.item = ItemController.getById(id);
        patchValues();
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AtualizarItemFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelCategoria2;
    private javax.swing.JLabel labelCategoria3;
    private javax.swing.JLabel labelCategoria4;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelId;
    private javax.swing.JPanel panelId1;
    private javax.swing.JPanel panelId2;
    private javax.swing.JPanel panelId3;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

    private void patchValues() {
        Patrimonio patrimonio = PatrimonioController.searchById(this.item.getIdPatrimonio());

        textFieldId.setText(String.valueOf(this.item.getId()));
        textFieldNome.setText(patrimonio.getNome());
        textFieldCategoria.setText(CategoriaController.searchById(patrimonio.getIdCategoria()).getNome());
        comboBoxEstado.setSelectedIndex(this.item.getEstado().Value() - 1);
    }

    private void loadEstadoComboBox() {
        comboBoxEstado.addItem(Estado.getByField(1).toString());
        comboBoxEstado.addItem(Estado.getByField(2).toString());
        comboBoxEstado.addItem(Estado.getByField(3).toString());

    }

    private Item createObjectToUpdate() {
        Item itemToUpdate = this.item;
        itemToUpdate.setEstado(Estado.getByField(comboBoxEstado.getSelectedIndex() + 1));
        return itemToUpdate;
    }
}
