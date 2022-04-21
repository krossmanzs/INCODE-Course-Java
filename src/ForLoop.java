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

        for(int i = 0;i < 10; i++) { // i = 10
            System.out.println("Angka: " + i);
        }

        System.out.println();

        // membuat segitiga dengan ukuran 5
        int size = 5;
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println(); // new line
        }

        System.out.println();

        // stackoverflow error
//        for (int i = 0; i < 10; i--) {
//            System.out.println(i);
//        }
    }
}
