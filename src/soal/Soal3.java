package soal;

import java.util.Scanner;

public class Soal3 {
    static String username = ""; // variabel username
    static String password = ""; // variabel password

    public static void main(String[] args) {
        // Membuat sebuah program register-login
        // terdapat dua buah variabel: username dan password dengan masing" bernilai kosong

        // Tugas:
        // - menulis kode untuk cek user di fungsi cekUser()
        // - menulis kode untuk daftar user di fungsi daftarUser()
        // - menulis kode untuk login user di fungsi loginUser()

        boolean userTerdaftar = cekUser(username, password);

        if(!userTerdaftar) {
            daftarUser();
        } else {
            loginUser();
        }

        // JANGAN MENGUBAH KODE DIATAS!!
    }

    private static void loginUser() {
        // Fungsi untuk login dengan cara:

        /*
            - terdapat dua variabel temporary dibawah ini untuk menyimpan input user sementara
            - lakukan looping untuk memasukkan usernameInput dan passwordInput hingga:
                * usernameInput sama dengan username dan passwordInput sama dengan password
         */

        String usernameInput, passwordInput;
        // JANGAN MENGUBAH KODE DIATAS!!

    }

    private static void daftarUser() {
        // Fungsi untuk mendaftarkan user dengan cara:

        /*
        - Melakukan input ke variabel username
        - Melakukan input ke variabel password
        - Ketika 2 langkah diatas sudah selesai, panggil fungsi loginUser()
         */

        // JANGAN MENGUBAH KODE DIATAS!!

        loginUser();
    }

    private static boolean cekUser(String id, String pw) {
        // fungsi untuk mengecek apakah user sudah terdaftar dengan cara:

        /*
        - Mengembalikan nilai true jika id tidak kosong atau pw tidak kosong
        - Mengembalikan nilai false jika id kosong atau pw kosong
         */

        // JANGAN MENGUBAH KODE DIATAS!!

    }
}
