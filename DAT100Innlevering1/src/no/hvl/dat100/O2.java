package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class O2 {
    public static void main(String[] args) {
        int antStud = 10;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < antStud; i++) {
            System.out.print("Poengsum: ");
            int poengsum = parseInt(input.nextLine());

            while (poengsum > 100 || poengsum < 0) {
                System.out.print("Ugyldig poengsum. Prøv igjen: ");
                poengsum = parseInt(input.nextLine());
            }

            if (poengsum >= 90) {
                System.out.println("Poengsum: " + poengsum + ", Karakter: A");
            } else if (poengsum >= 80) {
                System.out.println("Poengsum: " + poengsum + ", Karakter: B");
            } else if (poengsum >= 60) {
                System.out.println("Poengsum: " + poengsum + ", Karakter: C");
            } else if (poengsum >= 50) {
                System.out.println("Poengsum: " + poengsum + ", Karakter: D");
            } else if (poengsum >= 40) {
                System.out.println("Poengsum: " + poengsum + ", Karakter: E");
            } else {
                System.out.println("Poengsum: " + poengsum + ", Karakter: F");
            }
        }
    }
}
