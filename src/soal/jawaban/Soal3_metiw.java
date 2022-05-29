package soal.jawaban;

import java.util.Scanner;

public class Soal3_metiw {
    static String username = "";
    static String password = "";

    public static void main(String[] args) {
        boolean userTerdaftar = cekUser(username, password); // true/false?
        System.out.println(userTerdaftar);

        // jika user belum terdaftar
        if(!userTerdaftar) {
            // maka kita daftar user
            daftarUser();
        } else { // selain itu,
            // maka kita login user
            loginUser();
        }
    }

    private static void loginUser() {
        String usernameInput, passwordInput; // untuk menyimpan input user username dan pw
        Scanner userInput = new Scanner(System.in); // membuat object scanner

        boolean lanjut = false;
        do {
            int tester;
            System.out.println("");
            System.out.println("===LOGIN===");
            System.out.print("Masukkan Username paok :");
            usernameInput = userInput.nextLine();
            System.out.print("Masukkan Password paok :");
            passwordInput = userInput.nextLine();

            // if(true)
            if (usernameInput.equals(username) && passwordInput.equals(password)){
                tester = 1;
            } else {
                tester = 2;
            }

            switch (tester) {
                case 1:
                    System.out.println("Selamat Anda telah Login");
                    lanjut = false;
                    break;
                case 2:
                    System.out.println("Pastiin ngisi apa lo");
                    lanjut = true;
                    break;
            }

        } while(lanjut);
    }

    private static void daftarUser() {
        Scanner userInput = new Scanner(System.in); // buat objek scanner
        System.out.println("User belum terdaftar, Silahkan daftar terlebih dahulu");
        System.out.println("===Registration===");
        System.out.print("Masukkan Username paok :");
        username = userInput.nextLine();
        System.out.print("Masukkan Password paok :");
        password = userInput.nextLine();
        System.out.println("Selamat anda telah terdaftar. Senang?!");
        System.out.println("Sekarang lanjut ke login!!");
        loginUser();
    }

    private static boolean cekUser(String id, String pw) {
//        username = id = "";
//        password = pw = "";

        // angel: true
        // dadang: false
        // jn: false

        if(id.isEmpty() && pw.isEmpty()){ // true && true = true
            return false;
        } else {
            return true;
        }

    }
}
