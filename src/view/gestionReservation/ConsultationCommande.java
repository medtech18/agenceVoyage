/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gestionReservation;

/**
 *
 * @author simo
 */
public class ConsultationCommande extends javax.swing.JPanel {

    /**
     * Creates new form ConsultationCommande
     */
    public ConsultationCommande() {
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
        dateVol = new javax.swing.JFormattedTextField();
        dateVol1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        dateVol2 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateVol3 = new javax.swing.JFormattedTextField();
        dateVol4 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        dateVol5 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        dateVol6 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        dateVol7 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Consultation d'une commande");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 24, -1, -1));

        jLabel2.setText("Numero Client");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 10));

        dateVol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol.setToolTipText("");
        add(dateVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 132, -1));

        dateVol1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol1.setToolTipText("");
        add(dateVol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 132, -1));

        jLabel10.setText("Nom Client");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 77, -1));

        dateVol2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol2.setToolTipText("");
        add(dateVol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 132, -1));

        jLabel11.setText("Numero Passport");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        jLabel3.setText("Numero Reservation");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 10));

        dateVol3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol3.setToolTipText("");
        add(dateVol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 132, -1));

        dateVol4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol4.setToolTipText("");
        add(dateVol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 132, -1));

        jLabel12.setText("Classe Place");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 77, -1));

        dateVol5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol5.setToolTipText("");
        add(dateVol5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 132, -1));

        jLabel13.setText("Date Reservation");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, -1));

        dateVol6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol6.setToolTipText("");
        add(dateVol6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 132, -1));

        jLabel14.setText("Position Place");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 90, -1));

        dateVol7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateVol7.setToolTipText("");
        add(dateVol7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 132, -1));

        jLabel15.setText("Prix Place");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 77, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField dateVol;
    private javax.swing.JFormattedTextField dateVol1;
    private javax.swing.JFormattedTextField dateVol2;
    private javax.swing.JFormattedTextField dateVol3;
    private javax.swing.JFormattedTextField dateVol4;
    private javax.swing.JFormattedTextField dateVol5;
    private javax.swing.JFormattedTextField dateVol6;
    private javax.swing.JFormattedTextField dateVol7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
