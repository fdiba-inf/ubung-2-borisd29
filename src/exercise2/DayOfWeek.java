package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of day: ");
        int day = input.nextInt();
        if (day == 1) {
          System.out.println("Day of week: Monday");
        } else if (day == 2) {
          System.out.println("Day of week: Tuesday");
        } else if (day == 3) {
          System.out.println("Day of week: Wednesday");
        } else if (day == 4) {
          System.out.println("Day of week: Thursday");
        } else if (day == 5) {
          System.out.println("Day of week: Friday");
        } else if (day == 6) {
          System.out.println("Day of week: Saturday");
        } else if (day == 7) {
          System.out.println("Day of week: Sunday");
        } else {
          System.out.println("Invalid day");
        }
    }

}