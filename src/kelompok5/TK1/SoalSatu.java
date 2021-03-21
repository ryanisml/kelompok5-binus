package kelompok5.TK1;

import java.util.Scanner;
public class SoalSatu {
    public static void main(String args[]) {
        int a;
        int b;
        Scanner masukan = new Scanner(System.in);

        //masukan input bilangan 1
        System.out.print("Masukan bilangan ke-1: ");
        a = masukan.nextInt();
        //masukan input bilangan 2
        System.out.print("Masukan bilangan ke-2: ");
        b = masukan.nextInt();

        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int modulus = a % b;

        System.out.println("penjulahan :" + jumlah);
        System.out.println("pengurangan :" + kurang);
        System.out.println("perkalian " + kali);
        System.out.println("pembagian :" + bagi);
        System.out.println("modulus : " + modulus);
    }
}