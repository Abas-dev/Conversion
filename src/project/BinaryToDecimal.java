package project;

import java.util.Scanner;// importing the scanner class for user input

public class BinaryToDecimal { // creating a class
    public void binaryToDecimal(){ // creating a method
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
            System.out.print("Enter a binary number : ");
            String binaryNumber = sc.nextLine(); // receiving user binary input
            int decimal = Integer.parseInt(binaryNumber, 2); // converting the input to decimal value
            System.out.println("The binary conversion of " + binaryNumber + " to decimal is : " + decimal);
        }catch (Exception e){ // catching exception
            System.out.println("Pls input a binary value...");
            System.out.println();
            binaryToDecimal(); // recursion
        }
    }
}
