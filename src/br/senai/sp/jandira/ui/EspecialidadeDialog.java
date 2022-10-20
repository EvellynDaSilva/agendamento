package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EspecialidadeDialog extends javax.swing.JDialog {
       private Especialidade especialidade;
   
    /**
     *
     * @param parent
     * @param modal
     */
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e) {
           
        especialidade = e;
        preencherFormulario();
    }
     public EspecialidadeDialog(java.awt.Frame parent,boolean modal) {
        super(parent, modal);
        initComponents();
        
        private void preencherFormulario() {
        LabelEspecialidadeAdicionar.setText("Especialidades - ADICIONAR");
        LabelEspecialidadeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis (3).png")));
        CodigoEspecialidade.setText(especialidade.getCodigo().toString());
        NomeDaEspecialidade.setText(especialidade.getNome());
        DescricaoDeEspecialidade.setText(especialidade.getDescricao());
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LabelCodigo = new javax.swing.JLabel();
        CodigoEspecialidade = new javax.swing.JTextField();
        NomeDaEspecialidade = new javax.swing.JTextField();
        LabelEspecialidade = new javax.swing.JLabel();
        DescricaoDeEspecialidade = new javax.swing.JTextField();
        jLabelDescricaoDeEspecialidade = new javax.swing.JLabel();
        ButtonExcluir = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LabelEspecialidadeAdicionar = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(null);

        LabelCodigo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LabelCodigo.setText("Código");
        jPanel2.add(LabelCodigo);
        LabelCodigo.setBounds(40, 50, 60, 16);

        CodigoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(CodigoEspecialidade);
        CodigoEspecialidade.setBounds(40, 70, 120, 22);

        NomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(NomeDaEspecialidade);
        NomeDaEspecialidade.setBounds(40, 140, 330, 22);

        LabelEspecialidade.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LabelEspecialidade.setText("Nome da Especialidade");
        jPanel2.add(LabelEspecialidade);
        LabelEspecialidade.setBounds(40, 110, 160, 20);

        DescricaoDeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescricaoDeEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(DescricaoDeEspecialidade);
        DescricaoDeEspecialidade.setBounds(40, 200, 330, 22);

        jLabelDescricaoDeEspecialidade.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabelDescricaoDeEspecialidade.setText("Descrição de Especialidade");
        jPanel2.add(jLabelDescricaoDeEspecialidade);
        jLabelDescricaoDeEspecialidade.setBounds(40, 180, 180, 16);

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/caixote-de-lixo.png"))); // NOI18N
        ButtonExcluir.setToolTipText("excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonExcluir);
        ButtonExcluir.setBounds(450, 220, 70, 40);

        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        ButtonSalvar.setToolTipText("salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvar);
        ButtonSalvar.setBounds(530, 220, 38, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 120, 620, 280);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        LabelEspecialidadeAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        LabelEspecialidadeAdicionar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        LabelEspecialidadeAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        LabelEspecialidadeAdicionar.setText("Especialidade - ADICIONAR");
        LabelEspecialidadeAdicionar.setToolTipText("");
        jPanel3.add(LabelEspecialidadeAdicionar);
        LabelEspecialidadeAdicionar.setBounds(170, 40, 340, 27);

        LabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar-arquivo.png"))); // NOI18N
        jPanel3.add(LabelImg);
        LabelImg.setBounds(100, 20, 60, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 670, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
       
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(NomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(DescricaoDeEspecialidade.getText());
        
        // Gravar o objeto, através do dao, e avisar o usuário que foi gravado
        EspecialidadeDAO.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Salvo com sucesso!",
                "Adiciionar especialidade",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void CodigoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoEspecialidadeActionPerformed

    private void NomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeDaEspecialidadeActionPerformed

    private void DescricaoDeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescricaoDeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescricaoDeEspecialidadeActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonExcluirActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadeDialog dialog = new EspecialidadeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField CodigoEspecialidade;
    private javax.swing.JTextField DescricaoDeEspecialidade;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelEspecialidade;
    private javax.swing.JLabel LabelEspecialidadeAdicionar;
    private javax.swing.JLabel LabelImg;
    private javax.swing.JTextField NomeDaEspecialidade;
    private javax.swing.JLabel jLabelDescricaoDeEspecialidade;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
