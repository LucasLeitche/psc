/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistema;

/**
 *
 * @author Emanuel
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroADM
     */
    public CadastroUsuario() {
        initComponents();
        this.CriarCampo(false);
    }
        public void CriarCampo(boolean flag){
         UsernameADM.setEnabled(flag);
         senhaADM.setEnabled(flag);
         cpfADM.setEnabled(flag);
         idusuario.setEnabled(flag);
     }
     public void LimparCampo(){
         UsernameADM.setText("");
         senhaADM.setText("");
         cpfADM.setText("");
         idusuario.setText("");
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameADM = new javax.swing.JTextField();
        senhaADM = new javax.swing.JTextField();
        botaoNovo = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelarADM = new javax.swing.JButton();
        botaoVoltarADM = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cpfADM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbADM = new javax.swing.JRadioButton();
        rbAtendente = new javax.swing.JRadioButton();
        jbconsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idusuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setText("Username:");

        jLabel3.setText("Senha:");

        UsernameADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameADMActionPerformed(evt);
            }
        });

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelarADM.setText("Cancelar");
        botaoCancelarADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarADMActionPerformed(evt);
            }
        });

        botaoVoltarADM.setText("Voltar");
        botaoVoltarADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarADMActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        jLabel5.setText("ADM ou Atendente:");

        buttonGroup1.add(rbADM);
        rbADM.setText("ADM");

        buttonGroup1.add(rbAtendente);
        rbAtendente.setText("Atendente");
        rbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendenteActionPerformed(evt);
            }
        });

        jbconsultar.setText("Consultar");

        jLabel6.setText("ID Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoNovo)
                                    .addComponent(jLabel5))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoSalvar)
                                        .addGap(43, 43, 43)
                                        .addComponent(botaoCancelarADM)
                                        .addGap(59, 59, 59)
                                        .addComponent(botaoVoltarADM)
                                        .addGap(34, 34, 34)
                                        .addComponent(jbconsultar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbADM)
                                        .addGap(42, 42, 42)
                                        .addComponent(rbAtendente))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameADM)
                            .addComponent(cpfADM)
                            .addComponent(senhaADM)
                            .addComponent(idusuario))))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UsernameADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbADM)
                    .addComponent(rbAtendente))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelarADM)
                    .addComponent(botaoVoltarADM)
                    .addComponent(jbconsultar))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        setBounds(600, 225, 888, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameADMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameADMActionPerformed

    private void botaoVoltarADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarADMActionPerformed
       this.setVisible(true);
        
       this.setVisible(false);
    }//GEN-LAST:event_botaoVoltarADMActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
       this.setVisible(true);
        
       this.setVisible(false);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarADMActionPerformed
        this.LimparCampo();
        this.CriarCampo(false);
    }//GEN-LAST:event_botaoCancelarADMActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        this.CriarCampo(true);
        this.LimparCampo();
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void rbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtendenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameADM;
    private javax.swing.JButton botaoCancelarADM;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltarADM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cpfADM;
    private javax.swing.JTextField idusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbconsultar;
    private javax.swing.JRadioButton rbADM;
    private javax.swing.JRadioButton rbAtendente;
    private javax.swing.JTextField senhaADM;
    // End of variables declaration//GEN-END:variables
}