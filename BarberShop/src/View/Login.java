/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author skees
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        LabelLogin = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        TextSenha = new javax.swing.JPasswordField();
        LabelFundoLogin = new javax.swing.JLabel();
        LabelBackgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogin.setFont(new java.awt.Font("N-Gage", 0, 48)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogin.setText("Login");
        getContentPane().add(LabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 80));

        Usuario.setFont(new java.awt.Font("N-Gage", 0, 24)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setText("Usuário");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 170, 50));

        TextUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TextUsuario.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 240, 30));

        Senha.setFont(new java.awt.Font("N-Gage", 0, 24)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senha.setText("Senha");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 140, 30));

        TextSenha.setBackground(new java.awt.Color(255, 255, 255));
        TextSenha.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 230, 30));

        LabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        LabelFundoLogin.setText("jLabel2");
        getContentPane().add(LabelFundoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -30, 620, 460));

        LabelBackgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.png"))); // NOI18N
        getContentPane().add(LabelBackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBackgroundLogin;
    private javax.swing.JLabel LabelFundoLogin;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel Usuario;
    // End of variables declaration//GEN-END:variables
}