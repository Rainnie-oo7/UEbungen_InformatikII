/*
 * Klasse Tierheim v2
 *
 * Autor: jan.pelzl@hshl.de
 * Datum: 10.10.2020
 * Funktion: Erzeugung und Darstellung von Objekten der Klasse Tier
 *
 **/
public class Tierheim {

    public static void main(String[] args) {
        // Begrüssungstext
        System.out.println("Willkommen im Tierheim!");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("Unsere Tiere:");
        System.out.println();

        // Deklaration und Initialisierung von Objekten des Typs Tier
        Tier tier1 = new Tier("Mieze", "Katze", 2008, "schwarz");
        Tier tier2 = new Tier("Bello", "Hund", 2018, "weiss");

        // Ausgabe der Daten des Objektes
        tier1.datenAusgeben();
        tier2.datenAusgeben();
    }

}
