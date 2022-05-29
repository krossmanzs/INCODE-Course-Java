package soal.jawaban;

import java.util.Scanner;

public class Soal3_JN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // untuk buat objek scanner
        System.out.println("User belum terdaftar! silahkan daftar terlebih dahulu!");

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        System.out.println("Username berhasil didaftarkan, silahkan login ulang.");

        System.out.print("Masukkan username: ");
        String nameValidation = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordValidation = scanner.nextLine();

//        if (nameValidation == username && passwordValidation == password)
//            System.out.println("Pastikan password dan username benar!");
//        else
//            System.out.println("Login berhasil!");

        // if(false)
        if (nameValidation.equals(username) && passwordValidation.equals(password)) {
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("Pastikan username dan password benar!");
        }
    }
}
