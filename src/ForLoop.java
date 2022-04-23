public class ForLoop {
    // looping adalah perulangan yang mengulangi
    // suatu kode sebanyak kali yang ditentukan
    // contoh:
    // for(statement_pertama, statement_kedua, statement_ketiga){
    //     kode_yang_mau_diulangi;
    // }

    // statement_pertama akan menginilialisasi nilai awal variabel
    // statement_kedua akan mengecek kondisi apakah masih bisa diulangi
    // statement_ketiga akan menambahkan nilai variabel

    public static void main(String[] args) {
        // looping dari angka 0 - 9

        // programmer biasanya pakai variabel
        // i,j,k

        for (int i = 0; i < 10; i++) { // i = 10
            System.out.println("Angka: " + i);
        }

        for (int i = 0; i < 10; i++) { // i = 10
            System.out.println("Angka: " + i);
        }

        System.out.println();

        // membuat segitiga dengan ukuran 5
        int size = 5;
        for (int i = 1; i <= size; i++) { // 1-5
            for (int j = 1; j <= i; j++) { // 1-i
                System.out.printf("%d ", j);
            }
            System.out.println(); // new line
        }

        /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
         */

        System.out.println();

        // 5-1
        for (int i = 1; i <= 5; i++) { // 1-5
            //  5-i
            for(int j = 5; j >= i; j--) { // 5-i || 5-5, 5-4, 5-3, 5-2, 5-1
                System.out.printf("%d ", j);
            }
            System.out.println();
        }


        System.out.println();

        size = 5;
        for (int i = 5; i >= 1; i--) { // 5 - 1
            for (int j = 5; j >= i; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println(); // new line
//        }
        }

        System.out.println();

        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
        size = 5

         */

        /*
            *
           **
          ***
         ****
        *****
         */

        for(int i = 1; i <= 5; i++) {
            // spasi
            for (int j = 5; j >= i + 1; j--) {
                System.out.printf(" ");
            }

            // bintang
            for(int k = 1; k <= i; k++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
