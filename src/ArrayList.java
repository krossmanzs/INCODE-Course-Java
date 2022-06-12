public class ArrayList {
    public static void main(String[] args) {
//        int[3] angka = {1,2,3};
//        angka[4] = 5; error

        java.util.ArrayList<Integer> angka = new java.util.ArrayList<>();
        angka.add(1);
        angka.add(2);
        angka.add(3);
        angka.add(3);
        angka.add(3);
        angka.add(5);
        angka.add(6);
        angka.add(3);
        angka.add(1234);
        angka.add(5645);

        printAngka(angka);

        angka.remove(1);

        printAngka(angka);
    }

    static void printAngka(java.util.ArrayList<Integer> angka) {
        System.out.println();
        for (int number : angka) {
            System.out.println(number);
        }
    }
}
