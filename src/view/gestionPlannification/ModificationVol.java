/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gestionPlannification;

/**
 *
 * @author simo
 */
public class ModificationVol extends javax.swing.JFrame {

    /**
     * Creates new form PlannificationVol
     */
    public ModificationVol() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combox_numavion = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        dateVol = new javax.swing.JFormattedTextField();
        combox_aeroportdest = new javax.swing.JComboBox<>();
        editext_dureevol = new javax.swing.JTextField();
        editext_distancevol = new javax.swing.JTextField();
        editext_placeaffaire = new javax.swing.JTextField();
        editext_placeprem = new javax.swing.JTextField();
        editext_placeeco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combox_aeroportdep = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Date de Vol");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 54, 77, -1));

        jLabel2.setText("Aeroport depart");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 98, 132, -1));

        jLabel3.setText("Aeroport destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, 132, -1));

        jLabel5.setText("Distance de Vol");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 219, -1, -1));

        jLabel6.setText("Duree de Vol");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 186, 119, -1));

        jLabel4.setText("Nombre Place Affaire");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 261, 155, -1));

        jLabel8.setText("Nombre Place ECO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 343, 155, -1));

        jLabel9.setText("Nombre Place Premium");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 304, 155, -1));

        combox_numavion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combox_numavion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_numavionActionPerformed(evt);
            }
        });
        getContentPane().add(combox_numavion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 132, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 162, -1, -1));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 137, -1, -1));

        dateVol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol.setToolTipText("");
        getContentPane().add(dateVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 48, 132, -1));

        combox_aeroportdest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combox_aeroportdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_aeroportdestActionPerformed(evt);
            }
        });
        getContentPane().add(combox_aeroportdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 137, 132, -1));

        editext_dureevol.setEditable(false);
        editext_dureevol.setText("EX:22");
        getContentPane().add(editext_dureevol, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 180, 132, -1));

        editext_distancevol.setText("EX:400");
        getContentPane().add(editext_distancevol, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 213, 132, -1));

        editext_placeaffaire.setText("EX:100");
        editext_placeaffaire.setToolTipText("");
        getContentPane().add(editext_placeaffaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 255, 132, -1));

        editext_placeprem.setText("EX:100");
        editext_placeprem.setToolTipText("");
        getContentPane().add(editext_placeprem, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 298, 132, -1));

        editext_placeeco.setText("EX:100");
        getContentPane().add(editext_placeeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 337, 132, -1));

        jButton1.setText("CANCEL");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 132, -1));

        jButton2.setText("VALIDER");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 114, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setText("VOL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel10.setText("AVION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        combox_aeroportdep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combox_aeroportdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_aeroportdepActionPerformed(evt);
            }
        });
        getContentPane().add(combox_aeroportdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 93, 132, -1));

        jLabel11.setText("Numero Avion");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combox_numavionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_numavionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_numavionActionPerformed

    private void combox_aeroportdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_aeroportdestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_aeroportdestActionPerformed

    private void combox_aeroportdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_aeroportdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_aeroportdepActionPerformed

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
            java.util.logging.Logger.getLogger(ModificationVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificationVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificationVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificationVol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificationVol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combox_aeroportdep;
    private javax.swing.JComboBox<String> combox_aeroportdest;
    private javax.swing.JComboBox<String> combox_numavion;
    private javax.swing.JFormattedTextField dateVol;
    private javax.swing.JTextField editext_distancevol;
    private javax.swing.JTextField editext_dureevol;
    private javax.swing.JTextField editext_placeaffaire;
    private javax.swing.JTextField editext_placeeco;
    private javax.swing.JTextField editext_placeprem;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
