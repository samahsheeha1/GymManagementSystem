import java.awt.Image;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SYSCOM
 */
public class sign extends javax.swing.JFrame {

    /**
     * Creates new form sign
     */
    public sign() {
        initComponents();
        incorrect.setVisible(false);
ImageIcon icon =new ImageIcon(getClass().getResource("/image/fitt.png"));
Image img=icon.getImage();
Image imgscale=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon=new ImageIcon(imgscale);
jLabel1.setIcon(scaledicon);


icon =new ImageIcon(getClass().getResource("/image/username_1.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(20,30,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
username.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/password_1.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(25,30,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
password.setIcon(scaledicon);
        
 icon =new ImageIcon(getClass().getResource("/image/confirmpassword.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(35,30,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
label.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/gender.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(35,30,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
gender.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/age.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(35,30,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
age.setIcon(scaledicon);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text2 = new javax.swing.JTextField();
        confirm = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        text5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        incorrect = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 220, 43));
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 220, 42));
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 220, 40));

        username.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("username");
        username.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 240, 35));

        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, 43));

        password.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        password.setText("password");
        password.setFocusable(false);
        password.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, 35));

        age.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age.setText("age");
        age.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        age.setIconTextGap(30);
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 150, 35));

        gender.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        gender.setText("Gender");
        gender.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gender.setIconTextGap(15);
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 200, 35));

        label.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        label.setText("confirm password");
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setIconTextGap(1);
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 370, 35));

        text5.setForeground(new java.awt.Color(51, 51, 51));
        text5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, 38));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("create account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 220, 50));

        jLabel9.setBackground(new java.awt.Color(51, 153, 255));
        jLabel9.setFont(new java.awt.Font("Bodoni MT", 3, 48)); // NOI18N
        jLabel9.setText("signup");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 240, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        incorrect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        incorrect.setForeground(new java.awt.Color(255, 0, 0));
        incorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        incorrect.setText("Incorrect  password");
        getContentPane().add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pure-white-background-85a2a7fd.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
            // TODO add your handling code here:
            if(text2.getText().equals(confirm.getText())){
                  try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(user_id) from admin");
            rs.next();
            int id=rs.getInt("max(user_id)");
            id++;
            String user=  this.text1.getText();
            String pass=  this.text2.getText();
            int ag=Integer.parseInt(this.text4.getText());
            String gen=this.text5.getItemAt(text5.getSelectedIndex());
            String strstmt="insert into admin values("+ id +",'"+ user +"','" + pass + "','" + gen+"'," + ag + ")";
            stmt.executeUpdate(strstmt);
            setVisible(false);
            new login().setVisible(true);
         JOptionPane.showMessageDialog(null, "the user has been added");

            text1.setText("");
             text2.setText("");
              confirm.setText("");
            text4.setText("");

            con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
            else{
                incorrect.setVisible(true);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField confirm;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel incorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel password;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text4;
    private javax.swing.JComboBox<String> text5;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}