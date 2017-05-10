/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Danielle
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxExample {
   class Employee
   {
       String name;
       String emplyID;
       double salary;
      
       public Employee(String name, String emplyID, double salary) {
           this.name = name;
           this.emplyID = emplyID;
           this.salary = salary;
       }
       public String getDetails()
       {
           return emplyID + " " + name + " " + salary;
       }
       @Override
       public String toString() {
           // TODO Auto-generated method stub
           return emplyID;
       }
   }
  
   Employee employees [] = {new Employee("Philip", "SD234", 5000),
                               new Employee("James", "SD773", 4000),
                               new Employee("John", "SD982", 3000),};
   public JComboBoxExample() {
       JFrame frame = new JFrame("JComboBox example");
       JPanel panel = new JPanel(new FlowLayout());
       JComboBox<Employee> employeeBox = new JComboBox<>(employees);
       JButton next = new JButton("Go to next page");
       next.addActionListener(new ActionListener() {
          
           @Override
           public void actionPerformed(ActionEvent e) {
               //selected index
               int selection = employeeBox.getSelectedIndex();
               anotherWindow(selection);
              
           }
       });
       panel.add(employeeBox);
       panel.add(next);
       frame.getContentPane().add(panel);
       frame.setSize(400, 400);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
   //you can use the selected index from the combo and pass it either to another function
   // or another class and the use it to show the details or your functionality
   public void anotherWindow(int option)
   {
       JFrame frame = new JFrame("JComboBox example");
       JPanel panel = new JPanel(new FlowLayout());
       // use the index in your array of IDs to get the selected one.
       panel.add(new JLabel(employees[option].getDetails()));
       frame.getContentPane().add(panel);
       frame.setSize(400, 400);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
   public static void main(String args[])
   {
       new JComboBoxExample();
   }
}
