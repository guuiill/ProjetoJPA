/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class JanelaPrincipalGUI extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipalGUI
     */
    public JanelaPrincipalGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btMarca = new javax.swing.JButton();
        btCategoria = new javax.swing.JButton();
        btCelular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btMarca.setText("Marca");
        btMarca.setToolTipText("Marca");
        btMarca.setBorderPainted(false);
        btMarca.setOpaque(false);
        btMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarcaActionPerformed(evt);
            }
        });

        btCategoria.setText("Categoria");
        btCategoria.setBorderPainted(false);
        btCategoria.setFocusable(false);
        btCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCategoriaActionPerformed(evt);
            }
        });

        btCelular.setText("Celular");
        btCelular.setBorderPainted(false);
        btCelular.setFocusable(false);
        btCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarcaActionPerformed
        MarcaGui ma = new MarcaGui();
        ma.setLocationRelativeTo(null);
        ma.setVisible(true);
    }//GEN-LAST:event_btMarcaActionPerformed

    private void btCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategoriaActionPerformed
        CategoriaGui ca = new CategoriaGui();
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }//GEN-LAST:event_btCategoriaActionPerformed

    private void btCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCelularActionPerformed
        CelularGui ce = new CelularGui();
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }//GEN-LAST:event_btCelularActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCategoria;
    private javax.swing.JButton btCelular;
    private javax.swing.JButton btMarca;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
