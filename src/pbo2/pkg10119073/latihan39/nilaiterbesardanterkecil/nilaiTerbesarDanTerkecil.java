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

public class nilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);
        
        String nama;
        int banyakMhs;
        
        System.out.println("========Program Nilai Terbesar dan Terkecil Nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.nextLine();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = scanner.nextInt();
        mhs.inputNilai(mhs.nilai, banyakMhs);
        mhs.tampilBesarKecil(mhs.nilai, banyakMhs);
        System.out.println("\n"+"Petugas : " + nama);
    }
}