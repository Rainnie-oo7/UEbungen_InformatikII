import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;
//Aufgabe 2 - Summenberechg. mit User-Eingabe (Eingabe beliebiges n= x)
public class QuadratsummeMitUserEing {
    public void rechnehandy() {
        StdOut.print("Haben Sie noch einen Wunsch? Geben Sie n (Zahl, Aus dem Natürlichen Zahlenraum ein),");
        StdOut.println("zu der ihre Quadratsumme berechnen werden soll, hier ein:");
        StdOut.print(handyuser(k));
    }
    Scanner z = new Scanner(System.in);
    int k = z.nextInt();
    public int handyuser(int k) {
        if (k == 1) {
            return 1;
        } else {
            return (k * k + (handyuser(k-1)));
        }
    }
}
