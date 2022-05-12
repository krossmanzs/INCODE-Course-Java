public class Aritmatika {
    // operator pada java adalah
    // + = tambah
    // - = kurang
    // * = kali
    // / = bagi
    // % = modulus
    // ++ = increment -> + 1
    // -- = decrement -> - 1

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int result;

        // tambah
        result = a + b;
        System.out.println("Nilai a + b: " + result); // print line

        result = b + c; // 10
        System.out.printf("Nilai a + b: %d %s\n", result, "<- adalah hasilnya"); // print format

        // kurang
        a = 2;
        b = 2;
        result = a - b;
//        System.out.println("Nilai " + a + " - " + b + " = " + result);
        System.out.printf("Nilai %d - %d = %d\n", a, b, result);

        // perkalian
        a = 144;
        b = 12;
        result = a * b;
        System.out.printf("Nilai %d * %d = %d\n", a, b, result);

        // pembagian
        float e = 8f;
        float d = 8000000f;
        float result2 = e / d;
        System.out.printf("Nilai %f / %f = %f\n", e, d, result2);

        System.out.printf("Nilai %f / %f = %f\n", 1f, 0f, (1f / 0f));

        // modulus
        int z = 5;
        int x = 2;
        int result3 = 5 % 2;
        System.out.printf("Nilai %d %% %d = %d\n", z, x, result3);

        // increment
        int angka = 1;
        System.out.printf("angka = %d\n", angka);
        angka++; // angka = angka + 1
        System.out.printf("angka = %d\n", angka);
        angka += z; // angka = angka + 5
        System.out.printf("angka = %d\n", angka);

        // decrement
        angka = 10;
        System.out.printf("angka = %d\n", angka);
        angka--; // angka = angka - 1
        System.out.printf("angka = %d\n", angka);
        angka -= 11; // angka = angka - 11
        System.out.printf("angka = %d\n", angka);

        // kalkultor sederhana
        System.out.println("----KALKULATOR SEDERHANA----");
        float angka1 = 23.3f;
        float angka2 = 5.53f;
        System.out.printf("%f + %f = %f\n", angka1, angka2, (angka1 + angka2));
    }
}