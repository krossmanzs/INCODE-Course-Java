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

        // JAWABAN GARLAND (kurang tepat dan sudah dibenerin ama linuk)
        Scanner Power = new Scanner(System.in);
        System.out.println("What's Your Name?");
        System.out.print("My Name: ");
        String Name = Power.nextLine();
        System.out.println("How's your age?");
        System.out.print("My Age: ");
        int Age = Power.nextInt();
        System.out.println("What's Your Gender?");
        System.out.print("My Gender: ");
        Power = new Scanner(System.in); // refresh scanner
        String Gender = Power.nextLine();
        System.out.println("What's Your Class now?");
        System.out.print("Class: ");
        Power = new Scanner(System.in);
        String Class = Power.nextLine();
        System.out.println("When is your birthday?");
        System.out.print("My Birthday (ddmmyy): ");
        String Date = Power.nextLine();

        System.out.println("Thank You for Your Feedback. " +
                "So You are " + Name + " and your age is " +
                Age + ", Your gender is " + Gender +
                ". You're Currently on " + Class + " and Your Birthday's on "
                + Date);
    }
}
