/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class Display_Doctors extends javax.swing.JInternalFrame {

    /**
     * Creates new form Display_Doctors
     */
    public Display_Doctors() {
        initComponents();
        
        
         DefaultComboBoxModel dm=new DefaultComboBoxModel();
        String course;
        
          try {
 Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url1); //connection established
                String sql = "select depart from department  ";
                PreparedStatement ps = cn.prepareStatement(sql);


                ResultSet rs = ps.executeQuery();
                dm.addElement("ALL");
                while (rs.next()) {
course = rs.getString(1);

dm.addElement(course);
                //    jTextArea1.setText(jTextArea1.getText()+"\n" + rs.getString(1));
                }
                jComboBox1.setModel(dm);



            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
  String coname;
       

int cname,cunt=0;
            String  fname,  courrse, pno, email, address;
            DefaultTableModel dt = new DefaultTableModel();
             JTable table = new JTable();

          String [] columnNames = {"S.No", "Doctor's Name",  "Department","Slot", "Validity", "Fees","Appointment Limit"};
table.setEnabled(false);
            dt.setColumnIdentifiers(columnNames);
           table.setModel(dt); table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         try {
 Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url1); //connection established
                String sql = "select * from doctor" ;
                PreparedStatement ps = cn.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
                while (rs.next()) {cunt++;
                    cname = cunt;
                    fname = rs.getString(2);
                    pno = rs.getString(3);
                    email= rs.getString(4);
                     address= rs.getString(5);
                    coname = rs.getString(6);
                    courrse = rs.getString(7);
                   
                    dt.addRow(new Object[]{cname, fname,  pno, email, address ,coname, courrse});
                }
       } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }jPanel2.add(scroll);
        



        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Display Doctors");
        setToolTipText("Display Doctors");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setText("Doctors Detail");
        jPanel4.add(jLabel1);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jComboBox1.setFont(new java.awt.Font("Arno Pro Caption", 0, 18)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray), "Display Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 15))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        jPanel2.removeAll();
        int count=0;
        String coname;

        int cname;
        String  fname, courrse, pno, email, address;
        DefaultTableModel dt = new DefaultTableModel();
        JTable table = new JTable();String [] columnNames = {"S.No", "Doctor's Name",  "Department","Slot", "Validity", "Fees","Appointment Limit"};

        dt.setColumnIdentifiers(columnNames);
        table.setModel(dt);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        if (jComboBox1.getSelectedItem().equals("ALL"))
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn;

                cn = DriverManager.getConnection(url1); //connection established

                String sql = "select * from doctor" ;
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    count++;
                    cname = count;
                    fname = rs.getString(2);
                    pno = rs.getString(3);
                    email= rs.getString(4);
                    address= rs.getString(5);
                    coname = rs.getString(6);
                    courrse = rs.getString(7);

                    dt.addRow(new Object[]{cname, fname,  pno, email, address ,coname, courrse});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Exception");
            }
            jPanel2.add(scroll);
        }

        else {

            try {
                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url11="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn1;

                cn1 = DriverManager.getConnection(url11); //connection established

                String sql = "select * from doctor where dept=?";
                PreparedStatement ps = cn1.prepareStatement(sql);

                ps.setString(1, (String) jComboBox1.getSelectedItem());
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    count++;
                    cname = count;
                    fname = rs.getString(2);
                    pno = rs.getString(3);
                    email= rs.getString(4);
                    address= rs.getString(5);
                    coname = rs.getString(6);
                    courrse = rs.getString(7);

                    dt.addRow(new Object[]{cname, fname,  pno, email, address ,coname, courrse});
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Exception");
            }   jPanel2.add(scroll);
        }
        jPanel2.validate();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
