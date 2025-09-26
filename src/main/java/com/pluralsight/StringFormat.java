package com.pluralsight;

import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
        System.out.println("First name: ");
        String firstname= scanner.nextLine();
        System.out.println("What's up "+firstname);
        scanner.nextLine();


        String name = "Alice";
        int age = 25;
        double gpa = 3.6789;
        // Step 1: Format and print the string variable (name)
        // Example output: Name: Alice
        String names= String.format("Name:%s",name);
        System.out.println(name);


        // Step 2: Format and print the integer variable (age)
        // Example output: Age: 25
        String format = String.format("Age: %d", age);
        System.out.println(format);
        // Step 3: Format and print the double variable (gpa) with 2 decimal places
        // Example output: GPA: 3.68
        String avg= String.format("GPA: %.2f",gpa);
        System.out.println(avg);

        // Step 4: Combine all three into one formatted sentence using String.format
        // Example output: Name: Alice, Age: 25, GPA: 3.68
        String combine=String.format("%s, Age:%d, GPA:%.2f",names,age,gpa);
        System.out.println(combine);


        // Step 5: Print the same combined sentence using printf
        // Example output: Name: Alice, Age: 25, GPA: 3.68
//        Use String.format to create each output in Steps 1–4.
//        Print each formatted string with System.out.println.
//                In Step 5, use System.out.printf to print the same combined sentence directly.
        System.out.printf("%s, Age:%d, GPA:%.2f",names,age,gpa);


    }
}
