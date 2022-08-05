package EvenOrOdd;


/*
 * intializing Scanner(built in java method) so we can interact in the console
 */

import java.util.Scanner;

public class EvenOrOdd {

    public static void main (String[] args) {

        /*
         * creating a primative integer variable and calling it num
         */
        int num;

        /*
         * the console will ask us to enter a number
         */
        System.out.print("enter your number:");


/*
 * Scanner is a class so we are instantiating and creating a new object called input
 */
        Scanner input = new Scanner(System.in);

/* setting the num variable equal to the new Scanner class */
        num = input.nextInt();

        /* using an if else statement to check if the number inputted is even or odd. the % operator checks for remainders. i.e 3/2 = 1.5 so it's an odd number. the if state is false so it runs the else statement and prints odd for the above test.  */
        if (num % 2 == 0) {

            System.out.println("this " + num + " is even");
            
        } else {

            System.out.println("this " + num + " is odd");
            
        }

        input.close();

    }

  }

