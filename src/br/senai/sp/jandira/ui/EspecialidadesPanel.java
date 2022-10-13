package br.senai.sp.jandira.ui;

import javax.swing.JTable;

public class EspecialidadesPanel extends javax.swing.JPanel {

    public EspecialidadesPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEspecialidade = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/caixote-de-lixo.png"))); // NOI18N
        jPanel2.add(Excluir);
        Excluir.setBounds(630, 320, 80, 40);

        Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar-banco-de-dados.png"))); // NOI18N
        jPanel2.add(Atualizar);
        Atualizar.setBounds(720, 320, 80, 39);

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar (1).png"))); // NOI18N
        jPanel2.add(Editar);
        Editar.setBounds(810, 320, 80, 39);

        TableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableEspecialidade);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 880, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JTable TableEspecialidade;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
        TableEspecialidade.getTableHeader().setReorderingAllowed(false);
        
        TableEspecialidade.setDefaultEditor(Object.class, null);
        
        TableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        TableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(200);
        TableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(500);
    }
   



}
