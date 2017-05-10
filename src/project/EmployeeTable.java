/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
public class EmployeeTable {

    private Node head;
    
    public EmployeeTable() {  
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String emplyID, String lastName, String firstName, String gender, String phone, String email, String hireDate, String endDate, String SSN) {
        if(isEmpty()) {
            head = new Node(emplyID, lastName, firstName, gender, phone, email, hireDate, endDate, SSN); 
        } else {
            Node current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            } 
            current.setNext(new Node(emplyID, lastName, firstName, gender, phone, email, hireDate, endDate, SSN));
        }
    }
        
     public Integer size() {
         Integer size = 0;
         Node current = head;
         while (current != null) {
             size++;
             current = current.getNext();
         }
         return size;
     }

     
   public void sortEmplyID () { Node p0, p1, p2;
for (int i=1; i<size(); i++) 
{ p0 = head; p1 = head; p2 = p1.getNext(); 
for (int k=1; k<size(); k++) {
if (p1.getEmplyID().compareTo(p2.getEmplyID()) < 0) 

{ swap(p0, p1, p2);}       // actual link changes done here  
if (k == 1)  p0 = head; 
else p0 = p0.getNext(); 
p1 = p0.getNext(); 
p2 = p1.getNext(); } } 
}  
public void sortDescending () { Node p0, p1, p2;
for (int i=1; i<size(); i++) 
{ p0 = head; p1 = head; p2 = p1.getNext(); 
for (int k=1; k<size(); k++) {
if (p1.getEndDate().compareTo(p2.getEndDate()) > 0 ) 

{ swap(p0, p1, p2);}
if (k == 1)  p0 = head; 
else p0 = p0.getNext(); 
p1 = p0.getNext(); 
p2 = p1.getNext(); } } }

public void swap(Node p0, Node p1, Node p2) { Node p3;
p3 = p2.getNext();  // this processes a new head node 
if (head == p1) 
{ head = p2; 
p2.setNext(p1);
p1.setNext(p3); 
return; } 
p0.setNext(p2);   // this processes a swap anywhere else 
p2.setNext(p1); 
p1.setNext(p3); }
}
