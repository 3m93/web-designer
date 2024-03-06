/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample.dom;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class EmployeeNameCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}

public class mainordering {
    public static void main(String[] args){
        
   
     ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Rob","test@test.com",2010));
        employees.add(new Employee(3,"Mitchell","test@test.com",2000));
        employees.add(new Employee(2,"Ockert","test@test.com",2005));
        employees.add(new Employee(4,"Andy","test@test.com",1990));
        
        
        Collections.sort(employees);
        
        System.out.println("Employees after sorting");
        for(Employee emp: employees){
            System.out.println("ID:" + emp.getId() + " Name:" + emp.getName()+ " Year Joined:" + emp.getYearJoined());
        }

        System.out.println("Employees after sorting with names");
        EmployeeNameCompare nameComparator = new EmployeeNameCompare();
        
        Collections.sort(employees,nameComparator);
        
        for(Employee emp: employees){
            System.out.println("ID:" + emp.getId() + " Name:" + emp.getName() + " Year Joined:" + emp.getYearJoined());
        }
}

