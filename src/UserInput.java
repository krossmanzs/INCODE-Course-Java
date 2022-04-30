import soal.Soal1;

import java.util.Scanner;

public class UserInput {
    //    User Input adalah memasukkan sesuatu yang dilakukan
    //    oleh user / manusia baik itu perintah (Command), Click,
    //    dll. Untuk mengambil user input pada bahasa pemograman Java,
    //    kita bisa menggunakan kelas yang bernama Scanner.
    public static void main(String[] args) {
        // buat object scanner
        Scanner userInput = new Scanner(System.in);

        String namaDepan, namaBelakang; // blum ada nilainya atau hampa

        System.out.println("===========");
        System.out.println("INPUT DATA");
        System.out.println("===========");

        System.out.print("Masukkan nama depan: ");
        namaDepan = userInput.nextLine();

        System.out.print("Masukkan nama belakang: ");
        namaBelakang = userInput.nextLine();

        int umur;

        System.out.print("Masukkan umur: ");
        umur = userInput.nextInt();
        System.out.println("\n===========");
        System.out.println("INFO DATA");
        System.out.println("===========");

        System.out.println("Nama anda adalah: " + namaDepan.concat(" ").concat(namaBelakang));
        System.out.println("Umur anda adalah: " + umur);

        // Tugas
        // dapetin informasi kita kaya nama, umur, jenis kelamin, kelas, tanggal lahir
        // tampilin semua
    }
}
