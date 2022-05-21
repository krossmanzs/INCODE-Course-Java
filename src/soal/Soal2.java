package soal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        /**
         * buatlah bentuk seperti dibawah ini
           *****
            *****
             *****
              *****
               *****
         */

        // SILAHKAN BUAT KODENYA MULAI BARIS DIBAWAH INI!!
        dadang();
        System.out.println();
        metrung();
        System.out.println();
        jojo();
        System.out.println();
        marchel();
        System.out.println();
        linux();
        System.out.println();
        cindy();
        System.out.println();
        garland();
    }

    private static void dadang() {
        // DADANG
        System.out.println("dadang");
        int ukurannya = 9;
        for (int s = 5; s <= ukurannya; s++) {
            for (int n = 6; n <= s; n++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= s; o++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for (int s = 5; s <= ukurannya; s++) {
            for (int n = 6; n <= s; n++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= s; o++) {
                System.out.print("x");
            }

            System.out.println();
        }
    }

    private static void metrung() {
        // Metrung
        System.out.println("Metrung");
        int size = 5;
        for(int i = 1; i <= size; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void marchel() {
        // James Marchel
        System.out.println("James Marchel");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < limit; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void jojo() {
        // Jojo
        System.out.println("Jojo");
        int sizee = 5;
        for (int i = 1; i <= sizee; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= sizee; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void linux() {
        System.out.println("Linux :V");
        int bigchungus = 5;
        for (int i = 1; i <= bigchungus; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= bigchungus; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void cindy() {
        System.out.println("Cindy");
        for (int i = 0; i < 5; i++) {
            System.out.printf("*** \n");

            for (int j = 5; j >= i + 1; j--)
                System.out.printf("_");
        }
    }

    private static void garland() {
        System.out.println("\nGarland");
        for(int i = 0; i < 5; i++) { // 0-4 (5 looping)
            // spasi
            for(int j = 0; j < i; j++) { // 0-3 (4 looping)
                System.out.print(" ");
            }

            // bintang
            for(int k = 1; k <= 5; k++) { // 0-4 (5 kali looping)
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
