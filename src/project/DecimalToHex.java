package project;

import java.util.Scanner;

public class DecimalToHex {
    public void decimalToHex(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a decimal number : ");
            int decimal = sc.nextInt();
            String hex = Integer.toHexString(decimal);
            System.out.println("The decimal conversion of " + decimal + " to hexadecimal is : " + hex);
        }catch (Exception e){
            System.out.println("Pls input a decimal number...");
            System.out.println();
            decimalToHex();
        }
    }
}
