package project;

import java.util.Scanner;

public class HexToBinary {
    public void hexToBinary() {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Enter a hexadecimal value : ");
            String hex = sc.nextLine();
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The hexadecimal conversion of " + hex + " to binary is : " + binary);
        }catch (Exception e){
            System.out.println("Pls input a hexadecimal value...");
            System.out.println();
            hexToBinary();
        }
    }
}
