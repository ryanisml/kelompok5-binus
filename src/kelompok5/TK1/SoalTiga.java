package kelompok5.TK1;

import java.util.Scanner;
public class SoalTiga {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int luas = 0;
        System.out.println("== Menghitung harga jasa arsitek berdasarkan luas tanah ==");
        System.out.print("Masukkan luas tanah (m2) : ");
        luas = inp.nextInt();
        long totalharga = 0;
        if (luas < 50){
            totalharga = luas * 1000000;
        } else {
            long tempharga = 50 * 1000000;
            int sisa = luas - 50;
            long sisaharga = 0;
            if (sisa > 0){
                sisaharga = sisa * 1500000;
            }
            totalharga = tempharga + sisaharga;
        }
        System.out.println();
        System.out.print("Total harga yang perlu dibayar: " + totalharga);
    }
}

