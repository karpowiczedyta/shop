/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklepspozywczy;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FaktycznaLiczbaPrzepracowanychGodzin extends javax.swing.JFrame {

    /**
     * Creates new form FaktycznaLiczbaPrzepracowanychGodzin
     */
    public FaktycznaLiczbaPrzepracowanychGodzin() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Dodaj = new javax.swing.JButton();
        jButton_Edytuj = new javax.swing.JButton();
        jButton_Usun = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("WYBIERZ PRACOWNIKA");

        jLabel2.setText("WYBIERZ DZIEN ROBOCZY");

        jLabel3.setText("WYBIERZ ILOŚĆ GODZIN");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 16, 1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imie", "Nazwisko", "Data", "GodzinyP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton_Dodaj.setText("Dodaj przepracowane godziny");
        jButton_Dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DodajActionPerformed(evt);
            }
        });

        jButton_Edytuj.setText("Edytuj");
        jButton_Edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EdytujActionPerformed(evt);
            }
        });

        jButton_Usun.setText("Usuń");
        jButton_Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UsunActionPerformed(evt);
            }
        });

        jButton1.setText("Odswież");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Dodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Edytuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Usun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Edytuj)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Usun)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       for( DanePracownikow p : DanePracownikow.danePracownikow)
        {
            jComboBox1.addItem(p.imie+" "+p.nazwisko);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton_DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DodajActionPerformed
       PrzepracowaneGodziny pG = new PrzepracowaneGodziny();
        
        if(jComboBox1.getSelectedIndex()==-1 )
            JOptionPane.showMessageDialog(this,"Nie wypełniono wszystkich pól!!!");
        else{
        pG.pracownik = DanePracownikow.danePracownikow.get(jComboBox1.getSelectedIndex());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
        String theDate = dateFormat.format(jDateChooser1.getDate());
        pG.dzien = theDate;
        pG.liczbaGodzin = (int)jSpinner1.getValue();
        
        PrzepracowaneGodziny.przepracowaneGodziny.add(pG);
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         model.addRow(new Object[]{pG.pracownik.imie,pG.pracownik.nazwisko,pG.dzien,pG.liczbaGodzin});
        }
       
        
    }//GEN-LAST:event_jButton_DodajActionPerformed

    private void jButton_EdytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EdytujActionPerformed
       DanePracownikow pracownik = DanePracownikow.danePracownikow.get(jTable1.getSelectedRow()); 
        System.out.println(jTable1.getSelectedRow());
        int row = jTable1.getSelectedRow();

        
      
         for (int i = 0; i < PrzepracowaneGodziny.przepracowaneGodziny.size() ; i++) {
             
           if(PrzepracowaneGodziny.przepracowaneGodziny.get(i).pracownik.pesel == pracownik.pesel)
            {
                if(PrzepracowaneGodziny.przepracowaneGodziny.get(i).pracownik.nazwisko.equals(pracownik.nazwisko)) 
                    
                { 
                 //PrzepracowaneGodziny.przepracowaneGodziny.get(i).pracownik.imie= (String) jTable1.getValueAt(i,1);
                 //PrzepracowaneGodziny.przepracowaneGodziny.get(i).pracownik.nazwisko = (String) jTable1.getValueAt(i,2);
                 PrzepracowaneGodziny.przepracowaneGodziny.get(i).dzien = (String) jTable1.getValueAt(i, 2);
                 PrzepracowaneGodziny.przepracowaneGodziny.get(i).liczbaGodzin= (int) jTable1.getValueAt(i, 3);
                }
            }   
             
             
             
        }
           
     
      

        
    }//GEN-LAST:event_jButton_EdytujActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        for (PrzepracowaneGodziny pG : PrzepracowaneGodziny.przepracowaneGodziny) 
        {
            
           model.addRow(new Object[]{pG.pracownik.imie+" "+pG.pracownik.nazwisko,pG.dzien,pG.liczbaGodzin});
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UsunActionPerformed
                                              
        int row = jTable1.getSelectedRow();
         
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.removeRow(row);
 
        PrzepracowaneGodziny.przepracowaneGodziny.remove(row);
        
  
    }//GEN-LAST:event_jButton_UsunActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaktycznaLiczbaPrzepracowanychGodzin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Dodaj;
    private javax.swing.JButton jButton_Edytuj;
    private javax.swing.JButton jButton_Usun;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
