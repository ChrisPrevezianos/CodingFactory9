package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο.
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο τιμές: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.println(" base^power = " + result);
    }

    /**
     * Calculate base^power.
     * @param a    the base.
     * @param b    the exponent.
     * @return     the result.
     */

    public static int pow(int a, int b){
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }

        return result;
    }
}
