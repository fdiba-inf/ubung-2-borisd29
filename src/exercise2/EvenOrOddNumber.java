package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        if (number%2 == 1) {
        System.out.println("Number is odd");
        } if (number%2 == 0) {
        System.out.println("Number is even");
        }
        
    }

}