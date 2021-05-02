package com.mecindustries.meckstock.view.produto;

import com.mecindustries.meckstock.controller.CategoriaController;
import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.model.Categoria;
import com.mecindustries.meckstock.model.Patrimonio;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fael
 */
public class ExcluirProdutoFrame extends javax.swing.JFrame {

    private List<Categoria> categorias;
    private Patrimonio patrimonio;

    public ExcluirProdutoFrame() {
        initComponents();
        categoriaBoxInitializer();
    }

    private void categoriaBoxInitializer() {
        this.categorias = CategoriaController.getAll();

        this.categorias.forEach(categoria -> {
            comboBoxCategory.addItem(categoria.getNome());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        panelNome = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        panelCategoria = new javax.swing.JPanel();
        labelCategoria = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        panelId = new javax.swing.JPanel();
        labelCategoria1 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        panelQuantidade = new javax.swing.JPanel();
        labelQuantidade = new javax.swing.JLabel();
        textFieldQuantidade = new javax.swing.JTextField();
        buttonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelNome.setText("Nome:");

        textFieldName.setEditable(false);
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
                .addContainerGap())
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        labelCategoria.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria.setText("Categoria:");

        comboBoxCategory.setEditable(true);
        comboBoxCategory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriaLayout.createSequentialGroup()
                .addComponent(labelCategoria)
                .addGap(18, 18, 18)
                .addComponent(comboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
                .addComponent(textFieldId)
                .addGap(18, 18, 18)
                .addComponent(buttonPesquisar)
                .addContainerGap())
        );
        panelIdLayout.setVerticalGroup(
            panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria1)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        labelQuantidade.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelQuantidade.setText("Quantidade:");

        textFieldQuantidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldQuantidade.setEnabled(false);

        javax.swing.GroupLayout panelQuantidadeLayout = new javax.swing.GroupLayout(panelQuantidade);
        panelQuantidade.setLayout(panelQuantidadeLayout);
        panelQuantidadeLayout.setHorizontalGroup(
            panelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuantidade)
                .addGap(18, 18, 18)
                .addComponent(textFieldQuantidade)
                .addContainerGap())
        );
        panelQuantidadeLayout.setVerticalGroup(
            panelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuantidadeLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        buttonExcluir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(buttonExcluir)
                .addGap(320, 320, 320)
                .addComponent(buttonVoltar)
                .addGap(281, 281, 281)
                .addComponent(labelLogo)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(373, 373, 373)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(374, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(604, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonVoltar)
                            .addComponent(buttonExcluir))
                        .addGap(82, 82, 82))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
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
        this.patrimonio = PatrimonioController.searchById(Integer.valueOf(textFieldId.getText()));

        if (this.patrimonio != null) {
            patchValues(this.patrimonio);
        } else {
            JOptionPane.showMessageDialog(null, "Patrimônio não encontrado");
        }
    }//GEN-LAST:event_buttonPesquisarMouseClicked

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        if (PatrimonioController.delete(this.patrimonio.getId())) {
            JOptionPane.showMessageDialog(null, "Patrimônio excluido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir patrimonio");
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ExcluirProdutoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelId;
    private javax.swing.JPanel panelNome;
    private javax.swing.JPanel panelQuantidade;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldQuantidade;
    // End of variables declaration//GEN-END:variables

    private void patchValues(Patrimonio patrimonio) {
        for (int i = 0; i < this.categorias.size(); i++) {
            if (this.categorias.get(i).getId() == patrimonio.getIdCategoria()) {
                comboBoxCategory.setSelectedIndex(i);
                break;
            }
        }
        textFieldName.setText(patrimonio.getNome());
        textFieldQuantidade.setText(String.valueOf(patrimonio.getQuantidade()));
    }
}
