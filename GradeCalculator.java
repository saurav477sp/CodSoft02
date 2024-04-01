/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculator;

/**
 *
 * @author psaur
 */
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double marks,total=0,percentage;
        int noOfSubjects;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many subjects you have ? ");
        noOfSubjects = sc.nextInt();
        System.out.println("Please Enter the marks out of 100");

        for (int i = 0 ; i < noOfSubjects ; i++){
            marks = validateInput(sc);
            total +=marks;

        }

        percentage = total / noOfSubjects ;

        System.out.println("Your total marks is : " +total);
        System.out.println("Your Aerage percentage is : " +String.format("%.2f", percentage)+ "%");
        System.out.print("Your grade is : ");

        if (percentage >= 75) {
            System.out.println("Distinction");
        }else if (percentage >= 60) {
            System.out.println("First class");
        }else if (percentage >= 50) {
            System.out.println("Second class");
        }else if (percentage >= 33) {
            System.out.println("passing marks");
        }else{
            System.out.println("Fail");
        }

    }

    private static double validateInput(Scanner sc) {
        double marks;
        
        do {
            System.out.print("Enter the marks of subject : ");
            marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("The marks is out of range. Please enter a number between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }
}

