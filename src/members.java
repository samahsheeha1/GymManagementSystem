
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author SYSCOM
 */




public class members extends javax.swing.JFrame {

    /**
     * Creates new form members
     */
    public members() {
        initComponents();
               this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      showtable();

        ImageIcon icon =new ImageIcon(getClass().getResource("/image/wordgym.png"));
 Image img=icon.getImage();
  Image imgscale=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
ImageIcon  scaledicon=new ImageIcon(imgscale);
jLabel1.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/home.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jButton2.setIcon(scaledicon);


icon =new ImageIcon(getClass().getResource("/image/search.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jLabel2.setIcon(scaledicon);

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

icon =new ImageIcon(getClass().getResource("/image/play.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(),Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
jLabel3.setIcon(scaledicon);

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
print.setIcon(scaledicon);
icon =new ImageIcon(getClass().getResource("/image/nn.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
 jButton4.setIcon(scaledicon);
 
 icon =new ImageIcon(getClass().getResource("/image/membership.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,48,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
 add1.setIcon(scaledicon);
 
 
 
icon =new ImageIcon(getClass().getResource("/image/arm.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(label2.getWidth(),label2.getHeight(),Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
label2.setIcon(scaledicon);

icon =new ImageIcon(getClass().getResource("/image/currency.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
label1.setIcon(scaledicon);
icon =new ImageIcon(getClass().getResource("/image/bmi.png"));
img=icon.getImage();
 imgscale=img.getScaledInstance(30,40,Image.SCALE_SMOOTH);
 scaledicon=new ImageIcon(imgscale);
bmi.setIcon(scaledicon);

  try {
      
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery("select * from trainer");
          while (rs.next())
             {      
                String namet = rs.getString("name");         
                names.addItem(namet);
             }//end while
                   names.setSelectedIndex(-1);

                    stmt.close();
                   con.close();
                   con.commit();

    }
    catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private  void showtable(){
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from member");
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) tbldata.getModel();
            int cols= rsmd.getColumnCount();
            /*String [] colName=new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                
            }*/
            String name,mobile,city,trname;
            String age,amount,id;
            String height,weight,bmi;
            String date;
            while(rs.next()){
                id=rs.getString(1);
                name=rs.getString(2);
                mobile=rs.getString(3);
                city=rs.getString(4);
                amount=rs.getString(5);
                age=rs.getString(6);
               // height=rs.getString(7);
               // weight=rs.getString(8);
               // bmi=rs.getString(9);
                trname=rs.getString(10);
                date=rs.getString(11);

                String [] row={ id,name,mobile,city,amount,date,age,trname};
                model.addRow(row);
            }
                   stmt.close();
                   con.close();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        trainers = new javax.swing.JButton();
        exercises = new javax.swing.JButton();
        members = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        search1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        exercises1 = new javax.swing.JButton();
        exercises2 = new javax.swing.JButton();
        exercises3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        names = new javax.swing.JComboBox<>();
        arm = new javax.swing.JLabel();
        currency = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        bmi = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 120));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

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
        jPanel1.add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 50));

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
        jPanel1.add(trainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 50));

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
        jPanel1.add(exercises, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 50));

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
        jPanel1.add(members, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 50));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 200, 140));

        tbldata.setAutoCreateRowSorter(true);
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "mobile", "city", "amount", "paymentdate", "age", "trainer_name"
            }
        ));
        jScrollPane1.setViewportView(tbldata);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 720, 650));

        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        jPanel1.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 207, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("search");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 16, 150, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setText("Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 30, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 110, -1));

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

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
        jPanel1.add(exercises1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 200, 50));

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
        jPanel1.add(exercises2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 50));

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
        jPanel1.add(exercises3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel6.setText("member Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 120, 30));
        jPanel1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 200, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("member mobile");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 120, 30));

        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        jPanel1.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel8.setText("member city");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, 30));

        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        jPanel1.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 200, -1));
        jPanel1.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 130, -1));

        text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text7ActionPerformed(evt);
            }
        });
        jPanel1.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel9.setText("age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel12.setText("amount");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 120, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel14.setText("trainer Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 40));

        print.setBackground(new java.awt.Color(102, 102, 102));
        print.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.setBorder(null);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 240, 50));

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
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 240, 50));

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
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 240, 50));

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
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 240, 50));

        names.setKeySelectionManager(null);
        jPanel1.add(names, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 200, -1));
        jPanel1.add(arm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(currency, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel5.setText("Members");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 200, 40));
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 70, 40));

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 240, -1, -1));
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 50, 30));

        bmi.setBackground(new java.awt.Color(102, 102, 102));
        bmi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bmi.setForeground(new java.awt.Color(255, 255, 255));
        bmi.setText("BMI");
        bmi.setBorder(null);
        bmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiActionPerformed(evt);
            }
        });
        jPanel1.add(bmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 240, 50));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 50));

        add1.setBackground(new java.awt.Color(102, 102, 102));
        add1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("membership type");
        add1.setBorder(null);
        add1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
