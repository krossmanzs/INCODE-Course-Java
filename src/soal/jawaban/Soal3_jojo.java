package soal.jawaban;

import java.util.Scanner;

public class Soal3_jojo {
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

        Scanner userInput = new Scanner(System.in);

        boolean lanjut = false;
        do {
            int tester;
            System.out.println("");
            System.out.println("===LOGIN===");
            System.out.print("Masukkan Username  :");
            usernameInput = userInput.nextLine();
            System.out.print("Masukkan Password  :");
            passwordInput = userInput.nextLine();
            if (usernameInput.equals(username) && passwordInput.equals(password)){
                tester = 1;
            } else {
                tester = 2;
            }

            switch (tester) {
                case 1:
                    System.out.println("anda telah login");
                    lanjut = false;
                    break;
                case 2:
                    System.out.println("lu bodoh");
                    lanjut = true;
                    break;
            }

        } while(lanjut);
    }






    private static void daftarUser() {
        // Fungsi untuk mendaftarkan user dengan cara:

        /*
        - Melakukan input ke variabel username
        - Melakukan input ke variabel password
        - Ketika 2 langkah diatas sudah selesai, panggil fungsi loginUser()
         */

        // JANGAN MENGUBAH KODE DIATAS!!

        // pake userinput
        Scanner userInput = new Scanner(System.in);

        System.out.println ("Masukan username  :");
        username = userInput.next();

        System.out.println("Masukan password  :");
        password = userInput.next();

        loginUser();
    }

    private static boolean cekUser(String id, String pw) {

        // fungsi untuk mengecek apakah user sudah terdaftar dengan cara:

        /*
        - Mengembalikan nilai true jika id tidak kosong atau pw tidak kosong
        - Mengembalikan nilai false jika id kosong atau pw kosong
         */

        // JANGAN MENGUBAH KODE DIATAS!!
        if(!id.equals("") || !pw.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
