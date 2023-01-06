// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
//ignore decimal format for 100%
import org.w3c.dom.css.Counter;

import java.util.Scanner;
public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the primes upper bound ===>>");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }
    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int x = 2; x < primes.length; x++) {
            primes[x] = true;
        }
        for (int x = 2; x < primes.length; x++) {
            if(primes[x] == true){
                for (int y = 2; y * x < primes.length; y++) {
                    primes[(x * y)] = false;
                }
            }
        }
    }
    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        for(int x = 2; x < primes.length; x++) {
            if (primes[x] == true) {
                System.out.print(x + " ");
            }
        }
    }
}