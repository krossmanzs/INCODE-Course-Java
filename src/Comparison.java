public class Comparison {
    // untuk membandingkan dua buah nilai/value
    // dan mengembalikannya dalam bentuk boolean (true/false)

    // 5 > 3 = true

    // +----------+-----------------------------+------------+
    // | operator |         penjelasan          | penggunaan |
    // +----------+-----------------------------+------------+
    // | ==       | sama dengan                 | x == y     |
    // | !=       | tidak sama dengan           | x != y     |
    // | >        | lebih besar dari            | x > y      |
    // | <        | lebih kecil dari            | x < y      |
    // | >=       | lebih besar atau sama dari  | x >= y     |
    // | <=       | lebih kecil atau sama dari  | x <= y     |
    // +----------+-----------------------------+------------+

    public static void main(String[] args) {
        System.out.println("====== Sama Dengan");
        // sama dengan
        System.out.printf("Nilai %d == %d : %b\n", 5, 5, (5 == 5));
        System.out.printf("Nilai 2 == 3 : %b\n", (2 == 3));

        System.out.println("====== Tidak Sama Dengan");

        // tidak sama dengan
        System.out.printf("Nilai 5 != 5 : %b\n", (5 != 5));
        System.out.printf("Nilai 123 != 321 : %b\n", (123 != 321));

        // lebih besar dari
        System.out.println("====== Lebih Besar Dari");
        System.out.printf("Nilai 2 > 12 : %b\n", (2 > 12));

        // lebih besar sama dengan
        System.out.println("====== Lebih Besar Sama Dengan");
        System.out.printf("Nilai 2 >= 12 : %b\n", (2 >= 12));
        System.out.printf("Nilai 12 >= 12 : %b\n", (12 >= 12));

        // lebih kecil dari
        System.out.println("====== Lebih Kecil Dari");
        System.out.printf("Nilai 2 < 12 : %b\n", (2 < 12));

        // lebih kecil sama dengan
        System.out.println("====== Lebih Kecil Sama Dengan");
        System.out.printf("Nilai 2 <= 12 : %b\n", (2 <= 12));

        String kata1 = "Anjing";
        String kata3 = "Anjing";
        String kata2 = new String("Anjing");
        System.out.print("Anjing == Anjing : ");
        System.out.println(kata1 == kata2);
        System.out.println("Kata1: " + System.identityHashCode(kata1));
        System.out.println("Kata2: " + System.identityHashCode(kata2));
        System.out.println("Kata2: " + System.identityHashCode(kata3));
    }
}
