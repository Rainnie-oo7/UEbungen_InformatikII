public class Main {


    public static void main(String[] args) {
            //Aufgabe 2
        Quadratsumme quadrat = new Quadratsumme();
        quadrat.datenAusgeben();
        quadrat.schleife();
        quadrat.schleife2();
            //Aufgabe 2 Noch allgemeiner mit User Eingabe
        QuadratsummeMitUserEing quadrat2 = new QuadratsummeMitUserEing();
        quadrat2.rechnehandy();         //Frage: Wie kriege ich die zwei Klassen *nacheinander*
                                        //  aufgeführt?, nicht simultan ?? Antwort: Buffer
                                        // ODER Create a batch/sh file and -classpath einzelnd ausführen
            //Aufgabe 3
        Tortenaufteilung torte = new Tortenaufteilung();
        torte.datenAusgeben();
    }
}
