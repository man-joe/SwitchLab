/*
 * Write a program using a switch statement to print the month names given the exact number of days in the month.
 * If the user enters 30 then the program will display: "September April June November". If the user enters 9 then
 * program will alert the user that no months have exactly 9 days.
 *
 * You can have more than one statement in each switch case.
 * 31 days - Jan, Mar, May, July, Aug, Oct, Dec
 * 28/29 - Feb
 *
 */

import java.util.Scanner;

public class SwitchLab {
    public static void main (String [] args) {

        int numOfDays;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter exact number of days in a month: ");
        numOfDays = sc.nextInt();

        System.out.println();
        switch(numOfDays){
            case 30:
                System.out.println("April, June, September, and November has 30 days");
                break;
            case 31:
                System.out.println("January, March, May, July, August, October, and December has 31 days");
                break;
            case 28:
                System.out.println("February can have 28 days");
                break;
            case 29:
                System.out.println("February can have 29 days");
                break;
            default:
                System.out.println("There are no Months with " + numOfDays + " days.");
        }

    }
}
