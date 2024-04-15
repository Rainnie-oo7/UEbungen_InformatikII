/*
 * Klasse Tier
 *
 * Autor: jan.pelzl@hshl.de
 * Datum: 10.10.2020
 * Funktion: Speicherung von Tierart, Geburtsjahr, Farbe und Name eines Tiers
 *
 **/
    //da wo private anfängt heißt: Datenfeld(er)
    //warum private?-> weil:
    // Variablen deklariert man mit private
    //Methoden deklariert man mit public

    //Private
    //Wenn eine Variable oder Methode private deklariert ist, dann ist sie nur in der Klasse in der sie erstellt wurde sichtbar, also nicht von anderen Klassen.
    //
    //Public
    //Wenn eine Variable oder Methode public deklariert ist, dann ist sie von jeder Klasse aus siehtbar und bearbeitbar, die eine Referenz(ein Objekt) zu der Klasse der Variable/Methode besitzt.
class Tier {
    private String tierart;
    private String name;
    private int jahr;
    private String farbe;




    //Konstruktor mit Übergabe von Parametern
    //Klausurfrage: Darf es nur einen Konstrukor geben?
    // nein es darf beleibig viele K. geben, die sich in aber jeweils in ihrer
    // Parameterliste unterscheiden.
    //Ein Konstruktor hat verschiedene Parameter. (oder kkann haben)
    public Tier(String einName, String eineArt, int einJahr, String eineFarbe) {
        name = einName;
        tierart = eineArt;
        jahr = einJahr;
        farbe = eineFarbe;
    }



    public Tier(String eineArt, String eineFarbe) {
        name = "unbekannt";
        tierart = eineArt;
        jahr = 0;
        farbe = eineFarbe;
    }

    public Tier() {
        name = "unbekannt";
        tierart = "unbekannt";
        jahr = 0;
        farbe = "Unbekannt";
    }


    // Ausgabe aller Daten eines Objektes als Text
    public void datenAusgeben() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Tierart: " + tierart);
        System.out.println("Jahr: " + jahr);
        System.out.println("Farbe: " + farbe);

    }

    public void alterAendern(int neuesJahr) {
        // Kontrolliere das Alter auf Sinn
        jahr = neuesJahr;
        //Test nicht bestanden

        //Fehler ausgeben
    }

}
