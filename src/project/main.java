package project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true){
            System.out.println();
            System.out.println("Select what you would like to convert : ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Binary to Decimal");
            System.out.println("Enter 2 for Decimal to Binary");
            System.out.println("Enter 3 for Decimal to Hexadecimal");
            System.out.println("Enter 4 for Hexadecimal to Decimal");
            System.out.println("Enter 5 for Binary to Hexadecimal");
            System.out.println("Enter 6 for Hexadecimal to Binary");
            System.out.println("Enter 7 for Binary addition");
            System.out.println("Enter 8 to Exit the program");
            System.out.println();
            System.out.print("Your input : ");

            try {
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
                        binaryToDecimal.binaryToDecimal();
                        break;
                    case 2:
                        DecimalToBinary decimalToBinary = new DecimalToBinary();
                        decimalToBinary.decimalToBinary();
                        break;
                    case 3:
                        DecimalToHex decimalToHex = new DecimalToHex();
                        decimalToHex.decimalToHex();
                        break;
                    case 4:
                        HexToDecimal hexToDecimal = new HexToDecimal();
                        hexToDecimal.hexToDecimal();
                        break;
                    case 5:
                        BinaryToHex binaryToHex = new BinaryToHex();
                        binaryToHex.binaryToHex();
                        break;
                    case 6:
                        HexToBinary hexToBinary = new HexToBinary();
                        hexToBinary.hexToBinary();
                        break;
                    case 7:
                        BinaryAddition binaryAddition = new BinaryAddition();
                        binaryAddition.binaryAddition();
                        break;
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("You did not select any of the above choices");
                    }
                }catch (Exception e){
                    System.out.println("Something went wrong. Pls input a value from the table...");
                }
            }
        }
    }

