package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    //Create Senior Class

    //Constructor
    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        // Error if credits dont reach 85
        if (credits < 85) {
            throw new IllegalArgumentException("Senior students require a minimum of 85 credits.");
        }
    }
    //tostring class
    @Override
    public String toString() {
        return "Senior{ " + super.toString() + " }";
    }
}
