
package contacts;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame {
      DefaultTableModel model;
      File f;
   
        public MainFrame() throws Exception {
        initComponents();
        ImageIcon img = new ImageIcon("src/Resors/logo.png") ;
        setIconImage(img.getImage());
        model = (DefaultTableModel) table.getModel();
        table.setAutoCreateRowSorter(true);
        f = new File("src/data.bin");
        if(!f.exists()){
            f.createNewFile();
        }
        start();
    }
     public void start()throws Exception {
         FileInputStream fi = new  FileInputStream(f) ;
         if(f.length()==0){
             return;
         }
         ObjectInputStream oi = new ObjectInputStream(fi);
         Vector<Vector> tableData = (Vector<Vector> )oi.readObject();
         
         oi.close();
         fi.close();
         numberOfClients = tableData.size();
         for(int i = 0 ; i < numberOfClients;i++){
             model.addRow(new Object[]{tableData.get(i).get(0),tableData.get(i).get(1),tableData.get(i).get(2),tableData.get(i).get(3),tableData.get(i).get(4)});
         }
         
         updateCounter(numberOfClients);
     }
     
     public void updateFile() throws Exception{
         Vector<Vector> tableData = model.getDataVector();
         FileOutputStream fo = new  FileOutputStream(f) ;
         ObjectOutputStream oo = new ObjectOutputStream(fo);
         oo.writeObject(tableData);
         fo.close();
         oo.close();
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        elnemrLable = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        fullNameLable = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        phoneNumberLable = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        cityLable = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        gmailLable = new javax.swing.JLabel();
        gmailText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        listOfContactsLable = new javax.swing.JLabel();
        numberOfClientsLable = new javax.swing.JLabel();
        counterLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/id-card.png"))); // NOI18N
        jLabel4.setText("* Full Name");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        elnemrLable.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        elnemrLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elnemrLable.setText("Eng/A.Elnemr");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 650));
        setPreferredSize(new java.awt.Dimension(950, 650));
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(0, 255, 204));
        mainpanel.setForeground(new java.awt.Color(143, 188, 143));
        mainpanel.setMinimumSize(new java.awt.Dimension(950, 700));
        mainpanel.setPreferredSize(new java.awt.Dimension(950, 700));

        newClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        newClientPanel.setOpaque(false);
        newClientPanel.setPreferredSize(new java.awt.Dimension(350, 400));

        fullNameLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        fullNameLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/id-card.png"))); // NOI18N
        fullNameLable.setText("* Full Name");

        fullNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextActionPerformed(evt);
            }
        });

        phoneNumberLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        phoneNumberLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/telephone.png"))); // NOI18N
        phoneNumberLable.setText("* Phone Number");

        phoneNumberText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cityLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cityLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/buildings.png"))); // NOI18N
        cityLable.setText(" city");

        cityText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        gmailLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        gmailLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/gmail-logo.png"))); // NOI18N
        gmailLable.setText("* Gmail");

        gmailText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/broom.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/delete.png"))); // NOI18N
        deleteButton.setText("Delete SR");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/changes.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityText)
                    .addComponent(phoneNumberText)
                    .addComponent(fullNameText)
                    .addComponent(gmailLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gmailText)
                    .addComponent(phoneNumberLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newClientPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newClientPanelLayout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newClientPanelLayout.createSequentialGroup()
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(phoneNumberLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cityLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        listOfContactsLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        listOfContactsLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfContactsLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/contact.png"))); // NOI18N
        listOfContactsLable.setText("List of Contacts");

        numberOfClientsLable.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        numberOfClientsLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/number-blocks.png"))); // NOI18N
        numberOfClientsLable.setText("Number of Clients is :");

        counterLable.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        counterLable.setText("0");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Full Name", "Phone Number", "Gmail", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setPreferredSize(new java.awt.Dimension(1000, 700));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(90);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        comboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Full Name", "Phone Number", "Gmail", "City" }));
        comboBox.setSelectedIndex(1);

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resors/icons8-search-30.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(numberOfClientsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterLable, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(listOfContactsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfClientsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counterLable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listOfContactsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBox)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       
        clear();
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
      
        if(checkMainInfo()){
          Client newClient;
          if(cityText.getText().trim().isEmpty()){
              newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim() , gmailText.getText().trim());
          }
          else
          {
             newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim() , gmailText.getText().trim() , cityText.getText().trim());
          }
          if(!newClient.falg()){
             JOptionPane.showMessageDialog(this, newClient.getMessage() , "Error",JOptionPane.ERROR_MESSAGE);
          }
          
          
        }
       
        else{
            JOptionPane.showMessageDialog(this, "Please Enter Main Information", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       int index = table.getSelectedRow();
       if(index<0){
           JOptionPane.showMessageDialog(this,"please select at least one row", "Not Selected row!" ,JOptionPane.ERROR_MESSAGE );
       }
       else{
       model.removeRow(index);
        numberOfClients--;
        updateCounter(numberOfClients);
        clear();
       }
          try {
              updateFile();
          } catch (Exception ex) {
              Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if(searchBox.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Invalid Search", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(comboBox.getSelectedItem().equals("All")){
                for(int i=0 ;i<numberOfClients;i++){
                    for(int j=1 ; j<5 ; j++){
                    if(table.getValueAt(i, j).toString().trim().equals(searchBox.getText().trim())){
                      validSearch(i);
                      return;
                    }
                }
                }
               }
                       
        else if(comboBox.getSelectedItem().equals("Full Name")) {
                 for(int i=0 ; i<numberOfClients ; i++){
                    if(table.getValueAt(i, 1).toString().trim().equals(searchBox.getText().trim())){
                      validSearch(i);
                      return;
                    }
                }
        }
            else if(comboBox.getSelectedItem().equals("Phone Number")){
                for(int i=0 ; i<numberOfClients ; i++){
                    if(table.getValueAt(i, 2).toString().trim().equals(searchBox.getText().trim())){
                      validSearch(i);
                      return;
                    }
                }
            }
            else if(comboBox.getSelectedItem().equals("Gmail")){
                for(int i=0 ; i<numberOfClients ; i++){
                    if(table.getValueAt(i, 3).toString().trim().equals(searchBox.getText().trim())){
                      validSearch(i);
                      return;
                    }
                }
            }
            else{
                for(int i=0 ; i<numberOfClients ; i++){
                    if(table.getValueAt(i, 4).toString().trim().equals(searchBox.getText().trim())){
                      validSearch(i);
                      return;
                    }
                }
            }
            
             JOptionPane.showMessageDialog(this,"Not Founded Data In the option: " +comboBox.getSelectedItem(),"Not Founded" , JOptionPane.ERROR_MESSAGE);
    }            
               
                    
        
    }//GEN-LAST:event_searchButtonActionPerformed
    public void updateToTable(Client c )throws Exception{
        int i =table.getSelectedRow();
        model.setValueAt(c.getFullName() , i, 1);
        model.setValueAt(c.getPhoneNumber() , i, 2);
        model.setValueAt(c.getGmail() , i, 3);
        model.setValueAt(c.getCity() , i, 4);
         updateFile();
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(checkMainInfo()){
          Client newClient;
          if(cityText.getText().trim().isEmpty()){
              newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim() , gmailText.getText().trim());
          }
          else
          {
             newClient = new Client(fullNameText.getText().trim() , phoneNumberText.getText().trim() , gmailText.getText().trim() , cityText.getText().trim());
          }
          if(!newClient.falg()){
             JOptionPane.showMessageDialog(this, newClient.getMessage() , "Error",JOptionPane.ERROR_MESSAGE);
          }
          else{
              try {
                  updateToTable(newClient);
              } catch (Exception ex) {
                  Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
       
        else{
            JOptionPane.showMessageDialog(this, "Please Enter Main Information", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed
    public void validSearch(int i){
        JOptionPane.showMessageDialog(this, "Founded in the " +comboBox.getSelectedItem()+ " data!! " , "Result Of Your Search",JOptionPane.INFORMATION_MESSAGE);
        table.setRowSelectionInterval(i, i);
        fullNameText.setText(model.getValueAt(i, 1)+"");
        phoneNumberText.setText(model.getValueAt(i, 2)+"");
        gmailText.setText(model.getValueAt(i, 3)+"");
        cityText.setText(model.getValueAt(i, 4)+"");
    }
    public void updateCounter(int numberOfClients){
                counterLable.setText(numberOfClients + "");

    }
    public void addToTable(Client c)throws Exception{
        model.addRow(new Object[]{table.getRowCount()+1 , c.getFullName(),c.getPhoneNumber(),c.getGmail(),c.getCity().isEmpty()? "null" : c.getCity()});
        numberOfClients++;
       updateCounter(numberOfClients);
        clear();
        updateFile();
    }
    
    
    public boolean checkMainInfo(){
       return !fullNameText.getText().trim().isEmpty()&&
              !phoneNumberText.getText().trim().isEmpty()&&
              !gmailText.getText().trim().isEmpty();
     }
        
         
      
     

    public void clear(){
        fullNameText.setText("");
        phoneNumberText.setText("");
        gmailText.setText("");
        cityText.setText("");
    }
    
    
    
    public static void main(String args[])throws Exception  {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    public static int numberOfClients;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel cityLable;
    private javax.swing.JTextField cityText;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel counterLable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel elnemrLable;
    private javax.swing.JLabel fullNameLable;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JLabel gmailLable;
    private javax.swing.JTextField gmailText;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel listOfContactsLable;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel numberOfClientsLable;
    private javax.swing.JLabel phoneNumberLable;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    
}
