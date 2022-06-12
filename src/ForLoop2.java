public class ForLoop2 {
    public static void main(String[] args) {
        // n = 10
        // jumlahkan 1-n di tiap loop
        // jika dia prima maka tampilkan
        int n = 10;
        int total = 0;
        for(int i = 1; i <= n; i++) { // 1-10
            total += i;
            if (cekPrima(total)) {
                System.out.println(total);
            }
        }

    }

    static boolean cekPrima(int angka) {
        int mark = 0;
        for (int i = angka; i >= 1; i--) {
            if (angka % i == 0) {
                mark++;
            }
        }

        return mark == 2;
    }
}
