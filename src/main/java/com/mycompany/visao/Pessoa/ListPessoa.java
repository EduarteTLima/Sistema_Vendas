/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.Pessoa;

import com.mycompany.Dao.DaoCliente;
import com.mycompany.Dao.DaoEstadoCivil;
import com.mycompany.Dao.DaoPessoa;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Modelo.ModCliente;
import com.mycompany.Modelo.ModEndereco;
import com.mycompany.Modelo.ModPessoa;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo.3946
 */
public class ListPessoa extends javax.swing.JFrame {

    /**
     * Creates new form ListPessoa
     */
    public ListPessoa() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();;
    }

    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorId(Integer.parseInt(tfFiltro.getText()));
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorRua(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorRua(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarCep(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorCep(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNumeroResidencia(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNumeroResidencia(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorSobrenome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorSobrenome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorGenero(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorGenero(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorTelefone(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorTelefone(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEmail(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEmail(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEstadoCivil(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEstadoCivil(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cidade = resultSet.getString(2);
                String rua = resultSet.getString(3);
                String cep = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String nome = resultSet.getString(6);
                String sobrenome = resultSet.getString(7);
                String genero = resultSet.getString(8);
                String telefone = resultSet.getString(9);
                String email = resultSet.getString(10);
                String estCivil = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, cidade, rua, cep, numRes, nome, sobrenome, genero, telefone, email, estCivil});
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

        jPanel1 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePessoa = new javax.swing.JTable();
        jcbBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "RUA", "CEP", "NÚM. RESIDÊNCIA", "NOME", "SOBRENOME", "GENERO", "TELEFONE", "EMAIL", "ESTADO CIVIL" }));

        tablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CIDADE", "RUA", "CEP", "NÚM. RESIDENCIA", "NOME", "SOBRENOME", "GENERO", "TELEFONE", "EMAIL", "ESTADO CIVIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePessoa);

        jcbBuscar.setText("Buscar");
        jcbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbBuscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePessoaMouseClicked
        try{
            if (evt.getClickCount() == 2){
                //Pega os dados da pessoa
                ModPessoa modPessoa = new ModPessoa();

                modPessoa.setId(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0))));
                //                modPessoa.setIdEndereco(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 1))));
                //                modPessoa.setIdEstadoCivil(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2))));;;
                modPessoa.setNome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 5)));
                modPessoa.setSobrenome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 6)));
                modPessoa.setGenero(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 7)));
                modPessoa.setTelefone(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 8)));
                modPessoa.setEmail(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 9)));

                //
                DaoPessoa daoPessoa = new DaoPessoa();
                ResultSet resultSet = daoPessoa.listarPorId(Integer.parseInt(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0).toString()));

                int idEndereco = -1;
                while(resultSet.next())
                idEndereco = resultSet.getInt("ID_ENDERECO");

                modPessoa.setIdEndereco(idEndereco);
                //

                //
                DaoEstadoCivil daoEstadoCivil = new DaoEstadoCivil();
                resultSet = daoEstadoCivil.listarPorNome(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 10)));

                int idEstadoCivil = -1;
                while(resultSet.next())
                idEstadoCivil = resultSet.getInt("ID");

                modPessoa.setIdEstadoCivil(idEstadoCivil);
                //

                //Pega os dados do endereço
                ModEndereco modEndereco = new ModEndereco();

                modEndereco.setNomeRua(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2)));
                modEndereco.setCep(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 3)));
                modEndereco.setNumeroResidencia(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 4)));
                //

                //
                DaoCliente daoCliente = new DaoCliente();
                resultSet = daoCliente.listarPorIdPessoa(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 0))));

                ModCliente modCliente = new ModCliente();

                int idCliente = -1;
                while(resultSet.next())
                idCliente = resultSet.getInt("ID");

                modCliente.setId(idCliente);
                //

                DadosTemporarios.tempObject = (ModPessoa) modPessoa;
                DadosTemporarios.tempObject2 = (ModEndereco) modEndereco;
                DadosTemporarios.tempObject3 = (ModCliente) modCliente;

                CadPessoa cadPessoa = new CadPessoa();
                cadPessoa.setVisible(true);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_tablePessoaMouseClicked

    private void jcbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
            listarTodos();
            break;
            case 1:
            listarPorId();
            break;
            case 2:
            listarPorRua();
            break;
            case 3:
            listarCep();
            break;
            case 4:
            listarPorNumeroResidencia();
            break;
            case 5:
            listarPorNome();
            break;
            case 6:
            listarPorSobrenome();
            break;
            case 7:
            listarPorGenero();
            break;
            case 8:
            listarPorTelefone();
            break;
            case 9:
            listarPorEmail();
            break;
            case 10:
            listarPorEstadoCivil();
            break;
        }
    }//GEN-LAST:event_jcbBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jcbBuscar;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePessoa;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
