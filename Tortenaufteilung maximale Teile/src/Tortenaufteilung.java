//Aufgabe 3 - Tortenaufteilung
import edu.princeton.cs.introcs.StdOut;

public class Tortenaufteilung {
    public void datenAusgeben() {
        StdOut.println(tortenaufteilung(7));
    }
    public int tortenaufteilung(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n + (tortenaufteilung(n - 1)));
        }
    }
}
