public class LogicalBoolean {
    // operator logika digunakan untuk membandingkan logika
    // antara kedua value

    // +----------+-------------+---------------------------------------------------------------+--------------------+
    // | operator |    nama     |                          penjelasan                           |     penggunaan     |
    // +----------+-------------+---------------------------------------------------------------+--------------------+
    // | &&       | Logical and | Mengembalikan nilai true jika kedua pernyataan benar          | x < 5 &&  x < 10   |
    // | ||       | Logical or  | Mengembalikan nilai true jika salah satu pernyataan benar     | x < 5 || x < 4     |
    // | !        | Logical not | Membalikkan hasilnya, mengembalikan false jika hasilnya benar | !(x < 5 && x < 10) |
    // +----------+-------------+---------------------------------------------------------------+--------------------+

    public static void main(String[] args) {
        System.out.println("=========== && (dan)");
        System.out.printf("true && true = %s\n", (true && true));
        System.out.printf("true && true && false = %s\n", (true && true && false));

        System.out.println("\n=========== || (atau)");
        System.out.printf("true || false = %s\n", (true || false));
        System.out.printf("true || false || true = %s\n", (true || false || true));

        System.out.println("\n=========== ! (not)");
        System.out.printf("!true = %s\n", (!true));

        System.out.println("\n===========");
        System.out.printf("!(true != false) && (true) || false && false || (true || false) = %s\n",
                (!(true != false) && (true) || false && false || (true || false)));
    }
}
