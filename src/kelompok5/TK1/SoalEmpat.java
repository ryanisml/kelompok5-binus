package kelompok5.TK1;

import java.util.Scanner;
public class SoalEmpat {
    public static void main(String[] args) {
        // write your code here
        Scanner inp = new Scanner(System.in);
        double baseTP1 = 0.15;
        double baseTP2 = 0.15;
        double baseTK1 = 0.10;
        double baseTK2 = 0.10;
        double baseK1 = 0.10;
        double baseK2 = 0.10;
        double baseUAS = 0.30;
        System.out.println("***Sistem Perhitungan Nilai***");
        System.out.print("Masukkan Nama : ");
        String nama = inp.next();
        System.out.print("Masukkan Nilai Tugas Personal 1 : ");
        double inputTP1 = inp.nextDouble();
        System.out.print("Masukkan Nilai Tugas Personal 2 : ");
        double inputTP2 = inp.nextDouble();
        System.out.print("Masukkan Nilai Tugas Kelompok 1 : ");
        double inputTK1 = inp.nextDouble();
        System.out.print("Masukkan Nilai Tugas Kelompok 2 : ");
        double inputTK2 = inp.nextDouble();
        System.out.print("Masukkan Nilai Kuis 1 : ");
        double inputK1 = inp.nextDouble();
        System.out.print("Masukkan Nilai Kuis 2 : ");
        double inputK2 = inp.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double inputUAS = inp.nextDouble();

        double totalTP1 = baseTP1 * inputTP1;
        double totalTP2 = baseTP2 * inputTP2;
        double totalTK1 = baseTK1 * inputTK1;
        double totalTK2 = baseTK2 * inputTK2;
        double totalK1 = baseK1 * inputK1;
        double totalK2 = baseK2 * inputK2;
        double totalUAS = baseUAS * inputUAS;
        double totalNilai = totalTP1 + totalTP2 + totalTK1 + totalTK2 + totalK1 + totalK2 + totalUAS;
        //System.out.println("Total Nilai : " + totalNilai);

        String grade = "";

        if (totalNilai >= 85) {
            grade = "Grade A";
        }else if (totalNilai >= 75 & totalNilai <= 84){
            grade = "Grade B";
        }else if (totalNilai >= 65 & totalNilai <= 74){
            grade = "Grade C";
        }else if (totalNilai >= 50 & totalNilai <= 64){
            grade = "Grade D";
        }else if (totalNilai < 50) {
            grade = "Grade E";
        }
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas Personal 1 : " + inputTP1);
        System.out.println("Nilai Tugas Personal 2 : " + inputTP2);
        System.out.println("Nilai Tugas Kelompok 1 : " + inputTK1);
        System.out.println("Nilai Tugas Kelompok 2 : " + inputTK2);
        System.out.println("Nilai Kuis 1 : " + inputK1);
        System.out.println("Nilai Kuis 2 : " + inputK2);
        System.out.println("Nilai UAS : " + inputUAS);
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("Grade : " + grade);
    }
}
