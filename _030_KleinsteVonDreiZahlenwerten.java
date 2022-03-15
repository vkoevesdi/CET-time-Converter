package _Uebungen;

import java.util.Random;

public class _030_KleinsteVonDreiZahlenwerten {


    public static void main(String[] args) {

        Random r = new Random();
        int x = r.nextInt(10) +1;
        int y = r.nextInt(10) +1;
        int z = r.nextInt(10) +1;

        System.out.println("X: " +x);
        System.out.println("Y: " +y);
        System.out.println("Z: " +z);

        if (x < y && x < z)   {
            System.out.println("X ist die kleinste Zahl mit " + x);
        }   else if (y < x && y < z) {
            System.out.println("Y ist die kleinste Zahl mit " + y);
        }   else if (z < y && z < x) {
            System.out.println("Z ist die kleinste Zahl mit " + z);
        }   else if (x == y && x < z) {
            System.out.println("X und Y haben beide den kleinsten Wert mit " + x);
        }   else if (x == z && x < y) {
            System.out.println("X und Z haben beide den kleinsten Wert mit " + x);
        }   else if (y == z && y < x) {
            System.out.println("Y und Z haben beide den kleinsten Wert mit " + y);
        }   else {
            System.out.println("Die Zahlen sind alle gleich groß");
        }

    }
}
