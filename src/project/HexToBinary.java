package project;

import java.util.Scanner; // using the scanner class for user input

public class HexToBinary { // creating a class
    public void hexToBinary() { // creating a method or function
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
            System.out.print("Enter a hexadecimal value : ");
            String hex = sc.nextLine(); // receiving user hexadecimal value
            int decimal = Integer.parseInt(hex, 16); // converting the value to decimal
            String binary = Integer.toBinaryString(decimal);// converting the decimal value to binary
            System.out.println("The hexadecimal conversion of " + hex + " to binary is : " + binary);
        }catch (Exception e){ // exception handling
            System.out.println("Pls input a hexadecimal value...");
            System.out.println();
            hexToBinary();// recursion
        }
    }
}
