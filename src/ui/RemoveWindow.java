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
import models.Item;
import statics.Executor;

/**
 *
 * @author MiriamMarie
 */
public class RemoveWindow extends UI {

    /**
     * Creates new form RemoveWindow
     */
    public RemoveWindow() {
        initComponents();
        Executor.put("removeItem", CommandFactory.createRemoveItemCommand(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        remove_panel = new javax.swing.JPanel();
        item_label = new javax.swing.JLabel();
        removeItem_combo = new javax.swing.JComboBox();
        quantity_label = new javax.swing.JLabel();
        remove_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        quantity_field = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Item");

        item_label.setText("Item Name:");

        List<Item> itemList = Database.getItemList();
        removeItem_combo.setModel(new javax.swing.DefaultComboBoxModel());
        removeItem_combo.addItem(new String("--- SELECT ITEM ---"));
        for(Item i : itemList)
        removeItem_combo.addItem(i);
        removeItem_combo.setName("removeItem_combo"); // NOI18N
        removeItem_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                removeItem_comboItemStateChanged(evt);
            }
        });

        quantity_label.setText("Quantity:");

        remove_button.setText("Remove");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        quantity_field.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        quantity_field.setName("quantity_field"); // NOI18N

        javax.swing.GroupLayout remove_panelLayout = new javax.swing.GroupLayout(remove_panel);
        remove_panel.setLayout(remove_panelLayout);
        remove_panelLayout.setHorizontalGroup(
            remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remove_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantity_label, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeItem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, remove_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remove_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        remove_panelLayout.setVerticalGroup(
            remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remove_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_label)
                    .addComponent(removeItem_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_label)
                    .addComponent(quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(remove_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove_button)
                    .addComponent(cancel_button))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remove_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remove_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        try {
            Executor.execute("removeItem");
        } catch (ExecutorException ex) {
            Logger.getLogger(RemoveWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_remove_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void removeItem_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_removeItem_comboItemStateChanged
        int maxQuantity = ((Item) removeItem_combo.getSelectedItem()).getQuantity();
        quantity_field.setModel(new javax.swing.SpinnerNumberModel(0, 0, maxQuantity, 1));
    }//GEN-LAST:event_removeItem_comboItemStateChanged

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
            java.util.logging.Logger.getLogger(RemoveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel item_label;
    private javax.swing.JSpinner quantity_field;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JComboBox removeItem_combo;
    private javax.swing.JButton remove_button;
    private javax.swing.JPanel remove_panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        Map fields = new HashMap();
        fields.put(quantity_field.getName(), quantity_field);
        fields.put(removeItem_combo.getName(), removeItem_combo);
        return fields;
    }
}
