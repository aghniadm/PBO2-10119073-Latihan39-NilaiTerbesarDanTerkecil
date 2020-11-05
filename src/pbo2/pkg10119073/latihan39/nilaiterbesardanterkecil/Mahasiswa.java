package pbo2.pkg10119073.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai
 * terbesar dan terkecil dengan object oriented
 *
 */

public class Mahasiswa {
    public int nilai[] = new int[100];

    public int inputNilai(int nilai[], int banyakMhs) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scanner.nextInt();
        }
        return 0;
    }

    public int hitungTerbesar(int nilai[], int banyakMhs) {
        int max = 0;
        for (int i = 1; i <= banyakMhs; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }

    public int hitungTerkecil(int nilai[], int banyakMhs) {
        int min = 1000;
        for (int i = 1; i <= banyakMhs; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        return min;
    }

    public void tampilBesarKecil(int nilai[], int banyakMhs) {
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int i = 1; i <= banyakMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " : " + nilai[i]);
        }
        System.out.println("\n" + "Nilai Terbesar : " + hitungTerbesar(nilai, banyakMhs));
        System.out.println("Nilai Terkecil : " + hitungTerkecil(nilai, banyakMhs));
    }
}