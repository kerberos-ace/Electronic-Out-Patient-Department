/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class Cancel_appointment extends javax.swing.JInternalFrame {
String stt;

     int cc;
    
      DefaultTableModel dtz=new DefaultTableModel();
    JTable table=new JTable(); JTable table123z=new JTable();
 int selectedRow;

 DefaultTableModel dt=new DefaultTableModel();
    /**
     * Creates new form Cancel_appointment
     */
    public Cancel_appointment() {
        initComponents();
         this.getRootPane().setDefaultButton(jButton1);
         InputMap im = jButton5.getInputMap(WHEN_FOCUSED);

im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
         Calendar c=Calendar.getInstance();
          dateChooserCombo2.setMinDate(c);
      //  jButton5.setEnabled(false);
        
        
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
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cancel Appointment");
        setToolTipText("Cancel Appointment");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setText("Cancel Appointment");
        jPanel4.add(jLabel1);

        jPanel8.add(jPanel9);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 16))); // NOI18N

        jLabel3.setText(" Date");

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/imageedit_1_4334984652.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText(" Enter ID / Name / Mobile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(jPanel2);

        jPanel6.add(jPanel8);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), "Client Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/imageedit_3_8396192476.png"))); // NOI18N
        jButton5.setText("Cancel Appointment");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), "Appointments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int counter=0;
dt.getDataVector().removeAllElements();

            dt.fireTableDataChanged();
        
            jPanel5.removeAll();
            jPanel7.removeAll();
        if(jTextField2.getText().length()!=0)
        {

            dt.getDataVector().removeAllElements();

            dt.fireTableDataChanged();
            String [] cn_name={"S.No","Client ID","Client Name","Father's Name","Mobile Numer"};//table 1
            dt.setColumnIdentifiers(cn_name);
            table.setModel(dt);
            dt.fireTableDataChanged();
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.setFillsViewportHeight(true);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            int tempo=0;
            try {
                Class.forName("com.mysql.jdbc.Driver");//loads driver
                String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn=DriverManager.getConnection(url); //connection established

                String q="Select * from registration  where ID='"+jTextField2.getText()+"' or c_name='"+jTextField2.getText()+"' or email='"+jTextField2.getText()+"' ";
                PreparedStatement st=cn.prepareStatement(q);

                ResultSet rs=  st.executeQuery();
                while (rs.next()){

                    tempo=rs.getInt(1);
                    counter++; //JOptionPane.showMessageDialog(null, "anshul"+counter);
                    dt.addRow(new Object[]{counter,rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(5)});
                    //display table 1

                }    jPanel5.add(scroll);
                jPanel5.validate();
                cn.close();

            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                // if(jTextField1.getText().trim().equals(""))
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String [] cnz_name={"S.No","Client ID","App ID","Doctor ","Application Type"};//table 2
            dtz.setColumnIdentifiers(cnz_name);
            table123z.setModel(dtz);
            dtz.fireTableDataChanged();
            table123z.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table123z.setFillsViewportHeight(true);
            JScrollPane scrollz = new JScrollPane(table123z);
            scrollz.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollz.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            dtz.getDataVector().removeAllElements();

            dtz.fireTableDataChanged();
            try {
                Class.forName("com.mysql.jdbc.Driver");//loads driver
                String url11="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn11=DriverManager.getConnection(url11); //connection established
                Calendar cal1=dateChooserCombo2.getSelectedDate();
              //  JOptionPane.showMessageDialog(null, new java.sql.Date(cal1.getTimeInMillis()));
                String q11="Select * from appointment  where c_id='"+tempo+"'and app_date='"+new java.sql.Date(cal1.getTimeInMillis())+"' and status = '0' ";
                PreparedStatement st11=cn11.prepareStatement(q11);

                ResultSet rs11=  st11.executeQuery();
                while(rs11.next()){
                    rtrnd_name rt1=new rtrnd_name();

                    cc++;

                    dtz.addRow(new Object[]{cc,tempo,rs11.getInt(1),rt1.client_name(rs11.getInt(4)," doctor "," d_id ", " d_name "),rs11.getString(11)});
                    //display table 2
                   // JOptionPane.showMessageDialog(null,rs11.getInt(1) );

                } jButton5.setEnabled(true);
                jPanel7.add(scrollz);
                jPanel7.validate();

                jTextField2.setText("");

            } catch (Exception e11) {
                // if(jTextField1.getText().trim().equals(""))
                JOptionPane.showMessageDialog(null, e11.getMessage());
            }

            if(table.getRowCount()==0&&table123z.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"No Records");
            }

        }else {

            JOptionPane.showMessageDialog(null,"Field Empty");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try   {

            stt=table123z.getValueAt(table123z.getSelectedRow(),table123z.getSelectedColumn()).toString();

            selectedRow = table123z.getSelectedRow();
           // JOptionPane.showMessageDialog(null,table123z.getColumnName(table123z.getSelectedColumn()));
            if(selectedRow != -1 &&  "App ID".equals(table123z.getColumnName(table123z.getSelectedColumn()))) {

                 Class.forName("com.mysql.jdbc.Driver");//loads driver
                    String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
                    Connection cn=DriverManager.getConnection(url); //connection established

                   
                  String q="update appointment set status = 3 where  auto_id='"+stt+"'"; 
                    PreparedStatement st=cn.prepareStatement(q);

                    st.executeUpdate();
        
                    cn.close();
                    JOptionPane.showMessageDialog(null, "Appointment has been successfully canceled");
                    this.dispose();

            }
            else {

                JOptionPane.showMessageDialog(null, "Select App ID");

            } } catch (Exception e11) {
                // if(jTextField1.getText().trim().equals(""))
                JOptionPane.showMessageDialog(null,"Please Choose App ID");
            }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
