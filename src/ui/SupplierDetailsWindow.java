/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import base.UI;
import java.util.Map;

/**
 *
 * @author MiriamMarie
 */
public class SupplierDetailsWindow extends UI {

    /**
     * Creates new form SupplierDetailsWindow
     */
    public SupplierDetailsWindow() {
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

        supplier_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        contact_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        street_label = new javax.swing.JLabel();
        country_label = new javax.swing.JLabel();
        province_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        zipcode_label = new javax.swing.JLabel();
        name_details = new javax.swing.JLabel();
        contact_details = new javax.swing.JLabel();
        email_details = new javax.swing.JLabel();
        street_details = new javax.swing.JLabel();
        country_details = new javax.swing.JLabel();
        zipcode_details = new javax.swing.JLabel();
        province_details = new javax.swing.JLabel();
        city_details = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Details");
        setName("Form"); // NOI18N

        supplier_panel.setName("supplier_panel"); // NOI18N

        name_label.setText("Supplier Name:");
        name_label.setName("name_label"); // NOI18N

        contact_label.setText("Contact:");
        contact_label.setName("contact_label"); // NOI18N

        email_label.setText("Email:");
        email_label.setName("email_label"); // NOI18N

        address_label.setText("Address");
        address_label.setName("address_label"); // NOI18N

        street_label.setText("Street:");
        street_label.setName("street_label"); // NOI18N

        country_label.setText("Country:");
        country_label.setName("country_label"); // NOI18N

        province_label.setText("Province:");
        province_label.setName("province_label"); // NOI18N

        city_label.setText("City:");
        city_label.setName("city_label"); // NOI18N

        zipcode_label.setText("Zip Code:");
        zipcode_label.setName("zipcode_label"); // NOI18N

        name_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        name_details.setName("name_details"); // NOI18N

        contact_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contact_details.setName("contact_details"); // NOI18N

        email_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email_details.setName("email_details"); // NOI18N

        street_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        street_details.setName("street_details"); // NOI18N

        country_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        country_details.setName("country_details"); // NOI18N

        zipcode_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        zipcode_details.setName("zipcode_details"); // NOI18N

        province_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        province_details.setName("province_details"); // NOI18N

        city_details.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        city_details.setName("city_details"); // NOI18N

        close_button.setText("Close");
        close_button.setName("close_button"); // NOI18N
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supplier_panelLayout = new javax.swing.GroupLayout(supplier_panel);
        supplier_panel.setLayout(supplier_panelLayout);
        supplier_panelLayout.setHorizontalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplier_panelLayout.createSequentialGroup()
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, supplier_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addComponent(contact_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contact_details, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email_details, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address_label)
                                    .addGroup(supplier_panelLayout.createSequentialGroup()
                                        .addComponent(name_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(name_details, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(supplier_panelLayout.createSequentialGroup()
                                    .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(province_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(country_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(province_details, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(supplier_panelLayout.createSequentialGroup()
                                            .addComponent(country_details, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(zipcode_label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(zipcode_details, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(supplier_panelLayout.createSequentialGroup()
                                    .addComponent(street_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(street_details, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(city_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(city_details, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18))
        );
        supplier_panelLayout.setVerticalGroup(
            supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(name_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contact_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_label)
                    .addComponent(email_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_label)
                .addGap(12, 12, 12)
                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(street_label)
                            .addComponent(city_label)
                            .addComponent(street_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(supplier_panelLayout.createSequentialGroup()
                                    .addComponent(zipcode_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                    .addComponent(close_button)
                                    .addGap(38, 38, 38))
                                .addGroup(supplier_panelLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(province_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(supplier_panelLayout.createSequentialGroup()
                                .addGroup(supplier_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(country_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(country_label)
                                    .addComponent(zipcode_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(province_label))))
                    .addGroup(supplier_panelLayout.createSequentialGroup()
                        .addComponent(city_details, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplier_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplier_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_close_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierDetailsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel city_details;
    private javax.swing.JLabel city_label;
    private javax.swing.JButton close_button;
    private javax.swing.JLabel contact_details;
    private javax.swing.JLabel contact_label;
    private javax.swing.JLabel country_details;
    private javax.swing.JLabel country_label;
    private javax.swing.JLabel email_details;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel name_details;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel province_details;
    private javax.swing.JLabel province_label;
    private javax.swing.JLabel street_details;
    private javax.swing.JLabel street_label;
    private javax.swing.JPanel supplier_panel;
    private javax.swing.JLabel zipcode_details;
    private javax.swing.JLabel zipcode_label;
    // End of variables declaration//GEN-END:variables

    @Override
    public Map getFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
