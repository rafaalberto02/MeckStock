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
public class PesquisarProdutoFrame extends javax.swing.JFrame {

    private List<Categoria> categorias;

    public PesquisarProdutoFrame() {
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
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelNome.setText("Nome:");

        textFieldName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textFieldName.setEnabled(false);

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

        labelCategoria.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria.setText("Categoria:");

        comboBoxCategory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBoxCategory.setEnabled(false);

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

        buttonPesquisar.getAccessibleContext().setAccessibleName("buttonSearchId");

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

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(410, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(buttonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 331, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(panelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonVoltar)
                        .addGap(51, 51, 51)))
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
        Patrimonio patrimonio = PatrimonioController.searchById(Integer.valueOf(textFieldId.getText()));

        if (patrimonio != null) {
            patchValues(patrimonio);
        } else {
            JOptionPane.showMessageDialog(null, "Patrimônio não encontrado");
        }
    }//GEN-LAST:event_buttonPesquisarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PesquisarProdutoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
