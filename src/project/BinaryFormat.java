package project;

import java.util.Scanner;

public class BinaryFormat {
    public void binaryFormat(){
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        try { // exception handling
            System.out.print("Enter a number : ");
            int n = sc.nextInt(); // receiving user binary input
            int len = 32;
            String binary = "";
            for (long i = (1L << len - 1); i > 0; i = i / 2) {
                binary += (n & i) != 0 ? "1" : "0";
            }
            System.out.println("The binary format of " + n + " is " + binary);
        }catch (Exception e){ // catching exception
            System.out.println("Pls input a number...");
            System.out.println();
            binaryFormat(); // recursion
        }
    }
}