setVisible(false) ;
new employee().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_employeesActionPerformed

    private void exercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercisesActionPerformed
setVisible(false) ;
new exercises().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exercisesActionPerformed

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed
setVisible(false) ;
new members().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_membersActionPerformed

    private void exercises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises1ActionPerformed
setVisible(false) ;
new statistics().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_exercises1ActionPerformed

    private void exercises2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises2ActionPerformed
     setVisible(false) ;
new devicesandexercises().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_exercises2ActionPerformed

    private void exercises3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercises3ActionPerformed
setVisible(false) ;
new devices().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_exercises3ActionPerformed

    private void trainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainersActionPerformed
       setVisible(false) ;
new trainer().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_trainersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from member where id= "+Integer.parseInt(id.getText())+"");
                        rs.next();

            text1.setText(rs.getString("name"));
            text2.setText(rs.getString("mobile"));
            text3.setText(rs.getString("membercity"));
            text4.setText(Integer.toString(rs.getInt("age")));
            text7.setText(Integer.toString(rs.getInt("amount")));
            names.setSelectedItem(rs.getString("trainername"));

                   stmt.close();
                   con.close();
                   con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                      
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(id) from member");
            rs.next();
            int id1=rs.getInt("max(id)");
            id1++;
            String name=  this.text1.getText();
            String mobile=  this.text2.getText();
            String city=  this.text3.getText();
            int age=Integer.parseInt(this.text4.getText());
            int amount=Integer.parseInt(this.text7.getText());
            String tname=this.names.getItemAt(names.getSelectedIndex());
           deletetable();
            String strstmt="insert into member values("+ id1 +",'"+ name+"','" + mobile + "','" + city+"',"+amount+","+age+" ,0 ,0,0,'" + tname +"' ,'"+new Date()+"')";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the member added");
              id.setText("");
             text1.setText("");
             text2.setText("");
             text3.setText("");
             text4.setText("");
             text7.setText("");
         names.setSelectedIndex(-1);
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
           int id1=Integer.parseInt(id.getText());
           String name=text1.getText();
           String mobile=text2.getText();
           String city=text3.getText();
          int age=Integer.parseInt(text4.getText());
        
          int amount=Integer.parseInt(text7.getText());
          String tname= names.getItemAt(names.getSelectedIndex());
            String strstmt="update member  set id= "+id1+",name= '"+name+"',mobile='"+mobile+"',membercity='"+city+"',age="+age+",amount="+amount+",trainername='"+tname+"' where id="+Integer.parseInt(id.getText())+"";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the member has been update");
             id.setText("");
             text1.setText("");
             text2.setText("");
             text3.setText("");
             text4.setText("");
             text7.setText("");
         names.setSelectedIndex(-1);
            con.close();
               stmt.close();
                   con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"system","123456");
            Statement stmt=con.createStatement();
           
           deletetable();
            String strstmt="delete from  member where id="+Integer.parseInt(id.getText())+"";
            stmt.executeUpdate(strstmt);
                        showtable();
             JOptionPane.showMessageDialog(null, " the member has been delete");
              id.setText("");
             text1.setText("");
             text2.setText("");
             text3.setText("");
             text4.setText("");
             
             text7.setText("");
         names.setSelectedIndex(-1);
            con.close();
               stmt.close();
                   con.commit();

        }
            catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false) ;
new home().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
   
    }//GEN-LAST:event_search1ActionPerformed

    private void text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text7ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
            DefaultTableModel table = (DefaultTableModel)tbldata.getModel(); 
            String search=search1.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
            tbldata.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search));
  // TODO add your handling code here:
    }//GEN-LAST:event_search1KeyReleased

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void bmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiActionPerformed
setVisible(false);
        new BMI().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bmiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new about().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
new membership_type().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_add1ActionPerformed

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
            java.util.logging.Logger.getLogger(members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JLabel arm;
    private javax.swing.JButton bmi;
    private javax.swing.JLabel currency;
    private javax.swing.JButton delete;
    private javax.swing.JButton employees;
    private javax.swing.JButton exercises;
    private javax.swing.JButton exercises1;
    private javax.swing.JButton exercises2;
    private javax.swing.JButton exercises3;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton members;
    private javax.swing.JComboBox<String> names;
    private javax.swing.JButton print;
    private javax.swing.JTextField search1;
    public javax.swing.JTable tbldata;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text7;
    private javax.swing.JButton trainers;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
