package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class O3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn en verdi større enn 0: ");
        int num = parseInt(input.nextLine());

        while (num < 1) {
            System.out.print("Skriv inn en verdi større enn 0: ");
            num = parseInt(input.nextLine());
        }

        System.out.println(fakultet(num));
    }

    private static int fakultet(int n) {

        int sum = 1;

        if (n > 0) {
            sum = n * fakultet(n - 1);
        }

        return sum;
    }
}
