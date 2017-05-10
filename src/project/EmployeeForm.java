/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Danielle
 */
public class EmployeeForm extends javax.swing.JFrame {
  static EmployeeTable elist;

    private static Scanner input;
    
    private static Formatter output;
    //private static Formatter output;

    public EmployeeForm(){
   
       initComponents();
        readEmployeeTable();
        
     //   openFile(String filename);
        //addRecords();
      //  closeFile();
        

        
        
      /*  
      readEmployeeTable();
            //list.add("one", "dani", "female", "232", "id", "phone", "email","1/2/12", "2/2/22");
           
            /*
             Date chosenHireDate = hireDate.getDate(); 
       String hire = String.format("%1$tm/%1$td/%1$tY", chosenHireDate); 
    if (hire.equals("null/null/null")) 
    { message.setText("No Hire Date was selected."); 
    return; } 
   hireDate.setDate(null);  // clears JCalendar field

   //convert string date back to date object
   String hireDateString = eptr.getHiredate(); 
   DateFormat df= new SimpleDateFormat("MM/dd/yyyy"); 
   Date hireDate; 
   try {
       hireDate = (Date)df.parse(hireDateString); 
   } catch (Exception e) { 
       e.printStackTrace(); 
       return; }
            */
            
           // System.out.println("Size: "+list.size());
          
           
            // Search example through list for certain value
   
                // System.out.println("Size: "+list.size());
           // System.out.println("Last Name\tFirst\tGender\tSSN\templyID\tphone\temail\tstartdate\tenddate");
            elist.sortEmplyID();
            // Search example through list for certain value
            
            Node nodeptr = elist.getHead();
            for (int i = 0; i < elist.size(); i++) { 
                if(!nodeptr.getEndDate().equals("NA")){
                    DefaultTableModel model=(DefaultTableModel) EmployeeJTable.getModel();{
                Object[]newRowData={nodeptr.getEmplyID(),nodeptr.getLastName(),nodeptr.getFirstName(),nodeptr.getGender(),nodeptr.getPhone(),nodeptr.getEmail(),nodeptr.getHireDate(),nodeptr.getEndDate(),nodeptr.getSSN()};
               model.addRow(newRowData);
             
                nodeptr = nodeptr.getNext();
                     
           
                }}
                }
                    
                
                   // output.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s%n", eptr.getEmplyID(), eptr.getLastName(), eptr.getFirstName(), eptr.getGender(), eptr.getPhone(), eptr.getEmail(), eptr.getHireDate(), eptr.getEndDate(), eptr.getSSN()); 
                   // eptr = eptr.getNext(); 
                    
               // DefaultTableModel model=(DefaultTableModel) EmployeeTable1.getModel();{
               // Object[]newRowData={nodeptr.getEmplyID(), nodeptr.getLastName(),nodeptr.getFirstName(),nodeptr.getGender(),nodeptr.getPhone(),nodeptr.getEmail(),nodeptr.getHireDate(),nodeptr.getEndDate(),nodeptr.getSSN()};
              //   model.addRow(newRowData);
               // nodeptr = nodeptr.getNext();
            }
                //catch(FormatterClosedException formatterClosedException){
                     //   System.err.println("Error writing to employ file");
                      //  break;
                        
               
    
 
    
    
    
   
                //nodeptr.getEmplyID(),nodeptr.getLastName(),nodeptr.getFirstName(),nodeptr.getGender(),nodeptr.getPhone(),nodeptr.getEmail(),nodeptr.getHireDate(),nodeptr.getEndDate(),nodeptr.getSSN());
              
   public boolean verifyDates(Date hireDate, Date endDate){ 
        { if (hireDate.compareTo(endDate) < 0) 
            return true; 
            return false; }       
       
       }

    public static void openFile(String filename){
        try {
            input = new Scanner(Paths.get(filename));
        }
        catch(IOException e){
            System.err.println("Error opening file.");
            System.out.println("e.getMessage");
            System.exit(1);
        }
            
        }
 
