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
public class aNode {

    

    
    private String emplyID;
    private String dept;
    private String level;
    private String lastName;
     private String firstName;
    private String hireDate;
    private String endDate;

    private aNode next;
    
    //default constructor that will null everything out
    
    
//overloaded constructor that will accept info
    public aNode(String emplyID, String dept, String level, String lastName, String firstName, String hireDate, String endDate) {
        this.emplyID = emplyID;
        this.dept = dept; 
        this.level = level;
        this.lastName = lastName;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.endDate = endDate;
        this.next = null;
    }

    public String getEmplyID() {
        return emplyID;
    }

    public void setEmplyID(String emplyID) {
        this.emplyID = emplyID;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public aNode getNext() {
        return next;
    }

    public void setNext(aNode next) {
        this.next = next;
    }
   
 

   
    
    
    
    
}

    


    

