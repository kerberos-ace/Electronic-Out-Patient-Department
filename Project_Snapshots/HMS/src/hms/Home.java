/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Anshul
 */
public class Home extends javax.swing.JFrame implements ActionListener {
JTextField user; JPasswordField Password; JButton  b;JLabel l1;JLabel l2;
    /**
     * Creates new form Home
     */
    public Home() {
        
  
        initComponents();
        this.setResizable(false);
                UIManager.put("Synthetica.window.decoration", Boolean.FALSE);


    try {
UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
} catch (Exception e) {
e.printStackTrace();
}
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
       user =new JTextField();
       this.setTitle("eOPD");
       l1=new JLabel();
       l2=new JLabel();
        Password=new JPasswordField();
        user.setBounds(280, 150, 170, 30);
        jLabel1.add(user);
           Password.setBounds(280, 200, 170, 30);
        jLabel1.add(Password);
        l1.setText("Username");
        l2.setText("Password");
        l1.setBounds(200, 150, 170, 30);
       l2.setBounds(200, 200, 170, 30);
      jLabel1.add(l1); jLabel1.add(l2);
      
        b = new JButton("Login");
     //  b.setFont(new Font("Andalus", 3, 14));
       b.setForeground(Color.BLACK);
      
      b.setBounds(300,250,80,30);
b.addActionListener(this);
jLabel1.add(b);
 this.getRootPane().setDefaultButton(b);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 471));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/original.jpg"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
 String str;   
 
 if(user.getText().trim().length()==0||Password.getPassword().length==0){
 JOptionPane.showMessageDialog(null, "Field Can't be left blank");}else
 {
        str = new String(Password.getPassword());
        if(e.getSource().equals(b))
        {   
            if(str.equals("admin")&&user.getText().equals("admin"))
            {
           Admin h=new Admin();
    
      h.setVisible(true);
      this.setVisible(false);}
            else  if(str.equals("rc")&&user.getText().equals("rc")){ 
                Reception rc=new Reception();
      
     rc.setVisible(true);
      this.setVisible(false);} else {
          JOptionPane.showMessageDialog(null,"Invalid Credentials");}

            }
 
        }
}
    }
        //To change body of generated methods, choose Tools | Templates.
   

