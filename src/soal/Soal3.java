package soal;

import java.util.Scanner;

public class Soal3 {
    static String username = "";
    static String password = "";

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
    }

    private static void loginUser() {
        // Fungsi untuk login dengan cara:

        /*
            - terdapat dua variabel temporary dibawah ini untuk menyimpan input user sementara
            - lakukan looping untuk memasukkan usernameInput dan passwordInput hingga:
                * usernameInput sama dengan username dan passwordInput sama dengan password
         */

        String usernameInput, passwordInput;

        do {
            Scanner userInput = new Scanner(System.in);

            System.out.println("\n====LOGIN");
            System.out.print("Masukkan username: ");
            usernameInput = userInput.nextLine();

            System.out.print("Masukkan password: ");
            passwordInput = userInput.nextLine();

            if(!usernameInput.equals(username) || !passwordInput.equals(password)) {
                System.out.println("Login gagal, pastikan username dan password benar!");
            }
        } while(!usernameInput.equals(username) || !passwordInput.equals(password));

        System.out.println("Login berhasil!");
        System.out.printf("Selamat datang, %s!", username);
    }

    private static void daftarUser() {
        // Fungsi untuk mendaftarkan user dengan cara:

        /*
        - Melakukan input ke variabel username
        - Melakukan input ke variabel password
        - Ketika 2 langkah diatas sudah selesai, panggil fungsi loginUser()
         */

        System.out.println("User belum terdaftar! silahkan daftar terlebih dahulu!");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        username = userInput.nextLine();

        System.out.print("Masukkan password: ");
        password = userInput.nextLine();

        System.out.println("Username berhasil di daftarkan!");
        System.out.println("Silahkan login ulang.");
        loginUser();
    }

    private static boolean cekUser(String id, String pw) {
        // fungsi untuk mengecek apakah user sudah terdaftar dengan cara:

        /*
        - Mengambalikan nilai true jika id tidak kosong atau pw tidak kosong
        - Mengembalikan nilai false jika id kosong atau pw kosong
         */

        if(!id.isEmpty() || !pw.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
