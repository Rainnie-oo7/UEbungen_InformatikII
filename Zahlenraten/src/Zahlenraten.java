//import edu.princeton.cs.introcs.StdIn;
//import edu.princeton.cs.introcs.StdOut;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Zahlenraten {
    public void datenAusgeben() {
        int obergrenze = 1000;
        int untergrenze = 1;
        sucheZahl(untergrenze, obergrenze);
    }

    public static void sucheZahl(int untergrenze, int obergrenze) {
        //100 300
        if (untergrenze >= 1 && obergrenze <= 1000) {
            int mittelwert = (untergrenze + obergrenze) / 2;
            StdOut.println("Ist die gesuchte Zahl:" + mittelwert + " ?");

            String nutzer = StdIn.readLine();

            if (nutzer.equals("zu groß")) {
                sucheZahl(untergrenze, mittelwert);
            } else if (nutzer.equals("zu klein")) {
                sucheZahl(mittelwert, obergrenze);
            } else if (nutzer.equals("richtig")) {
                StdOut.println("Zahl gefunden");
                StdOut.println("Yippieh");
            }
        }
    }

}
