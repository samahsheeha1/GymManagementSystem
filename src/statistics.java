
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SYSCOM
 */
public class statistics extends javax.swing.JFrame {

    /**
     * Creates new form statistics
     */
    public statistics() {
        initComponents();
        mnum();
        nume();
        tnum();
        salary();
        profit();
                salary1();
                numd();

         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon icon =new ImageIcon(getClass().getResource("/image/wordgym.png"));
 Image img=icon.getImage();
  Image imgscale=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
ImageIcon  scaledicon=new ImageIcon(imgscale);
jLabel1.setIcon(scaledicon);



icon =new ImageIcon(getClass().getResource("/image/nn.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
 jButton4.setIcon(scaledicon);



icon =new ImageIcon(getClass().getResource("/image/home.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jButton2.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/log-out.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(40,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jButton3.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/team.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
members.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/employee.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
employees.setIcon(scaledicon);


icon =new ImageIcon(getClass().getResource("/image/trainer.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
trainers.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/exercise.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
exercises.setIcon(scaledicon);



icon =new ImageIcon(getClass().getResource("/image/devices.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
exercises3.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/carry.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(16,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
exercises2.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/sta.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(40,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
exercises1.setIcon(scaledicon);
       

   icon =new ImageIcon(getClass().getResource("/image/trainer.png"));
             img=icon.getImage();
            imgscale=img.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_SMOOTH);
             scaledicon=new ImageIcon(imgscale);
            jLabel2.setIcon(scaledicon);
            icon =new ImageIcon(getClass().getResource("/image/sta.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(50,60,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jLabel3.setIcon(scaledicon); 
            
    }
    private void mnum(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(id) from member");
            if(rs.next())
            {
                String count = rs.getString("count(id)");     
                mnum.setText(count);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    
    
     private void nume(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(id) from employee");
            if(rs.next())
            {
                String count = rs.getString("count(id)");     
                nume.setText(count);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
     
     
     
     
     private void tnum(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(id) from trainer");
            if(rs.next())
            {
                String count = rs.getString("count(id)");     
                tnum.setText(count);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
     
      private void numd(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(id) from devices");
            if(rs.next())
            {
                String count = rs.getString("count(id)");     
                numd.setText(count);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
     
     
     private void salary(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select sum(salary) from trainer");
            if(rs.next())
            {
                String sum = Integer.toString(rs.getInt("sum(salary)"));     
                salary.setText(sum);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

     
     
      private void profit(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select sum(amount) from member");
            if(rs.next())
            {
                String sum = Integer.toString(rs.getInt("sum(amount)"));     
                profit.setText(sum);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
      
      
      
       private void salary1(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select sum(salary) from employee");
            if(rs.next())
            {
                String sum = Integer.toString(rs.getInt("sum(salary)"));     
                salary1.setText(sum);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employees = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        members = new javax.swing.JButton();
        trainers = new javax.swing.JButton();
        exercises2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exercises3 = new javax.swing.JButton();
        exercises1 = new javax.swing.JButton();
        exercises = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salary = new javax.swing.JButton();
        mnum = new javax.swing.JButton();
        nume = new javax.swing.JButton();
        tnum = new javax.swing.JButton();
        profit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salary1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        numd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employees.setBackground(new java.awt.Color(51, 51, 51));
        employees.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        employees.setForeground(new java.awt.Color(255, 255, 255));
        employees.setText("Employees");
        employees.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employees.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        employees.setIconTextGap(20);
        employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesActionPerformed(evt);
            }
        });
        getContentPane().add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Homepage");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(20);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 50));

        members.setBackground(new java.awt.Color(51, 51, 51));
        members.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        members.setForeground(new java.awt.Color(255, 255, 255));
        members.setText("Members");
        members.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        members.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        members.setIconTextGap(20);
        members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersActionPerformed(evt);
            }
        });
        getContentPane().add(members, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 50));

        trainers.setBackground(new java.awt.Color(51, 51, 51));
        trainers.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        trainers.setForeground(new java.awt.Color(255, 255, 255));
        trainers.setText("Trainers");
        trainers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        trainers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        trainers.setIconTextGap(20);
        trainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainersActionPerformed(evt);
            }
        });
        getContentPane().add(trainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 50));

        exercises2.setBackground(new java.awt.Color(51, 51, 51));
        exercises2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        exercises2.setForeground(new java.awt.Color(255, 255, 255));
        exercises2.setText("devices and exercises");
        exercises2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exercises2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exercises2.setIconTextGap(10);
        exercises2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercises2ActionPerformed(evt);
            }
        });
        getContentPane().add(exercises2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 200, 50));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 200, 147));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 110));

        exercises3.setBackground(new java.awt.Color(51, 51, 51));
        exercises3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        exercises3.setForeground(new java.awt.Color(255, 255, 255));
        exercises3.setText("devices ");
        exercises3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exercises3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exercises3.setIconTextGap(10);
        exercises3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercises3ActionPerformed(evt);
            }
        });
        getContentPane().add(exercises3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 50));

        exercises1.setBackground(new java.awt.Color(51, 51, 51));
        exercises1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        exercises1.setForeground(new java.awt.Color(255, 255, 255));
        exercises1.setText("statistics");
        exercises1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exercises1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exercises1.setIconTextGap(10);
        exercises1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercises1ActionPerformed(evt);
            }
        });
        getContentPane().add(exercises1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 200, 50));

        exercises.setBackground(new java.awt.Color(51, 51, 51));
        exercises.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        exercises.setForeground(new java.awt.Color(255, 255, 255));
        exercises.setText("exercises");
        exercises.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exercises.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exercises.setIconTextGap(10);
        exercises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercisesActionPerformed(evt);
            }
        });
        getContentPane().add(exercises, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 440, 340));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("statistics");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 150, 50));

        salary.setBackground(new java.awt.Color(0, 153, 153));
        salary.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        salary.setText("jButton1");
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 210, 160));

        mnum.setBackground(new java.awt.Color(102, 0, 0));
        mnum.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        mnum.setText("jButton1");
        mnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumActionPerformed(evt);
            }
        });
        getContentPane().add(mnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 210, 160));

        nume.setBackground(new java.awt.Color(153, 0, 153));
        nume.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        nume.setText("jButton1");
        getContentPane().add(nume, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 210, 160));

        tnum.setBackground(new java.awt.Color(0, 153, 102));
        tnum.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        tnum.setText("jButton1");
        tnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnumActionPerformed(evt);
            }
        });
        getContentPane().add(tnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 210, 160));

        profit.setBackground(new java.awt.Color(255, 255, 51));
        profit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        profit.setText("jButton1");
        getContentPane().add(profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 210, 160));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Total profits :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 260, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("number of employee:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("number of member:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 260, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Total  salaries of employee:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 260, 70));

        salary1.setBackground(new java.awt.Color(255, 0, 255));
        salary1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        salary1.setText("jButton1");
        getContentPane().add(salary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 210, 160));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Total  salaries of trainers :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 260, 60));

        numd.setBackground(new java.awt.Color(51, 204, 255));
        numd.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        numd.setText("jButton1");
        getContentPane().add(numd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 210, 160));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("number of trainers :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 260, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("number of devices :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 260, 60));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("about gym");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(20);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
new employee().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_employeesActionPerformed

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed
new members().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_membersActionPerformed

    private void trainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainersActionPerformed
new trainer().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_trainersActionPerformed

    private void exercises2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises2ActionPerformed
new devicesandexercises().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_exercises2ActionPerformed

    private void exercises3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises3ActionPerformed
new devices().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_exercises3ActionPerformed

    private void exercises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises1ActionPerformed
new statistics().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_exercises1ActionPerformed

    private void exercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercisesActionPerformed
new exercises().setVisible(true);
setVisible(false);//         // TODO add your handling code here:
    }//GEN-LAST:event_exercisesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new home().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnumActionPerformed

    private void mnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnumActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new about().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employees;
    private javax.swing.JButton exercises;
    private javax.swing.JButton exercises1;
    private javax.swing.JButton exercises2;
    private javax.swing.JButton exercises3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton members;
    private javax.swing.JButton mnum;
    private javax.swing.JButton numd;
    private javax.swing.JButton nume;
    private javax.swing.JButton profit;
    private javax.swing.JButton salary;
    private javax.swing.JButton salary1;
    private javax.swing.JButton tnum;
    private javax.swing.JButton trainers;
    // End of variables declaration//GEN-END:variables
}
