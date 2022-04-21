public class Casting {
    public static void main(String[] args) {
        // casting digunakan untuk merubah tipe data
        // casting dibagi menjadi 2:
        // - manual casting
        // - auto casting

        float floatA = 12.8f;
        int intA = (int) floatA; // manual casting
        System.out.printf("Nilai floatA: %f\n", floatA);
        System.out.printf("Nilai intA: %d\n", intA);

        char charB = 'Z';
        int intB = charB; // auto casting
        System.out.printf("Nilai charB: %c\n", charB);
        System.out.printf("Nilai intB: %d\n", intB);

        byte byteA = 5;
        long longA = (long) byteA; // manual casting
        System.out.printf("Nilai byteA: %d\n", byteA);
        System.out.printf("Nilai longA: %d\n", longA);
    }
}
