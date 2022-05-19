public class While {
    public static void main(String[] args) {
        int i = 0;

        while(i <= 5) {
            String kata = "Halo";
            System.out.println(kata);
            i++;
        }

        System.out.println(i);

        // stackoverflow
//        while(true) {
//            System.out.println("halo ges :D");
//        }


        // terdapat sebuah desa dengan penduduk maksimal 100
        // kita tambah penduduk sampai 100
        // jika belum penuh maka tampilkan banyak penduduk saat itu

        int penduduk = 1;
        int maxPenduduk = 100;

        // ketika penduduk belum penuh
        while(penduduk <= maxPenduduk) {
            // kita tampilin penduduk saat ini
            System.out.printf("Penduduk saat ini: %d\n", penduduk);

            // kita tambah penduduknya
            penduduk *= 2; // penduduk = penduduk + 1

            // kita tampilin penduduk setelah ditambah
            System.out.printf("Penduduk setelah ditambah: %d\n\n", penduduk);
        }
    }
}
