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
public class dNode {
    private String dept;
    private String deptManager;
    private Integer emplyCount;
    private dNode next;
    
    
    public dNode(String dept, String deptManager, Integer emplyCount){
        this.dept = dept;
        this.deptManager = deptManager;
        this.emplyCount = emplyCount ;
        this.next = null;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

   

    public void setDeptManager(String deptManager) {
        this.deptManager = deptManager;
    }
     public String getDeptManager() {
        return deptManager;
    }

   

    public void setEmplyNum(Integer emplyCount) {
        this.emplyCount = emplyCount;
    }
     public Integer getEmplyCount() {
        return emplyCount;
    }

    public dNode getNext() {
        return next;
    }

    public void setNext(dNode next) {
        this.next = next;
    }
    
    
}
