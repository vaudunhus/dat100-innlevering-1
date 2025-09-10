package Uke36;

import java.util.Scanner;

public class O1 {

    public static double beregnTrinnskatt(double brutto) {

        double[][] trinn = {
                {217400, 306050, 0.017},
                {306050, 697150, 0.04},
                {697150, 942400, 0.137},
                {942400, 1410750, 0.167},
                {1410750, Double.MAX_VALUE, 0.177}
        };

        double skatt = 0.0;

        for (double[] t : trinn) {
            double nedre = t[0];
            double øvre = t[1];
            double sats = t[2];

            if (brutto > nedre) {
                double grunnlag = Math.min(brutto, øvre) - nedre;
                skatt += grunnlag * sats;
            } else {
                break;
            }
        }
        return skatt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt (kr): ");
        double brutto = sc.nextDouble();

        double trinnskatt = beregnTrinnskatt(brutto);

        System.out.printf("Trinnskatt for bruttoinntekt %.2f kr: %.2f kr%n", brutto, trinnskatt);

        sc.close();
    }
}
