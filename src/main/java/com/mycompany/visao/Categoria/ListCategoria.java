/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.Categoria;

import com.mycompany.Dao.DaoCategoria;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo.3946
 */
public class ListCategoria extends javax.swing.JFrame {

    /**
     * Creates new form ListCategoria
     */
    public ListCategoria() {
        initComponents();
        
         setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
       try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) TBcategoria.getModel();
            
            TBcategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

            ResultSet resultSet = daoCategoria.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
       
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) TBcategoria.getModel();

            TBcategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCategoria.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
    }
    public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) TBcategoria.getModel();
            
            TBcategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCategoria.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
                
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
    }
    public void listarPorDescricao(String pDescricao){
        try{
        DefaultTableModel defaultTableModel = (DefaultTableModel) TBcategoria.getModel();
            
        TBcategoria.setModel(defaultTableModel);

        DaoCategoria daoCategoria = new DaoCategoria();

        ResultSet resultSet = daoCategoria.listarPorDescricao(pDescricao);
            
        defaultTableModel.setRowCount(0);
        
        while (resultSet.next()){
            String id = resultSet.getString(1);
            String nome = resultSet.getString(2);
            String descricao = resultSet.getString(3);
                
            defaultTableModel.addRow(new Object[]{id, nome, descricao});
            
        }
        
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBcategoria = new javax.swing.JTable();
        BTbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCBcategoria = new javax.swing.JComboBox<>();
        TFpesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TBcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇAO"
            }
        ));
        jScrollPane1.setViewportView(TBcategoria);

        BTbuscar.setText("Buscar");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("De dois cliques no registro para edita-lo");

        JCBcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME", "DESCRIÇÃO" }));
        JCBcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBcategoriaActionPerformed(evt);
            }
        });

        TFpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JCBcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TFpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTbuscar))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
        // TODO add your handling code here:
        switch (JCBcategoria.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(TFpesquisa.getText()));
                break;
            case 2:
                listarPorNome(TFpesquisa.getText());
                break;
            case 3:
                listarPorDescricao(TFpesquisa.getText());
                break;
        }
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void TFpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpesquisaActionPerformed

    private void JCBcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBcategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JComboBox<String> JCBcategoria;
    private javax.swing.JTable TBcategoria;
    private javax.swing.JTextField TFpesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
