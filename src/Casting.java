public class Casting {
    public static void main(String[] args) {
        // casting digunakan untuk merubah tipe data
        // casting dibagi menjadi 2:
        // - manual casting
        // - auto casting

        float floatA = 12.8f;
        // hard-coded
        int intA = (int) floatA; // manual casting
        System.out.printf("Nilai floatA: %f\n", floatA);
        System.out.printf("Nilai intA: %d\n", intA);

        // kalo bilangan desimal ke bulat harus di manual casting
        // kalo udah sesama jenis bilangan sudah auto casting

        char charB = 'B';
        int intB = charB; // auto casting
        System.out.printf("Nilai charB: %c\n", charB);
        System.out.printf("Nilai intB: %d\n", intB);

        byte byteA = 5;
        long longA = (long) byteA; // manual casting
        System.out.printf("Nilai byteA: %d\n", byteA);
        System.out.printf("Nilai longA: %d\n", longA);

        byte byteC = 55;
        short shortC = byteC;
        System.out.printf("Nilai byteC: %d\n", byteC);
        System.out.printf("Nilai shortC: %d\n", shortC);
    }
}
