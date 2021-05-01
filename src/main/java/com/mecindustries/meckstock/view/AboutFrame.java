package com.mecindustries.meckstock.view;

/**
 *
 * @author Fael
 */
public class AboutFrame extends javax.swing.JFrame {

    public AboutFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        developersLabel = new javax.swing.JLabel();
        developersLabel1 = new javax.swing.JLabel();
        developersLabel2 = new javax.swing.JLabel();
        developersLabel3 = new javax.swing.JLabel();
        developersLabel5 = new javax.swing.JLabel();
        developersLabel6 = new javax.swing.JLabel();
        developersLabel7 = new javax.swing.JLabel();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuItemExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("principalFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LogoMeckStock - 256x256.png"))); // NOI18N

        developersLabel.setBackground(java.awt.Color.black);
        developersLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel.setForeground(java.awt.Color.darkGray);
        developersLabel.setText("Desenvolvedores: ");

        developersLabel1.setBackground(java.awt.Color.black);
        developersLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel1.setForeground(java.awt.Color.darkGray);
        developersLabel1.setText("Anna Luiza Figueiredo Magalhães");

        developersLabel2.setBackground(java.awt.Color.black);
        developersLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel2.setForeground(java.awt.Color.darkGray);
        developersLabel2.setText("Lucas Matheus de Carvalho Dobscha");

        developersLabel3.setBackground(java.awt.Color.black);
        developersLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel3.setForeground(java.awt.Color.darkGray);
        developersLabel3.setText("Rafael Alberto Barbosa Henriques");

        developersLabel5.setBackground(java.awt.Color.black);
        developersLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel5.setForeground(java.awt.Color.darkGray);
        developersLabel5.setText("Rafael Loula Corsino");

        developersLabel6.setBackground(java.awt.Color.black);
        developersLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel6.setForeground(java.awt.Color.darkGray);
        developersLabel6.setText("Thiago de Freitas Santos");

        developersLabel7.setBackground(java.awt.Color.black);
        developersLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        developersLabel7.setForeground(java.awt.Color.darkGray);
        developersLabel7.setText("Vitor Braga Leão");

        menuBarPrincipal.setBackground(java.awt.Color.white);
        menuBarPrincipal.setForeground(java.awt.Color.black);
        menuBarPrincipal.setBorderPainted(false);
        menuBarPrincipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItemExit.setText("Sair");
        menuItemExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuBarPrincipal.add(menuItemExit);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(developersLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(developersLabel1)
                            .addComponent(developersLabel2)
                            .addComponent(developersLabel3)
                            .addComponent(developersLabel5)
                            .addComponent(developersLabel6)
                            .addComponent(developersLabel7))))
                .addGap(18, 18, 18)
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(developersLabel)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(developersLabel7)))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuItemExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel developersLabel;
    private javax.swing.JLabel developersLabel1;
    private javax.swing.JLabel developersLabel2;
    private javax.swing.JLabel developersLabel3;
    private javax.swing.JLabel developersLabel5;
    private javax.swing.JLabel developersLabel6;
    private javax.swing.JLabel developersLabel7;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuItemExit;
    // End of variables declaration//GEN-END:variables
}
