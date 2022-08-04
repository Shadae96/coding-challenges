/**
 * PrimeNumberChecker
 */
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(Integer[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");


    int num = input.nextLine();

   if (isPrime(num)) {System.out.println("the number "+ num + " you entered is prime");


    }

    public static boolean isPrime(int n) {
        if(n <= 1){
            if (n= 1){
                return false
            }

            for (int i =2; i < Math.sqrt(n); i++)
            {
                if(n % i == 0) {
                    return false;
                }
            }
        }

        return false;
        
    }


    }
}