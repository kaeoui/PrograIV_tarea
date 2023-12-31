/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package upi.cr.ejerciciojframe.vista;

import java.awt.event.ActionListener;
import upi.cr.ejerciciojframe.modelo.Calculo;

/**
 *
 * @author User
 */
public class PnlCalculo extends javax.swing.JPanel {

    /**
     * Creates new form PnlCalculo
     */
    public PnlCalculo() {
        initComponents();
    }

    public void escuchar(ActionListener manejador) {
     
        this.btnSuma.addActionListener(manejador); 
        this.btnResta.addActionListener(manejador); 
        this.btnMultiplicacion.addActionListener(manejador); 
        this.btnDivision.addActionListener(manejador); 
        this.btnNumPrimo.addActionListener(manejador); 
               
    }
    
    public String getNum_1() {
        return this.txtNum1.getText(); 
        
    }
    
    public String getNum_2() {
        return this.txtNum2.getText(); 
        
    }
    
    public void setDatos(Calculo calculo){
//        this.txtNum1.setValue(calculo.getNum_1());
//        this.txtNum2.setValue(calculo.getNum_2());
    }
    
    public void limpiar() {
        this.txtNum1.setText(""); 
        this.txtNum2.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnNumPrimo = new javax.swing.JButton();

        btnCalcular1.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcular1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular1.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular1.setText("Calcular");
        btnCalcular1.setActionCommand("calcular");
        btnCalcular1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número 1:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número 2:");

        txtNum1.setBackground(new java.awt.Color(255, 255, 255));
        txtNum1.setActionCommand("num1");
        txtNum1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNum2.setBackground(new java.awt.Color(255, 255, 255));
        txtNum2.setActionCommand("num2");
        txtNum2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 0, 0));
        btnSuma.setText("Suma");
        btnSuma.setActionCommand("suma");
        btnSuma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 0, 0));
        btnResta.setText("Restar");
        btnResta.setActionCommand("resta");
        btnResta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        btnMultiplicacion.setText("Multiplicación");
        btnMultiplicacion.setActionCommand("multiplicacion");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 0, 0));
        btnDivision.setText("División");
        btnDivision.setActionCommand("division");
        btnDivision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumPrimo.setBackground(new java.awt.Color(255, 255, 255));
        btnNumPrimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNumPrimo.setForeground(new java.awt.Color(0, 0, 0));
        btnNumPrimo.setText("Número Primo");
        btnNumPrimo.setActionCommand("numprimo");
        btnNumPrimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnSuma)
                .addGap(18, 18, 18)
                .addComponent(btnResta)
                .addGap(18, 18, 18)
                .addComponent(btnMultiplicacion)
                .addGap(18, 18, 18)
                .addComponent(btnDivision)
                .addGap(18, 18, 18)
                .addComponent(btnNumPrimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta)
                    .addComponent(btnMultiplicacion)
                    .addComponent(btnDivision)
                    .addComponent(btnNumPrimo))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNumPrimo;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
