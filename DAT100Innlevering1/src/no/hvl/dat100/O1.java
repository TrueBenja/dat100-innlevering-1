package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bruttolønn: ");
        int lonn = parseInt(input.nextLine());

        System.out.println("Trinnskatt: " + String.format("%.2f", beregnTrinnskatt(lonn)) + " kr");
        input.close();
    }

    private static double beregnTrinnskatt(int lonn) {
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

        while (lonn > trinn0) {
            if (lonn > trinn4) {
                totalTrinnskatt += (lonn - trinn4) * trinnskatt5;
                lonn -= (lonn - trinn4);
            } else if (lonn > trinn3) {
                totalTrinnskatt += (lonn - trinn3) * trinnskatt4;
                lonn -= (lonn - trinn3);
            } else if (lonn > trinn2) {
                totalTrinnskatt += (lonn - trinn2) * trinnskatt3;
                lonn -= (lonn - trinn2);
            } else if (lonn > trinn1) {
                totalTrinnskatt += (lonn - trinn1) * trinnskatt2;
                lonn -= (lonn - trinn1);
            } else {
                totalTrinnskatt += (lonn - trinn0) * trinnskatt1;
                lonn -= (lonn - trinn0);
            }
        }

        return totalTrinnskatt;
    }
}
