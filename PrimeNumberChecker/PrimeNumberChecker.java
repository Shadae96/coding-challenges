package PrimeNumberChecker;

import java.util.Scanner;

public class PrimeNumberChecker {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = s.nextInt();
if (isPrime(n)) {
System.out.println(n + " is a prime number.");
} else {
System.out.println(n + " is not a prime number.");
}
s.close();
}


public static boolean isPrime(int n) {
if (n <= 1) {
return false;
}
for (int i = 2; i < Math.sqrt(n); i++) {
if (n % i == 0) {
return false;
}
}
return true;
}
}

/*Work on this--- it is returning every number as prime */