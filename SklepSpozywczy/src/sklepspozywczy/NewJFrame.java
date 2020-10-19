
package sklepspozywczy;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class NewJFrame extends javax.swing.JFrame {

  
    public NewJFrame()
    {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_imie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nazwisko = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_pesel = new javax.swing.JTextField();
        jDateChooser_dataUrodzenia = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_adres = new javax.swing.JTextField();
        jTextField_nrD = new javax.swing.JTextField();
        jTextField_urządS = new javax.swing.JTextField();
        jDateChooser_dataRozPracy = new com.toedter.calendar.JDateChooser();
        jTextField_tel = new javax.swing.JTextField();
        jButton_dodaj = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("WPROWADZ DANE PRACOWNIKA");

        jLabel2.setText("Imię:");

        jTextField_imie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_imieActionPerformed(evt);
            }
        });
        jTextField_imie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_imieKeyTyped(evt);
            }
        });

        jLabel3.setText("Nazwisko:");

        jTextField_nazwisko.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_nazwiskoKeyTyped(evt);
            }
        });

        jLabel4.setText("Pesel:");

        jLabel5.setText("Data urodzenia:");

        jTextField_pesel.setToolTipText("");
        jTextField_pesel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_peselKeyTyped(evt);
            }
        });

        jDateChooser_dataUrodzenia.setToolTipText(""); // NOI18N
        jDateChooser_dataUrodzenia.setDateFormatString("dd-MM-yyyy");
        jDateChooser_dataUrodzenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser_dataUrodzeniaKeyTyped(evt);
            }
        });

        jLabel6.setText("Adres zamieszkania:");

        jLabel7.setText("Nr domu/mieszkania:");

        jLabel8.setText("Urząd skarbowy:");

        jLabel9.setText("Data rozpoczęcia pracy:");

        jLabel10.setText("Stawka za godzinę:");

        jLabel11.setText("Telefon komórkowy:");

        jTextField_adres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_adresKeyTyped(evt);
            }
        });

        jTextField_nrD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nrDActionPerformed(evt);
            }
        });
        jTextField_nrD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_nrDKeyTyped(evt);
            }
        });

        jTextField_urządS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_urządSKeyTyped(evt);
            }
        });

        jDateChooser_dataRozPracy.setDateFormatString("dd-MM-yyyy");

        jTextField_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_telKeyTyped(evt);
            }
        });

        jButton_dodaj.setText("Dodaj pracownika ");
        jButton_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dodajActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton1.setText("Wyczyść");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imie ", "Nazwisko", "Pesel", "DataUrodzenia", "AdresZamieszkania", "NrDomu", "UrządSkarbowy", "DataRozPracy", "StawkaZaH", "Telefon"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("WYSWIETL DANE PRACOWNIKOW OBECNYCH W SYSTEMIE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edytuj ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("OdświeżTabele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Usuń");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_adres)
                                        .addComponent(jDateChooser_dataUrodzenia, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(jTextField_urządS)
                                        .addComponent(jTextField_nrD)
                                        .addComponent(jDateChooser_dataRozPracy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_tel)
                                        .addComponent(jSpinner1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_pesel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_imie, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser_dataUrodzenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_nrD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_urządS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser_dataRozPracy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_dodaj)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void odswiezTabele()
    {
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       
       for(DanePracownikow d : DanePracownikow.danePracownikow)
       {
            model.addRow(new Object[]{d.imie+" "+d.nazwisko,d.pesel,d.dataUrodzeniaa,d.adresZamieszkania+" "+d.numerDomu,
               d.urzadSkarbowy,d.dataRozpPracy,d.stawka,d.telefon});
               } ;
     
       }
    
    
    
    
    private void jTextField_imieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_imieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_imieActionPerformed

    private void jTextField_nrDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nrDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nrDActionPerformed

    private void jButton_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dodajActionPerformed
       
        if(jTextField_imie.getText().isEmpty() || jTextField_nazwisko.getText().isEmpty() || jTextField_pesel.getText().isEmpty()
                || jTextField_adres.getText().isEmpty() || jTextField_nrD.getText().isEmpty() || jTextField_urządS.getText().isEmpty()
                || jTextField_tel.getText().isEmpty() )
        {
          JOptionPane.showMessageDialog(this,"Nie wypełniono wszystkich pól!!!");  
        }
        else{
        
        DanePracownikow pracownik = new DanePracownikow();
        
            pracownik.imie = jTextField_imie.getText();
            pracownik.nazwisko = jTextField_nazwisko.getText();
            try
            {
            String text = jTextField_pesel.getText();
            pracownik.pesel = Long.parseLong(text);
            }
            catch(NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(this,"Podaj pesel"); 
            }
             SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
             String theDate = dateFormat.format(jDateChooser_dataUrodzenia.getDate());
             String theDate1 = dateFormat.format(jDateChooser_dataRozPracy.getDate());
            pracownik.dataUrodzeniaa = theDate;
            
            pracownik.dataRozpPracy = theDate1;
            pracownik.adresZamieszkania = jTextField_adres.getText();
            try
            {
            String text1 = jTextField_nrD.getText();
            pracownik.numerDomu = Integer.parseInt(text1);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this,"Podaj numer Domu"); 
            }
            pracownik.urzadSkarbowy = jTextField_urządS.getText();
            pracownik.stawka = (int)jSpinner1.getValue();
            try
            {
            String text2 = jTextField_tel.getText();
            pracownik.telefon = Long.parseLong(text2);
            }
            catch(NumberFormatException ex)
            {
            JOptionPane.showMessageDialog(this,"Podaj numer telefonu"); 
            }
            
            
        DanePracownikow.danePracownikow.add(pracownik);
        
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         model.addRow(new Object[]{pracownik.imie,pracownik.nazwisko,pracownik.pesel,pracownik.dataUrodzeniaa,pracownik.adresZamieszkania,pracownik.numerDomu,
               pracownik.urzadSkarbowy,pracownik.dataRozpPracy,pracownik.stawka,pracownik.telefon});
     
        }
    }//GEN-LAST:event_jButton_dodajActionPerformed

    private void jTextField_peselKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_peselKeyTyped
       if(!jestLiczba(evt.getKeyChar()))
               {
                   evt.consume();
               }
      
    }//GEN-LAST:event_jTextField_peselKeyTyped

    private void jTextField_nrDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nrDKeyTyped
         if(!jestLiczba(evt.getKeyChar()))
               {
                   evt.consume();
               }
      
    }//GEN-LAST:event_jTextField_nrDKeyTyped

    private void jTextField_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_telKeyTyped
           if(!jestLiczba(evt.getKeyChar()))
               {
                   evt.consume();
               }
      
    }//GEN-LAST:event_jTextField_telKeyTyped

    private void jTextField_imieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_imieKeyTyped
       if(!jestString(evt.getKeyChar()))
       {
           evt.consume();
       }
        
        
        
    }//GEN-LAST:event_jTextField_imieKeyTyped

    private void jTextField_nazwiskoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nazwiskoKeyTyped
       if(!jestString(evt.getKeyChar()))
       {
           evt.consume();
       }
        
        
    }//GEN-LAST:event_jTextField_nazwiskoKeyTyped

    private void jTextField_adresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_adresKeyTyped
        if(!jestString(evt.getKeyChar()))
       {
           evt.consume();
       }
        
        
    }//GEN-LAST:event_jTextField_adresKeyTyped

    private void jTextField_urządSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_urządSKeyTyped
       if(!jestString(evt.getKeyChar()))
       {
           evt.consume();
       }
        
        
    }//GEN-LAST:event_jTextField_urządSKeyTyped

    private void jDateChooser_dataUrodzeniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_dataUrodzeniaKeyTyped
