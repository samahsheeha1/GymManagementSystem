
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SYSCOM
 */
public class employee extends javax.swing.JFrame {

    /**
     * Creates new form employee
     */
    public employee() {
        initComponents();
        showtable();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon icon =new ImageIcon(getClass().getResource("/image/wordgym.png"));
 Image img=icon.getImage();
  Image imgscale=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
ImageIcon  scaledicon=new ImageIcon(imgscale);
jLabel1.setIcon(scaledicon);


icon =new ImageIcon(getClass().getResource("/image/home.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
home1.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/nn.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jButton4.setIcon(scaledicon);



icon =new ImageIcon(getClass().getResource("/image/search.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jLabel3.setIcon(scaledicon);


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

icon =new ImageIcon(getClass().getResource("/image/employee1.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(employee1.getWidth(),employee1.getHeight(),Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
employee1.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/add.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
add.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/update.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
update.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/delete1.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
delete.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/print.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jButton5.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/currency.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(48,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
currency.setIcon(scaledicon);

    }
    private  void showtable(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) tbldata.getModel();
            int cols= rsmd.getColumnCount();
            String [] colName=new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                
            }
            String id,name,mobile,city,age,salary;
            
            while(rs.next()){
                id=rs.getString(1);
                name=rs.getString(2);
                mobile=rs.getString(3);
                city=rs.getString(4);
                age=rs.getString(5);
                salary=rs.getString(6);
               

                String [] row={ id,name,mobile,city,age,salary};
                model.addRow(row);
            }
                        con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
        }

        
          
    }
    
    
     private  void deletetable(){
        
      DefaultTableModel model = (DefaultTableModel)tbldata.getModel(); 
int rows = model.getRowCount(); 
for(int i = rows - 1; i >=0; i--)
{
   model.removeRow(i); 
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        exercises1 = new javax.swing.JButton();
        exercises2 = new javax.swing.JButton();
        exercises3 = new javax.swing.JButton();
        exercises = new javax.swing.JButton();
        trainers = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        members = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        employee1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        text7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text6 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        currency = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        home2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 120));

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

        home1.setBackground(new java.awt.Color(51, 51, 51));
        home1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        home1.setForeground(new java.awt.Color(255, 255, 255));
        home1.setText("Homepage");
        home1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home1.setIconTextGap(20);
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        tbldata.setAutoCreateRowSorter(true);
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "mobile", "city", "age", "salary"
            }
        ));
        jScrollPane1.setViewportView(tbldata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 740, 670));
        getContentPane().add(employee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 10, 260, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setText("employee");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1011, 0, 110, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setText("Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 70, 50));
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 240, 90, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel6.setText("salary");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 140, 40));

        text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text7ActionPerformed(evt);
            }
        });
        getContentPane().add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel7.setText("employee Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 140, 50));

        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 170, -1));

        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel8.setText("employee mobile");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 140, 30));

        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel9.setText("employee city");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel10.setText("age");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 140, 50));

        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });
        getContentPane().add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 170, -1));

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorder(null);
        add.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, 240, 50));

        update.setBackground(new java.awt.Color(102, 102, 102));
        update.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, 240, 50));

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 240, 50));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Print");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 240, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel3.setText("search for employee");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 250, 30));

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        getContentPane().add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 150, -1));
        getContentPane().add(currency, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 440, 40, 30));

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

        home2.setBackground(new java.awt.Color(51, 51, 51));
        home2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        home2.setForeground(new java.awt.Color(255, 255, 255));
        home2.setText("Homepage");
        home2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home2.setIconTextGap(20);
        home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2ActionPerformed(evt);
            }
        });
        getContentPane().add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exercises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises1ActionPerformed
setVisible(false);
new statistics().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exercises1ActionPerformed

    private void exercises2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises2ActionPerformed
setVisible(false);
new devicesandexercises().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exercises2ActionPerformed

    private void exercises3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises3ActionPerformed
setVisible(false);
new devices().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exercises3ActionPerformed

    private void exercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercisesActionPerformed
setVisible(false);
new exercises().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exercisesActionPerformed

    private void trainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainersActionPerformed
setVisible(false);
new trainer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_trainersActionPerformed

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
setVisible(false);
new employee().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_employeesActionPerformed

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed
setVisible(false);
new members().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_membersActionPerformed

    private void text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text7ActionPerformed

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text6ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(id) from employee");
            rs.next();
            int id1=rs.getInt("max(id)");
            id1++;
            String name=  text3.getText();
            String mobile=  this.text4.getText();
            String city=  this.text5.getText();
            int age=Integer.parseInt(this.text6.getText());
            int salary=Integer.parseInt(this.text7.getText());
           deletetable();
            String strstmt="insert into employee values("+ id1 +",'"+ name+"','" + mobile + "','" + city+"',"+age+","+salary+")";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the employee added");
             
             text2.setText("");
             text3.setText("");
             text4.setText("");
             text5.setText("");
             text6.setText("");
             text7.setText("");
            con.close();
               stmt.close();
                   con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
                                       

      
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
           
           deletetable();
           int id1=Integer.parseInt(text2.getText());
           String name=text3.getText();
           String mobile=text4.getText();
           String city=text5.getText();
          int age=Integer.parseInt(text6.getText());
          int salary=Integer.parseInt(text7.getText());
            String strstmt="update employee  set id="+id1+",name= '"+name+"',mobile='"+mobile+"',city='"+city+"',age="+age+",salary="+salary+" where id="+Integer.parseInt(text2.getText())+"";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the employee has been update");
            
             text2.setText("");
             text3.setText("");
             text4.setText("");
             text5.setText("");
             text6.setText("");
             text7.setText("");
            con.close();
               stmt.close();
                   con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }// TO        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
           
           deletetable();
            String strstmt="delete from  employee where id="+Integer.parseInt(text2.getText())+"";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the employee has been delete");
             
             text2.setText("");
             text3.setText("");
             text4.setText("");
             text5.setText("");
             text6.setText("");
             text7.setText("");
            con.close();
               stmt.close();
                   con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
setVisible(false);
new home().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_home1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee where id= "+Integer.parseInt(text2.getText())+"");
                        rs.next();

            text3.setText(rs.getString("name"));
            text4.setText(rs.getString("mobile"));
            text5.setText(rs.getString("city"));
            text6.setText(Integer.toString(rs.getInt("age")));
            text7.setText(Integer.toString(rs.getInt("salary")));

                   stmt.close();
                   con.close();
                   con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
        }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
 DefaultTableModel table = (DefaultTableModel)tbldata.getModel(); 
            String search=search1.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
            tbldata.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search));        // TODO add your handling code here:
    }//GEN-LAST:event_search1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
setVisible(false);
 new about().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home2ActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel currency;
    private javax.swing.JButton delete;
    private javax.swing.JLabel employee1;
    private javax.swing.JButton employees;
    private javax.swing.JButton exercises;
    private javax.swing.JButton exercises1;
    private javax.swing.JButton exercises2;
    private javax.swing.JButton exercises3;
    private javax.swing.JButton home1;
    private javax.swing.JButton home2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton members;
    private javax.swing.JTextField search1;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JButton trainers;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
