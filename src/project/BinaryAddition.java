package project;

import java.util.Scanner;

public class BinaryAddition {
    public void binaryAddition(){
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Enter first binary number : ");
        String binaryOne = sc.nextLine();
        int first = Integer.parseInt(binaryOne,2);

        System.out.print("Enter second binary number : ");
        String binaryTwo = sc.nextLine();
        int second = Integer.parseInt(binaryTwo,2);

        int third = first + second;
        String result = Integer.toBinaryString(third);

        System.out.println("The addition of " + binaryOne + " and " + binaryTwo + " is : " + result);
        }catch (Exception e){
            System.out.println("Pls input a binary number...");
            System.out.println();
            binaryAddition();
        }
    }
}
