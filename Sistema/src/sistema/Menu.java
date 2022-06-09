/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema;

/**
 *
 * @author Thiago
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpprincipal = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        bmCadastro = new javax.swing.JMenu();
        miCadADM = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnConsulta = new javax.swing.JMenu();
        mnconsultaAluno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        bmCadastro.setText("Cadastro");
        bmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmCadastroActionPerformed(evt);
            }
        });

        miCadADM.setText("Cadastro Usuário");
        miCadADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadADMActionPerformed(evt);
            }
        });
        bmCadastro.add(miCadADM);

        jMenuItem1.setText("Cadastro Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bmCadastro.add(jMenuItem1);

        jMenuBar2.add(bmCadastro);

        mnConsulta.setText("Consulta");
        mnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaActionPerformed(evt);
            }
        });

        mnconsultaAluno.setText("Consultar Aluno");
        mnconsultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnconsultaAlunoActionPerformed(evt);
            }
        });
        mnConsulta.add(mnconsultaAluno);

        jMenuBar2.add(mnConsulta);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpprincipal)
                .addContainerGap())
        );

        setBounds(0, 0, 616, 397);
    }// </editor-fold>//GEN-END:initComponents

    private void bmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmCadastroActionPerformed
      
       
      
    }//GEN-LAST:event_bmCadastroActionPerformed

    private void miCadADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadADMActionPerformed
        CadastroUsuario obj = new CadastroUsuario();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_miCadADMActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       setExtendedState(Tela.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroAluno obj = new CadastroAluno();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaActionPerformed
       
    }//GEN-LAST:event_mnConsultaActionPerformed

    private void mnconsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnconsultaAlunoActionPerformed
        ConsultaAluno obj = new ConsultaAluno ();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_mnconsultaAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bmCadastro;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenuItem miCadADM;
    private javax.swing.JMenu mnConsulta;
    private javax.swing.JMenuItem mnconsultaAluno;
    // End of variables declaration//GEN-END:variables
}
