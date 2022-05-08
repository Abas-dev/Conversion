package project;

import java.util.Scanner;// importing Scanner class to receive user input

public class main { //main class
    public static void main(String[] args) { // main method
        while (true){ // using while loop to keep running the application till the user exits
            System.out.println();
            System.out.println("Select what you would like to convert : ");
            Scanner sc = new Scanner(System.in); // using java scanner class to receive user input
            System.out.println("Enter 1 for Binary to Decimal");
            System.out.println("Enter 2 for Decimal to Binary");
            System.out.println("Enter 3 for Decimal to Hexadecimal");
            System.out.println("Enter 4 for Hexadecimal to Decimal") ;
            System.out.println("Enter 5 for Binary to Hexadecimal");
            System.out.println("Enter 6 for Hexadecimal to Binary");
            System.out.println("Enter 7 for Binary addition");
            System.out.println("Enter 8 to Exit the program");
            System.out.println();
            System.out.print("Your input : "); // expecting user input
            try { // exception handling
                int input = sc.nextInt(); // receiving user input and storing it in a variable
                switch (input) { // using switch statement
                    case 1:
                        BinaryToDecimal binaryToDecimal = new BinaryToDecimal(); // creating an object of the class
                        binaryToDecimal.binaryToDecimal();// using the object created to access the method in the class
                        break;
                    case 2:
                        DecimalToBinary decimalToBinary = new DecimalToBinary(); // creating an object of the class
                        decimalToBinary.decimalToBinary();// using the object created to access the method in the class
                        break;
                    case 3:
                        DecimalToHex decimalToHex = new DecimalToHex(); // creating an object of the class
                        decimalToHex.decimalToHex();// using the object created to access the method in the class
                        break;
                    case 4:
                        HexToDecimal hexToDecimal = new HexToDecimal(); // creating an object of the class
                        hexToDecimal.hexToDecimal();// using the object created to access the method in the class
                        break;
                    case 5:
                        BinaryToHex binaryToHex = new BinaryToHex(); // creating an object of the class
                        binaryToHex.binaryToHex();// using the object created to access the method in the class
                        break;
                    case 6:
                        HexToBinary hexToBinary = new HexToBinary(); // creating an object of the class
                        hexToBinary.hexToBinary();// using the object created to access the method in the class
                        break;
                    case 7:
                        BinaryAddition binaryAddition = new BinaryAddition();// creating an object of the class
                        binaryAddition.binaryAddition();// using the object created to access the method in the class
                        break;
                    case 8:
                        System.exit(0); // to exit the program
                    default:
                        System.out.println("You did not select any of the above choices");
                    }
                }catch (Exception e){ // exception handling
                    System.out.println("Something went wrong. Pls input a value from the table...");
                }
            }
        }
    }

