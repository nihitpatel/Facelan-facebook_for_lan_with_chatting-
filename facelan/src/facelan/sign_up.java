/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facelan;

import com.sun.awt.AWTUtilities;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Nihit
 */
public class sign_up extends javax.swing.JFrame {

    /**
     * Creates new form sign_up
     */
    public sign_up() {
        initComponents();
        CurrentDate();
        AWTUtilities.setWindowOpaque(this,false);
      this.setLocationRelativeTo(null);
       AWTUtilities.setWindowOpaque(sign_in,false);
         sign_in.setLocationRelativeTo(this);
    }

    /**
     *
     */
  
       
       int x,y;
   
    
 public void CurrentDate(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
   //     date.setText(day+"/"+(month+1)+"/"+year);
        
        int second=cal.get(Calendar.SECOND);
        int minute=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
   //     time.setText(second+"-"+minute+"-"+hour);
        
//         date.setText(second+"-"+minute+"-"+hour+"-"+day+"/"+(month+1)+"/"+year);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op = new javax.swing.JOptionPane();
        sign_in = new javax.swing.JFrame();
        signin = new javax.swing.JLabel();
        us_na_in = new javax.swing.JTextField();
        pass_in = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        us_na = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        user_error = new javax.swing.JTextField();
        pass_error = new javax.swing.JTextField();
        mob_error = new javax.swing.JTextField();
        mobile_war = new javax.swing.JTextField();
        user_war = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        sign_in.setAlwaysOnTop(true);
        sign_in.setLocation(new java.awt.Point(0, 0));
        sign_in.setMinimumSize(new java.awt.Dimension(299, 513));
        sign_in.setName("sign_in\n"); // NOI18N
        sign_in.setUndecorated(true);
        sign_in.setResizable(false);
        sign_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sign_inFocusGained(evt);
            }
        });
        sign_in.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                sign_inWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                sign_inWindowOpened(evt);
            }
        });
        sign_in.getContentPane().setLayout(null);

        signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signinMouseReleased(evt);
            }
        });
        sign_in.getContentPane().add(signin);
        signin.setBounds(50, 400, 190, 60);

        us_na_in.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        us_na_in.setForeground(new java.awt.Color(255, 255, 255));
        us_na_in.setText("USER NAME/MOBILE NUMBER ");
        us_na_in.setBorder(null);
        us_na_in.setOpaque(false);
        us_na_in.setRequestFocusEnabled(false);
        us_na_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                us_na_inFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                us_na_inFocusLost(evt);
            }
        });
        us_na_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                us_na_inMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                us_na_inMouseReleased(evt);
            }
        });
        sign_in.getContentPane().add(us_na_in);
        us_na_in.setBounds(20, 230, 240, 19);

        pass_in.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass_in.setForeground(new java.awt.Color(255, 255, 255));
        pass_in.setText("PASSWORD");
        pass_in.setBorder(null);
        pass_in.setOpaque(false);
        pass_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_inFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_inFocusLost(evt);
            }
        });
        sign_in.getContentPane().add(pass_in);
        pass_in.setBounds(20, 290, 250, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facelan/Sign In.JPG"))); // NOI18N
        sign_in.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 299, 510);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(302, 513));
        setMinimumSize(new java.awt.Dimension(302, 513));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        us_na.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        us_na.setForeground(new java.awt.Color(255, 255, 255));
        us_na.setText("User Name");
        us_na.setBorder(null);
        us_na.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        us_na.setOpaque(false);
        us_na.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                us_naMouseMoved(evt);
            }
        });
        us_na.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                us_naFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                us_naFocusLost(evt);
            }
        });
        us_na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                us_naMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                us_naMouseReleased(evt);
            }
        });
        us_na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                us_naActionPerformed(evt);
            }
        });
        getContentPane().add(us_na);
        us_na.setBounds(60, 160, 180, 30);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 410, 190, 60);

        mob.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        mob.setForeground(new java.awt.Color(255, 255, 255));
        mob.setText("Mobile");
        mob.setBorder(null);
        mob.setOpaque(false);
        mob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobFocusLost(evt);
            }
        });
        mob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mobMouseReleased(evt);
            }
        });
        mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobKeyTyped(evt);
            }
        });
        getContentPane().add(mob);
        mob.setBounds(60, 240, 180, 31);

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");
        pass.setBorder(null);
        pass.setOpaque(false);
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passMouseReleased(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(60, 324, 160, 20);

        user_error.setEditable(false);
        user_error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_error.setForeground(new java.awt.Color(255, 0, 0));
        user_error.setBorder(null);
        user_error.setOpaque(false);
        user_error.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_errorFocusLost(evt);
            }
        });
        user_error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_errorActionPerformed(evt);
            }
        });
        getContentPane().add(user_error);
        user_error.setBounds(260, 170, 30, 20);

        pass_error.setEditable(false);
        pass_error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass_error.setForeground(new java.awt.Color(255, 51, 51));
        pass_error.setBorder(null);
        pass_error.setOpaque(false);
        getContentPane().add(pass_error);
        pass_error.setBounds(260, 330, 30, 20);

        mob_error.setEditable(false);
        mob_error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mob_error.setForeground(new java.awt.Color(255, 51, 51));
        mob_error.setBorder(null);
        mob_error.setOpaque(false);
        mob_error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mob_errorActionPerformed(evt);
            }
        });
        getContentPane().add(mob_error);
        mob_error.setBounds(260, 250, 30, 20);

        mobile_war.setEditable(false);
        mobile_war.setForeground(new java.awt.Color(255, 0, 0));
        mobile_war.setBorder(null);
        mobile_war.setOpaque(false);
        getContentPane().add(mobile_war);
        mobile_war.setBounds(50, 290, 210, 20);

        user_war.setEditable(false);
        user_war.setForeground(new java.awt.Color(255, 51, 51));
        user_war.setBorder(null);
        user_war.setOpaque(false);
        getContentPane().add(user_war);
        user_war.setBounds(60, 200, 210, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN IN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 480, 90, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facelan/Capture.JPG"))); // NOI18N
        Background.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BackgroundFocusGained(evt);
            }
        });
        getContentPane().add(Background);
        Background.setBounds(0, 0, 300, 520);

        getAccessibleContext().setAccessibleName("Sign_up");

        setSize(new java.awt.Dimension(357, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 int usercount=1;
  int mobilecount=1;
  int passcount=1;
    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased

     
    String usr=us_na.getText(); 
        String password=pass.getText();
      String  mobi = mob.getText();  
      
      
          if(usr.equals(""))
                      {
                              op.showMessageDialog(null,"Enter user name");
                      }
                        
                        
         else if(mobi.equals("") || mobi.length()>10 || mobi.length()<10)
                      {
                             op.showMessageDialog(null,"Enter correct Mobile Number");
                      }
       
           
       else if(password.equals(""))
                      {
                              op.showMessageDialog(null,"Enter Password");
                      }
        else
       {
      
        try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=(Connection)DriverManager.getConnection
                            ("jdbc:mysql://localhost/facelan","root","nihit");
                    stmt=con.createStatement();
                   
                    
                    
                    String sql="insert into users (user,pass,mobile) values('"+usr+"','"+password+"','"+mobi+"')";
                    String sql2="create table f_"+mobi+" (mobile varchar(10) primary key);";
                    stmt.execute(sql);
                    stmt.executeUpdate(sql2);
                    
                    
                    
//                
                 Home.setVisible(true);
////                
////                   Home.setVisible(true);
////                   this.setVisible(false);
               }
                catch(Exception ee)
                {                              
                   
                    
                        {
                              op.showMessageDialog(null,"User Name or Mobile Number is already taken");
                        }
                  
                }       }         
    }//GEN-LAST:event_jLabel1MouseReleased

    private void us_naMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_us_naMouseReleased
        if(usercount==1)
        {
        us_na.setText("");
        usercount++;
        }// TODO add your handling code here:
    }//GEN-LAST:event_us_naMouseReleased

    private void mobMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobMouseReleased
        if(mobilecount==1)
        {
        mob.setText("");
        mobilecount++;
        }// TODO add your handling code here:
    }//GEN-LAST:event_mobMouseReleased

    private void passMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseReleased
    if(passcount==1)
    {
             pass.setText("");
             passcount++;
    }
    }//GEN-LAST:event_passMouseReleased

    private void us_naMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_us_naMouseMoved
    
    }//GEN-LAST:event_us_naMouseMoved

    private void us_naMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_us_naMouseExited
              
    }//GEN-LAST:event_us_naMouseExited

    private void mobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobFocusLost
        String mobi=mob.getText();
        
       
          if(mobi.isEmpty() || mobi.length()>10 || mobi.length()<10 )
                      {
                              mob_error.setText("*");
                              mob.setText("Mobile");
                       //       mobile_war.setText("Invalid Mobile Number");
                          //    mobile_war.setText("Mobile Number Should have only 10 Digit");
                      }
          
              else
        {
            mob_error.setText("");
   
           try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=(Connection)DriverManager.getConnection
                            ("jdbc:mysql://localhost/facelan","root","nihit");
                    stmt=con.createStatement();
                    String sql="select * from users where mobile='"+mobi+"';";
                    rs=stmt.executeQuery(sql);
                    if(rs.next())
                    {
                        String a=rs.getString("mobile");
                       
                        
                        if(mobi.equals(a) )
                        {
                            mobile_war.setText("Mobile Number is taken");                        
                              
                        }
                     
                    }
                }
                catch(Exception ee)
                {
                  
                    op.showMessageDialog(null, ee.getMessage());
                }  
           
        }
       
    }//GEN-LAST:event_mobFocusLost

    private void us_naFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_us_naFocusLost
       
        String us_na1=us_na.getText();
        if(us_na1.isEmpty())
                      {
                              user_error.setText("*");
                              us_na.setText("User Name");
                      }
      
       else
        {
      
   
           try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=(Connection)DriverManager.getConnection
                            ("jdbc:mysql://localhost/facelan","root","nihit");
                    stmt=con.createStatement();
                    String sql="select * from users where user='"+us_na1+"';";
                    rs=stmt.executeQuery(sql);
                    if(rs.next())
                    {
                        String a=rs.getString("user");
                       
                        
                        if(us_na1.equals(a) )
                        {
                            user_war.setText("User Name is taken");                        
                              
                        }
                     
                    }
                }
                catch(Exception ee)
                {
               //     user_war.setText("");
                    op.showMessageDialog(null, ee.getMessage());
                }  
           
        }
    }//GEN-LAST:event_us_naFocusLost

    private void user_errorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_errorFocusLost
   
    }//GEN-LAST:event_user_errorFocusLost

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        String pass1=pass.getText();
        if(pass1.isEmpty())
                      {
                              pass_error.setText("*");
                              pass.setText("Password");
                      }
        else
        {
            pass_error.setText("");
        }
                
    }//GEN-LAST:event_passFocusLost

    private void mob_errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mob_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mob_errorActionPerformed

    private void user_errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_errorActionPerformed

    private void us_naFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_us_naFocusGained
          String user1=us_na.getText();
      user_war.setText("");
      user_error.setText("");
        if(user1.equals("User Name"))
                      {
                             us_na.setText("");
                      }
        
    }//GEN-LAST:event_us_naFocusGained

    private void mobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobFocusGained
        
        String mobi=mob.getText();
       mobile_war.setText("");
         mob_error.setText("");
        if(mobi.equals("Mobile"))
                      {
                           mob.setText("");
                      }  
        
    // TODO add your handling code here:
    }//GEN-LAST:event_mobFocusGained

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
      pass_error.setText("");
        String password=pass.getText();
      if(password.equals("Password"))
      {
          pass.setText("");
      }
    }//GEN-LAST:event_passFocusGained

    private void us_naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_us_naActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_us_naActionPerformed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
      sign_in.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void signinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseReleased
         String usr=us_na_in.getText(); 
        String password=pass_in.getText();
     
      
      
        try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=(Connection)DriverManager.getConnection
                            ("jdbc:mysql://localhost/facelan","root","nihit");
                    stmt=con.createStatement();
                    String sql="select * from users where mobile='"+usr+"' || user='"+usr+"';";
                    rs=stmt.executeQuery(sql);
                    if(rs.next())
                    {
                        String a=rs.getString("user");
                        String b=rs.getString("pass");
                        String c=rs.getString("mobile");
                        
                        if((a.equals(usr) ||  c.equals(usr) )&& b.equals(password))
                        {
                          
                             Home.setVisible(true);
                              dispose();
                              
                        }
                        else
                        {
                            op.showMessageDialog(null,"Incorent User Name/Password.");
                        }
                        
                    }
                }
                catch(Exception ee)
                {
                    op.showMessageDialog(null, ee.getMessage());
                }     
    }//GEN-LAST:event_signinMouseReleased

    private void us_na_inFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_us_na_inFocusGained
        us_na_in.setText("");
     
    }//GEN-LAST:event_us_na_inFocusGained

    private void us_na_inFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_us_na_inFocusLost
         String user=us_na_in.getText();
     if(user.isEmpty())
     
     {
         us_na_in.setText("USER NAME/MOBILE NUMBER");
     }
    }//GEN-LAST:event_us_na_inFocusLost

    private void us_na_inMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_us_na_inMouseReleased
    
    }//GEN-LAST:event_us_na_inMouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void sign_inFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sign_inFocusGained
