public class Switch {
    public static void main(String[] args) {
        // statement switch merupakan salah satu dari statement
        //  logika yang dapat digunakan untuk menentukan kondisi
        //  yang akan dijalankan

        // syarat khusus pada java meliputi
        //  - tidak menerima sistem duplikasi case
        //  - harus mengandung value yang konstan dan tidak menggunakan variabel
        //  - jika semua case tidak terpenuhi maka lanjut ke default case sebagai
        //      default case yang akan dijalankan

        int angka = 30;

        System.out.println("==== switch");

        switch (angka) {
            case 20:
                System.out.println("angkanya adalah 20");
                break;
            case 30:
                System.out.println("angkanya adalah 30");
                break;
            default:
                System.out.println("Ini adalah default case");
                break;
        }

        System.out.println("==== if else");

        if(angka == 20) {
            System.out.println("angkanya adalah 20");
        } else if (angka == 30) {
            System.out.println("angkanya adalah 30");
        } else {
            System.out.println("Ini adalah default case");
        }
    }
}