     private static void readEmployeeTable() {
        // create Employee List
        elist = new EmployeeTable();

        // Open Employees.txt file and read each line into an array
        openFile("Employees.txt");
        while (input.hasNext()) {
            elist.add(input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
        }
    }
     /*
public static void writeToFiles(){
    try{
    File file = new File("Employees.txt");
    if(!file.exists()){
        file.createNewFile();
    }
    
    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    
    for(int i = 0; i < table.getRowCount();i++){
        
        for(int j = 0; j < table.getColumnCount(); j++){
            bw.write(table.getModel().getValueAt(i,j)+" ");
        }
        bw.write("\n");
        
    }
    bw.close();
    fw.close();
    
    }catch(Exception ex){
        ex.printStackTrace();
    
}}*/
   
        public static void closeEmployee() {
        try {
            output = new Formatter("Employees.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
         

        Node eptr = elist.getHead();
        for (int i = 0; i < elist.size(); i++) {
            
            try {
                
                output.format("%s %s %s %s %s %s %s %s %s%n",eptr.getEmplyID(),eptr.getLastName(),eptr.getFirstName(),eptr.getGender(),eptr.getPhone(),eptr.getEmail(),eptr.getHireDate(),eptr.getEndDate(),eptr.getSSN());
                eptr = eptr.getNext();
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to Employees file. Terminating.");
                break;
            }
}
        if (output !=null){
            output.close();
        }
        }
     
        public String getSelectedButtonText(ButtonGroup buttonGroup){
        for(Enumeration < AbstractButton> buttons = buttonGroup.getElements(); 
                buttons.hasMoreElements();)
        {
            AbstractButton button = buttons.nextElement();
            if(button.isSelected())
            {return button.getText();}
        }
     return"";   
    }
        
        public void closeForm(){
            
            try{
    File file = new File("Employees.txt");
    if(!file.exists()){
        file.createNewFile();
    }
    
    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    
    for(int i = 0; i < EmployeeJTable.getRowCount();i++){
        
        for(int j = 0; j < EmployeeJTable.getColumnCount(); j++){
            bw.write(EmployeeJTable.getModel().getValueAt(i,j)+" ");
        }
        bw.write("\n");
        
    }
    bw.close();
    fw.close();
    
    }catch(Exception ex){
        ex.printStackTrace();
        
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
        }
        }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        emplyID = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        hireDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        bgGender = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Past = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emplyID.setBackground(new java.awt.Color(204, 204, 255));
        emplyID.setText(" ");

        lastName.setBackground(new java.awt.Color(204, 204, 255));
        lastName.setText(" ");

        firstName.setBackground(new java.awt.Color(204, 204, 255));
        firstName.setText(" ");

        ssn.setBackground(new java.awt.Color(204, 204, 255));
        ssn.setText("  ");

        phone.setBackground(new java.awt.Color(204, 204, 255));
        phone.setText(" ");

        email.setBackground(new java.awt.Color(204, 204, 255));
        email.setText(" ");

        hireDate.setDateFormatString("MM dd, yyyy");

        endDate.setDateFormatString("MM dd, yyyy");
        endDate.setVerifyInputWhenFocusTarget(false);

        buttonGroup1.add(bgGender);
        bgGender.setText("Male");
        bgGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgGenderActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setText("Female");

        jLabel1.setText("Employee ID:");

        jLabel2.setText("Last Name");

        jLabel3.setText("First Name");

        jLabel4.setText("SSN:");

        jLabel5.setText("Phone:");

        jLabel6.setText("Email:");

        EmployeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Last Name", "First Name", "Gender", "Phone", "Email", "Hire Date", "End Date", "SSN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmployeeJTable);
        EmployeeJTable.getAccessibleContext().setAccessibleParent(EmployeeJTable);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Message.setText("   ");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        message.setText(" ");

        jLabel7.setText("Hire Date:");

        jLabel8.setText("End Date:");

        Past.setText("Past");
        Past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastActionPerformed(evt);
            }
        });

        jButton3.setText("Current");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Home");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Employees");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Departments");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Assignments");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Payroll");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Close");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ssn)
                                .addComponent(firstName)
                                .addComponent(lastName)
                                .addComponent(emplyID)
                                .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(email)
                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bgGender)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                    .addComponent(female)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update)
                                .addGap(29, 29, 29)
                                .addComponent(Past)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addComponent(message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Message)
                        .addContainerGap(387, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Message)
                            .addComponent(message)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emplyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addComponent(hireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bgGender)
                            .addComponent(female))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(Past))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgGenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
       message.setText("");
                 
        
        DefaultTableModel model=(DefaultTableModel) EmployeeJTable.getModel();{
        
        if(emplyID.getText().trim().equals("")){
            message.setText("Employee ID should not be left empty, please enter");}
        else if(lastName.getText().trim().equals("")){
            message.setText("Last Name should not be empty");}
        else if(endDate.getDate() == null){
                    endDate.setDate(null);
                    } 
        else if(firstName.getText().trim().equals("")){
            message.setText("First Name should not be empty");}
        

       
          //readEmployeeTable();
        //list.add(emplyID.getText(), lastName.getText(), firstName.getText(), gender , phone.getText(), email.getText(),hireDate.getDate().toString(), endDate.getDate().toString(), ssn.getText());
     
      
        
            //create row object and add data into object
        else{    Object[]newRowData={emplyID.getText(),lastName.getText(),firstName.getText(), getSelectedButtonText(buttonGroup1),phone.getText() ,email.getText(), hireDate.getDate().toString(), endDate.getDate().toString(), ssn.getText()};
           
        
        
            
          
             //add row to table for display
             model.addRow(newRowData);
             
             //list.add(emplyID.getText(), lastName.getText(), firstName.getText(), getSelectedButtonText(buttonGroup1) , phone.getText(), email.getText(),hireDate.getDate().toString(), endDate.getDate().toString(),ssn.getText());
        
             //clear data
             emplyID.setText("");
             lastName.setText("");
             firstName.setText("");
             ssn.setText("");
             phone.setText("");
             email.setText("");
             hireDate.setDate(null);
             endDate.setDate(null);
            
             
             
        }
     
        
        
        
        
        
    }  
      
  
                     

    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         // update action performed
        DefaultTableModel model=(DefaultTableModel) EmployeeJTable.getModel();
       
        //if(jTable_EmployeeTable.getSelectedRow()==-1){
          // if(jTable_EmployeeTable.getSelectedRow()==0){
             //  Message.setText("Table is empty");
         //  } else{
                //   Message.setText("You must ave a name");
                  // }
     //   }else{
       // model.setValueAt(jTextField_EmplyID.getText(), jTable_EmployeeTable.getSelectedRow(),0);
      //  model.setValueAt(jTextField_LastName.getText(), jTable_EmployeeTable.getSelectedRow(),1);
      //  model.setValueAt(jTextField_FirstName.getText(), jTable_EmployeeTable.getSelectedRow(),2);
     //   model.setValueAt(jComboBox_Gender.getSelectedItem().toString(), jTable_EmployeeTable.getSelectedRow(),3);
      //  model.setValueAt(jTextField_Phone.getText(), jTable_EmployeeTable.getSelectedRow(),4);
     //   model.setValueAt(jTextField_Email.getText(), jTable_EmployeeTable.getSelectedRow(),5);
     //   model.setValueAt(jDateChooser_HireDate.getDate(), jTable_EmployeeTable.getSelectedRow(),6);
        model.setValueAt(endDate.getDate(), EmployeeJTable.getSelectedRow(),7);
         
       // }
        
    
    }//GEN-LAST:event_updateActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       closeForm();
        new MainForm().setVisible(true);
        
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //do nothing
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        closeForm();
        
        new DepartmentsForm().setVisible(true);
    
       
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
      closeForm();
        
        new AssignmentsForm().setVisible(true);
       
      
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        
        closeForm();
        new PayrollForm().setVisible(true);
      
       
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
       // Project.writeFiles();
       
        if(output != null){
        closeForm();}
    }//GEN-LAST:event_jMenu6MouseClicked

    private void PastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastActionPerformed
        // eNode nodeptr2 = elist.getHead();
       /*
       //message.setText("past employees");
       for (int j = 0; j<elist.size(); j++){
       if(nodeptr2.getEndDate().equals("NA")){
          
               
               
                   DefaultTableModel model=(DefaultTableModel) EmployeeJTable.getModel();{
                Object[]newRowData={nodeptr2.getEmplyID(), nodeptr2.getLastName(),nodeptr2.getFirstName(),nodeptr2.getGender(),nodeptr2.getPhone(),nodeptr2.getEmail(),nodeptr2.getHireDate(),nodeptr2.getEndDate(),nodeptr2.getSSN()};
                model.addRow(newRowData);
                nodeptr2 = nodeptr2.getNext();
           
           }
           }
/*        EmployeeTableDate = new String[list.size()][9];
   
       Node nodeptr2 = list.getHead();
       
       //message.setText("past employees");
       for (int i = 0; i<list.size(); i++){
           if(nodeptr2.getEndDate().equals("NA")){
    EmployeeTableDate[i][0] = nodeptr2.getEmplyID();
  EmployeeTableDate[i][1] = nodeptr2.getLastName();
  EmployeeTableDate[i][2] = nodeptr2.getFirstName();
   EmployeeTableDate[i][3] = nodeptr2.getGender();

   EmployeeTableDate[i][4] = nodeptr2.getPhone();
 EmployeeTableDate[i][5] = nodeptr2.getEmail();
   EmployeeTableDate[i][6] = nodeptr2.getHireDate();
   EmployeeTableDate[i][7] = nodeptr2.getEndDate();
      EmployeeTableDate[i][8] = nodeptr2.getSSN();
                nodeptr2 = nodeptr2.getNext();}
            
       }
      

      JTable EmployeeTable1= new JTable(employeeTableDate, headerNames);{
          // JTable EmployeeTable1 = open JTable(employeeTableDate, headerNames);
           EmployeeTable1.getColumnModel().getColumn(0);
            EmployeeTable1.getColumnModel().getColumn(1);
             EmployeeTable1.getColumnModel().getColumn(2);
              EmployeeTable1.getColumnModel().getColumn(3);
               EmployeeTable1.getColumnModel().getColumn(4);
                EmployeeTable1.getColumnModel().getColumn(5);
                 EmployeeTable1.getColumnModel().getColumn(6);
                  EmployeeTable1.getColumnModel().getColumn(7);
                   EmployeeTable1.getColumnModel().getColumn(8);
          

    }*/
           
                                  

    }//GEN-LAST:event_PastActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   /*     // TODO add your handling code here:
        readEmployeeTable();
        elist.sortEmplyID();
         Node nodeptr = elist.getHead();
            for (int i = 0; i < elist.size(); i++) { 
                if(!nodeptr.getEndDate().equals("NA")){
                
               DefaultTableModel model=(DefaultTableModel) EmployeeJTable.getModel();{
                Object[]newRowData={nodeptr.getEmplyID(), nodeptr.getLastName(),nodeptr.getFirstName(),nodeptr.getGender(),nodeptr.getPhone(),nodeptr.getEmail(),nodeptr.getHireDate(),nodeptr.getEndDate(),nodeptr.getSSN()};
                 model.addRow(newRowData);
                nodeptr = nodeptr.getNext();
            }}}*/

                
    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeJTable;
    private javax.swing.JLabel Message;
    private javax.swing.JButton Past;
    private javax.swing.JRadioButton bgGender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emplyID;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private com.toedter.calendar.JDateChooser hireDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel message;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
