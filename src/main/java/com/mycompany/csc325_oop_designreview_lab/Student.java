/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
    private double gpa;
    private int credits;
	// ToDo 2: Fix the resulting errors
    // Constructor for Student

    public Student(String name, int age, int credits) {
        super(name, age); // Call to the superclass
        this.credits = credits;
    }



    // ToDo 3: Add a field for GPA and create a setter and a getter
    // Getters and Setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //tostring
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", credits=" + credits + ", gpa=" + gpa + "}";
    }
    // Had to implement from superclass Human
    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public void setAddress(String address) {

    }
    // ToDo 4: Add comments to your code
}
