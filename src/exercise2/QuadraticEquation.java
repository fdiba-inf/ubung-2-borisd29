package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a != 0) {
          double D = b*b - 4*a*c;
          if (D>=0) {
          double w1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
          double w2 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
          System.out.println(w1 + ", " + w2);
          }
          else {
            System.out.println("Imaginary values");
          }

        } else if (b != 0) {
          double x = -c/b;
          System.out.println(x);
        } else if (c != 0) {
            System.out.println("No values");
        } else {
           System.out.println("Many values");
        }
    }

}
