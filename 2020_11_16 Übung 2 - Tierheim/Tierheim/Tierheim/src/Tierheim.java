/*
 * Klasse Tierheim
 *
 * Autor: jan.pelzl@hshl.de
 * Datum: 10.10.2020
 * Funktion: Erzeugung und Darstellung von Objekten der Klasse Tier
 *
 **/

        //Tierheim ist eine Klasse.
        //Man kann Attribute auf eine Klasse haben/reintun.
        //z.B.  public class Kraftfahrzeug {
        //
        //	        private int ps = 0;
        //	        private int verbrauch = 0;
        //	        private int geschwindigkeit  = 0;
        //}
        //  *//Der Operator new sorgt dafür, dass Speicher für die zu erzeugenden Objekte reserviert wird.*
        //1: Kraftfahrzeug fahrzeug1 = new Kraftfahrzeug();
        //2: Kraftfahrzeug fahrzeug2 = new Kraftfahrzeug();
        //
        //  *//Nach den beiden Anweisungen von oben haben wir also zwei Speicherbereiche, in denen       *
        //  *//wir jeweils Platz für die Kraftfahrzeug Attribute ps, verbrauch und geschwindigkeit haben.*
        //


import java.util.Arrays;

public class Tierheim {

    public static void main(String[] args) {
        int[] schrank = {1,2,3,4};

        // Begrüssungstext
        System.out.println("Willkommen im Tierheim!");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("Unsere Tiere: ");
        System.out.println("Der Aktenschrank hat vier Fächer: ");
        System.out.println(Arrays.toString(schrank));
        System.out.println("Überblick Detailvorschau: ");       //von Fach 1 & Fach 2
        System.out.println("Inhalt von erster Schublade: " + schrank[0]);
        System.out.println("Inhalt von vierter Schublade: " + schrank[3]);
        int[] reihe = new int[7];  //kam in Klausur dran LOL
        reihe[0]=0;
        reihe[1]=1;
        for(int n = 2; n<reihe.length; n++){
            reihe[n]= reihe[n-2]+reihe[n-1];
            System.out.println(reihe[n]);
        }

        for(int a=0; a<=17; a++)
        {
            System.out.print("X");
        }


        // Deklaration und Initialisierung von Objekten der Klasse Tier
        //new ist ein Operator.
        Tier tier1 = new Tier("Mieze", "Katze", 2008, "schwarz");

        // Deklaration und Initialisierung von Objekten der Klasse Tier
        Tier tier2 = new Tier("Bello","Hund",2012,"braun");

        Tier tier3 = new Tier("AtillasBlondie","Pferd",1998, "weiß");

        Tier einPikatchu = new Tier("Pika","ein wildes Pikatchu",2020, "vorwiegend gelb");

        Tier tier222 = new Tier("Pieps", "Vogel", 2019, "blau");

        Tier tierunbekannt = new Tier();

        Tier Zugelaufen1 = new Tier("Hund", "weiss");



        // Ausgabe der Daten des Objektes
        tier1.datenAusgeben();
        tier2.datenAusgeben();
        tier3.datenAusgeben();
        einPikatchu.datenAusgeben();
        tier222.datenAusgeben();
        tierunbekannt.datenAusgeben();
        Zugelaufen1.datenAusgeben();
        Zugelaufen1.alterAendern(2012);
    }

}
