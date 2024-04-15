import edu.princeton.cs.introcs.StdOut;

//Aufgabe 2 -  Quadratsumme bilden für Zahl 3.
public class Quadratsumme {
    public void datenAusgeben(){
        StdOut.println(quadratsumme(3));
    }
         //Allgemein YES
    public int quadratsumme(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * n + (quadratsumme(n - 1)));
        }
    }+
        //Schleife1 sehr unallgemein, stimmt aber für unsere determinisiert vor-bekannten n=3 , OK
        public void schleife(){
            int i=1;
            i = i*i + (i+1)*(i+1) + (i+2)*(i+2);
            System.out.println(i);
        }
        //Schleife2 --- iterativ
        //Auch hier sehr unallgemein, mit vor-bekannter determinisierten n=3 als Arrayobergrenze.
        public void schleife2(){
            int a;
            int summe = 0;
            for(int i = 0; i <= 3; i++){
                a = i*i;
                summe = a + summe;
            }
            System.out.println(summe);
        }
}


