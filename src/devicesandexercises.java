
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SYSCOM
 */
public class devicesandexercises extends javax.swing.JFrame {

    /**
     * Creates new form devicesandexercises
     */
    public devicesandexercises() {
            initComponents();
            showtable1();
            showtable2();
            member1();
            device1();
            exercise1();
            box1.setSelectedIndex(-1);
            box2.setSelectedIndex(-1);
            box3.setSelectedIndex(-1);

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
            
            icon =new ImageIcon(getClass().getResource("/image/play.png"));
            img=icon.getImage();
            imgscale=img.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_SMOOTH);
            scaledicon=new ImageIcon(imgscale);
            jLabel2.setIcon(scaledicon);
            
            icon =new ImageIcon(getClass().getResource("/image/run.png"));
            img=icon.getImage();
            imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
            scaledicon=new ImageIcon(imgscale);
            jButton8.setIcon(scaledicon);
            
            icon =new ImageIcon(getClass().getResource("/image/lo.png"));
            img=icon.getImage();
            imgscale=img.getScaledInstance(20,40,Image.SCALE_SMOOTH);
            scaledicon=new ImageIcon(imgscale);
            show.setIcon(scaledicon);
     
    }
        
     private  void showtable1(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from exercise");
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) tbldata1.getModel();
            int cols= rsmd.getColumnCount();
            String [] colName=new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                
            }
            String id,name,enumber,week;
            
            while(rs.next()){
                id=rs.getString(1);
                name=rs.getString(2);
                enumber=rs.getString(3);
                week=rs.getString(4);
                
               

                String [] row={ id,name,enumber,week};
                model.addRow(row);
            }
                        con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
        }

        
          
    }
     
    private  void showtable2(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from devices");
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) tbldata2.getModel();
            int cols= rsmd.getColumnCount();
            String [] colName=new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                
            }
            String id,name,body,price;
            
            while(rs.next()){
                id=rs.getString(1);
                name=rs.getString(2);
                body=rs.getString(3);
                price=rs.getString(4);
                
               

                String [] row={ id,name,body,price};
                model.addRow(row);
            }
                        con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
        }

        
          
    }
    
    
    private void member1(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from member");
            while (rs.next())
            {
                String name = rs.getString("name");         
                box1.addItem(name);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(devicesandexercises.class.getName()).log(Level.SEVERE, null, ex);
        }

    
   
    }
    
    private void device1(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from devices");
            while (rs.next())
            {
                String name = rs.getString("name");         
                box2.addItem(name);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(devicesandexercises.class.getName()).log(Level.SEVERE, null, ex);
        }

    
   
    }
    
     private void exercise1(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from exercise");
            while (rs.next())
            {
                String name = rs.getString("name");         
                box3.addItem(name);
            }//end while
            con.commit();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(devicesandexercises.class.getName()).log(Level.SEVERE, null, ex);
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

        exercises3 = new javax.swing.JButton();
        members = new javax.swing.JButton();
        exercises = new javax.swing.JButton();
        exercises2 = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        exercises1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        trainers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldata1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        box3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        box2 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(exercises3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 50));

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
        getContentPane().add(members, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 50));

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
        getContentPane().add(exercises, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 50));

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
        getContentPane().add(exercises2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 50));

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
        getContentPane().add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 50));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 200, 147));

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
        getContentPane().add(exercises1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 200, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 60));

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
        getContentPane().add(trainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 110));

        tbldata1.setAutoCreateRowSorter(true);
        tbldata1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "exercise number", "exercise in week-day"
            }
        ));
        jScrollPane2.setViewportView(tbldata1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 510, 620));

        tbldata2.setAutoCreateRowSorter(true);
        tbldata2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "body part", "price"
            }
        ));
        jScrollPane1.setViewportView(tbldata2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 340, 580));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 190, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("exercise");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 150, 40));

        getContentPane().add(box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("member");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 150, 40));

        getContentPane().add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("device");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 150, 40));

        getContentPane().add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 190, -1));

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add");
        jButton8.setBorder(null);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 180, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("devices");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 140, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("exercises");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        show.setBackground(new java.awt.Color(102, 102, 102));
        show.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("show member");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 180, 50));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exercises3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises3ActionPerformed
  setVisible(false);
        new devices().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_exercises3ActionPerformed

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed
  setVisible(false);
        new members().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_membersActionPerformed

    private void exercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercisesActionPerformed
  setVisible(false);
        new exercises().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_exercisesActionPerformed

    private void exercises2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises2ActionPerformed
  setVisible(false);
        new devicesandexercises().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_exercises2ActionPerformed

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
  setVisible(false);
        new employee().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_employeesActionPerformed

    private void exercises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises1ActionPerformed
  setVisible(false);
        new statistics().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_exercises1ActionPerformed

    private void trainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainersActionPerformed
  setVisible(false);
        new trainer().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_trainersActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(id) from devicesandexercises");
            rs.next();
            int id=rs.getInt("max(id)");
            id++;
            
            String mname=this.box1.getItemAt(box1.getSelectedIndex());
            String dname=this.box2.getItemAt(box2.getSelectedIndex());
            String ename=this.box3.getItemAt(box3.getSelectedIndex());
               rs=stmt.executeQuery("select * from member where name='"+mname+"'");
                 rs.next();
           String tname=rs.getString(10);
            String strstmt="insert into devicesandexercises values("+ id +",'"+ mname+"','" + dname + "','" + ename+"','"+tname+"')";
            stmt.executeUpdate(strstmt);
                        JOptionPane.showMessageDialog(null, " the member added exercise and device");

            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(devicesandexercises.class.getName()).log(Level.SEVERE, null, ex);
        }

        
          
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
setVisible(false);
 new show_all_member().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      setVisible(false);
 new about().setVisible(true);  // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(devicesandexercises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(devicesandexercises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(devicesandexercises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(devicesandexercises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new devicesandexercises().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JComboBox<String> box3;
    private javax.swing.JButton employees;
    private javax.swing.JButton exercises;
    private javax.swing.JButton exercises1;
    private javax.swing.JButton exercises2;
    private javax.swing.JButton exercises3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton members;
    private javax.swing.JButton show;
    private javax.swing.JTable tbldata1;
    private javax.swing.JTable tbldata2;
    private javax.swing.JButton trainers;
    // End of variables declaration//GEN-END:variables
}
