package _Uebungen._230_EigeneKlasse_Viktor;

import java.text.DecimalFormat;

public class Bild {

    protected static int counter;

    private String farbe;
    private int zoll;


    Bild() {
        setFarbe("Blau");
        setZoll(37);
        counter++;
    }

    Bild(int zoll) {
        setFarbe("Rot");
        setZoll(zoll);
        counter++;
    }

    Bild(String farbe) {
        setFarbe(farbe);
        setZoll(42);
        counter++;
    }

    Bild(String farbe, int zoll) {
        setFarbe(farbe);
        setZoll(zoll);
        counter++;
    }
        
    // Getter & Setter
        public String getFarbe() {return this.farbe;}
        public int getZoll() {return this.zoll;}

        public void setFarbe(String farbe) {this.farbe = farbe;}
        public void setZoll(int zoll) {this.zoll = zoll;}


        public double umrechnung() {
        DecimalFormat df1 = new DecimalFormat("#.00");
        return getZoll() * 2.54;
        }

        public String toString(){
        return "Das Bild hat die Farbe " + getFarbe() + " und eine Diagonale von " + getZoll() + " Zoll (" + umrechnung() + " in cm)";
        }


    }

