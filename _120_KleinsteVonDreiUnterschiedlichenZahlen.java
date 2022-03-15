package _Uebungen;

import java.util.Random;

public class _120_KleinsteVonDreiUnterschiedlichenZahlen {

    public static void main(String[] args) {

        Random r = new Random();
        int zahl1 = r.nextInt(10) + 1;
        int zahl2 = r.nextInt(10) + 1;
        int zahl3 = r.nextInt(10) + 1;

        while (zahl1 == zahl2 || zahl1 == zahl3 || zahl2 == zahl3) {

            /*System.out.println(zahl1);                // Kontrolle
            System.out.println(zahl2);
            System.out.println(zahl3);
            */


            if (zahl1 == zahl2) {
                zahl1 = r.nextInt(10) + 1;
                zahl2 = r.nextInt(10) + 1;
            } else if (zahl1 == zahl3) {
                zahl1 = r.nextInt(10) + 1;
                zahl2 = r.nextInt(10) + 1;
            } else if (zahl2 == zahl3) {
                zahl2 = r.nextInt(10) + 1;
                zahl3 = r.nextInt(10) + 1;
            } else {
                break;
            }
        }
        System.out.println("1. Zahl: " + zahl1);
        System.out.println("2. Zahl: " + zahl2);
        System.out.println("3. Zahl: " + zahl3);

        if (zahl1 < zahl2 && zahl1 < zahl3) {
            System.out.println("Die 1. Zahl ist die Kleinste mit " + zahl1);
        } else if (zahl2 < zahl1 && zahl2 < zahl3) {
            System.out.println("Die 2. Zahl ist die Kleinste mit " + zahl2);
        } else {
            System.out.println("Die 3. Zahl ist die Kleinste mit " + zahl3);
        }
    }
}
