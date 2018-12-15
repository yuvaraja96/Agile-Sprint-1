/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderpickup;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuvaraja
 */
public class JOrderDelivery extends javax.swing.JFrame {

    private Component frame;

    /**
     * Creates new form JOrderDelivery
     */
    public JOrderDelivery() {
        initComponents();
        
        addRowToJTable();
        
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showDate();
        showTime();
    }
    
        
    void clearText(){
        jtxtName.setText("");
        jtxtOrderId.setText("");
        jtxtContactNo.setText("");
        jtxtAddress.setText("");
        jcboStatus.setSelectedItem("Delivered");
    }
    
    
     void showDate(){
    Date d = new Date();
    SimpleDateFormat s =new SimpleDateFormat("dd-MM-yyyy");
    jlblDate.setText(s.format(d));
    }
    
    void showTime(){
     new Timer(0, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             Date d = new Date();
             SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
             jlblTime.setText(s.format(d));
         }
     }).start();
     
       
    }
    
    public class Delivery {
     String name; 
     String address;
     String orderId;
     String deliveryStatus;
     String contactNo;
    
    public Delivery(String custName, String orderId, String contact, String custAddress,  String status){
        this.name = custName;
        this.address = custAddress;
        this.orderId = orderId;
        this.deliveryStatus = status;
        this.contactNo = contact;

    }
   
}

    public ArrayList Delivery()
    {
        ArrayList<Delivery> list = new ArrayList<Delivery>();
        Delivery d1 = new Delivery("Ali","D001", "012-4568165", "Serdang", "In Progress");
        Delivery d2 = new Delivery("Siti","D002","012-4568165","Wangsa Maju","In Progress"); 
        Delivery d3 = new Delivery("Tan","D003","012-4568165","Pudu","In Progress");
        Delivery d4 = new Delivery("John","D004","012-4568165","Puchong","In Progress");
        Delivery d5 = new Delivery("Mary","D005","012-4568165","Shah Alam","In Progress");
        
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        
        return list;
    }
    
    public void addRowToJTable()
    {
    
        DefaultTableModel model = (DefaultTableModel) jtDelivery.getModel();
        ArrayList<Delivery> list = Delivery();
        Object rowData[] = new Object[5];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).name;
            rowData[1] = list.get(i).orderId;
            rowData[2] = list.get(i).contactNo;
            rowData[3] = list.get(i).address;
            rowData[4] = list.get(i).deliveryStatus;
            model.addRow(rowData);
   
    
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDelivery = new javax.swing.JTable();
        jlblDate = new javax.swing.JLabel();
        jlblTime = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jtxtOrderId = new javax.swing.JTextField();
        jtxtContactNo = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtUpdate = new javax.swing.JButton();
        jbtClear = new javax.swing.JButton();
        jcboStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fiore Flowershop System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Fiore Flowershop Sdn. Bhd.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Order Delivery ");

        jtDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Order ID", "Contact No.", "Address", "Delivery Status", "Delivery Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDeliveryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDelivery);

        jlblDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jlblTime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jLabel3.setText("Name:");

        jLabel4.setText("Order ID:");

        jLabel5.setText("Contact No:");

        jLabel6.setText("Address: ");

        jLabel7.setText("Delivery Status: ");

        jbtUpdate.setText("Update");
        jbtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUpdateActionPerformed(evt);
            }
        });

        jbtClear.setText("Clear");
        jbtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClearActionPerformed(evt);
            }
        });

        jcboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivered", "In Progress", "Cancelled" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jtxtName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(jLabel3)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtAddress)
                            .addComponent(jtxtContactNo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addGap(608, 608, 608))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtUpdate)
                    .addComponent(jbtClear))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUpdateActionPerformed
              
      int i = jtDelivery.getSelectedRow();
        
      
      if(i >= 0)
      {
        jtDelivery.setValueAt(jtxtName.getText(), i, 0);
        jtDelivery.setValueAt(jtxtOrderId.getText(), i, 1);
        jtDelivery.setValueAt(jtxtContactNo.getText(), i, 2); 
        jtDelivery.setValueAt(jtxtAddress.getText(), i, 3);
        
         if(jcboStatus.getSelectedItem().equals("In Progress")){ 
            jtDelivery.setValueAt("In Progress", i, 4);  
            jtDelivery.setValueAt(null, i, 5); 
            
        }else if(jcboStatus.getSelectedItem().equals("Cancelled")){
             jtDelivery.setValueAt("Cancelled", i, 4);
            jtDelivery.setValueAt(null, i, 5); 

        }else{
         jtDelivery.setValueAt(jcboStatus.getSelectedItem().toString(), i, 4);   
         jtDelivery.setValueAt(jlblDate.getText().toString() + " " + jlblTime.getText().toString(), i, 5);
         JOptionPane.showMessageDialog(frame, "Delivery details updated.");
        }
         
      }else{
          
       JOptionPane.showMessageDialog(frame, "Update failed. Please select a customer.");
      }
        clearText();  
    }//GEN-LAST:event_jbtUpdateActionPerformed

    private void jtDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDeliveryMouseClicked
         
        DefaultTableModel model = (DefaultTableModel) jtDelivery.getModel();
        int selectedRowIndex = jtDelivery.getSelectedRow();
        
        jtxtName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jtxtOrderId.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jtxtContactNo.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jtxtAddress.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_jtDeliveryMouseClicked

    private void jbtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClearActionPerformed
       clearText(); 
    }//GEN-LAST:event_jbtClearActionPerformed

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
            java.util.logging.Logger.getLogger(JOrderDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JOrderDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JOrderDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JOrderDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JOrderDelivery().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtClear;
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JComboBox<String> jcboStatus;
    private javax.swing.JLabel jlblDate;
    private javax.swing.JLabel jlblTime;
    private javax.swing.JTable jtDelivery;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtContactNo;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtOrderId;
    // End of variables declaration//GEN-END:variables
}