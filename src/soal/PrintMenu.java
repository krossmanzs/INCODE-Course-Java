package soal;

import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        // cara membuat menu
        boolean lanjut = true;

        do {
            System.out.println();
            int pilih;
            Scanner userinput = new Scanner(System.in);

            printMenu();

            /*
                - ambil user input > pilih
                - switch pilih
             */

            pilih = userinput.nextInt();

            switch (pilih) {
                case 1:
                    // print nama
                    printNama();
                    break;
                case 2:
                    // kick metiw
                    kickMetiw();
                    break;
                case 3:
                    // tanya umur
                    tanyaUmur();
                    break;
                case 4:
                    // string method equals
                    equals();
                    break;
                case 0:
                    // keluar
                    lanjut = false;
                    break;
                default:
                    System.out.println("Nomor yang anda masukkan tidak terdaftar!");
            }

        } while(lanjut);
    }

    static void equals() {
        String kata1 = "metiw";
        String kata2 = "metiw";
        System.out.println(kata1.equals(kata2));
        System.out.println(kata1 == kata2);
    }

    private static void tanyaUmur() {
        /*
            - tanya umur berapa
            - tampilin
         */

        System.out.print("Masukkan umur: ");
        int umur = inputInt();

        System.out.println("Umur anda adalah " + umur);
    }

    private static int inputInt() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    static void kickMetiw() {
        // apakah kamu yakin? (y/n)
        // variabel apa yang akan dipakai untuk menyimpan yes/no?

        boolean lanjut = true;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Apakah kamu yakin?(y/n)");
            char isKick =  userInput.next().toLowerCase().charAt(0); // "y"

            switch (isKick) {
                case 'y':
                    System.out.println("Metiw telah dikick");
                    lanjut = false;
                    break;
                case 'n':
                    System.out.println("Metiw tidak jadi dikick");
                    lanjut = false;
                    break;
                default:
                    System.out.println("Silahkan masukkan y/n!");
                    break;
            }
        } while (lanjut);
    }

    static void printNama() {
        String nama;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = userInput.nextLine();

        System.out.println("Halo " + nama);
    }

    static void printMenu() {
        System.out.println("MENU");
        System.out.println("1. print nama");
        System.out.println("2. Kick matthew");
        System.out.println("3. Tanya umur");
        System.out.println("4. String method equals");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
}
