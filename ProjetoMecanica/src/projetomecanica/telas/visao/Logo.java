/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetomecanica.telas.visao;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Logo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTechnocar
     */
    public Logo() {
        initComponents();
    }
    
    public Void ImageIcon () {
    
        ImageIcon imgRenault = new ImageIcon(getClass().getResource("imagens/Renault.png"));
        
         
        ImageIcon imgFiat = new ImageIcon(getClass().getResource("imagens/Fiat.png"));
        
         
        ImageIcon imgChevrolet = new ImageIcon(getClass().getResource("imagens/Chevrolet.png"));
        

        ImageIcon imgFord = new ImageIcon(getClass().getResource("imagens/Ford.png"));
        

        ImageIcon imgHonda = new ImageIcon(getClass().getResource("imagens/Honda.png"));
        

        ImageIcon imgHyundai = new ImageIcon(getClass().getResource("imagens/Hyundai.png"));
        

        ImageIcon imgKia = new ImageIcon(getClass().getResource("imagens/Kia.png"));
        

        ImageIcon imgMitsubish = new ImageIcon(getClass().getResource("imagens/Mitsubish.png"));
        

        ImageIcon imgPeugeot = new ImageIcon(getClass().getResource("imagens/Peugeot.png"));
        

        ImageIcon imgToyota = new ImageIcon(getClass().getResource("imagens/Toyota.png"));
        

        ImageIcon imgVolks = new ImageIcon(getClass().getResource("imagens/Volks.png"));
        

        ImageIcon imgVolvo = new ImageIcon(getClass().getResource("imagens/Volvo.png"));
        
      
        String marca = (String) (jComboBoxMarcas.getSelectedItem());
        
        if (marca.equals("Chevrolet"))jLabelQuadro.setIcon(imgChevrolet);
        if (marca.equals("Fiat"))jLabelQuadro.setIcon(imgFiat);
        if (marca.equals("Ford"))jLabelQuadro.setIcon(imgFord);
        if (marca.equals("Honda"))jLabelQuadro.setIcon(imgHonda);
        if (marca.equals("Hyundai"))jLabelQuadro.setIcon(imgHyundai);
        if (marca.equals("Kia"))jLabelQuadro.setIcon(imgKia);
        if (marca.equals("Mitsubishi"))jLabelQuadro.setIcon(imgMitsubish);
        if (marca.equals("Peugeot"))jLabelQuadro.setIcon(imgPeugeot);;
        if (marca.equals("Renault"))jLabelQuadro.setIcon(imgRenault);
        if (marca.equals("Toyota"))jLabelQuadro.setIcon(imgToyota);;
        if (marca.equals("Volkswagen"))jLabelQuadro.setIcon(imgVolks);;
        if (marca.equals("Volvo")) jLabelQuadro.setIcon(imgVolvo);
        return null;

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
        jButtonMenu = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelQuadro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxMarcas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonCadastrarCliente = new javax.swing.JButton();
        jButtonCadastrarVeiculo = new javax.swing.JButton();
        jButtonOrdemServico = new javax.swing.JButton();
        jButtonServico = new javax.swing.JButton();
        jButtonPagar = new javax.swing.JButton();
        jButtonCadastrarColaborador = new javax.swing.JButton();
        jButtonConfiguracoes = new javax.swing.JButton();
        jButtonCadastrarPecas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 83, 148));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(8, 83, 148));

        jButtonMenu.setBackground(new java.awt.Color(8, 83, 148));
        jButtonMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\1x\\Ativo 20.png")); // NOI18N
        jButtonMenu.setBorder(null);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(8, 83, 148));
        jButtonSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 14.png")); // NOI18N
        jButtonSair.setBorder(null);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPerfil.setBackground(new java.awt.Color(8, 83, 148));
        jButtonPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\1x\\Ativo 19.png")); // NOI18N
        jButtonPerfil.setBorder(null);
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPerfil)
                .addGap(27, 27, 27)
                .addComponent(jButtonSair)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonPerfil)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonMenu))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelQuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Chevrolet", "Fiat", "Ford", "Honda", "Hyundai", "Kia", "Mitsubishi", "Peugeot", "Renault", "Toyota", "Volkswagen", "Volvo", " " }));
        jComboBoxMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMarcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(572, 572, 572))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBoxMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(8, 83, 148));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButtonCadastrarCliente.setBackground(new java.awt.Color(8, 83, 148));
        jButtonCadastrarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 4.png")); // NOI18N
        jButtonCadastrarCliente.setBorder(null);
        jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarClienteActionPerformed(evt);
            }
        });

        jButtonCadastrarVeiculo.setBackground(new java.awt.Color(8, 83, 148));
        jButtonCadastrarVeiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 5.png")); // NOI18N
        jButtonCadastrarVeiculo.setBorder(null);
        jButtonCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarVeiculoActionPerformed(evt);
            }
        });

        jButtonOrdemServico.setBackground(new java.awt.Color(8, 83, 148));
        jButtonOrdemServico.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 7.png")); // NOI18N
        jButtonOrdemServico.setBorder(null);
        jButtonOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdemServicoActionPerformed(evt);
            }
        });

        jButtonServico.setBackground(new java.awt.Color(8, 83, 148));
        jButtonServico.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 8.png")); // NOI18N
        jButtonServico.setBorder(null);
        jButtonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoActionPerformed(evt);
            }
        });

        jButtonPagar.setBackground(new java.awt.Color(8, 83, 148));
        jButtonPagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 9.png")); // NOI18N
        jButtonPagar.setBorder(null);
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jButtonCadastrarColaborador.setBackground(new java.awt.Color(8, 83, 148));
        jButtonCadastrarColaborador.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\Ativo 10.png")); // NOI18N
        jButtonCadastrarColaborador.setBorder(null);
        jButtonCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarColaboradorActionPerformed(evt);
            }
        });

        jButtonConfiguracoes.setBackground(new java.awt.Color(8, 83, 148));
        jButtonConfiguracoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\1x\\engrenagem.png")); // NOI18N
        jButtonConfiguracoes.setBorder(null);
        jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracoesActionPerformed(evt);
            }
        });

        jButtonCadastrarPecas.setBackground(new java.awt.Color(8, 83, 148));
        jButtonCadastrarPecas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Imagens PI\\1x\\Ativo 18.png")); // NOI18N
        jButtonCadastrarPecas.setBorder(null);
        jButtonCadastrarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPecasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarPecas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonCadastrarCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrarVeiculo)
                .addGap(18, 18, 18)
                .addComponent(jButtonOrdemServico)
                .addGap(18, 18, 18)
                .addComponent(jButtonServico)
                .addGap(18, 18, 18)
                .addComponent(jButtonPagar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrarPecas)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrarColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButtonConfiguracoes)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarClienteActionPerformed

    private void jButtonCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarVeiculoActionPerformed

    private void jButtonOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdemServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOrdemServicoActionPerformed

    private void jButtonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonServicoActionPerformed

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jButtonCadastrarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarPecasActionPerformed

    private void jButtonCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarColaboradorActionPerformed

    private void jButtonConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfiguracoesActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ImageIcon ();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcasActionPerformed

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
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrarCliente;
    private javax.swing.JButton jButtonCadastrarColaborador;
    private javax.swing.JButton jButtonCadastrarPecas;
    private javax.swing.JButton jButtonCadastrarVeiculo;
    private javax.swing.JButton jButtonConfiguracoes;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonOrdemServico;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonServico;
    private javax.swing.JComboBox<String> jComboBoxMarcas;
    private javax.swing.JLabel jLabelQuadro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
