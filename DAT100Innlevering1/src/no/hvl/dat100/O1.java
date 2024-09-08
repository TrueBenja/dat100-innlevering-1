package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Math.round;
import static java.lang.Integer.parseInt;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bruttolønn: ");
        int lonn = parseInt(input.nextLine());

        System.out.println("Trinnskatt: " + beregnTrinnskatt(lonn));
    }

    private static int beregnTrinnskatt(int lonn) {
        int trinn0 = 208050;
        int trinn1 = 292850;
        int trinn2 = 670000;
        int trinn3 = 937900;
        int trinn4 = 1350000;

        double trinnskatt1 = 1.7 / 100;
        double trinnskatt2 = 4.0 / 100;
        double trinnskatt3 = 13.6 / 100;
        double trinnskatt4 = 16.6 / 100;
        double trinnskatt5 = 17.6 / 100;

        double totalTrinnskatt = 0.0;

        if (lonn <= trinn0) {
            return 0;
        }

        double interim;

        if (lonn <= trinn1) {
            interim = lonn - trinn0;
            totalTrinnskatt += interim * trinnskatt1;
        } else if (lonn <= trinn2) {
            interim = trinn1 - trinn0;
            totalTrinnskatt += interim * trinnskatt1;
            interim = lonn - trinn1;
            totalTrinnskatt += interim * trinnskatt2;
        } else if (lonn <= trinn3) {
            interim = trinn1 - trinn0;
            totalTrinnskatt += interim * trinnskatt1;
            interim = trinn2 - trinn1;
            totalTrinnskatt += interim * trinnskatt2;
            interim = lonn - trinn2;
            totalTrinnskatt += interim * trinnskatt3;
        } else if (lonn <= trinn4) {
            interim = trinn1 - trinn0;
            totalTrinnskatt += interim * trinnskatt1;
            interim = trinn2 - trinn1;
            totalTrinnskatt += interim * trinnskatt2;
            interim = trinn3 - trinn2;
            totalTrinnskatt += interim * trinnskatt3;
            interim = lonn - trinn3;
            totalTrinnskatt += interim * trinnskatt4;
        } else {
            interim = trinn1 - trinn0;
            totalTrinnskatt += interim * trinnskatt1;
            interim = trinn2 - trinn1;
            totalTrinnskatt += interim * trinnskatt2;
            interim = trinn3 - trinn2;
            totalTrinnskatt += interim * trinnskatt3;
            interim = trinn4 - trinn3;
            totalTrinnskatt += interim * trinnskatt4;
            interim = lonn - trinn4;
            totalTrinnskatt += interim * trinnskatt5;
        }
        totalTrinnskatt = round(totalTrinnskatt);
        return (int)totalTrinnskatt;
    }
}
