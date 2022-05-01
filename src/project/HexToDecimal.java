package project;

import java.util.Scanner;

public class HexToDecimal {
    public void hexToDecimal(){
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Enter an hexadecimal value : ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex,16);
        System.out.println("The hexadecimal conversion of " + hex + " to decimal : " + decimal);
        }catch (Exception e){
            System.out.println("Pls input a hexadecimal value...");
            System.out.println();
            hexToDecimal();
        }
    }
}
