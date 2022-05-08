package project;

import java.util.Scanner; // importing the scanner class

public class DecimalToHex { // creating a class
    public void decimalToHex(){ // creating a method
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
            System.out.print("Enter a decimal number : ");
            int decimal = sc.nextInt(); // receiving user decimal value
            String hex = Integer.toHexString(decimal); // converting from decimal to hexadecimal
            System.out.println("The decimal conversion of " + decimal + " to hexadecimal is : " + hex);
        }catch (Exception e){ // catching exception
            System.out.println("Pls input a decimal number...");
            System.out.println();
            decimalToHex(); // recursion
        }
    }
}
