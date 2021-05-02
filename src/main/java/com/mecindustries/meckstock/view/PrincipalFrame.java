package com.mecindustries.meckstock.view;

import com.mecindustries.meckstock.model.Usuario;
import com.mecindustries.meckstock.view.produto.CadastrarProdutoFrame;

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
        menuItemCreateProdutoCategoria = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock.png"))); // NOI18N

        labelBemVindo.setBackground(java.awt.Color.white);
        labelBemVindo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelBemVindo.setForeground(java.awt.Color.black);

        menuBar.setForeground(java.awt.Color.white);
        menuBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuProduto.setText("Produto");
        menuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProdutoMouseClicked(evt);
            }
        });

        menuItemCreateProduto.setText("Cadastrar");
        menuProduto.add(menuItemCreateProduto);

        menuItemCreateProdutoCategoria.setText("Cadastrar Categoria");
        menuProduto.add(menuItemCreateProdutoCategoria);

        menuItemReadProduto.setText("Pesquisar");
        menuProduto.add(menuItemReadProduto);

        menuItemUpdateProduto.setText("Atualizar");
        menuProduto.add(menuItemUpdateProduto);

        menuItemDeleteProduto.setText("Deletar");
        menuProduto.add(menuItemDeleteProduto);

        menuBar.add(menuProduto);

        menuSetor.setText("Setor");

        menuItemCreateSetor.setText("Cadastrar");
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

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBemVindo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(labelBemVindo)
                .addGap(18, 18, 18)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProdutoMouseClicked
        new CadastrarProdutoFrame().setVisible(true);
    }//GEN-LAST:event_menuProdutoMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemCreateMovimentacao;
    private javax.swing.JMenuItem menuItemCreateProduto;
    private javax.swing.JMenuItem menuItemCreateProdutoCategoria;
    private javax.swing.JMenuItem menuItemCreateSetor;
    private javax.swing.JMenuItem menuItemDeleteMovimentacao;
    private javax.swing.JMenuItem menuItemDeleteProduto;
    private javax.swing.JMenuItem menuItemDeleteSetor;
    private javax.swing.JMenuItem menuItemReadMovimentacao;
    private javax.swing.JMenuItem menuItemReadProduto;
    private javax.swing.JMenuItem menuItemReadSetor;
    private javax.swing.JMenuItem menuItemUpdateMovimentacao;
    private javax.swing.JMenuItem menuItemUpdateProduto;
    private javax.swing.JMenuItem menuItemUpdateSetor;
    private javax.swing.JMenu menuMovimentacao;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuSetor;
    // End of variables declaration//GEN-END:variables
}
