/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JPanel;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class TableModelTest extends javax.swing.JPanel {


 
   public static final String FILE_PATH = "C:\\Users\\Danielle\\Desktop\\Programming\\Project\\";
   public static final String FILE_NAME = "Departments.txt";
   public static final String[] COLUMNS = {"Column 1", "Column 2","Column 3"};
    
   private JTable table = new JTable();
   private DefaultTableModel model;
    
   public TableModelTest() {
      setLayout(new BorderLayout());
      add(new JScrollPane(table), BorderLayout.CENTER);
       
      Vector<String> colNames = new Vector<String>(Arrays.asList(COLUMNS));
       
      try {
         Scanner scanner = new Scanner(new File(FILE_PATH + FILE_NAME));
         int count = 0;
         Vector<Vector<String>> dataVector = new Vector<Vector<String>>();
         Vector<String> rowVector = new Vector<String>();
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            rowVector.add(line);
            count++;
            count %= COLUMNS.length;
            if (count == 0) {
               dataVector.add(rowVector);
               rowVector = new Vector<String>();
            }
         }
         
        model = new DefaultTableModel(dataVector, colNames);
         table.setModel(model);
          
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
 
   private static void createAndShowUI() {
       
      JFrame frame = new JFrame("FuSwing2");
      frame.getContentPane().add(new TableModelTest());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
 
   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();

        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Departments"
            }
        ));
        jScrollPane1.setViewportView(tableModel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModel;
    // End of variables declaration//GEN-END:variables
}
