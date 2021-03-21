package kelompok5.TK1;

import java.text.DecimalFormat;
import java.util.Scanner;
public class SoalDua {
    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan ke-1: ");
        int a = scan.nextInt();
        System.out.print("Masukkan bilangan ke-2: ");
        int b = scan.nextInt();
        System.out.print("Masukkan bilangan ke-3: ");
        int c = scan.nextInt();
        System.out.println();
        System.out.println(a + " Log 10 = " + Math.log10(a));
        System.out.println(b + " Log 10 = " + Math.log10(b));
        System.out.println(c + " Log 10 = " + Math.log10(c));
        Double penambahan = Math.log10(a) + Math.log10(b) + Math.log10(c);
        System.out.println("Total Log 10 dari Bil1 + Bil 2 + Bil 3 = " + df.format(penambahan));
        System.out.println();
        System.out.println("COS = " + Math.cos(a));
        System.out.println("SIN = " + Math.sin(b));
        System.out.println("TAN = " + Math.tan(c));
        double pengurangan = Math.cos(a) - Math.sin(b) - Math.tan(c);
        System.out.println();
        System.out.println("Total COS - SIN - TAN = " + df.format(pengurangan));
    }
}
