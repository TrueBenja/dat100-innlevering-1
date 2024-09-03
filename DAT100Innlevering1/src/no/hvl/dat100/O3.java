package no.hvl.dat100;

public class O3 {
    public static void main(String[] args) {
        System.out.println(fakultet(4));
    }

    private static int fakultet(int n) {
        int sum = 1;

        if (n > 0) {
            sum = n * fakultet(n - 1);
        }

        return sum;
    }
}
