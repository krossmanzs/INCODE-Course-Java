package soal;

public class Soal1 {
    /*
    Terdapat dua buah variabel char seperti berikut

    pertanyaan:
    buatlah komparasi apakah karakter1 kurang dari sama dengan karakter2
    jika <, tampilkan "karakter1 yang bernilai B kurang dari sama dengan karakter2 yang bernilai @"
    jika >, tampilkan "karakter1 yang bernilai B lebih dari sama dengan karakter2 yang bernilai @"

    note:
    - kalian boleh menggunakan if else atau switch
    - harus ada casting, komparasi, dan gunakan printf untuk menampilkan tulisannya :D
     */

    public static void main(String[] args) {
        char karakter1 = 'B'; // 66
        char karakter2 = '@'; // 64

        // boolean komparasi = 66 <= 64;
        boolean komparasi = karakter1 <= karakter2;

        /* JAWABAN */

        System.out.println("=============CINDY");

        // Cindy
        // if ('B' <= '@') { ini percuma ygy
        if (karakter1 <= karakter2) { // false
            System.out.printf("karakter2 yang bernilai @ lebih dari sama dengan karakter1 yang bernilai B\n");
        } else {
            System.out.printf("karakter1 yang bernilai @ kurang dari sama dengan karakter2 yang bernilai B\n");
        }

        System.out.println("\n=============DADANG");

        // Dadang
        int karakterA = (int) karakter1;
        int karakterB = (int) karakter2;
        System.out.printf("Nilai karakterA: %d\n", karakterA);
        System.out.printf("Nilai karakterB: %d\n", karakterB);
        System.out.printf("\n");

        System.out.println("berarti B lebih besar dari @ kan");
        System.out.printf("Nilai B > @ : %b\n", ('B' > '@'));
        System.out.printf("\n");

        System.out.println("tapi kan pertanyaannya apakah karakter1 kurang dari sama dengan karakter2?");
        System.out.printf("jadi\n");
        System.out.printf("Nilai B <= @ : %b\n", ('B' <= '@'));
        System.out.printf("Nilai %d <= %d : %b\n", karakterA, karakterB, ('B' <= '@'));
        System.out.printf("\n");

        System.out.printf("kalau pake if-else.....\n");
        System.out.printf("apakah karakter1 kurang dari sama dengan karakter2?\n");
        if(karakterA <= karakterB) {
            System.out.println("jawaban : iya bro");
            System.out.println("karakter2 yang bernilai @ lebih dari sama dengan karakter1 yang bernilai B");
        } else {
            System.out.println("jawaban : ndak bro");
            System.out.println("karakter2 yang bernilai @ lebih dari sama dengan karakter1 yang bernilai B");
        }
        System.out.printf("\n");
        System.out.printf("kalau pake switch\n");
        System.out.printf("....\n");
        System.out.printf("saya surrender\n\n");

        // switch
        switch (karakter1) {
            case 66:
                System.out.println("Nilainya adalah 66");
                break;
            case 65:
                System.out.println("Nilainya adalah 65");
                break;
        }
    }
}
