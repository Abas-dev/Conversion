package project;

import java.util.Scanner;

public class BinaryToDecimal {
    public void binaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number : ");
            String binaryNumber = sc.nextLine();
            int decimal = Integer.parseInt(binaryNumber, 2);
            System.out.println("The binary conversion of " + binaryNumber + " to decimal is : " + decimal);
        }catch (Exception e){
            System.out.println("Pls input a binary value...");
            System.out.println();
            binaryToDecimal();
        }
    }
}
