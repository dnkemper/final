
package project;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

/**
 *
 * department linked list shit
 */
public class DepartmentForm {

  static DeptLinkedList dlist;
  private static Scanner input;
  private static Formatter output;
  
    public static void main(String[] args) {
    
        
     readDeptLinkedList();
            dlist.add("test", "test", 2);
           
            
            
            System.out.println("Size: "+dlist.size());
            System.out.println("Dept\tsmanager\templycount");
            dlist.sortDept();
            // Search example through list for certain value
            dNode nodeptr = dlist.getHead();
            for (int i = 0; i < dlist.size(); i++) { 
                    System.out.printf("%s %s %s %n",nodeptr.getDept(),nodeptr.getDeptManager(),nodeptr.getEmplyCount());
                
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
    
     private static void readDeptLinkedList() {
        // create Employee List
        dlist = new DeptLinkedList();
        
        // Open Employees.txt file and read each line into an array
        openFile("Departments.txt");
        while (input.hasNext()) {
            dlist.add(input.next(), input.next(), Integer.parseInt(input.next()));
        }
    }
    
        public static void closeDeptLinkedList() {
        try {
            output = new Formatter("Departments");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

        dNode eptr = DepartmentForm.dlist.getHead();
        for (int i = 0; i < DepartmentForm.dlist.size(); i++) {
            try {
                output.format("%s %s %s %s %s %s %s %s %s%n",eptr.getDept(),eptr.getDeptManager(),eptr.getEmplyCount());
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