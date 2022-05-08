package project;

import java.util.Scanner;// importing scanner class to receive user input

public class BinaryToHex { // creating a class
    public void binaryToHex() { // creating a method
        Scanner sc = new Scanner(System.in); // creating an  object of the scanner class
        try { // catching exceptions
            System.out.print("Enter a binary number : ");
            String binary = sc.nextLine(); // receiving user input
            int decimal = Integer.parseInt(binary, 2); // converting to decimal
            String hex = Integer.toHexString(decimal); // converting the decimal to hexadecimal
            System.out.println("The binary conversion of " + binary + " to hexadecimal is : " + hex);
        }catch (Exception e){ // catching exception
            System.out.println("Pls input a Binary number...");
            System.out.println();
            binaryToHex(); // using recursion
        }
    }
}
