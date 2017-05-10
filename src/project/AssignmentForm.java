/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;



public class AssignmentForm {

    static AssignmentsLinkedList assignList;
    private static Scanner input;
    private static Formatter output;
    
    
    
    public static void main(String[] args) {
         readAssignmentsLinkedList();
            assignList.add("JJ09823", "Marketing", "Level3", "Kemper", "Danielle", "9/13/2012", "N/A");
           
            
            System.out.println("Size: "+assignList.size());
            System.out.println("emplyID\tDept\tLevel\tLast\tFirst\tstartdate\tenddate");
            assignList.sortEmplyID();
            // Search example through list for certain value
            aNode nodeptr = assignList.getHead();
            for (int i = 0; i < assignList.size(); i++) { 
                    System.out.printf("%s %s %s %s %s %s %s %n",nodeptr.getEmplyID(), nodeptr.getDept(),nodeptr.getLevel(),nodeptr.getLastName(),nodeptr.getFirstName(),nodeptr.getHireDate(),nodeptr.getEndDate());
                
                nodeptr = nodeptr.getNext();
            }
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
    
     private static void readAssignmentsLinkedList() {
        // create Employee List
        assignList = new AssignmentsLinkedList();
        
        // Open Employees.txt file and read each line into an array
        openFile("Assignments.txt");
        while (input.hasNext()) {
            assignList.add(input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
        }
    }
    
        public static void closeAssignmentsLinkedList() {
        try {
            output = new Formatter("Assignments.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

        aNode eptr = AssignmentForm.assignList.getHead();
        for (int i = 0; i < AssignmentForm.assignList.size(); i++) {
            try {
                output.format("%s %s %s %s %s %s %s %n",eptr.getEmplyID(), eptr.getDept(),eptr.getLevel(),eptr.getLastName(),eptr.getFirstName(),eptr.getHireDate(),eptr.getEndDate());
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
}