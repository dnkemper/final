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
import static project.Project.elist;

/**
 *
 * @author Danielle
 */
public class EmployeeLinkedList {


static EmployeeTable elist;
private static Scanner input;
private static Formatter output;

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
readEmployeeTable();
//list.add("one", "dani", "female", "232", "id", "phone", "email","1/2/12", "2/2/22");

  
  
System.out.println("Size: "+elist.size());
System.out.println("Last Name\tFirst\tGender\tSSN\templyID\tphone\temail\tstartdate\tenddate");
elist.sortEmplyID();
// Search example through list for certain value
Node nodeptr = elist.getHead();
for (int i = 0; i < elist.size(); i++) {
System.out.printf("%s %s %s %s %s %s %s %s %s%n",nodeptr.getFirstName(),nodeptr.getLastName(),nodeptr.getSSN(),nodeptr.getEmplyID(),nodeptr.getPhone(),nodeptr.getEmail(),nodeptr.getHireDate(),nodeptr.getEndDate(),nodeptr.getGender());
  
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
  
private static void readEmployeeTable() {
// create Employee List
elist = new EmployeeTable();
  
// Open Employees.txt file and read each line into an array
openFile("Employees.txt");
while (input.hasNext()) {
elist.add(input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next(), input.next());
}
}
  
public static void closeFile() {
try {
output = new Formatter("Employees.txt");
} catch (SecurityException securityException) {
System.err.println("Write permission denied. Terminating.");
System.exit(1);
} catch (FileNotFoundException fileNotFoundException) {
System.err.println("Error opening file. Terminating.");
System.exit(1);
}

Node eptr = EmployeeLinkedList.elist.getHead();
for (int i = 0; i < EmployeeLinkedList.elist.size(); i++) {
try {
output.format("%s %s %s %s %s %s %s %s %s%n",eptr.getLastName(),eptr.getFirstName(),eptr.getGender(),eptr.getSSN(),eptr.getEmplyID(),eptr.getPhone(),eptr.getEmail(),eptr.getHireDate(),eptr.getEndDate());
eptr = eptr.getNext();
} catch (FormatterClosedException formatterClosedException) {
System.err.println("Error writing to Employees file. Terminating.");
break;
}
}
if (output !=null){
output.close();
}
}}
