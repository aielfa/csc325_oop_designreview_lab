package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    //Create Freshman Class

    //Constructor
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }
    //tostring class
    @Override
    public String toString() {
        return "Freshman{ " + super.toString() + " }";
    }
}
