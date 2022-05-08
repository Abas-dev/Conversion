package project;

import java.util.Scanner; // importing the scanner class

public class DecimalToBinary { // creating a class
    public void decimalToBinary(){ // creating a method
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
            System.out.print("Enter a decimal number : ");
            int decimal = sc.nextInt(); // receiving user decimal values
            String binary = Integer.toBinaryString(decimal);// converting the input to binary
            System.out.println("The decimal conversion of " + decimal + " to binary is : " + binary);
        }catch(Exception e){ // catching exception
            System.out.println("Pls input a decimal number...");
            System.out.println();
            decimalToBinary(); // recursion
        }
    }
}
