package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleConstants;

public class HomeFrame extends javax.swing.JPanel {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/entrega-agendada.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCabecario = new javax.swing.JPanel();
        LabelImagem = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        ButtonAgenda = new javax.swing.JButton();
        ButtonPaciente = new javax.swing.JButton();
        ButtonMedicos = new javax.swing.JButton();
        ButtonEspecialidades = new javax.swing.JButton();
        ButtonPlanoDeSaude = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        PanelLista = new javax.swing.JPanel();
        LabelListaDeEspecialidades = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        ScrollPane = new javax.swing.JScrollPane();
        TableTabela = new javax.swing.JTable();
        ButtonExcluir = new javax.swing.JButton();
        ButtonAtualizar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(null);

        PanelCabecario.setBackground(new java.awt.Color(255, 153, 153));
        PanelCabecario.setLayout(null);

        LabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        PanelCabecario.add(LabelImagem);
        LabelImagem.setBounds(30, 30, 40, 40);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("Sistema de Agendamento de Cosultas");
        PanelCabecario.add(LabelTitulo);
        LabelTitulo.setBounds(70, 30, 450, 32);

        add(PanelCabecario);
        PanelCabecario.setBounds(0, 0, 760, 90);

        ButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png"))); // NOI18N
        ButtonAgenda.setToolTipText("Agenda");
        ButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendaActionPerformed(evt);
            }
        });
        add(ButtonAgenda);
        ButtonAgenda.setBounds(20, 100, 80, 60);

        ButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        ButtonPaciente.setToolTipText("Paciente");
        add(ButtonPaciente);
        ButtonPaciente.setBounds(120, 100, 80, 60);

        ButtonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica.png"))); // NOI18N
        ButtonMedicos.setToolTipText("Médicos");
        add(ButtonMedicos);
        ButtonMedicos.setBounds(210, 100, 90, 60);

        ButtonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialista.png"))); // NOI18N
        ButtonEspecialidades.setToolTipText("Especialidades");
        add(ButtonEspecialidades);
        ButtonEspecialidades.setBounds(310, 100, 80, 60);

        ButtonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/protecao.png"))); // NOI18N
        ButtonPlanoDeSaude.setToolTipText("Plano de Saúde");
        add(ButtonPlanoDeSaude);
        ButtonPlanoDeSaude.setBounds(400, 100, 70, 60);

        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair.png"))); // NOI18N
        ButtonSair.setToolTipText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        add(ButtonSair);
        ButtonSair.setBounds(680, 100, 70, 50);

        PanelLista.setBackground(new java.awt.Color(102, 102, 102));
        PanelLista.setLayout(null);

        LabelListaDeEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        LabelListaDeEspecialidades.setText("Lista de Especialidades:");
        PanelLista.add(LabelListaDeEspecialidades);
        LabelListaDeEspecialidades.setBounds(0, 0, 130, 16);
        PanelLista.add(Separator);
        Separator.setBounds(130, 10, 600, 10);

        TableTabela.setAutoCreateRowSorter(true);
        TableTabela.setBackground(new java.awt.Color(153, 153, 153));
        TableTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollPane.setViewportView(TableTabela);
        TableTabela.getAccessibleContext().setAccessibleName("");

        PanelLista.add(ScrollPane);
        ScrollPane.setBounds(20, 20, 700, 210);

        add(PanelLista);
        PanelLista.setBounds(10, 170, 740, 270);

        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/caixote-de-lixo.png"))); // NOI18N
        ButtonExcluir.setToolTipText("Excluir");
        add(ButtonExcluir);
        ButtonExcluir.setBounds(550, 470, 60, 50);

        ButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/atualizar-banco-de-dados.png"))); // NOI18N
        ButtonAtualizar.setToolTipText("Atualizar");
        add(ButtonAtualizar);
        ButtonAtualizar.setBounds(620, 470, 60, 50);

        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar (1).png"))); // NOI18N
        ButtonEditar.setToolTipText("Editar");
        add(ButtonEditar);
        ButtonEditar.setBounds(690, 470, 60, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendaActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgenda;
    private javax.swing.JButton ButtonAtualizar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEspecialidades;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonMedicos;
    private javax.swing.JButton ButtonPaciente;
    private javax.swing.JButton ButtonPlanoDeSaude;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelImagem;
    private javax.swing.JLabel LabelListaDeEspecialidades;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelCabecario;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSeparator Separator;
    private javax.swing.JTable TableTabela;
    // End of variables declaration//GEN-END:variables
 
    private void preencherTabela(){
        
        String[][] dados = {
            { "100", "Jandira", "SP"},
            {"200", "Itapevi", "SP" },
            {"300", "Cotia", "SP" },
            { "400", "Barueri", "SP"},
            {"500", "Curitida", "SP"},
            {"600", "Fortaleza", "CE"},
        };
        String[] titulos = {"CÓDIGO", "NOME DA CIDADE", "ESTADO"};
        
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        
        TableTabela.setModel(modelo);
     }



}
