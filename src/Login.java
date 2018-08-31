
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David Chamorro, María Fernanda Brand, Santiago Mira
 */
public class Login extends javax.swing.JFrame {

    private ArrayList<Residente> Residentes;    
    private PrintWriter salida;
    private BufferedReader entrada;
    private Condominio admin;
    private Residencia resgui;
    private String adminuser;
    private String adminpass;
    
    public Login() {
        initComponents();
        Residentes = new ArrayList();        
        lectorDatos();
        admin = new Condominio(Residentes);
        resgui = new Residencia();                
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginWindow = new javax.swing.JPanel();
        PasswordText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(367, 246));
        setResizable(false);

        LoginWindow.setBackground(new java.awt.Color(204, 55, 87));
        LoginWindow.setMaximumSize(new java.awt.Dimension(394, 250));
        LoginWindow.setMinimumSize(new java.awt.Dimension(394, 250));

        PasswordText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(51, 153, 255));
        LoginButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 255));
        LoginButton.setText("INGRESAR");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(51, 153, 255));
        CloseButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(204, 204, 255));
        CloseButton.setText("CANCELAR");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("CONSTRASEÑA:");

        UsernameLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("USUARIO: ");

        TitleLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("ADCON");

        UsernameText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout LoginWindowLayout = new javax.swing.GroupLayout(LoginWindow);
        LoginWindow.setLayout(LoginWindowLayout);
        LoginWindowLayout.setHorizontalGroup(
            LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginWindowLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CloseButton)
                        .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginWindowLayout.setVerticalGroup(
            LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginWindowLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseButton)
                    .addComponent(LoginButton))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold desc="Otros métodos">
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
      
        LoginMethod();                       
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginMethod();
        }
    }//GEN-LAST:event_PasswordTextKeyPressed
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Main Method">
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
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
            Login loginwindow = new Login();
            loginwindow.setVisible(true);
                
            }
        });
    }
//</editor-fold>

    public ArrayList<Residente> getResidentes() {
        return Residentes;
    }
    
private void lectorDatos() 
//Método de lectura de usuarios
{
    
        
        try {
            //Lectura Residentes
            entrada = new BufferedReader(new FileReader("Residentes.txt"));
            String r;
            while ((r = entrada.readLine()) != null) {

                String[] datos = (r.split("/"));
                String nombre = datos[0];
                String cedula = datos[1];
                String username = datos [2];
                String password = datos [3];
                String moroso = datos[4];
                Residentes.add(new Residente(nombre, cedula, username, password, moroso));

            }
            entrada.close();
            
            //Lectura Administradores
            entrada = new BufferedReader(new FileReader("Administrador.txt"));
            String a;
            while ((a = entrada.readLine()) != null){
                String[] admindata = (a.split("/"));
                this.adminuser = admindata[0];
                this.adminpass = admindata[1];                                             
            }
            entrada.close();
            } 
        catch (java.io.IOException e) {}
        
        

    }
    
private void LoginMethod()
// Método de Inicio de Sesión:
{           
            int notfoundcounter = 0;
            String userfound = "";           
            String usuario = UsernameText.getText();
            String contraseña = PasswordText.getText();
            
            do{
                for (Usuario requser : Residentes) {
                    if (requser.ValidarCredenciales(usuario, contraseña)) {
                        resgui.setVisible(true);
                        this.setVisible(false);
                        userfound = "found";
                        break;

                    }
                    else{notfoundcounter++;

                    }      
                }
                
                if(userfound == "found"){
                 break;
                }
                
            }
            
            while(notfoundcounter < Residentes.size());
            

                    if (adminuser.equals(UsernameText.getText()) && adminpass.equals(PasswordText.getText())) {
                        this.admin.setVisible(true);
                        this.setVisible(false);
                        
                    }
                    else{JOptionPane.showMessageDialog(null,"Usuario no encontrado");}
            
            
} 
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginWindow;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    // End of variables declaration//GEN-END:variables
}
