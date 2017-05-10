/*
tthis class should accomplish:
1. reading of data from the files into collection lists
2.writing the data fromthe collection lists back to the files

for now,create an object instance of the form class that you are to create in the next step and set form visible
 */
package project;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
import static project.AssignmentsForm.dlist;
import static project.DepartmentForm.dlist;
import static project.Project.dlist;




public class Project {

  private static Formatter output;
  private static Scanner input;
  public static EmployeeTable elist;
  public static DeptLinkedList dlist;
  public static AssignmentsLinkedList assignList;
  public static Node Node;
  public static Node dNode;
  public static Node aNode;
  public static AssignmentForm readAssignmentsLinkedList;
 
  




  
    public static void main(String[] args) {
          readAssignmentsLinkedList();
        
       // readDeptLinkedList();
    
    
                    
           // System.out.println("Size: "+list.size());
          
           
            // Search example through list for certain value
   
                // System.out.println("Size: "+list.size());
           // System.out.println("Last Name\tFirst\tGender\tSSN\templyID\tphone\temail\tstartdate\tenddate");
        
            // Search example through list for certain value
            
           
    
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
    

     
     
  /* 
private static void readDeptLinkedList() {
        // create Employee List
        dlist = new DeptLinkedList();
        
        // Open Employees.txt file and read each line into an array
        openFile("Departments.txt");
        while (input.hasNext()) {
            dlist.add(input.next());
        }
    }
/*

       
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

        // TODO code application logic here
        
      
      /*
        java.io.File departmentsFile = new java.io.File("Departments.txt");
        try {
            Scanner input = new Scanner(departmentsFile);
            while(input.hasNext()){
                String num = input.nextLine();//grabs line
                System.out.println(num);
                
            }
            
        }
        catch (FileNotFoundException e){
        
        System.err.format("File does not exist");
    }
        java.io.File employeesFile = new java.io.File("Employees.txt");
        try {
            Scanner input = new Scanner(employeesFile);
            while(input.hasNext()){
                String num = input.nextLine();//grabs line
                System.out.println(num);
                
            }
            
        }
        catch (FileNotFoundException e){
        
        System.err.format("File does not exist");
    }
         java.io.File assignmentsFile = new java.io.File("Assignments.txt");
        try {
            Scanner input = new Scanner(assignmentsFile);
            while(input.hasNext()){
                String num = input.nextLine();//grabs line
                System.out.println(num);
                
            }
            
        }
        catch (FileNotFoundException e){
        
        System.err.format("File does not exist");
    }
         java.io.File payrollFile = new java.io.File("Paygrade.txt");
        try {
            Scanner input = new Scanner(payrollFile);
            while(input.hasNext()){
                String num = input.nextLine();//grabs line
                System.out.println(num);
                
            }
            
        }
        catch (FileNotFoundException e){
        
        System.err.format("File does not exist");
    }
    }*/
    
}
