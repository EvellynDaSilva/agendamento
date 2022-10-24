package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadesPanel extends javax.swing.JPanel {
    
    private int linha;

    public EspecialidadesPanel() {
        initComponents();
         EspecialidadeDAO.getTabelaEspecialidade();
        preencherTabela();
    }
     
    
    private int getLinha(){
        linha = tabelaEspecialidade.getSelectedRow();
        return linha;
    }
    
    private void setLinha(){
        linha = tabelaEspecialidade.getSelectedRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        EspecialidadePane1 = new javax.swing.JScrollPane();
        tabelaEspecialidade = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/caixote-de-lixo.png"))); // NOI18N
        jPanel2.add(Excluir);
        Excluir.setBounds(630, 310, 60, 40);

        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar-banco-de-dados.png"))); // NOI18N
        jPanel2.add(atualizar);
        atualizar.setBounds(710, 310, 60, 39);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar (1).png"))); // NOI18N
        jPanel2.add(editar);
        editar.setBounds(830, 310, 60, 39);

        tabelaEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EspecialidadePane1.setViewportView(tabelaEspecialidade);

        jPanel2.add(EspecialidadePane1);
        EspecialidadePane1.setBounds(10, 20, 880, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
        JOptionPane.showConfirmDialog(
                this,
                "Por favor, selecione a especialidade que você deseja editar.", 
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void editarEspecialidade() {
            Especialidade especialidade = new EspecialidadeDAO().getEspecialidade(getCodigo());
       
       EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, especialidade);
       especialidadeDialog.setVisible(true);
       
       preencherTabela();
    }
    
    
    
    private void excluirEspecialidadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirEspecialidadeButtonActionPerformed
       
  
        if (getLinha() != -1) {
        excluirEspecialidade(linha);
        } else {
        JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a especialidade que deseja excluir",
                "Atenção",
                JOptionPane.OK_OPTION);
        }
        
        
       
    }//GEN-LAST:event_excluirEspecialidadeButtonActionPerformed
    
   private void excluirEspecialidade(int linha) {
         
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Confirma exclusão",
                "Atenção", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
        
        EspecialidadeDAO.excluir(getCodigo());
        
        preencherTabela();
        }
    }
    
    
    private void adicionarEspecialidadeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeJButton1ActionPerformed
   
    
    EspecialidadeDialog especialidadeDialog 
            = new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
    especialidadeDialog.setVisible(true);
    
    preencherTabela();
    }//GEN-LAST:event_adicionarEspecialidadeJButton1ActionPerformed

    private Integer getCodigo(){
        String codigoStr = tabelaEspecialidade.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane EspecialidadePane1;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton editar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable tabelaEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
        tabelaEspecialidade.getTableHeader().setReorderingAllowed(false);
       
        tabelaEspecialidade.setDefaultEditor(Object.class, null);
        
        //
        tabelaEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(400);
        
        
        
        
   

    }

}
