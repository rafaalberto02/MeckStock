package com.mecindustries.meckstock.view;

import com.mecindustries.meckstock.model.Usuario;
import com.mecindustries.meckstock.view.Setor.CadastrarSetorFrame;
import com.mecindustries.meckstock.view.produto.AtualizarProdutoFrame;
import com.mecindustries.meckstock.view.produto.CadastrarProdutoFrame;
import com.mecindustries.meckstock.view.produto.PesquisarProdutoFrame;

/**
 *
 * @author Fael
 */
public class PrincipalFrame extends javax.swing.JFrame {
    
    public PrincipalFrame() {
        initComponents();
    }
    
    public PrincipalFrame(Usuario usuario) {
        initComponents();
        labelBemVindo.setText("Bem vindo, " + usuario.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelBemVindo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuProduto = new javax.swing.JMenu();
        menuItemCreateProduto = new javax.swing.JMenuItem();
        menuItemReadProduto = new javax.swing.JMenuItem();
        menuItemUpdateProduto = new javax.swing.JMenuItem();
        menuItemDeleteProduto = new javax.swing.JMenuItem();
        menuSetor = new javax.swing.JMenu();
        menuItemCreateSetor = new javax.swing.JMenuItem();
        menuItemReadSetor = new javax.swing.JMenuItem();
        menuItemUpdateSetor = new javax.swing.JMenuItem();
        menuItemDeleteSetor = new javax.swing.JMenuItem();
        menuMovimentacao = new javax.swing.JMenu();
        menuItemCreateMovimentacao = new javax.swing.JMenuItem();
        menuItemReadMovimentacao = new javax.swing.JMenuItem();
        menuItemUpdateMovimentacao = new javax.swing.JMenuItem();
        menuItemDeleteMovimentacao = new javax.swing.JMenuItem();
        menuCategoria = new javax.swing.JMenu();
        menuItemCreateCategoria = new javax.swing.JMenuItem();
        menuItemReadCategoria = new javax.swing.JMenuItem();
        menuItemDeleteCategoria = new javax.swing.JMenuItem();
        menuItemUpdateCategoria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock.png"))); // NOI18N

        labelBemVindo.setBackground(java.awt.Color.white);
        labelBemVindo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelBemVindo.setForeground(java.awt.Color.black);

        menuBar.setForeground(java.awt.Color.white);
        menuBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuProduto.setText("Produto");

        menuItemCreateProduto.setText("Cadastrar");
        menuItemCreateProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(menuItemCreateProduto);

        menuItemReadProduto.setText("Pesquisar");
        menuItemReadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReadProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(menuItemReadProduto);

        menuItemUpdateProduto.setText("Atualizar");
        menuItemUpdateProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdateProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(menuItemUpdateProduto);

        menuItemDeleteProduto.setText("Deletar");
        menuProduto.add(menuItemDeleteProduto);

        menuBar.add(menuProduto);

        menuSetor.setText("Setor");

        menuItemCreateSetor.setText("Cadastrar");
        menuItemCreateSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateSetorActionPerformed(evt);
            }
        });
        menuSetor.add(menuItemCreateSetor);

        menuItemReadSetor.setText("Pesquisar");
        menuSetor.add(menuItemReadSetor);

        menuItemUpdateSetor.setText("Atualizar");
        menuSetor.add(menuItemUpdateSetor);

        menuItemDeleteSetor.setText("Deletar");
        menuSetor.add(menuItemDeleteSetor);

        menuBar.add(menuSetor);

        menuMovimentacao.setText("Movimentação");

        menuItemCreateMovimentacao.setText("Cadastrar");
        menuMovimentacao.add(menuItemCreateMovimentacao);

        menuItemReadMovimentacao.setText("Pesquisar");
        menuMovimentacao.add(menuItemReadMovimentacao);

        menuItemUpdateMovimentacao.setText("Atualizar");
        menuMovimentacao.add(menuItemUpdateMovimentacao);

        menuItemDeleteMovimentacao.setText("Deletar");
        menuMovimentacao.add(menuItemDeleteMovimentacao);

        menuBar.add(menuMovimentacao);

        menuCategoria.setText("Categoria");

        menuItemCreateCategoria.setText("Cadastrar");
        menuCategoria.add(menuItemCreateCategoria);

        menuItemReadCategoria.setText("Pesquisar");
        menuCategoria.add(menuItemReadCategoria);

        menuItemDeleteCategoria.setText("Deletar");
        menuCategoria.add(menuItemDeleteCategoria);

        menuItemUpdateCategoria.setText("Atualizar");
        menuCategoria.add(menuItemUpdateCategoria);

        menuBar.add(menuCategoria);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(504, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(labelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCreateProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateProdutoActionPerformed
        new CadastrarProdutoFrame().setVisible(true);
    }//GEN-LAST:event_menuItemCreateProdutoActionPerformed

    private void menuItemReadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReadProdutoActionPerformed
        new PesquisarProdutoFrame().setVisible(true);
    }//GEN-LAST:event_menuItemReadProdutoActionPerformed

    private void menuItemUpdateProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdateProdutoActionPerformed
        new AtualizarProdutoFrame().setVisible(true);
    }//GEN-LAST:event_menuItemUpdateProdutoActionPerformed

    private void menuItemCreateSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateSetorActionPerformed
        new CadastrarSetorFrame().setVisible(true);
    }//GEN-LAST:event_menuItemCreateSetorActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCategoria;
    private javax.swing.JMenuItem menuItemCreateCategoria;
    private javax.swing.JMenuItem menuItemCreateMovimentacao;
    private javax.swing.JMenuItem menuItemCreateProduto;
    private javax.swing.JMenuItem menuItemCreateSetor;
    private javax.swing.JMenuItem menuItemDeleteCategoria;
    private javax.swing.JMenuItem menuItemDeleteMovimentacao;
    private javax.swing.JMenuItem menuItemDeleteProduto;
    private javax.swing.JMenuItem menuItemDeleteSetor;
    private javax.swing.JMenuItem menuItemReadCategoria;
    private javax.swing.JMenuItem menuItemReadMovimentacao;
    private javax.swing.JMenuItem menuItemReadProduto;
    private javax.swing.JMenuItem menuItemReadSetor;
    private javax.swing.JMenuItem menuItemUpdateCategoria;
    private javax.swing.JMenuItem menuItemUpdateMovimentacao;
    private javax.swing.JMenuItem menuItemUpdateProduto;
    private javax.swing.JMenuItem menuItemUpdateSetor;
    private javax.swing.JMenu menuMovimentacao;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuSetor;
    // End of variables declaration//GEN-END:variables
}
