/*
 * Klasse Tier
 *
 * Autor: jan.pelzl@hshl.de
 * Datum: 10.10.2020
 * Funktion: Speicherung von Tierart, Geburtsjahr, Farbe und Name eines Tiers
 *
 **/
class Tier {
    private String tierart;
    private String name;
    private int jahr;
    private String farbe;

    public Tier() {
        name = "unbekannt";
        tierart = "unbekannt";
        jahr = 0;
        farbe = "";
    }

    public Tier(String einName, String eineArt, int einJahr, String eineFarbe) {
        name = einName;
        tierart = eineArt;
        jahr = einJahr;
        farbe = eineFarbe;
    }

    // Ausgabe aller Daten eines Objektes als Text
    public void datenAusgeben() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Tierart: " + tierart);
        System.out.println("Jahr: " + jahr);
        System.out.println("Farbe: " + farbe);
    }

    public String gibTierart() {
        return tierart;
    }

    public String gibName() {
        return name;
    }

    public int gibJahr() {
        return jahr;
    }

    public String gibFarbe() {
        return farbe;
    }

    public void aendereName(String neuerName) {
        name = neuerName;
    }

    public void aendereTierart(String neueTierart) {
        tierart = neueTierart;
    }

    public void aendereFarbe(String neueFarbe) {
        farbe = neueFarbe;
    }

    public void aendereJahr(int neuesJahr) {
        jahr = neuesJahr;
    }

}
