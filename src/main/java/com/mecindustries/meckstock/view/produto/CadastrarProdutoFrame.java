package com.mecindustries.meckstock.view.produto;

import com.mecindustries.meckstock.controller.PatrimonioController;
import com.mecindustries.meckstock.dao.CategoriaDao;
import com.mecindustries.meckstock.model.Categoria;
import com.mecindustries.meckstock.model.Patrimonio;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fael
 */
public class CadastrarProdutoFrame extends javax.swing.JFrame {

    private List<Categoria> categorias;

    public CadastrarProdutoFrame() {
        initComponents();
        categoriaBoxInitializer();
    }

    private void categoriaBoxInitializer() {
        this.categorias = CategoriaDao.getAll();

        this.categorias.forEach(categoria -> {
            comboBoxCategory.addItem(categoria.getNome());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        panelCategoria = new javax.swing.JPanel();
        labelCategoria = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        panelNome = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 96x96.png"))); // NOI18N

        labelCategoria.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelCategoria.setText("Categoria:");

        comboBoxCategory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria)
                .addGap(18, 18, 18)
                .addComponent(comboBoxCategory, 0, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

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
                .addContainerGap())
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        buttonCreate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonCreate.setText("Criar");
        buttonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreateMouseClicked(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buttonBack.setText("Voltar");
        buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(buttonCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreate)
                    .addComponent(buttonBack))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(labelLogo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonBackMouseClicked

    private void buttonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateMouseClicked
        Patrimonio patrimonio = new Patrimonio(
                this.categorias.get(comboBoxCategory.getSelectedIndex()).getId(),
                textFieldName.getText(),
                0
        );

        if (PatrimonioController.create(patrimonio)) {
            JOptionPane.showMessageDialog(null, "Patrimônio adicionado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao adicionar patrimonio");
        }

    }//GEN-LAST:event_buttonCreateMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarProdutoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelNome;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}
