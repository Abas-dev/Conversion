package project;

import java.util.Scanner;

public class DecimalToBinary {
    public void decimalToBinary(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number : ");
            int decimal = sc.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The decimal conversion of " + decimal + " to binary is : " + binary);
        }catch(Exception e){
            System.out.println("Pls input a decimal number...");
            System.out.println();
            decimalToBinary();
        }
    }
}
