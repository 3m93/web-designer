/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample.dom;

/**
 *
 * @author DELL
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String email;
    private int yearJoined;

    public Employee(int id, String name, String email, int yearJoined) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.yearJoined = yearJoined;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
