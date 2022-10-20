package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class HomeFrame extends javax.swing.JFrame {
    
        private EspecialidadesPanel especialidadesPanel;
        
                

   
    public HomeFrame() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png")));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelSisacon = new javax.swing.JLabel();
        LabelLinha = new javax.swing.JLabel();
        LabelSistemaDeAgendamento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 30, 80, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de atendimento de cosultas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 40, 420, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 110);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        LabelSisacon.setFont(new java.awt.Font("Swis721 Ex BT", 0, 36)); // NOI18N
        LabelSisacon.setForeground(new java.awt.Color(255, 255, 255));
        LabelSisacon.setText("SISACON");
        jPanel2.add(LabelSisacon);
        LabelSisacon.setBounds(30, 10, 210, 60);

        LabelLinha.setForeground(new java.awt.Color(255, 255, 255));
        LabelLinha.setText("_________________________________________________________________________________________________________________________________________________________________________");
        jPanel2.add(LabelLinha);
        LabelLinha.setBounds(10, 80, 890, 16);

        LabelSistemaDeAgendamento.setForeground(new java.awt.Color(153, 153, 153));
        LabelSistemaDeAgendamento.setText("Sistema de Agendamento de Consultas");
        jPanel2.add(LabelSistemaDeAgendamento);
        LabelSistemaDeAgendamento.setBounds(20, 70, 250, 16);

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Suporte Técnico:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(680, 140, 150, 23);

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("E-mail: sisacon@gmail.com");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(670, 180, 160, 16);

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Telefone: (11)96625-8475");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(670, 200, 170, 16);

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("www.sisacon.com.br");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(680, 220, 130, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 180, 870, 290);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/casa (1).png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 120, 70, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 121, 70, 39);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 120, 80, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica.png"))); // NOI18N
        getContentPane().add(jButton4);
        jButton4.setBounds(260, 120, 80, 39);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialista.png"))); // NOI18N
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 120, 80, 39);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/protecao.png"))); // NOI18N
        getContentPane().add(jButton6);
        jButton6.setBounds(440, 120, 90, 39);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair.png"))); // NOI18N
        getContentPane().add(jButton7);
        jButton7.setBounds(810, 120, 70, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLinha;
    private javax.swing.JLabel LabelSisacon;
    private javax.swing.JLabel LabelSistemaDeAgendamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

   

    }
        



