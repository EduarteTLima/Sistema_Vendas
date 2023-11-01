/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.Estado;

import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Modelo.ModEstado;
import com.mycompany.Dao.DaoEstado;
import com.mycompany.Dao.DaoPais;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo.3946
 */
public class ListEstado extends javax.swing.JFrame {

    /**
     * Creates new form ListEstado
     */
    public ListEstado() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }

    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstado.getModel();
            
            tableEstado.setModel(defaultTableModel);

            DaoEstado daoEstado = new DaoEstado();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEstado.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pais = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String uf =  resultSet.getString(4);
                
                defaultTableModel.addRow(new Object[]{id, pais, nome, uf});
            }
        }catch(Exception e){
            
        }
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstado.getModel();

            tableEstado.setModel(defaultTableModel);

            DaoEstado daoEstado = new DaoEstado();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEstado.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pais = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String uf = resultSet.getString(4);
                
                defaultTableModel.addRow(new Object[]{id, pais, nome, uf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstado.getModel();
            
            tableEstado.setModel(defaultTableModel);

            DaoEstado daoEstado = new DaoEstado();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEstado.listarPorNome(pNome, true);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pais = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String uf = resultSet.getString(4);
                
                defaultTableModel.addRow(new Object[]{id, pais, nome, uf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPais(String pPais){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstado.getModel();
            
            tableEstado.setModel(defaultTableModel);

            DaoEstado daoEstado = new DaoEstado();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEstado.listarPorPais(pPais);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pais = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String uf = resultSet.getString(4);
                
                defaultTableModel.addRow(new Object[]{id, pais, nome, uf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorUf(String pUf){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableEstado.getModel();
            
            tableEstado.setModel(defaultTableModel);

            DaoEstado daoEstado = new DaoEstado();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoEstado.listarPorUf(pUf);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String pais = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String uf = resultSet.getString(4);
                
                defaultTableModel.addRow(new Object[]{id, pais, nome, uf});
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

        JCBestado = new javax.swing.JComboBox<>();
        TFfiltro = new javax.swing.JTextField();
        BTbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstado = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JCBestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "Pais", "Estado", "UF" }));
        JCBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBestadoActionPerformed(evt);
            }
        });

        TFfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFfiltroActionPerformed(evt);
            }
        });

        BTbuscar.setText("Buscar");
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });

        tableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Pais", "Estado", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEstado);

        jButton2.setText("Salvar");

        jButton3.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JCBestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TFfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTbuscar))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
        // TODO add your handling code here:
        switch (JCBestado.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(TFfiltro.getText()));
                break;
            case 2:
                listarPorPais(TFfiltro.getText());
                break;
            case 3:
                listarPorNome(TFfiltro.getText());
                break;
            case 4:
                listarPorUf(TFfiltro.getText());
                break;
        }
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void JCBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBestadoActionPerformed

    private void TFfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFfiltroActionPerformed
        // TODO add your handling code here:
        switch (JCBestado.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(TFfiltro.getText()));
                break;
            case 2:
                listarPorPais(TFfiltro.getText());
                break;
            case 3:
                listarPorNome(TFfiltro.getText());
                break;
            case 4:
                listarPorUf(TFfiltro.getText());
                break;
        }
    }//GEN-LAST:event_TFfiltroActionPerformed
    private void tableEstadoMouseClicked(java.awt.event.MouseEvent evt) {                                         
        try{
            if (evt.getClickCount() == 2){
                ModEstado modEstado = new ModEstado();

                modEstado.setId(Integer.parseInt(String.valueOf(tableEstado.getValueAt(tableEstado.getSelectedRow(), 0))));
                modEstado.setNome(String.valueOf(tableEstado.getValueAt(tableEstado.getSelectedRow(), 2)));
                modEstado.setUf(String.valueOf(tableEstado.getValueAt(tableEstado.getSelectedRow(), 3)));
                
                DaoPais daoPais = new DaoPais();
                ResultSet resultSet = daoPais.listarPorNome(String.valueOf(tableEstado.getValueAt(tableEstado.getSelectedRow(), 1)));

                int idPais = -1;
                while(resultSet.next())
                    idPais = resultSet.getInt("ID");

                modEstado.setIdPais(idPais);
                
                DadosTemporarios.tempObject = (ModEstado) modEstado;

                CadEstado cadEstado = new CadEstado();
                cadEstado.setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(ListEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JComboBox<String> JCBestado;
    private javax.swing.JTextField TFfiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEstado;
    // End of variables declaration//GEN-END:variables
}
