package project;

import java.util.Scanner; // importing the scanner class to receive user input

public class BinaryAddition { // creating a class
    public void binaryAddition(){ // creating a method inside the class
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
        System.out.print("Enter first binary number : ");
        String binaryOne = sc.nextLine(); // receiving first input
        int first = Integer.parseInt(binaryOne,2); // converting from binary to decimal and storing it in a variable

        System.out.print("Enter second binary number : ");
        String binaryTwo = sc.nextLine();// receiving second input
        int second = Integer.parseInt(binaryTwo,2);// converting from binary to decimal and storing it in a variable

        int third = first + second; // creating another variable and storing the added value of both values
        String result = Integer.toBinaryString(third); // converting back to binary and storing it in a variable

        System.out.println("The addition of " + binaryOne + " and " + binaryTwo + " is : " + result);
        }catch (Exception e){ // exception handling
            System.out.println("Pls input a binary number...");
            System.out.println();
            binaryAddition(); // recursion
        }
    }
}
