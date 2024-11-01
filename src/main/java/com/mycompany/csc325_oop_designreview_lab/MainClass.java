/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // ToDo 5: Fix the error
	 //Create instances
	 //Student std1 = new Student("James", 20, 12);

	 // Contructors werent made correct?
	 Freshman freshman1 = new Freshman("James", 20, 12); // name, age, credits
	 // ToDo 6: Fix the constructor of the Student class
	 //Fixed to match condictions such as age name and gpa and credits
	 Student std1 = new Student("James", 20, 12); // name, age, credits
	 // ToDo 8: The senior class should have a minimum of 85 credits
	//Pulls from student and if less them 85 credits will return an error message
	 Senior std2 = new Senior("John", 30, 90);


	 // Todo 7: Create two classes for Freshman and Senior



	 // ToDo 9: Add a toString method for the Student class
	 // ToDo 10: Add a toString method for the Freshman class
	 // ToDo 11: Add a toString method for the Senior class





	 // ToDo 12: Set the gpa of the student using the scanner and user
	 //  input and then print the output.
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter GPA for " + std1.getName() + ": ");
	 double gpa1 = scanner.nextDouble();
	 std1.setGpa(gpa1);
	//Outputs the .tostring outputs
	 System.out.println(std1);

	 System.out.print("Enter GPA for " + std2.getName() + ": ");
	 double gpa2 = scanner.nextDouble();
	 std2.setGpa(gpa2);
	//Outputs the .tostring outputs
	 System.out.println(std2);

	 // ToDo 13: add comments and explain your code

	}

}

