public class IfElse {
    public static void main(String[] args) { // driver code
        // if (jika)
        // kondisi dimana suatu proses dijalankan ketika kondisi
        // bernilai true

        // else (lainnya)
        // kondisi dimana jika if tidak terpenuhi (false)

        boolean capek = false;

        if(capek) { // false || capek == true
            System.out.println("Sedang tidur");
        } else {
            System.out.println("Sedang bekerja");
        }

        if(1 > 5) { // false
            System.out.println("1 lebih besar dari 5");
        } else {
            System.out.println("1 kurang dari 5");
        }

        if(5 == 5) { // true
            // jika true maka tampilkan
            System.out.println("5 sama dengan 5");
        } else {
            // jika false tampilkan
            System.out.println("5 tidak sama dengan 5");
        }

        int angka = 4;

        System.out.printf("Angka: %d\n", angka);

        if (angka == 0) {
            System.out.println("Angkanya adalah 0, mari kita ubah angkanya menjadi 5");
            angka = 5;
        } else {
            System.out.println("Angka nya bukan 0, mari kita ubah angkanya menjadi 10");
            angka = 10;
        }

        System.out.printf("Angka: %d\n", angka);

        // else if
        // hampir mirip seperti else tetapi dia punya kondisi juga
        // jadi perintah akan dieksekusi ketika if == false
        // dengan syarat tambahan

        if(5 > 7) { // false
            System.out.println("5 lebih dari 7");
        } else if (1 < 2) { // true
            System.out.println("1 kurang dari 2");
        } else {
            System.out.println("komparasi diatas salah semua");
        }

        if(1 < 2) { // true
            System.out.println("1 kurang dari 2");
        } if (3 == 3) { // true
            System.out.println("3 sama dengan 3");
        } else {
            System.out.println("komparasi diatas salah semua");
        }

        if('G' == 'C') { // false
            System.out.println("G sama dengan C");
        } else if ("anjay" != "wow") { // true
            System.out.println("anjay tidak sama dengan wow");
        } if ("aku" != "dia") { // true
            System.out.println("bener :(");
        } else {
            System.out.println("komparasi diatas salah semua");
        }

        boolean lawak = false;

        // pukul pedo
        lawak = true;
        if (!lawak) { // not lawak = !lawak
            System.out.println("Pedo harus dimusnahkan!");
        } else {
            System.out.println("berikan saya loli :3");
        }
    }
}
