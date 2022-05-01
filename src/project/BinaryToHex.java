package project;

import java.util.Scanner;

public class BinaryToHex {
    public void binaryToHex() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number : ");
            String binary = sc.nextLine();
            int decimal = Integer.parseInt(binary, 2);
            String hex = Integer.toHexString(decimal);
            System.out.println("The binary conversion of " + binary + " to hexadecimal is : " + hex);
        }catch (Exception e){
            System.out.println("Pls input a Binary number...");
            System.out.println();
            binaryToHex();
        }
    }
}
