package project;

import java.util.Scanner; // importing scanner class for user input

public class HexToDecimal { //creating a class
    public void hexToDecimal(){ // creating a method
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
        System.out.print("Enter an hexadecimal value : ");
        String hex = sc.nextLine(); // receiving user hexadecimal input
        int decimal = Integer.parseInt(hex,16); // converting to decimal
        System.out.println("The hexadecimal conversion of " + hex + " to decimal : " + decimal);
        }catch (Exception e){ // exception handling
            System.out.println("Pls input a hexadecimal value...");
            System.out.println();
            hexToDecimal(); // recursion
        }
    }
}
