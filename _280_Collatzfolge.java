package _Uebungen;

import java.util.Scanner;

public class _280_Collatzfolge {

    public static void main(String[] args) {

        System.out.println("Bitte zufällige Zahl angeben: ");
        Scanner scanner = new Scanner(System.in);
        int nummer = scanner.nextInt();
        int count = 0;
        int groesste = 0;

        while (nummer != 1) {
            count++;
            if (nummer % 2 == 0) {
                nummer = nummer / 2;
            } else {
                nummer = nummer * 3 +1;
            } if (nummer > groesste) {
                groesste = nummer;
            }
            //System.out.println("Count: " + count + "\nGroesste: " + groesste + "\nNummer: " + nummer);     //Kontrolle!
        } System.out.println("Count: " + count + "\nGroesste: " + groesste + "\nNummer: " + nummer);
    }
}
