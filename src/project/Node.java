/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Date;


/**
 *
 * @author Danielle
 */
public class Node {
    

    
    private String emplyID;
   
    private String lastName;
     private String firstName;
     private String gender;
  
    private String phone;
    private String email;
    private String hireDate;
    private String endDate;
   
    private String SSN;
    private Node next;
    
    //default constructor that will null everything out
    
    
//overloaded constructor that will accept info
    public Node(String emplyID, String lastName, String firstName, String gender, String phone, String email, String hireDate, String endDate, String SSN) {
       this.emplyID = emplyID;
       this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.hireDate = hireDate;
        this.endDate = endDate;
         this.SSN = SSN;
        this.next = null;
    }

    public String getEmplyID() {
        return emplyID;
    }

    public void setEmplyID(String emplyID) {
        this.emplyID = emplyID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
   
  
    
}

    

