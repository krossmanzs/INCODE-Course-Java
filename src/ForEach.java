import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String animals[] = {"Kucing", "Anjing", "Kecoak Goreng", "Tikus"};

        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println();

        // for each
//        for (type var : array) {
//            statements using var;
//        }

        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        int b[] = {1,2,3,4,4,5,3,34,5,34,12,3,21,4,23};

        for (int angka : b) {
            if((angka % 2) == 0) { // bila angka mod 2 != 0 atau genap
                System.out.printf("%d adalah bilangan genap\n", angka);
            } else {
                System.out.printf("%d adalah bilangan ganjil\n", angka);
            }
        }

        System.out.println();

        Arrays.sort(b);
        for(int angka : b) {
            System.out.println(angka);
        }

        System.out.println();

        int c[] = Arrays.copyOf(b,b.length);

        for (int angka : c) {
            System.out.println(angka);
        }

        System.out.println();

        String fruits[] = {"Apple", "Mango", "Banana", "Strawberry"};

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(Integer.toString(5));
    }
}
