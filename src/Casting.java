public class Casting {
    public static void main(String[] args) {
        // casting digunakan untuk merubah tipe data
        float floatA = 12.8f;
        int intA = (int) floatA;
        System.out.printf("Nilai floatA: %f\n", floatA);
        System.out.printf("Nilai intA: %d\n", intA);

        char charB = 'Z';
        int intB = (int) charB;
        System.out.printf("Nilai charB: %c\n", charB);
        System.out.printf("Nilai intB: %d\n", intB);
    }
}
