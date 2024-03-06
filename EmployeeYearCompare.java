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
public class EmployeeYearCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getYearJoined() > o2.getYearJoined()) return 1;
        if(o1.getYearJoined() < o2.getYearJoined()) return -1;
        else return 0;
    }
    
}
