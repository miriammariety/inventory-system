/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author MiriamMarie
 */
public class EditItemWindow extends javax.swing.JFrame {

    /**
     * Creates new form EditItemWindow
     */
    public EditItemWindow() {
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

        editItem_panel = new javax.swing.JPanel();
        item_label = new javax.swing.JLabel();
        item_combo = new javax.swing.JComboBox();
        itemname_radiobutton = new javax.swing.JRadioButton();
        itemname_field = new javax.swing.JTextField();
        itemdescription_radiobutton = new javax.swing.JRadioButton();
        description_scollpane = new javax.swing.JScrollPane();
        description_field = new javax.swing.JTextArea();
        save_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Item");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        item_label.setText("Choose Item to Edit:");

        item_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        itemname_radiobutton.setText("New Item Name:");
        itemname_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemname_radiobuttonActionPerformed(evt);
            }
        });

        itemname_field.setEnabled(false);

        itemdescription_radiobutton.setText("New Item Description:");
        itemdescription_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdescription_radiobuttonActionPerformed(evt);
            }
        });

        description_field.setColumns(20);
        description_field.setLineWrap(true);
        description_field.setRows(5);
        description_field.setEnabled(false);
        description_scollpane.setViewportView(description_field);

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editItem_panelLayout = new javax.swing.GroupLayout(editItem_panel);
        editItem_panel.setLayout(editItem_panelLayout);
        editItem_panelLayout.setHorizontalGroup(
            editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItem_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editItem_panelLayout.createSequentialGroup()
                        .addComponent(itemdescription_radiobutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(description_scollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editItem_panelLayout.createSequentialGroup()
                        .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item_label)
                            .addComponent(itemname_radiobutton))
                        .addGap(20, 20, 20)
                        .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editItem_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        editItem_panelLayout.setVerticalGroup(
            editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItem_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_label)
                    .addComponent(item_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemname_radiobutton)
                    .addComponent(itemname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemdescription_radiobutton)
                    .addComponent(description_scollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(editItem_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(cancel_button))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editItem_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editItem_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemname_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemname_radiobuttonActionPerformed
        // TODO add your handling code here:]
        if(itemname_radiobutton.isSelected())
            itemname_field.setEnabled(true);
        else itemname_field.setEnabled(false);
    }//GEN-LAST:event_itemname_radiobuttonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void itemdescription_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdescription_radiobuttonActionPerformed
        // TODO add your handling code here:
        if(itemdescription_radiobutton.isSelected())
            description_field.setEnabled(true);
        else description_field.setEnabled(false);
    }//GEN-LAST:event_itemdescription_radiobuttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_save_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItemWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItemWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextArea description_field;
    private javax.swing.JScrollPane description_scollpane;
    private javax.swing.JPanel editItem_panel;
    private javax.swing.JComboBox item_combo;
    private javax.swing.JLabel item_label;
    private javax.swing.JRadioButton itemdescription_radiobutton;
    private javax.swing.JTextField itemname_field;
    private javax.swing.JRadioButton itemname_radiobutton;
    private javax.swing.JButton save_button;
    // End of variables declaration//GEN-END:variables
}
