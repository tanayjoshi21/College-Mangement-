import java.sql.*;
import Projects.ConnectionProvider;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik jain
 */
public class NewTeachers extends javax.swing.JFrame {

    /**
     * Creates new form NewTeachers
     */
    public NewTeachers() {
        initComponents();
        

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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("CODE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 146, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("DEPARTMENT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 196, -1, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 351, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 398, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("PHONE NUMBER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 448, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 498, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 252, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 302, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 102));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 450, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCS", "BMATH", "BPHY", "BCOM" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 148, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 500, -1, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 550, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 598, 200, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("POST");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 548, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1302, 0, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTER SCIENCE", "MATHS", "PHYSICS", "COMMERCE" }));
        jComboBox2.setMinimumSize(new java.awt.Dimension(220, 30));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 203, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 102));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 400, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 102));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jDateChooser1.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 350, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Want To Exit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
                
    }//GEN-LAST:event_formMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new Teachers().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
            String Code=(String)jComboBox1.getSelectedItem();
            String Department=(String)jComboBox2.getSelectedItem();
            String ID=jTextField1.getText();
            String Name=jTextField2.getText();
            String DOB=dFormat.format(jDateChooser1.getDate());
            String Gender=(String)jComboBox3.getSelectedItem();
            String Phone_Number=jTextField3.getText();
            String Address=jTextField4.getText();
            String Post=jTextField5.getText();
            String Sallary=null;
            try
            {
               Connection con=ConnectionProvider.getcon();
               Statement st=con.createStatement();
               st.executeUpdate("INSERT INTO TEACHER VALUES('"+Code+"','"+Department+"','"+ID+"','"+Name+"','"+DOB+"','"+Gender+"','"+Phone_Number+"','"+Address+"','"+Post+"','"+Sallary+"')");
               JOptionPane.showMessageDialog(null,"Successsfully Added");
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
               jDateChooser1.setDate(null);
            }
            catch(Exception e)
            {
               JOptionPane.showMessageDialog(null,"Error");
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
            String Code=(String)jComboBox1.getSelectedItem();
            String Department=(String)jComboBox2.getSelectedItem();
            String ID=jTextField1.getText();
            String Name=jTextField2.getText();
            String DOB=dFormat.format(jDateChooser1.getDate());
            String Gender=(String)jComboBox3.getSelectedItem();
            String Phone_Number=jTextField3.getText();
            String Address=jTextField4.getText();
            String Post=jTextField5.getText();
            String Sallary=null;
            try
            {
               Connection con=ConnectionProvider.getcon();
               Statement st=con.createStatement();
               st.executeUpdate("INSERT INTO TEACHER VALUES('"+Code+"','"+Department+"','"+ID+"','"+Name+"','"+DOB+"','"+Gender+"','"+Phone_Number+"','"+Address+"','"+Post+"','"+Sallary+"')");
               JOptionPane.showMessageDialog(null,"Successsfully Added");
               jTextField1.setText("");
               jTextField2.setText("");
               jTextField3.setText("");
               jTextField4.setText("");
               jTextField5.setText("");
               jDateChooser1.setDate(null);
            }
            catch(Exception e)
            {
               JOptionPane.showMessageDialog(null,"Error");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTeachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
