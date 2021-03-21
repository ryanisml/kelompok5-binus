package kelompok5.TK1;

import java.util.Scanner;
public class SoalDua {
    public static void main(String args[]) {
        int a;
        int b;
        int c;
        double jumlah ;
        double kurang ;
        Scanner masukan = new Scanner(System.in);

        //masukan input bilangan 1
        System.out.print("Masukan bilangan ke-1: ");
        a = masukan.nextInt();
        //masukan input bilangan 2
        System.out.print("Masukan bilangan ke-2: ");
        b = masukan.nextInt();
        //masukan input bilangan 3
        System.out.print("Masukan bilangan ke-3: ");
        c = masukan.nextInt();

        jumlah = Math.log10(a) + Math.log10(b) + Math.log10(c);
        kurang = Math.cos(a) - Math.sin(b) - Math.tan(c);

        System.out.println();
        System.out.println("Hasil penjumlahan logaritma basis 10 dari ketiga bilangan = " + jumlah);
        System.out.println("Hasil pengurangan dari Cos angka1, Sin angka2, Tan angka3 = " + kurang);
    }
}