//    //    int xx=evt.getXonScreen();
//        sign_in.setLocation(500, 100);
//         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);               
    }//GEN-LAST:event_sign_inFocusGained

    private void mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobKeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isDigit(a))|| a==KeyEvent.VK_BACK_SPACE || a==KeyEvent.VK_DELETE)
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mobKeyTyped

    private void BackgroundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackgroundFocusGained
      
    }//GEN-LAST:event_BackgroundFocusGained

    private void sign_inWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_sign_inWindowActivated
     
//{
//        // Get the size of the screen
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//
//        // Determine the new location of the window
//        int w = this.getSize().width;
//        int h = this.getSize().height;
//        int x = (dim.width-w)/2;
//        int y = (dim.height-h)/2;
//
//        // Move the window
//        sign_in.setLocationRelativeTo(null);
//}
    }//GEN-LAST:event_sign_inWindowActivated

    private void sign_inWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_sign_inWindowOpened
    
    }//GEN-LAST:event_sign_inWindowOpened

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  
//{
//        // Get the size of the screen
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//
//        // Determine the new location of the window
//        int w = this.getSize().width;
//        int h = this.getSize().height;
//        int x = (dim.width-w)/2;
//        int y = (dim.height-h)/2;
//
//        // Move the window
//        this.setLocationRelativeTo(null);
//}
    }//GEN-LAST:event_formWindowActivated

    private void pass_inFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_inFocusGained

   
        pass_in.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_pass_inFocusGained

    private void pass_inFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_inFocusLost
  String pass=pass_in.getText();
      if(pass.isEmpty())
      {
          pass_in.setText("PASSWORD");
      }        // TODO add your handling code here:
    }//GEN-LAST:event_pass_inFocusLost

    private void us_na_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_us_na_inMouseExited
String user=us_na_in.getText();
      if(user==null)
      {
          us_na_in.setText("PASSWORD");
      }            // TODO add your handling code here:
    }//GEN-LAST:event_us_na_inMouseExited
Statement stmt=null;
ResultSet rs=null;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField mob_error;
    private javax.swing.JTextField mobile_war;
    private javax.swing.JOptionPane op;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField pass_error;
    private javax.swing.JPasswordField pass_in;
    private javax.swing.JFrame sign_in;
    private javax.swing.JLabel signin;
    private javax.swing.JTextField us_na;
    private javax.swing.JTextField us_na_in;
    private javax.swing.JTextField user_error;
    private javax.swing.JTextField user_war;
    // End of variables declaration//GEN-END:variables

    private Object getToolKit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class setLocationRelativeTo {

        public setLocationRelativeTo() {
        }
    }
}
