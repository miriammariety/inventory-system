/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.Database;
import base.UI;
import commands.factory.CommandFactory;
import exceptions.ExecutorException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JFrame;
import models.Item;
import statics.Executor;

/**
 *
 * @author MiriamMarie
 */
public class AddWindow extends UI {
    JFrame item = new NewItemWindow();
    /**
     * Creates new form AddItemWindow
     */
    public AddWindow() {
        initComponents();
        Executor.put("addItem", CommandFactory.createAddItemCommand(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        additem_panel = new javax.swing.JPanel();
        itemname_label = new javax.swing.JLabel();
        itemName_combo = new javax.swing.JComboBox();
        quantity_label = new javax.swing.JLabel();
        newItem_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        quantity_field = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add");

        itemname_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemname_label.setText("Item Name:");

        EntityManager em = Database.EMF.createEntityManager();
        TypedQuery items = em.createQuery("SELECT i FROM Item i", Item.class);
        List<Item> itemList = items.getResultList();
        itemName_combo.setModel(new javax.swing.DefaultComboBoxModel());
        for(Item i : itemList)
        itemName_combo.addItem(i);
        itemName_combo.setName("itemName_combo"); // NOI18N

        quantity_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity_label.setText("Quantity:");

        newItem_button.setText("New Item...");
        newItem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItem_buttonActionPerformed(evt);
            }
        });

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        quantity_field.setName("quantity_field"); // NOI18N

        javax.swing.GroupLayout additem_panelLayout = new javax.swing.GroupLayout(additem_panel);
        additem_panel.setLayout(additem_panelLayout);
        additem_panelLayout.setHorizontalGroup(
            additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additem_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(additem_panelLayout.createSequentialGroup()
                        .addGroup(additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(additem_panelLayout.createSequentialGroup()
                                .addComponent(quantity_label, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(additem_panelLayout.createSequentialGroup()
                                .addComponent(itemname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(newItem_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, additem_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        additem_panelLayout.setVerticalGroup(
            additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additem_panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemname_label)
                    .addComponent(itemName_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newItem_button))
                .addGap(18, 18, 18)
                .addGroup(additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_label)
                    .addComponent(quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(additem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(cancel_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(additem_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(additem_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItem_buttonActionPerformed
        // TODO add your handling code here:
        item.show();
    }//GEN-LAST:event_newItem_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        try {
            // TODO add your handling code here:
            Executor.execute("addItem");
        } catch (ExecutorException ex) {
            Logger.getLogger(AddWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_add_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JPanel additem_panel;
    private javax.swing.JButton cancel_button;
    private javax.swing.JComboBox itemName_combo;
    private javax.swing.JLabel itemname_label;
    private javax.swing.JButton newItem_button;
    private javax.swing.JSpinner quantity_field;
    private javax.swing.JLabel quantity_label;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        Map fields = new HashMap();
        fields.put(itemName_combo.getName(), itemName_combo);
        fields.put(quantity_field.getName(), quantity_field);
        return fields;
    }
}
