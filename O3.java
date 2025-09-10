package Uke36;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv inn et heltall n (> 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ugyldig verdi! n må være større enn 0.");
        } else {
            long fakultet = 1;
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }

            System.out.println(n + "! = " + fakultet);
        }

        sc.close();
    }
}
