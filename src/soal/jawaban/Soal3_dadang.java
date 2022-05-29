package soal.jawaban;

import java.util.Scanner;

public class Soal3_dadang {
    static String username = "";
    static String password = "";

    public static void main(String[] args) {

        boolean userTerdaftar = cekUser(username, password);

        if(!userTerdaftar) {
            daftarUser();
        } else {
            loginUser();
        }
    }

    private static void loginUser() {
        String usernameMasuk, passwordMasuk;

        do {

            System.out.println("[LOGIN]");
            Scanner ketiklo = new Scanner(System.in);

            System.out.println("Masukkan username : ");
            usernameMasuk = ketiklo.nextLine();
            System.out.println();

            System.out.println("Masukkan password : ");
            passwordMasuk = ketiklo.nextLine();
            System.out.println();

            if(!usernameMasuk.equals(username) || !passwordMasuk.equals(password)) {
                System.out.println("Maaf, data tidak ditemukan");
                System.out.println("Yok coba lagi yok");
                System.out.println();
            }

        } while(!usernameMasuk.equals(username) || !passwordMasuk.equals(password));

        System.out.println("[Login terdeteksi]");
        System.out.println("Selamat datang to the hell!");
        System.out.println("heh");
    }

    private static void daftarUser() {
        System.out.println("Yok daftar dulu yok");
        System.out.println();
        Scanner ketiklo = new Scanner(System.in);

        System.out.println("Masukkan username anda : ");
        username = ketiklo.nextLine();
        System.out.println();

        System.out.println("Masukkan password anda : ");
        password = ketiklo.nextLine();
        System.out.println();

        System.out.println("[Data (semoga) berhasil ditambahkan!]");
        System.out.println("Monggo, daftar ulang dulu...");
        System.out.println();
        loginUser();
    }

    private static boolean cekUser(String id, String pw) {

        if(!id.isEmpty() || !pw.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
