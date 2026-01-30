package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο αριθμούς: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.printf("%d^%d = %d%n", base, power, result);
    }

    public static int pow(int base, int power) {
//        if (power == 0) {
//            return 1;
//        }
//        return base * pow(base, power - 1);
        return power == 0 ? 1 : base * pow(base, power - 1);
    }
}
