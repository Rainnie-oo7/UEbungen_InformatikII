public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }


    private static int fakultaet(int k)
    { if (k <= 1)
    { return 1; }

    else
    { return fakultaet(k - 1) * k; }}

}