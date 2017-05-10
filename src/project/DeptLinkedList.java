/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;




public class DeptLinkedList {
    
    private dNode head;
    public DeptLinkedList(){
        
    }
    public dNode getHead(){
        return head;    
    }
    
     public void setHead(dNode head) {
        this.head = head;
    }
    
    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String dept, String deptManager, Integer emplyCount) {
        if(isEmpty()) {
            head = new dNode(dept, deptManager, emplyCount); 
        } else {
            dNode current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            } 
            current.setNext(new dNode(dept, deptManager, emplyCount));
        }
    }
        
     public Integer size() {
         Integer size = 0;
         dNode current = head;
         while (current != null) {
             size++;
             current = current.getNext();
         }
         return size;
     }

     
public void sortDept () { dNode p0, p1, p2;
for (int i=1; i<size(); i++) 
{ p0 = head; p1 = head; p2 = p1.getNext(); 
for (int k=1; k<size(); k++) {
if (p1.getDept().compareTo(p2.getDept()) < 0) 

{ swap(p0, p1, p2);}       // actual link changes done here  
if (k == 1)  p0 = head; 
else p0 = p0.getNext(); 
p1 = p0.getNext(); 
p2 = p1.getNext(); } } 
}  
public void sortDescending () { dNode p0, p1, p2;
for (int i=1; i<size(); i++) 
{ p0 = head; p1 = head; p2 = p1.getNext(); 
for (int k=1; k<size(); k++) {
if (p1.getEmplyCount().compareTo(p2.getEmplyCount()) > 0 ) 

{ swap(p0, p1, p2);}
if (k == 1)  p0 = head; 
else p0 = p0.getNext(); 
p1 = p0.getNext(); 
p2 = p1.getNext(); } } }

public void swap(dNode p0, dNode p1, dNode p2) { dNode p3;
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