//       if( (!jestData(evt.getKeyChar()))  || (!jestznakDaty(evt.getKeyChar())) )
//       {
//           evt.consume();
//       }
      
        
    }//GEN-LAST:event_jDateChooser_dataUrodzeniaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField_imie.setText("");
        jTextField_nazwisko.setText("");
        jTextField_pesel.setText("");
        jTextField_adres.setText("");
        jTextField_nrD.setText("");
        jTextField_urządS.setText("");
        jTextField_tel.setText("");
        jSpinner1.setValue(0);
        jDateChooser_dataUrodzenia.setCalendar(null);
        jDateChooser_dataRozPracy.setCalendar(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            odswiezTabele();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DanePracownikow pracownik = DanePracownikow.danePracownikow.get(jTable1.getSelectedRow()); 
        System.out.println(jTable1.getSelectedRow());
        int row = jTable1.getSelectedRow();

        
            if(DanePracownikow.danePracownikow.get(row).pesel == pracownik.pesel)
            {
                if(DanePracownikow.danePracownikow.get(row).nazwisko.equals(pracownik.nazwisko)) 
                { 
                  DanePracownikow.danePracownikow.get(row).imie = (String) jTable1.getValueAt(row,0);
                  DanePracownikow.danePracownikow.get(row).nazwisko = (String) jTable1.getValueAt(row,1);
                  DanePracownikow.danePracownikow.get(row).pesel =  (long) jTable1.getValueAt(row,2);
                  DanePracownikow.danePracownikow.get(row).dataUrodzeniaa = (String) jTable1.getValueAt(row,3);
                  DanePracownikow.danePracownikow.get(row).adresZamieszkania = (String) jTable1.getValueAt(row,4);
                  DanePracownikow.danePracownikow.get(row).numerDomu =  (int) jTable1.getValueAt(row,5);
                  DanePracownikow.danePracownikow.get(row).urzadSkarbowy = (String) jTable1.getValueAt(row,6);
                  DanePracownikow.danePracownikow.get(row).dataRozpPracy= (String) jTable1.getValueAt(row,7);
                  DanePracownikow.danePracownikow.get(row).stawka =  (int) jTable1.getValueAt(row,8);
                  DanePracownikow.danePracownikow.get(row).telefon =  (long) jTable1.getValueAt(row,9);
                }
            }   
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        for(DanePracownikow pracownik : DanePracownikow.danePracownikow )
      {
        
         model.addRow(new Object[]{pracownik.imie,pracownik.nazwisko,pracownik.pesel,pracownik.dataUrodzeniaa,pracownik.adresZamieszkania,pracownik.numerDomu,
               pracownik.urzadSkarbowy,pracownik.dataRozpPracy,pracownik.stawka,pracownik.telefon});
      } 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row = jTable1.getSelectedRow();
         
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.removeRow(row);
 
        DanePracownikow.danePracownikow.remove(row);
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private boolean jestLiczba(char zn)
    {
        if(zn >= '0' && zn <= '9')
            return true;
        
        else 
            return false;
    }
  
    private boolean jestString(char zn)
    {
        if(zn >= '0' && zn <= '9')
            return false;
        
        else 
            return true;
    }
    
//    private boolean jestData(char zn)
//    {
//        if (zn >= '0' && zn <= '9')
//            return true;
//        else
//            return false;
//    }
//    
//        private boolean jestznakDaty(char zn)
//    {
//        if (zn >= '-')
//            return true;
//        else
//            return false;
//    }
    
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_dodaj;
    private com.toedter.calendar.JDateChooser jDateChooser_dataRozPracy;
    private com.toedter.calendar.JDateChooser jDateChooser_dataUrodzenia;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_adres;
    private javax.swing.JTextField jTextField_imie;
    private javax.swing.JTextField jTextField_nazwisko;
    private javax.swing.JTextField jTextField_nrD;
    private javax.swing.JTextField jTextField_pesel;
    private javax.swing.JTextField jTextField_tel;
    private javax.swing.JTextField jTextField_urządS;
    // End of variables declaration//GEN-END:variables
}
